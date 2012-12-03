package com.cwb.testing;

import com.cwb.testing.RequestProcessor;

public class Driver {

	public static void main(String[] args){
		System.out.println("Starting test driver...");
		StringBuffer buff = new StringBuffer();
		buff.append("\nUsage:");
		buff.append("\nDriver <host> <requestfile>");
		try {
			if (args == null || args.length != 2) {
				System.out.println(buff.toString());
				return;
			}

			RequestProcessor processor = new RequestProcessor();
			processor.checkImageFiles(args[0], args[1]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}
	
}
