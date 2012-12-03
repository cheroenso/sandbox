package com.cwb.request;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Make requests to Image Server and validate the response.
 * @author cbrann
 * @since 2012-05-09
 * 
 */
public class IsRequestProcessor {
	public static String PORT = "8080";
	public static String COMMENT = "#";
	private static int IMAGE_TYPE = 0;
	private static int PATH_FIELD_NUMBER = 1;
	private static int REQUEST_FIELD_NUMBER = 2;
	private static int MD5_REFERENCE = 3;
	public static String JPG = "jpg";
	public static String PNG = "png";
	public static String GIF = "gif";
	public static String PDF = "pdf";
	public static String EPS = "eps";
	public static String TIF = "tif";
	public static String SWF = "swf";
	public static String TEXT = "text";
	

	/**
	 * Request image files and test for validity. Used by command line for checking multiple requests.
	 * The only test currently used is md5.
	 * Input file should have following fields in each line:
	 * <image type>		<path>		<query>		<reference md5>
	 * Expected delimiter is a tab
	 * TODO: add capability for checking text responses.
	 * TODO: add capability for checking xml files.
	 * TODO: add capability for checking eps, pdf, and other files that have embeded dates.
	 * @param host
	 * @param testFile
	 */
	public boolean testImageFile(String host, String testFile) {
		InputHandler inputHandler = new InputHandler();
		ArrayList<String> requestSet = inputHandler.getAllRequestsFromFile(testFile);
		Iterator<String> itr = requestSet.iterator();
		int count = 0;
		int errors = 0;
		boolean wasHandled;
		boolean allPassed = true;
		// check all the requests in the file
		System.out.println("Target host: " + host + ", source file: " + testFile);
		while (itr.hasNext()){
			wasHandled = false;
			String testLine = itr.next();
			String myTest = this.testSingleImage(host, testLine);
			if (myTest.length() > 0) {
				errors++;
			}
			wasHandled = true;
			count++;
			if (wasHandled) {
				// Progress bar
				System.out.print(".");
			}
		}
		System.out.println("\nTest finished, total requests handled: " + Integer.toString(count) + ", total errors: " + Integer.toString(errors));
		if (errors > 0){
			allPassed = false;
		}
		return allPassed;
	}
	
	/**
	 * Used by JUnit test, where we process each request separately.
	 * @param host
	 * @param testString
	 * @return
	 */
	public String testSingleImage(String host, String testString) {
		String port = PORT;
		String parsedRequest[] = null;
		String test = "";
			parsedRequest = testString.split("\t");
			if (parsedRequest.length > 3 && parsedRequest[IMAGE_TYPE].equalsIgnoreCase(PNG)){
				test = this.rawMd5Validation(host, port, parsedRequest);
			} else if (parsedRequest.length > 3 && parsedRequest[IMAGE_TYPE].equalsIgnoreCase(JPG)) {
				test = this.rawMd5Validation(host, port, parsedRequest);
			} else if (parsedRequest.length > 3 && parsedRequest[IMAGE_TYPE].equalsIgnoreCase(GIF)) {
				test = this.rawMd5Validation(host, port, parsedRequest);
			} else if (parsedRequest.length > 3 && parsedRequest[IMAGE_TYPE].equalsIgnoreCase(SWF)) {
				test = this.rawMd5Validation(host, port, parsedRequest);
			} else if (parsedRequest.length > 3 && parsedRequest[IMAGE_TYPE].equalsIgnoreCase(TIF)) {
				test = this.tiffMd5Validation(host, port, parsedRequest);
			} else if (parsedRequest.length > 3 && parsedRequest[IMAGE_TYPE].equalsIgnoreCase(EPS)) {
				System.out.println("\neps - NOT YET IMPLEMENTED"); // different md5 every request
			} else if (parsedRequest.length > 3 && parsedRequest[IMAGE_TYPE].equalsIgnoreCase(PDF)) {
				System.out.println("\npdf - NOT YET IMPLEMENTED"); // different md5 every request
			} else if (parsedRequest.length > 3 && parsedRequest[IMAGE_TYPE].equalsIgnoreCase(TEXT)) {
				System.out.println("\ntext request - NOT YET IMPLEMENTED");
			} else if (parsedRequest.length > 0 && parsedRequest[0].startsWith(COMMENT, 0)) {
				// Skip comments
			} else {
				System.out.println("\nunknown request");
				System.out.println(parsedRequest[0] + ":" + parsedRequest[IMAGE_TYPE] + "," + parsedRequest[PATH_FIELD_NUMBER] + "?" + parsedRequest[REQUEST_FIELD_NUMBER]);
			}
		if (test.length() > 0){
			System.out.println(test);
		}
		return test;
	}

	
	/**
	 * For checking a raw input stream.
	 * @param requestArr
	 * @return 0 length String if successful. If the test fails the returned string contains error message.
	 */
	private String rawMd5Validation(String host, String port, String[] parsedRequest){
		ImageFileRequest imageRequest = new ImageFileRequest();
		ImageValidater imageValidater = new ImageValidater();
		OutputHandler outputHandler = new OutputHandler();
		//  Switched to handling a regular stream instead of an image
		byte[] image = null;
		image = imageRequest.getStream(host, port, parsedRequest[PATH_FIELD_NUMBER], parsedRequest[REQUEST_FIELD_NUMBER] );
		String imageType = parsedRequest[IMAGE_TYPE];
		String referenceMD5 = parsedRequest[MD5_REFERENCE];
		StringBuffer message = new StringBuffer();
		if (image != null && !imageValidater.compareByteArrMD5(image, imageType, referenceMD5)) {
			String testfile = outputHandler.saveRawResponseFile(image, imageType);
			message.append("\nMD5 difference for: " + host + ":" + port + parsedRequest[PATH_FIELD_NUMBER] + "?" + parsedRequest[REQUEST_FIELD_NUMBER]);
			message.append("\nreference md5: " + referenceMD5);
			message.append("\nNew file saved as: " + testfile);
		}		
		return message.toString();
	}

