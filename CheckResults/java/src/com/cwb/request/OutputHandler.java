package com.cwb.request;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.imageio.ImageIO;

/**
 * 
 * @author cbrann
 * @since 2012-05-09
 * 
 */
public class OutputHandler {
	public static String outputPath = "/tmp/imgcheck/";
	public static String fileNameFormat = "yyyyMMddhhmmss.SSSS";
	
	/**
	 * Save an image to a file name (based on a timestamp)
	 * @param bufImage
	 * @param format
	 * @return
	 */
	public String saveImageFile(BufferedImage bufImage, String format){
		String path = null;
		SimpleDateFormat formatter = new SimpleDateFormat(fileNameFormat);
		Date now = new Date();
		path = outputPath + "test_" + formatter.format(now);
		try {
			File outputdir = new File(outputPath);
			if (!outputdir.exists()){
				outputdir.mkdir();
			}
			File outputfile = new File(path);
			ImageIO.write(bufImage, format, outputfile);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return path;
	}
	
	/**
	 * Save an image to a file name (based on a timestamp)
	 * @param rawResponse
	 * @param format
	 * @return
	 */
	public String saveRawResponseFile(byte[] rawResponse, String format){
		String path = null;
		SimpleDateFormat formatter = new SimpleDateFormat(fileNameFormat);
		Date now = new Date();
		path = outputPath + "test_" + formatter.format(now);
		try {
			File outputdir = new File(outputPath);
			if (!outputdir.exists()){
				outputdir.mkdir();
			}
			FileOutputStream outputfile = new FileOutputStream(path);
			outputfile.write(rawResponse);
			outputfile.flush();
			outputfile.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return path;
	}	
	
	public void removeFile(String name) {
		try {
			File file = new File(name);
			file.delete();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
