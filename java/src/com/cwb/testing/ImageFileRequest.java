package com.cwb.testing;

import java.awt.image.BufferedImage;
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
//			String scheme = "http://";
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
}
