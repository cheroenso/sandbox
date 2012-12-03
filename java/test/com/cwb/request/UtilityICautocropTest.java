package com.cwb.request;

import static org.custommonkey.xmlunit.XMLAssert.assertXMLEqual;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.ElementNameAndTextQualifier;
//import org.custommonkey.xmlunit.XMLTestCase;
//import org.custommonkey.xmlunit.XMLUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import static org.custommonkey.xmlunit.XMLAssert.*;

public class UtilityICautocropTest {

	public String UTILITY_PATH	= "/usr/local/scene7/ImageServing/bin64/ic";
	public String CMD_IMAGEINFO	= "/usr/local/scene7/ImageServing/bin64/ImageInfo";
	public UtilityHandler uHandler = new UtilityHandler();

	@Before
	public void checkDir(){
		try {
		File file = new File(UtilityHandler.outputPath);
		if (!file.exists() || !file.isDirectory()){
			file.mkdir();
		}
		} catch (Exception e){
			System.err.println("Error accessing " + UtilityHandler.outputPath);
		}		
	}
	
//	@Test
//	public void testInfo_0001() throws Exception {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.tif";
//		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
//		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.tif\" ImageWidth=\"504\" ImageHeight=\"360\" ImagePixelEncoding=\"TIFF deflate\" ImageTileBytes=\"49152\" ImageBytes=\"115450\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"true\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Scene7 Image Converter 5.1.0\" /> <IptcInfo /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"Path 1\" > </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
//		assertXMLEqual("Compare image info result", infoExpect, infocontent);
//	}
	
	@Test
	public void testIc_0001() throws Exception {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert";
		String reference	= "9c599c730d188a89a6285c12d06a0921";
		String xCrop = "0";
		String yCrop = "0";
		String height = "0";
		String width = "0";
//		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
//		
//		assertTrue(errorMsg, (errorMsg.length() == 0));
        String myControlXML = "<msg><uuid>0x00435A8C</uuid></msg>";
//        String myTestXML = "<msg><localId>2376</localId></msg>";
        String myTestXML = "<msg><uuid>2376</uuid></msg>";
        try {
        	assertXMLEqual("Comparing test xml to control xml",
                       myControlXML, myTestXML);
        	// list all differences
        	DetailedDiff myDiff = new DetailedDiff(new Diff(myControlXML, myTestXML));
            List allDifferences = myDiff.getAllDifferences();
            assertEquals(myDiff.toString(), 2, allDifferences.size());
        } catch (Exception e) {
        	// If test encounters an error print the Exception message and fail the test
        	assertTrue(e.getMessage(), false);
        }
	}
	
	@Test
	public void testIc_0002(){
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert";
		String reference	= "9c599c730d188a89a6285c12d06a0921";
		String xCrop = "0";
		String yCrop = "0";
		String height = "0";
		String width = "0";
//		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
//
//		assertTrue(errorMsg, (errorMsg.length() == 0));
		//        String myControlXML = "<msg><uuid>0x00435A8C</uuid></msg>";
		//        String myTestXML = "<msg><localId>2376</localId></msg>";
		String myControlXML = "<suite>"
				+ "<test status=\"pass\">FirstTestCase</test>"
				+ "<test status=\"pass\">SecondTestCase</test></suite>";
		String myTestXML = "<suite>"
				+ "<test status=\"pass\">SecondTestCase</test>"
				+ "<test status=\"pass\">FirstTestCase</test></suite>";
		//            assertXMLNotEqual("Repeated child elements in different sequence order are not equal by default",
		//                              myControlXML, myTestXML);
		//            Diff myDiff = new Diff(myControlXML, myTestXML);
		//            myDiff.overrideElementQualifier(new ElementNameAndTextQualifier());
		//            assertXMLEqual("But they are equal when an ElementQualifier controls which test element is compared with each control element",
		//                            myDiff, true);
		try {
			assertXMLNotEqual("Repeated child elements in different sequence order are not equal by default",
					myControlXML, myTestXML);
			Diff myDiff = new Diff(myControlXML, myTestXML);
			myDiff.overrideElementQualifier(new ElementNameAndTextQualifier());
			assertXMLEqual("But they are equal when an ElementQualifier controls which test element is compared with each control element",
					myDiff, true);
		} catch (Exception e) {
			// If test encounters an error print the Exception message and fail the test
			assertTrue(e.getMessage(), false);
		}
	}
	
	@Test
	public void testIc_0003(){
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert";
		String reference	= "9c599c730d188a89a6285c12d06a0921";
		String xCrop = "0";
		String yCrop = "0";
		String height = "0";
		String width = "0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);

	    String mySolarSystemXML = "<solar-system>"
	            + "<planet name='Earth' position='3' supportsLife='yes'/>"
	            + "<planet name='Venus' position='4'/></solar-system>";
	    try {
	        assertXpathExists("//planet[@name='Earth']", mySolarSystemXML);
	        assertXpathNotExists("//star[@name='alpha centauri']",
	                             mySolarSystemXML);
	        assertXpathsEqual("//planet[@name='Earth']",
	                          "//planet[@position='3']", mySolarSystemXML);
	        assertXpathsNotEqual("//planet[@name='Venus']",
	                             "//planet[@supportsLife='yes']",
	                             mySolarSystemXML);
		} catch (Exception e) {
			// If test encounters an error print the Exception message and fail the test
			assertTrue(e.getMessage(), false);
		}
	}
	
	public String getInfo(String cmd) {
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(
					p.getErrorStream()));
			String line = null;
			while ((line = stdError.readLine()) != null) {
				System.out.println("Error: returned: \n" + line);
			}
			String xmlcontent = "";
			for (int i = 0; (line = stdInput.readLine()) != null; i++) {
				if ((i > 296) && (i != 299)) {
					xmlcontent += line;
				}
			}
			xmlcontent = xmlcontent.replaceAll("\\s+|\\t+", " ");
			return xmlcontent;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
}
