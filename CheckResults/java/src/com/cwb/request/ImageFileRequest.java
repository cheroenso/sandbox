package com.cwb.request;

import java.awt.image.BufferedImage;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

/**
 * 
 * @author cbrann
 * @since 2012-03-01
 * 
 */
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
			String authority = host + ":" + port;
			String fragment = "";
			try {
				uri = new URI(scheme, authority, path, query, fragment);
				URL url = uri.toURL();
				try {
					buffImage = ImageIO.read(url);
				} catch (javax.imageio.IIOException iioe) {
					System.out.println("\nERROR retrieving " + scheme + authority + path + query + fragment);
					System.out.println(iioe.getMessage());
					buffImage = null;
				}
			} catch (Exception e) {
				System.out.println("ERROR request: " + scheme + authority + path + "?" + query + fragment);
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
			String authority = host + ":" + port;
			String fragment = "";
			ByteArrayOutputStream bais = new ByteArrayOutputStream();
			InputStream is = null;
			try {
				uri = new URI(scheme, authority, path, query, fragment);
				URL url = uri.toURL();
				try {
					is = url.openStream();
				} catch (IOException ioe) {
					System.err.println(ioe.getMessage());
					System.err.println("request: " + url);
				}
				byte[] byteChunk = new byte[4096];
				int i;
				while (is != null && (i = is.read(byteChunk)) > 0){
					bais.write(byteChunk, 0, i);
				}
			} catch (Exception e) {
				System.out.println("ERROR: stream request: " + scheme + authority + path + "?" + query + fragment);
				e.getMessage();
//				e.printStackTrace();
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
