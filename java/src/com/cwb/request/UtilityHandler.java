package com.cwb.request;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import com.cwb.request.ResultBean;

/**
 * Make requests to a utility and validate the response.
 * @author cbrann
 * @since 2012-06-01
 * 
 */
public class UtilityHandler {
	public static String PORT = "8080";
	public static String COMMENT = "#";
	public static String outputPath = "/tmp/imgcheck/";
	public static String fileNameFormat = "yyyyMMddhhmmss";
	public static String tiffMd5sumPath = "/home/jenkins/lib/ImageServing/bin64/TiffMd5sum";
	public static String tiffMd5Utility = "TIFF_MD5_UTILITY";
	public static String macMd5Utility = "/sbin/md5";
	public static String linuxMd5Utility = "/usr/bin/md5sum";
	
	/*
	 * Execute ic conv command, return all result information of command by ResultBean
	 * Properties of ResultBean:
	 *     exitValue         exit value of command
	 *     stdout			stdout of command
	 *     stderr			stderr of command
	 *     outFileMd5		md5 sum of output file
	 *     errorMsg			error message if any exception
	 */
	public ResultBean executeICConv(String utilityCommand) {
		try {
			String outFileName = makeFileName();
			Process p = Runtime.getRuntime().exec(utilityCommand + " " + outFileName);
			
			int exitValue = p.waitFor(); 
			String stdOut = "";
			String stdErr = "";
			String md5Value = "";
			String errorMsg = "";
			
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String line;
			while((line = stdInput.readLine()) != null){
				stdOut += line;
			}
			while((line = stdError.readLine()) != null){
				stdErr += line;
			}
			if(exitValue == 0){
				if (!(new File(outFileName)).exists()){
					errorMsg = errorMsg + "\nMissing converted file: " + outFileName;
				} else {
					md5Value = this.getTiffMd5(outFileName);
					new OutputHandler().removeFile(outFileName);
				}
			}
			
			ResultBean resultBean = new ResultBean();
			resultBean.setExitValue(exitValue);
			resultBean.setStdout(stdOut);
			resultBean.setStderr(stdErr);
			resultBean.setOutFileMd5(md5Value);
			resultBean.setErrorMsg(errorMsg);
			return resultBean;
		} catch (Exception e) {
			ResultBean resultBean = new ResultBean();
			resultBean.setErrorMsg(e.getMessage());
			return resultBean;
		}
	}
	


	/**
	 * Execute an arbitrary command using .exec call. The output of the command is a file in the /tmp directory.
	 * The output file is processed with TiffMd5sum, and the result compared to the reference parameter
	 * If the results match the reference the temporary file is removed from the /tmp directory.
	 * If the results don't match the temporary file is left in place and the name is passed to the
	 * calling test.
	 * @param utilityCommand
	 * @param reference
	 * @return
	 * @author cbrann
	 * @since 2012-07-12
	 */
	public String convertFileToTiff(String utilityCommand, String reference) {
		String error = "";
		StringBuffer errBuff = new StringBuffer();
		String sum = "";
		OutputHandler out = new OutputHandler();
		String[] utilityOut = {"",""};
		try {
			// Create a file name
			String outFileName = makeFileName();
			// Execute the utility command
			utilityOut = executeCommand(utilityCommand, outFileName);
			// Check that we generated an output file
			if (!(new File(outFileName)).exists()){
				error = error + "\nMissing converted file: " + outFileName;
			}
			// Get TiffMd5sum of output file
			sum = this.getTiffMd5(outFileName);
			if (reference.contentEquals(sum.trim())){
				// test passed, so clear errors and cleanup
				error = "";
				out.removeFile(outFileName);
			} else {
				// Create JUnit failure statement
				errBuff.append("Error - calculated sum: " + sum + " does not match reference: " + reference);
				errBuff.append("\n  Command string:" + utilityCommand);
				errBuff.append("\n  Output");
				errBuff.append(utilityOut[1]);
				errBuff.append("\n  Converted file: ");
				errBuff.append(outFileName);
				error = errBuff.toString();
			}
		} catch (Exception e) {
			error = error + "\n" + e.getMessage();
		}
		return error;
	}
	
	/**
	 * Execute file conversion utility that produces a tiff file. Created to handle utilities that expect the
	 * command line options AFTER the source and output files. 
	 * The output of the command is a file in the /tmp directory.
	 * The output file is processed with TiffMd5sum, and the result compared to the reference parameter
	 * If the results match the reference the temporary file is removed from the /tmp directory.
	 * If the results don't match the temporary file is left in place and the name is passed to the
	 * calling test.
	 * @param utilityCommand
	 * @param source
	 * @param options
	 * @param reference
	 * @return
	 * @author cbrann
	 * @since 2012-07-12
	 */
	public String convertFileToTiffTrailingOptions(String utilityCommand,  String source, String options, String reference) {
		String error = "";
		StringBuffer errBuff = new StringBuffer();
		String sum = "";
		OutputHandler out = new OutputHandler();
		String[] utilityOut = {"",""};
		try {
			// Create a file name
			String outFileName = makeFileName();
			// Execute the utility command
			utilityOut = executeCommandTrailingOptions(utilityCommand, source, outFileName, options);
			// Check that we generated an output file
			if (!(new File(outFileName)).exists()){
				error = error + "\nMissing converted file: " + outFileName;
			}
			// Get TiffMd5sum of output file
			sum = this.getTiffMd5(outFileName);
			if (reference.contentEquals(sum.trim())){
				// test passed, so clear errors and cleanup
				error = "";
				out.removeFile(outFileName);
			} else {
				// Create JUnit failure statement
				errBuff.append("Error - calculated sum: " + sum + " does not match reference: " + reference);
				errBuff.append("\n");
				errBuff.append(utilityOut[1]);
				errBuff.append("\nConverted file: ");
				errBuff.append(outFileName);
				error = errBuff.toString();
			}
		} catch (Exception e) {
			error = error + "\n" + e.getMessage();
		}
		return error;
	}