	private String tiffMd5Validation(String host, String port, String[] parsedRequest){
		ImageFileRequest imageRequest = new ImageFileRequest();
		ImageValidater imageValidater = new ImageValidater();
		OutputHandler outputHandler = new OutputHandler();
		byte[] image = null;
		image = imageRequest.getStream(host, port, parsedRequest[PATH_FIELD_NUMBER], parsedRequest[REQUEST_FIELD_NUMBER] );
		String imageType = parsedRequest[IMAGE_TYPE];
		String referenceMD5 = parsedRequest[MD5_REFERENCE];
		StringBuffer message = new StringBuffer();
		if (image != null && !imageValidater.compareTiffByteArrMD5(image, imageType, referenceMD5)) {
			String testfile = outputHandler.saveRawResponseFile(image, imageType);
			message.append("\nTiffMd5 difference for: " + host + ":" + port + parsedRequest[PATH_FIELD_NUMBER] + "?" + parsedRequest[REQUEST_FIELD_NUMBER]);
			message.append("\nreference TiffMd5: " + referenceMD5);
			message.append("\nNew file saved as: " + testfile);
		}		
		return message.toString();
	}

	/**
	 * For checking a Java image object.
	 * @param requestArr
	 * @return 0 length String if successful. If the test fails the returned string contains error message.
	 */
	private String imageMd5Validation(String host, String port, String[] parsedRequest){
		ImageFileRequest imageRequest = new ImageFileRequest();
		ImageValidater imageValidater = new ImageValidater();
		OutputHandler outputHandler = new OutputHandler();
		BufferedImage image = imageRequest.getImage(host, port, parsedRequest[PATH_FIELD_NUMBER], parsedRequest[REQUEST_FIELD_NUMBER] );
		String imageType = parsedRequest[IMAGE_TYPE];
		String referenceMD5 = parsedRequest[MD5_REFERENCE];
		StringBuffer message = new StringBuffer();
		if (image != null && !imageValidater.compareImageMD5(image, imageType, referenceMD5)) {
			String testfile = outputHandler.saveImageFile(image, imageType);
			message.append("MD5 difference for: " + host + port + parsedRequest[PATH_FIELD_NUMBER] + parsedRequest[REQUEST_FIELD_NUMBER]);
			message.append("reference md5: " + referenceMD5);
			message.append("New file saved as: " + testfile);
		}		
		return message.toString();
	}
	
}
