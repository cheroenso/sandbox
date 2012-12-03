package com.cwb.request;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.cwb.request.UtilityHandler;

public class UtilityKnockoutBackgroundTest {
	String host = "s7porto.macromedia.com";
	String dir = "/opt/jenkins/home/data/";
	String sourceDir = "/mnt/sjshare/automation_assets_sync/Utilities/KnockoutBackground/";
	public String UTILITY_PATH = "/usr/local/scene7/ImageServing/bin64/KnockoutBackground";
	String beforeErr = "";
	
	@Before
	public void checkDir(){
		try {
		File file = new File(UtilityHandler.outputPath);
		if (!file.exists() || !file.isDirectory() || !file.canWrite()){
			file.mkdir();
		}
		} catch (Exception e){
			beforeErr = "Error accessing " + UtilityHandler.outputPath;
			System.err.println("Error accessing " + UtilityHandler.outputPath);
		}		
	}

	@Test
	public void testKo_0001(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_2_RGB_background.tif";
		String reference = "3d61059f5249db0a977b35c245e82e40";
		String options = "ul 0 -floodfill";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(beforeErr + errorMsg, (errorMsg.length() == 0));
	}
	
	@Test
	public void testKo_0002(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "68208156fb598c37bb428c49283298a4";
		String options = "ul .1 -floodfill";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(beforeErr + errorMsg, (errorMsg.length() == 0));
	}	

	@Test
	public void testKo_0003(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "275e3f7055207d6a64fb4833ece3a3e9";
		String options = "ul .1 -matchpixel";
//		String errorMsg = uHandler.convertTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}	

	@Test
	public void testKo_0004(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "9643d8ad922cceec2078a5755011b4b3";
		String options = " ur .1 -floodfill";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}	

	@Test
	public void testKo_0005(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "0cb53f199b79200adda5fe294810780e";
		String options = " ur .1 -matchpixel";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}	
	
	@Test
	public void testKo_0006(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "c345ff136c79d908c272848f7befcabe";
		String options = " ll .1 -floodfill";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}	

	@Test
	public void testKo_0007(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "9ff5253541f93d25938cf25cefec403e";
		String options = " ll .1 -matchpixel";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}	

	@Test
	public void testKo_0008(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "048015a766ffbb8ee1b278aa101ecd29";
		String options = " lr .1 -floodfill";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}		
	
	@Test
	public void testKo_0009(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "bf81c3b6732616dfec6b1ed7808fd38d";
		String options = " lr .1 -matchpixel";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}	

	@Test
	public void testKo_0010(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "6452528afaf8adcb624a1b25cb264c5d";
		String options = " lr .1 -matchpixel -lzwcompress";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}	
	
	@Test
	public void testKo_0011(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "70e46ced1765b5b103e54135860222a0";
		String options = " lr .1 -matchpixel -uncompressed";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}	

	@Test
	public void testKo_0012(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "e16f24a58838ee1317c22a9dba9a1b70";
		String options = " lr .1 -matchpixel -createmask";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}	
	
	@Test
	public void testKo_0013(){
		UtilityHandler uHandler = new UtilityHandler();
		String sourceFile = sourceDir + "merry_spots.tif";
		String reference = "9c0ef29ee5d45f441ede560a5179aa0a";
		String options = " lr .1 -floodfill -createmask";
		String errorMsg = uHandler.convertFileToTiffTrailingOptions(UTILITY_PATH, sourceFile, options, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}		
}