	/**
	 * Execute an arbitrary command to send results to the supplied file name. Currently used by processFileTiff()
	 * @param utilityCommand  Command line utility AND associated parameters to be executed.
	 * @param outFileName  Converted destination file
	 * @return  Two element array containing the std out and std error from the command line utility
	 * @author cbrann
	 * @since 2012-07-12
	 */
	private String[] executeCommand(String utilityCommand, String outFileName){
		String[] out = {"",""};
		String output = "";
		String error = "";
		try {
			// Execute the utility command
			Process p = Runtime.getRuntime().exec(utilityCommand + " " + outFileName);
			// Get output
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			// Capture runtime errors
			while ((output = stdError.readLine()) != null) {
				error = error + output;
			}
			out[0] = stdInput.readLine();
			out[1] = error;
		} catch (Exception e) {
			out[1] = out[1] + "\n" + e.getMessage();
		}
		return out;
	}
	
	/**
	 * Execute an arbitrary command to send results to the supplied file name. Currently used by processFileTiffTrailingOptions()
	 * @param utilityCommand  Command line utility to be executed
	 * @param source  Initial file
	 * @param outFileName  Converted destination file
	 * @param options  Options to be provided to the command line utility. These are placed AFTER the destination file.
	 * @return  Two element array containing the std out and std error from the command line utility
	 * @author cbrann
	 * @since 2012-07-12
	 */
	private String[] executeCommandTrailingOptions(String utilityCommand, String source, String outFileName, String options){
		String[] out = {"",""};
		String output = "";
		String error = "";
		try {
			// Execute the utility command
			Process p = Runtime.getRuntime().exec(utilityCommand + " " + source + " " + outFileName + " " + options);
			// Get output
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			// Capture runtime errors
			while ((output = stdError.readLine()) != null) {
				error = error + output;
			}
			out[0] = stdInput.readLine();
			out[1] = error;
		} catch (Exception e) {
			out[1] = out[1] + "\n" + e.getMessage();
		}
		return out;
	}

	/**
	 * Execute Scene7 utility TiffMd5Sum
	 * @param outFileName
	 * @return TiffMd5Sum
	 * @author cbrann
	 * @since 2012-07-12
	 */
	public String getTiffMd5(String outFileName){
		String output = "";
		String error = "";
		String sum = "";
		StringBuffer inBuff = new StringBuffer();
		StringBuffer outBuff = new StringBuffer();
		try {
			// Execute the utility command
			Process p = Runtime.getRuntime().exec(UtilityHandler.tiffMd5sumPath + " " + outFileName);
			// Get output
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			// Capture runtime errors
			while ((output = stdError.readLine()) != null) {
				outBuff.append(output);
			}
			inBuff.append(stdInput.readLine());
			sum = inBuff.toString();
			error = outBuff.toString();
			if (error.length() > 0) {
				sum = sum + error;
			}
		} catch (Exception e) {
			sum = sum + "\n" + e.getMessage();
		}
		return sum.trim();
	}

	/**
	 * Execute basic md5sum and return sum
	 * Adding a line in branch 2013-09
	 * @param outFileName
	 * @return standard md5 sum
	 * @author cbrann
	 * @since 2012-07-12
	 */
	public String getMd5(String outFileName){
		String output = "";
		String error = "";
		String sum = "";
		StringBuffer inBuff = new StringBuffer();
		StringBuffer outBuff = new StringBuffer();
		try {
			// Execute the utility command
			Process p = Runtime.getRuntime().exec(UtilityHandler.linuxMd5Utility + " " + outFileName);
			// Get output
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			// Capture runtime errors
			while ((output = stdError.readLine()) != null) {
				outBuff.append(output);
			}
			inBuff.append(stdInput.readLine());
			sum = inBuff.toString().split("\\s+")[0];
			error = outBuff.toString();
			if (error.length() > 0) {
				sum = sum + "error: " + error;
			}
		} catch (Exception e) {
			sum = sum + "\n" + e.getMessage();
		}
		return sum.trim();
	}

	/**
	 * Create a unique string for use as a file name. Date is included so we can
	 * differentiate files that indicate failures. Method is synchronized to
	 *  prevent multiple tests using the same file name.
	 * @return String for use as file name
	 */
	public synchronized String makeFileName(){
		String path = null;
		SimpleDateFormat formatter = new SimpleDateFormat(fileNameFormat);
		Date now = new Date();
		UUID id = UUID.randomUUID();
		path = outputPath + "test_" + formatter.format(now) + "." + id;
		return path;
	}	
	
}
