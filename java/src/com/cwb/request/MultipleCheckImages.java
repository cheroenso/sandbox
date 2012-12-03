package com.cwb.request;

import com.cwb.request.IsRequestProcessor;

/**
 * 
 * @author cbrann
 * @since 2012-05-09
 * 
 */
public class MultipleCheckImages {

	public static void main(String[] args){
		System.out.println("Requesting images...");
		StringBuffer buff = new StringBuffer();
		buff.append("\nUsage:");
		buff.append("\nDriver <host> <requestfile>");
		boolean totalSuccess = false;
		try {
			if (args == null || args.length != 2) {
				System.out.println(buff.toString());
				return;
			}

			IsRequestProcessor processor = new IsRequestProcessor();
			totalSuccess = processor.testImageFile(args[0], args[1]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}
	
}
