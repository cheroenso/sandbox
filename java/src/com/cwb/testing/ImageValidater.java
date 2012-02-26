package com.cwb.testing;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import javax.imageio.ImageIO;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class ImageValidater {
	
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
			ImageIO.write(image, format, baos);
			baos.close();
			digest.update(baos.toByteArray());
			byte[] md5sum = digest.digest();
	        //convert the byte[] to hex format
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < md5sum.length; i++) {
	          sb.append(Integer.toString((md5sum[i] & 0xff) + 0x100, 16).substring(1));
	        }	

	        if (reference.contentEquals(sb.toString())){
	        	match = true;
//	        } else {
//	        	System.out.println("MD5 Difference");
//	        	System.out.println("orig: " + reference);
//	        	System.out.println(" new: " + sb.toString());
	        }
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return match;
	}

}
