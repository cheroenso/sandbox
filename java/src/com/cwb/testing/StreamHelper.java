package com.cwb.testing;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

//import org.apache.commons.httpclient.URIException;
//import org.apache.commons.httpclient.util;
//import org.apache.http.client.utils.URIUtils;

//import com.sun.jndi.toolkit.url.UrlUtil;


public class StreamHelper {

	private static String uriScheme = "http";
	private static String httpAuth = "username:password";
	private static String encoding = "UTF-8";
	
	public void setUriScheme(String scheme){
		uriScheme = scheme;
	}
	
	public String getUriScheme(){
		return uriScheme;
	}
	
	public void setUserInfo(String userInfo){
		httpAuth = userInfo;
	}
	
	public String getUserInfo(){
		return httpAuth;
	}
	
	public static byte[] getBytesFromUriStream(String host, String port, String path, String query){
		URI uri = null;
		byte[] bArray = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		InputStream is = null;
		String authority = host + ":" + port;
		String fragment = "";
		try {
			uri = new URI(uriScheme, authority, path, query, fragment);
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
				baos.write(byteChunk, 0, i);
			}
			is.close();
		} catch (Exception e){
			e.getMessage();
			System.err.println("ERROR: for stream request: " + uriScheme + authority + "/" + path + "?" + query + fragment);
		} finally {
			if (is != null){
				try {
				is.close();
				} catch (IOException ioe){
					System.err.println(ioe.getMessage());
				}
			}
		}
		if (baos != null) {
			bArray = baos.toByteArray();
		}
		return bArray;
		
	}
	
	public static byte[] getBytesFromUriStreamAuth(String host, String port, String path, String query){
		URI uri = null;
		byte[] bArray = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		InputStream is = null;
		String authority = host + ":" + port;
		String fragment = "";
		try {
			uri = new URI(uriScheme, httpAuth, host, Integer.parseInt(port), URLEncoder.encode(path, encoding), query, fragment);
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
				baos.write(byteChunk, 0, i);
			}
			is.close();
		} catch (Exception e){
			e.getMessage();
			System.err.println("ERROR: for stream request: " + uriScheme + authority + "/" + path + "?" + query + fragment);
		} finally {
			if (is != null){
				try {
				is.close();
				} catch (IOException ioe){
					System.err.println(ioe.getMessage());
				}
			}
		}
		if (baos != null) {
			bArray = baos.toByteArray();
		}
		return bArray;
		
	}

}
