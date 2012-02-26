package com.cwb.testing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

public class OutputHandler {
	public static String outputPath = "/tmp/requests/";
	public static String fileNameFormat = "yyyyMMddhhmmss.SSSS";
	
	/**
	 * Save an image to a file name based on a timestamp
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
			File outputfile = new File(path);
			ImageIO.write(bufImage, format, outputfile);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return path;
	}
}
