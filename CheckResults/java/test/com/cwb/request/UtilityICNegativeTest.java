package com.cwb.request;

import static org.junit.Assert.assertTrue;

import java.io.File;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cwb.request.ResultBean;
import com.cwb.request.UtilityHandler;

/**
*
* @author Jun Zhang
* @since 2012-08-20
*
*/

public class UtilityICNegativeTest{
	public String UTILITY_PATH	= "/usr/local/scene7/ImageServing/bin64/ic";
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
	
	@Test
	public void test_WrongPara_0001() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm -1 250 250 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0002() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm d 250 250 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0003() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 5.1 250 250 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0004() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 6 250 250 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0005() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 251 250 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0006() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 1000 250 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0007() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 -1 250 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0008() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 s 250 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0009() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 250 256 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0010() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 250 2000 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0011() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 250 a 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0012() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 250 -1 1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0013() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 250 255 -1";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0014() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 250 255 2";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0015() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 250 255 a";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}

	@Test
	public void test_WrongPara_0016() {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options = "-convert -usm 2 250 255 10";
		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
				+ " " + srcFile);
		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
		assertTrue(result.getErrorMsg(), result.getStderr()
				.startsWith("Usage:"));
	}
}
