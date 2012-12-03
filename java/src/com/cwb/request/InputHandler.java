package com.cwb.request;

import java.io.*;
import java.util.ArrayList;

/**
 * 
 * @author cbrann
 * @since 2012-03-01
 * 
 */
public class InputHandler {

	/**
	 * Get requests from file
	 * @param fileName
	 * @return
	 */
	public ArrayList<String> getAllRequestsFromFile(String fileName){
		ArrayList<String> requestSet = new ArrayList<String>();
    	StringBuffer buff = new StringBuffer();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
	    	String line = null;
	    	while ((line = reader.readLine()) != null) {
	    		buff.append(line);	
	    		requestSet.add(line);
	    	}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return requestSet;	
	}
	
}
