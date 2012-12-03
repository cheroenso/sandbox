package com.cwb.testing;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;

public class RequestProcessor {
	public static String IMAGE = "image";
	public static String TEXT = "text";
	public static String PORT = "80";
	private static int PATH_FIELD_NUMBER = 1;
	private static int REQUEST_FIELD_NUMBER = 2;
	private static int IMAGE_TYPE = 3;
	private static int MD5_REFERENCE = 4;
	
	/**
	 * Request image files and test for validity. Only test currently used is md5.
	 * Input file is tab belimited and should have following fields in each line:
	 * <image|text>		<path>		<query>		<image type>	<md5>
	 * @param host
	 * @param requestFile
	 */
	public void checkImageFiles(String host, String requestFile) {
		String port = PORT;
		String parsedRequest[] = null;
		InputHandler inputHandler = new InputHandler();
		OutputHandler outputHandler = new OutputHandler();
		ImageFileRequest imageRequest = new ImageFileRequest();
		TextFileRequest textRequest = new TextFileRequest();
		ImageValidater imageValidater = new ImageValidater();
		BufferedImage image = null;
		byte[] streamAsBytes = null;
		String imageType = null;
		String referenceMD5 = null;
		ArrayList<String> requestSet = inputHandler.getAllRequestsFromFile(requestFile);
		Iterator<String> itr = requestSet.iterator();
		int count = 0;
		int errors = 0;
		// check all the requests in the file
		System.out.println("Target host: " + host + ", source file: " + requestFile);
		while (itr.hasNext()){
			count++;
			parsedRequest = itr.next().split("\t");
			if (parsedRequest.length > 0 && parsedRequest[0].equalsIgnoreCase(IMAGE)){
				image = imageRequest.getImage(host, port, parsedRequest[PATH_FIELD_NUMBER], parsedRequest[REQUEST_FIELD_NUMBER]);
				streamAsBytes = imageRequest.getStream(host, port, parsedRequest[PATH_FIELD_NUMBER], parsedRequest[REQUEST_FIELD_NUMBER]);
				System.out.println("streamAsBytes: " + Integer.toString(streamAsBytes.length));
				imageType = parsedRequest[IMAGE_TYPE];
				referenceMD5 = parsedRequest[MD5_REFERENCE];
				if (!imageValidater.compareImageMD5(image, imageType, referenceMD5)) {
					String testfile = outputHandler.saveImageFile(image, imageType);
					System.out.println("MD5 difference for: " + host + port + parsedRequest[PATH_FIELD_NUMBER] + parsedRequest[REQUEST_FIELD_NUMBER]);
					System.out.println("reference md5: " + referenceMD5);
					System.out.println("New file saved as: " + testfile);
					errors++;
				}				
				if (!imageValidater.compareByteArrayMD5(streamAsBytes, imageType, referenceMD5)) {
					String testfile = outputHandler.saveImageFile(image, imageType);
					System.out.println("MD5 byte difference for: " + host + port + parsedRequest[PATH_FIELD_NUMBER] + parsedRequest[REQUEST_FIELD_NUMBER]);
					System.out.println("byte reference md5: " + referenceMD5);
					System.out.println("New file saved as: " + testfile);
					errors++;
				}				} else if (parsedRequest.length > 0 && parsedRequest[0].equalsIgnoreCase(TEXT)) {
				System.out.println("text request - NOT YET IMPLEMENTED");
//				String temp = textRequest.getText(host, port, parsedRequest[PATH_FIELD_NUMBER], "");
//				System.out.println(temp);
//				if (temp.equalsIgnoreCase(parsedRequest[3])){
//					System.out.println("response matches");
//				} else {
//					System.out.println("FAILURE");
//					System.out.println("test:");
//					System.out.println(temp);
//					System.out.println("sample:");
//					System.out.println(parsedRequest[3]);
//				}
			} else {
				System.err.println("unknown or invalid record at line " + Integer.toString(count));
			}
			System.out.print(".");
		}
		System.out.println("\nTest finished, total requests handled: " + Integer.toString(count) + ", total errors: " + Integer.toString(errors));
	}

}
