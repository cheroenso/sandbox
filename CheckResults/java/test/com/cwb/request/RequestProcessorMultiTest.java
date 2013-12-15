package com.cwb.request;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.cwb.request.InputHandler;
import com.cwb.request.IsRequestProcessor;


/**
 * Junit4 harness to Image Server and validate the response. Uses a data file for multiple tests.
 * @author cbrann
 * @since 2012-05-29
 * 
 */
@RunWith(Parameterized.class)
public class RequestProcessorMultiTest {
	//  Example requests, similar to what we expect to see in the request file
	//	static String testRequest1 = "jpg\t/is/image/demo/bedroom.tif\twid=200&flip=ud&cache=off\tc357bc45da4270266166a9464bd7a302";
	//	static String testRequest2 = "png\t/is/image/demo/small-art.tif\tfmt=png&op_blur=10\td6f2ebc234d5db1b3cc19975c907603e";
	public static String testHostPropertyName = "TEST_HOST";
	public static String testFilePropertyName = "TEST_REQUEST_FILE";
	// Default host, override by setting system property "TEST_HOST"
	public static String host = "s7porto.macromedia.com";
	// Default host, override by setting system property "TEST_REQUEST_FILE"
	public static String testFile = "/opt/jenkins/home/data/requests_demo.txt";
	private static String request;
	private IsRequestProcessor testProcessor;
	
    @Before
    public void initialize() {
    	this.testProcessor = new IsRequestProcessor();
    }

    public RequestProcessorMultiTest(String request, String unused){
    	RequestProcessorMultiTest.request = request;
	}	
    
    @Parameterized.Parameters(name="{0}")
    public static Collection<Object[]> requests(){
    	String myHost = System.getenv(testHostPropertyName);
    	String myFile = System.getenv(testFilePropertyName);
    	// Check for alternate host
    	if (myHost != null && myHost.length() > 0) {
    		host = myHost;
    	}
    	// Check for alternate file
    	if (myFile != null && myFile.length() > 0) {
    		testFile = myFile;
    	}
    	InputHandler inputHandler = new InputHandler();
		Collection<String> coll = inputHandler.getAllRequestsFromFile(testFile);
		Object[] objectArray = coll.toArray();
		Object[][] requestArray = new Object[objectArray.length][2];
    	for (int i = 0; i < objectArray.length; i++){
    		requestArray[i][0] = objectArray[i];
    	}
		return Arrays.asList(requestArray);
    }    
    
	@Test
	public void testIsRequestProcessor() {
		String results = testProcessor.testSingleImage(host, request);
		assertTrue(results, (results.length() == 0));
	}
	
}
