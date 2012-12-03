package com.cwb.testing;

import java.io.*;
import java.util.ArrayList;

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
