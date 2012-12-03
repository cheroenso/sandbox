package com.cwb.request;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import java.security.MessageDigest;

/**
 * 
 * @author cbrann
 * @since 2012-03-01
 * 
 */
public class ImageValidater {
	public static String md5sumPath = "/sbin/md5";
	public static String md5Utility = "TIFF_MD5_UTILITY";

	/**
	 * Returns true if the reference string matches the md5 string for the BufferedImage
	 * @param image
	 * @param format
	 * @param reference
	 * @return 
	 */
 	public boolean compareImageMD5(BufferedImage image, String format, String reference){
		boolean match = false;
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			// Convert image to byte array
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			if (image != null && format != null) {
				ImageIO.write(image, format, baos);
				baos.close();
				digest.update(baos.toByteArray());
				byte[] md5sum = null;
				if (format.equalsIgnoreCase(IsRequestProcessor.PNG)){
					md5sum = digest.digest();
				} else if (format.equalsIgnoreCase(IsRequestProcessor.JPG)) {
					md5sum = digest.digest();					
				} else if (format.equalsIgnoreCase(IsRequestProcessor.TIF)) {
					System.out.println(".tif files not enabled");
					return match;		
				} else {
					System.err.println("Unsupported image type, md5 checking not emabled.");
					return match;
				}
				//convert the byte[] to hex format
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < md5sum.length; i++) {
					sb.append(Integer.toString((md5sum[i] & 0xff) + 0x100, 16).substring(1));
				}	

	        	if (reference.contentEquals(sb.toString())){
	        		match = true;
	        	}
			} else {
				System.err.println("no image returned, skipping validation");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return match;
	}

	/**
	 * Returns true if the reference string matches the md5 string for the raw byte array
	 * @param image
	 * @param format
	 * @param reference
	 * @return 
	 */
	public boolean compareByteArrMD5(byte[] rawResponse, String format, String reference){
		boolean match = false;
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			// Convert image to byte array
			if (rawResponse != null && format != null) {
				digest.update(rawResponse);
				byte[] md5sum = null;
					md5sum = digest.digest();
				//convert the byte[] to hex format
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < md5sum.length; i++) {
					sb.append(Integer.toString((md5sum[i] & 0xff) + 0x100, 16).substring(1));
				}
	        	if (reference.contentEquals(sb.toString())){
	        		match = true;
	        	} else {
					System.out.println("\nMismatch - calculated sum: " + sb.toString());
	        	}
			} else {
				System.err.println("no image returned, skipping validation");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return match;
	}

	/**
	 * Returns true if the reference string matches the stable MD5 string
	 * @param rawResponse
	 * @param format
	 * @param reference
	 * @return
	 */
	public boolean compareTiffByteArrMD5(byte[] rawResponse, String format, String reference){
		boolean match = false;
		try {
			if (rawResponse != null && format != null) {
				StringBuffer sb = new StringBuffer();
				String s = null;
		    	String tiffMd5Path = System.getenv(md5Utility);
		    	// Get TiffMd5 location from environment, defaulting to hard coded path
		    	if (tiffMd5Path == null || tiffMd5Path.length() < 10){
		    		tiffMd5Path = md5sumPath;
		    	}

		    	// TiffMd5Sum relies on reading a disk file, so we write the response to a temporary file
		    	OutputHandler out = new OutputHandler();
		    	String rawFileName = out.saveRawResponseFile(rawResponse, OutputHandler.fileNameFormat);
				Process p = Runtime.getRuntime().exec(md5sumPath + " " + rawFileName);
	            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
	            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

	            // read the output from the command
	            sb.append(stdInput.readLine());
	            while ((s = stdError.readLine()) != null) {
	            	System.out.println(s);
	            }
	            // compare calculated to reference value
	        	if (reference.contentEquals(sb.toString())){
	        		match = true;
	        	} else {
					System.out.println("\nMismatch - calculated sum: " + sb.toString());
	        	}
        		// clean up temporary file. If it didn't match it will be saved by the calling method
        		out.removeFile(rawFileName);
			} else {
				System.err.println("no image returned, skipping validation");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return match;
	}

}
