package com.cwb.request;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

/**
 * 
 * @author cbrann
 * @since 2012-05-09
 * 
 */
public class TextFileRequest {
	
	/**
	 * Save a text response to a file name based on a timestamp
	 * NOTE: Not currently used
	 * @param bufImage
	 * @param format
	 * @return
	 */	
	public String getText(String host, String port, String path, String query){
		
		URI uri = null;
		String textResponse = "";
	
		try {
			String scheme = "http";
			String authority = host + ":" + port;
			String fragment = "";
			try {
				uri = new URI(scheme, authority, path, query, fragment);
				URL url = uri.toURL();
				System.out.println("Path: " + url.getPath());
				System.out.println("Query: " + url.getQuery());
				String response = null;
				BufferedReader in = new BufferedReader(
				        new InputStreamReader(
				        url.openStream()));
				while ((response = in.readLine()) != null){
					textResponse += response;
				}
				System.out.println(textResponse);
				in.close();

			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		} catch (Exception e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return textResponse;
	}
}
