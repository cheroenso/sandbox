package com.cwb.testing;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageFileRequest {

	/**
	 * Request an image from the target server
	 * @param host
	 * @param port
	 * @param path
	 * @param query
	 * @return
	 */
	public BufferedImage getImage(String host, String port, String path, String query){
		URI uri = null;
		BufferedImage buffImage = null;

		try {
			String scheme = "http";
//			String authority = host + ":" + port;
			String authority = host;
			String fragment = "";
			try {
				uri = new URI(scheme, authority, path, query, fragment);
				URL url = uri.toURL();
				buffImage = ImageIO.read(url);
				if (buffImage == null){
					System.out.println("ERROR: empty response for: " + scheme + authority + path + query + fragment);
				}
			} catch (Exception e) {
				System.out.println("ERROR: request: " + scheme + authority + path + query + fragment);
				e.getMessage();
				e.printStackTrace();
			}
		} catch (Exception e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return buffImage;
	}
	public byte[] getStream(String host, String port, String path, String query){
		URI uri = null;
		byte[] bArray = null;

		try {
			String scheme = "http";
//			String authority = host + ":" + port;
			String authority = host;
			String fragment = "";
			ByteArrayOutputStream bais = new ByteArrayOutputStream();
			InputStream is = null;
			try {
				uri = new URI(scheme, authority, path, query, fragment);
				URL url = uri.toURL();
				is = url.openStream();
				byte[] byteChunk = new byte[4096];
				int i;
				while ((i = is.read(byteChunk)) > 0){
					bais.write(byteChunk, 0, i);
				}
//				if (bais == null){
//					System.out.println("ERROR: empty response for: " + scheme + authority + path + query + fragment);
//				}
			} catch (Exception e) {
				System.out.println("ERROR: request: " + scheme + authority + path + query + fragment);
				e.getMessage();
				e.printStackTrace();
			} finally {
				if (is != null){
					is.close();
				}
			}
			if (bais != null){
				bArray = bais.toByteArray();
			}
			
		} catch (Exception e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return bArray;
	}
}
