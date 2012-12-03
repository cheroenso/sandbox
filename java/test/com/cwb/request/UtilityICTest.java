package com.cwb.request;

import static org.junit.Assert.assertTrue;

import java.io.File;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cwb.request.UtilityHandler;

/**
*
* @author Jun Zhang
* @author cbrann
* @since 2012-06-11
*
*/

public class UtilityICTest{
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
	public void testIc_0001() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert";
		String reference	= "9c599c730d188a89a6285c12d06a0921";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0002() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert";
		String reference	= "6511012a80a08acfb49b8ac859319084";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0003() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0004() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0005() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert";
		String reference	= "57b7570fb4f73e41b30647d4b6bda0e4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0006() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0007() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0008() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0009() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert";
		String reference	= "4c401817dee1b5ef0d662e3edbb5ea86";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0010() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert";
		String reference	= "3dc43328382c424d7844d3a960fc29f3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0011() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert";
		String reference	= "17454507590b894c9ae6cd41fb6e4d25";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0012() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0013() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert";
		String reference	= "ec0caed7483b8889010dcb7904af6cf6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0014() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0015() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert";
		String reference	= "6f993e796c1fdaf55ac533f49fdca349";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0016() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0017() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0018() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0019() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert";
		String reference	= "5feb37282b5ba8a5c0b24ccc8870d8b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0020() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert";
		String reference	= "8c318dc91a6e68d9971ddcae5586e51a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0021() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert";
		String reference	= "ed7481d746dfcac300f66a473fbd943e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0022() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert";
		String reference	= "dae31f4fda694b02ec4985228053fecf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0023() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert";
		String reference	= "f077a9c7b530e20a9138860bccdd42c3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0024() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert";
		String reference	= "247ee34d097da7ed4c695bfa559ada73";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0025() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert";
		String reference	= "5813da7947f1101f8ba6e1f3d87ab10a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0026() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert";
		String reference	= "e758a141d60722d263ffec7bc4925c24";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0027() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert";
		String reference	= "c6dfdb0cd934612fd76402b5c1f5be7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0028() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert";
		String reference	= "8ed88d9a97e1077e06e910ceca8377c5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0029() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert";
		String reference	= "f0ff98bb6fff98f302966c5d279d51d8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Ignore
	public void TestIc_0029_png_2_bit(){
		// The following file does not exist, and we don't currently have a way to generate it
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_2/Untitled-2.png";		
	}

	@Ignore
	public void TestIc_0029_png_4_bit(){
		// The following file does not exist, and we don't currently have a way to generate it
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_4/Untitled-2.png";		
	}
	
	@Test
	public void testIc_0030() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert";
		String reference	= "c4c28ecafe15f7ef024278291287f562";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0031() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert";
		String reference	= "ad9c05e06aaffb4ebcc7730a8c2a1d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0032() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert";
		String reference	= "9635d11fca86ee8044d4ed5bff011149";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0033() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert";
		String reference	= "15ab2efca793c8014298c426b1ff013a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0034() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert";
		String reference	= "15fb20519748110b9359d0712f9de983";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0035() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0036() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0037() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0038() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert";
		String reference	= "27a7c8a5a438eb6aee01a465413469a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0039() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert";
		String reference	= "84a2f2ce9033af64626f48c8ac70c92d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0040() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert";
		String reference	= "116d3a2781445c271dd74245ac137114";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0041() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0042() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert";
		String reference	= "259d7f724fddfb6a47832e36ba1e1190";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0043() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0044() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert";
		String reference	= "b5b14f891f40fb2833e149fe9727973e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0045() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0046() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0047() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert";
		String reference	= "43a33abbd2dc0710232ed92dc4ce86af";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0048() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0049() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert";
		String reference	= "c4f5795e76429f78efe9ab1f2bc25ff2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0050() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert";
		String reference	= "f312986f715178ef3185a6c80fa90a60";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0051() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert";
		String reference	= "c0de80ce588bb9e45bcd32efbfeedc4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0052() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0053() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert";
		String reference	= "3683926382e24effbbe82a0e1fec72dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0054() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert";
		String reference	= "d7b62480a61401a388939cda36d8f075";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0055() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert";
		String reference	= "366527b338adc54504a6e14d8c9308f7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0056() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0057() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0058() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0059() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert";
		String reference	= "8a3f657ee891648a572cd3cefa42f101";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0060() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert";
		String reference	= "dd324171c7555e15cc3cd4640b115c3d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0061() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert";
		String reference	= "dde88d57456444f3143b1b3d86e9cfc4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0062() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0063() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -uncompressed";
		String reference	= "83cfbf9620024e0bea87cc0af71b13f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0064() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -uncompressed";
		String reference	= "841b72347318233c1c0bc7fd3ca46f9a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0065() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -uncompressed";
		String reference	= "ec36499ca493cd4959860fd56552132f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0066() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -uncompressed";
		String reference	= "ec36499ca493cd4959860fd56552132f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0067() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -uncompressed";
		String reference	= "de829f456c17bcb2664d80a684b96fba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0068() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -uncompressed";
		String reference	= "2c380af041873ac4d25894fe22aa36fe";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0069() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -uncompressed";
		String reference	= "2c380af041873ac4d25894fe22aa36fe";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0070() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -uncompressed";
		String reference	= "ec36499ca493cd4959860fd56552132f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0071() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -uncompressed";
		String reference	= "83d03901fb82e089f1a79baae5df9700";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0072() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -uncompressed";
		String reference	= "8e5db484e96a9032505a585e0cfb7642";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0073() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -uncompressed";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0074() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -uncompressed";
		String reference	= "ceec08dcd834d8046cadc459db3d869e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0075() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -uncompressed";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0076() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -uncompressed";
		String reference	= "e2b4447546aaff13e9801bf270137701";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0077() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -uncompressed";
		String reference	= "6bbcc9f969c8662b8a2ee15584a055ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0078() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -uncompressed";
		String reference	= "e2b4447546aaff13e9801bf270137701";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0079() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -uncompressed";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0080() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -uncompressed";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0081() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -uncompressed";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0082() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -uncompressed";
		String reference	= "271ce8a0552d7690e8552ab1daf64369";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0083() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -uncompressed";
		String reference	= "fbc7468a316de49d3daf42a1c619d214";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0084() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -uncompressed";
		String reference	= "b1b2148d8a5e05b7309a8d076b455331";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0085() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -uncompressed";
		String reference	= "55dc20257bf033bcca072d50e13d9b99";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0086() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -uncompressed";
		String reference	= "30f2a57d4123eb3bd788f700071afd77";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0087() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -uncompressed";
		String reference	= "1ba872c6d2f9987599fa5bb07c11a791";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0088() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -uncompressed";
		String reference	= "d082e6a129b5d32715cdfae5fa5b90c7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0089() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -uncompressed";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0090() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -uncompressed";
		String reference	= "946925039cf8d7a180bdac89ef7a1e7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0091() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -uncompressed";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0092() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -uncompressed";
		String reference	= "67e3763f63646366d62b522ad7cc69fc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0093() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -uncompressed";
		String reference	= "686f3ed3bf6ab5db0554fd896cfcc812";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0094() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -uncompressed";
		String reference	= "7226c971ff2e149f0bfb35d6ca482b66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0095() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -uncompressed";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0096() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -uncompressed";
		String reference	= "9f8f600a6021c967cbcb6289a083d4d9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0097() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -uncompressed";
		String reference	= "4438dce3ab2e80cbb6c8f113ce7c61e7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0098() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -uncompressed";
		String reference	= "4438dce3ab2e80cbb6c8f113ce7c61e7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0099() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -uncompressed";
		String reference	= "4438dce3ab2e80cbb6c8f113ce7c61e7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0100() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -uncompressed";
		String reference	= "b95612100f184f5047e920ab0f634cf1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0101() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -uncompressed";
		String reference	= "549f75112bc36e084fc996f9a69b165a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0102() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -uncompressed";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0103() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -uncompressed";
		String reference	= "5ed1adedeba040a729f4f74a7bded877";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0104() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -uncompressed";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0105() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -uncompressed";
		String reference	= "5ed1adedeba040a729f4f74a7bded877";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0106() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -uncompressed";
		String reference	= "9871f91ee6c0d907200ec618941150c1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0107() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -uncompressed";
		String reference	= "8d4ec2ffd8af5889885cee7bbb0be4a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0108() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -uncompressed";
		String reference	= "5ed1adedeba040a729f4f74a7bded877";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0109() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -uncompressed";
		String reference	= "de3088533ad5f35eb8316daef059d520";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0110() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -uncompressed";
		String reference	= "8d4ec2ffd8af5889885cee7bbb0be4a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0111() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -uncompressed";
		String reference	= "520cbf7e1af01bb93f812be518f7534d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0112() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -uncompressed";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0113() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -uncompressed";
		String reference	= "41d9c40f7b8006c2d05bc91837a56106";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0114() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -uncompressed";
		String reference	= "8d4ec2ffd8af5889885cee7bbb0be4a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0115() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -uncompressed";
		String reference	= "5a9589a8d562fb9ad5428c5428030837";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0116() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -uncompressed";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0117() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -uncompressed";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0118() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -uncompressed";
		String reference	= "a5a09b6b51f51fa2a66e3af90988ac4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0119() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -uncompressed";
		String reference	= "a5a09b6b51f51fa2a66e3af90988ac4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0120() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -uncompressed";
		String reference	= "a5a09b6b51f51fa2a66e3af90988ac4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0121() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -uncompressed";
		String reference	= "39adef8e0f6c0b4cababa13b0dd4b450";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0122() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -uncompressed";
		String reference	= "d1df8a571864a99c13842077726c11d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0123() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -uncompressed";
		String reference	= "839da0546dc840e0206399242b1751e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0124() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -uncompressed";
		String reference	= "a5a09b6b51f51fa2a66e3af90988ac4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0125() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -deflatecompress";
		String reference	= "9c599c730d188a89a6285c12d06a0921";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0126() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -deflatecompress";
		String reference	= "6511012a80a08acfb49b8ac859319084";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0127() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -deflatecompress";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0128() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -deflatecompress";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0129() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -deflatecompress";
		String reference	= "57b7570fb4f73e41b30647d4b6bda0e4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0130() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -deflatecompress";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0131() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -deflatecompress";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0132() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -deflatecompress";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0133() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -deflatecompress";
		String reference	= "4c401817dee1b5ef0d662e3edbb5ea86";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0134() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "3dc43328382c424d7844d3a960fc29f3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0135() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "17454507590b894c9ae6cd41fb6e4d25";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0136() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0137() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "ec0caed7483b8889010dcb7904af6cf6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0138() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0139() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "6f993e796c1fdaf55ac533f49fdca349";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0140() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0141() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0142() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0143() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "5feb37282b5ba8a5c0b24ccc8870d8b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0144() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -deflatecompress";
		String reference	= "8c318dc91a6e68d9971ddcae5586e51a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0145() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -deflatecompress";
		String reference	= "ed7481d746dfcac300f66a473fbd943e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0146() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -deflatecompress";
		String reference	= "dae31f4fda694b02ec4985228053fecf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0147() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -deflatecompress";
		String reference	= "f077a9c7b530e20a9138860bccdd42c3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0148() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -deflatecompress";
		String reference	= "247ee34d097da7ed4c695bfa559ada73";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0149() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -deflatecompress";
		String reference	= "5813da7947f1101f8ba6e1f3d87ab10a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0150() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -deflatecompress";
		String reference	= "e758a141d60722d263ffec7bc4925c24";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0151() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -deflatecompress";
		String reference	= "c6dfdb0cd934612fd76402b5c1f5be7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0152() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -deflatecompress";
		String reference	= "8ed88d9a97e1077e06e910ceca8377c5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0153() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -deflatecompress";
		String reference	= "f0ff98bb6fff98f302966c5d279d51d8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0154() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -deflatecompress";
		String reference	= "c4c28ecafe15f7ef024278291287f562";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0155() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -deflatecompress";
		String reference	= "ad9c05e06aaffb4ebcc7730a8c2a1d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0156() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -deflatecompress";
		String reference	= "9635d11fca86ee8044d4ed5bff011149";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0157() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -deflatecompress";
		String reference	= "15ab2efca793c8014298c426b1ff013a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0158() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -deflatecompress";
		String reference	= "15fb20519748110b9359d0712f9de983";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0159() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0160() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0161() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0162() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "27a7c8a5a438eb6aee01a465413469a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0163() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -deflatecompress";
		String reference	= "84a2f2ce9033af64626f48c8ac70c92d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0164() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "116d3a2781445c271dd74245ac137114";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0165() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0166() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "259d7f724fddfb6a47832e36ba1e1190";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0167() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0168() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "b5b14f891f40fb2833e149fe9727973e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0169() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0170() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0171() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "43a33abbd2dc0710232ed92dc4ce86af";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0172() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0173() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "c4f5795e76429f78efe9ab1f2bc25ff2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0174() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "f312986f715178ef3185a6c80fa90a60";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0175() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "c0de80ce588bb9e45bcd32efbfeedc4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0176() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -deflatecompress";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0177() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -deflatecompress";
		String reference	= "3683926382e24effbbe82a0e1fec72dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0178() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -deflatecompress";
		String reference	= "d7b62480a61401a388939cda36d8f075";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0179() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -deflatecompress";
		String reference	= "366527b338adc54504a6e14d8c9308f7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0180() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -deflatecompress";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0181() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -deflatecompress";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0182() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -deflatecompress";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0183() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -deflatecompress";
		String reference	= "8a3f657ee891648a572cd3cefa42f101";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0184() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -deflatecompress";
		String reference	= "dd324171c7555e15cc3cd4640b115c3d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0185() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -deflatecompress";
		String reference	= "dde88d57456444f3143b1b3d86e9cfc4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0186() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -deflatecompress";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0187() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -lzwcompress";
		String reference	= "4f7dc7243da63c6d95732f68e22809f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0188() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -lzwcompress";
		String reference	= "e2a415e9d6f5381ec57705b7bad8e95b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0189() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -lzwcompress";
		String reference	= "76ffc8ad552563f8eaed2ea3ab4d01dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0190() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -lzwcompress";
		String reference	= "76ffc8ad552563f8eaed2ea3ab4d01dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0191() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -lzwcompress";
		String reference	= "1eac7a8483d357d601aac14af6620f36";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0192() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -lzwcompress";
		String reference	= "7f2b7a7c536dae93a377b75dca57f07b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0193() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -lzwcompress";
		String reference	= "7f2b7a7c536dae93a377b75dca57f07b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0194() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -lzwcompress";
		String reference	= "76ffc8ad552563f8eaed2ea3ab4d01dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0195() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -lzwcompress";
		String reference	= "28cca55e84c9946016c1be30bbf0dc79";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0196() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "2ac9a3adb38a092718a545e4c35a89a5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0197() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "a5a7cada2225a4117fc7b78574832e83";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0198() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "8e7cc2aadffa1ee2da90c221a0384936";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0199() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "a45492a7aa4e68ccddabeb8c7e8f559c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0200() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "ad8809b18e8d00601ed5219c9f8e58ea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0201() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "aa4f9855c06de198f0bc2d288f7ab406";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0202() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "ad8809b18e8d00601ed5219c9f8e58ea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0203() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "93943a4a4125dcd416d5940e0911732e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0204() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "93943a4a4125dcd416d5940e0911732e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0205() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "578536cfd0e8fb8d0f2a8bf25a544992";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0206() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -lzwcompress";
		String reference	= "18a03b122c480f54953969fa3130ca18";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0207() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -lzwcompress";
		String reference	= "e22672286926d43cfca8924578bc7527";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0208() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -lzwcompress";
		String reference	= "86f810b1380ab9f0b79f060dc41327a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0209() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -lzwcompress";
		String reference	= "95bfcb7df710a4d4d5ce4e9a48ada820";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0210() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -lzwcompress";
		String reference	= "090f8c54b7b4e77c65106b5301376648";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0211() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -lzwcompress";
		String reference	= "3c5bec58c6cf66cdf949688da5eb1dfc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0212() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -lzwcompress";
		String reference	= "b63d5ba88cfeccaf1c1952aa751fc31b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0213() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -lzwcompress";
		String reference	= "a8a6b5c17673b954b284a0ef8f618e6c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0214() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -lzwcompress";
		String reference	= "f512702a12db0c7966770a5ce84b0786";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0215() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -lzwcompress";
		String reference	= "6540f5adfc87e14d2d299884b58b2429";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0216() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -lzwcompress";
		String reference	= "c1382cc410f2f0990cd92a87b55b32c6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0217() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -lzwcompress";
		String reference	= "68f2fa5a041b9e0ba1d440ecfc81904f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0218() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -lzwcompress";
		String reference	= "acd3a67960773f5ba6568242228c869a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0219() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -lzwcompress";
		String reference	= "c2c80e564bfc231a59f19b0a20ce52f2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0220() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -lzwcompress";
		String reference	= "8c8ddac616d76106df79d16cf01c4e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0221() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "a1a58d9fd119f7d48bc368a3593aec41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0222() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "a1a58d9fd119f7d48bc368a3593aec41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0223() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "a1a58d9fd119f7d48bc368a3593aec41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0224() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "d9d3bb32b275944642fa20e792b25843";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0225() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -lzwcompress";
		String reference	= "45d3960ce0d3f12a7e58f1cb87cc8759";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0226() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "e1902040f911b0ade866533f4b3113d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0227() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "9d10c2610731989237fc99e0d393b7b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0228() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "449a19b181f1d50114cf217087de44dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0229() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "9d10c2610731989237fc99e0d393b7b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0230() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "1b2f32ce2c2c2f66249d80fc3c559b6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0231() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "9a8f8856ba34954d7d148afa3151a2e5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0232() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "9d10c2610731989237fc99e0d393b7b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0233() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "3f56821764c7fc12782b768ad79aa971";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0234() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "9a8f8856ba34954d7d148afa3151a2e5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0235() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "9643af0c9efe1f9f0dc524d897b87514";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0236() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "dfe6ca04003d9bb8973c481912bcc317";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0237() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "cb42b6dabecefa6d2f63f43193741d2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0238() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -lzwcompress";
		String reference	= "9a8f8856ba34954d7d148afa3151a2e5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0239() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -lzwcompress";
		String reference	= "cdc3e19df466463bd246a96bd4755409";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0240() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -lzwcompress";
		String reference	= "b59d472027f1bc2582b4009a4f191090";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0241() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -lzwcompress";
		String reference	= "27b9626d9b8d4f4691263c0804d0d056";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0242() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -lzwcompress";
		String reference	= "eba3c4ddb3fc13b53a2b6124f74b5be7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0243() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -lzwcompress";
		String reference	= "eba3c4ddb3fc13b53a2b6124f74b5be7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0244() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -lzwcompress";
		String reference	= "eba3c4ddb3fc13b53a2b6124f74b5be7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0245() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -lzwcompress";
		String reference	= "439691dc16dbce8e1b560e741d87fed8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0246() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -lzwcompress";
		String reference	= "fccbf1fa0be9c3a21c216b7727fc9556";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0247() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -lzwcompress";
		String reference	= "7ebd9cabba72841e4e245ffa93dbe150";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0248() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -lzwcompress";
		String reference	= "eba3c4ddb3fc13b53a2b6124f74b5be7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0249() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -jpegcompress";
		String reference	= "5207be0c259ee10e867808f12a9d92a7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0250() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -jpegcompress";
		String reference	= "f87940abb040cb5913caabf9b7f63fbf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0251() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -jpegcompress";
		String reference	= "9663316095768276616bf4e83332033d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0252() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -jpegcompress";
		String reference	= "9663316095768276616bf4e83332033d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0253() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -jpegcompress";
		String reference	= "159700b315c9aa16a0521214ece98be9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0254() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -jpegcompress";
		String reference	= "1e153d3afe75cf13786b7236557b4fc9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0255() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -jpegcompress";
		String reference	= "1e153d3afe75cf13786b7236557b4fc9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0256() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -jpegcompress";
		String reference	= "9663316095768276616bf4e83332033d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0257() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -jpegcompress";
		String reference	= "236566dc7232a43a78b227afeb24a086";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0258() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "d51fe4ce969c31932f0b80b4d2c876ed";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0259() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0260() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "f9b4342abac9c985a1b253618bbbac42";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0261() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0262() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "7df0ed8fc8a53748f313330e2d59ae95";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0263() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "b845603eb7e55f88086f95ca100fec27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0264() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "7df0ed8fc8a53748f313330e2d59ae95";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0265() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0266() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0267() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0268() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -jpegcompress";
		String reference	= "33dcb11c589f964d91af38da6096276c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0269() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -jpegcompress";
		String reference	= "0b7a5792b6da79a9a1ce8467e4d4de73";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0270() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -jpegcompress";
		String reference	= "4993aee9a4b07d6834646d1bf7a638f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0271() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -jpegcompress";
		String reference	= "3d96239651d61d1816b0965cebfa506d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0272() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -jpegcompress";
		String reference	= "6f99f4b0a5ee698802105d0e57b3c698";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0273() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -jpegcompress";
		String reference	= "5f5f27a777d223a002ff90812f8da7dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0274() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -jpegcompress";
		String reference	= "1c445fb78384dd431ccebdcb286feff9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0275() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -jpegcompress";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0276() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -jpegcompress";
		String reference	= "380d85d0d41cd0a0108da0d9ca4a958f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0277() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -jpegcompress";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0278() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -jpegcompress";
		String reference	= "72edaf855162836ff5ffd84baf5b9125";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0279() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -jpegcompress";
		String reference	= "70c61ef01be6ee0d136afe6140f7cf1d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0280() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -jpegcompress";
		String reference	= "2c158d0dd1c7fa1581fbce6fe49ca4f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0281() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -jpegcompress";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0282() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -jpegcompress";
		String reference	= "e9c022b1a6f8e2b74e61f7a6482cad23";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0283() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "abf637a73df25b788aed039461b34957";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0284() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "abf637a73df25b788aed039461b34957";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0285() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "abf637a73df25b788aed039461b34957";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0286() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "28afd334afa0f5b69777086ef3808e1e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0287() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -jpegcompress";
		String reference	= "49901059df26e4c5f42e8e7f8194d8d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0288() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0289() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0290() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0291() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0292() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "3bb534871ab8f05ad9176a09e37a07ba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0293() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "db36f13f56330e8ab3cf977dced20278";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0294() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0295() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "5daafad985c5821f93450a04356536f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0296() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "db36f13f56330e8ab3cf977dced20278";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0297() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "d9952c24b73da9e07b74071d92a83be2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0298() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0299() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "36f3e60c327f58f9d36d1c1128b9eada";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0300() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -jpegcompress";
		String reference	= "db36f13f56330e8ab3cf977dced20278";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0301() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -jpegcompress";
		String reference	= "c289848a773931580936b5b8d871aff3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0302() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -jpegcompress";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0303() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -jpegcompress";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0304() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -jpegcompress";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0305() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -jpegcompress";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0306() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -jpegcompress";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0307() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -jpegcompress";
		String reference	= "f2eafc9bb468b2a8e971a6d91c3d109b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0308() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -jpegcompress";
		String reference	= "2ccb2cd8942d3833f7a11a2e4882f49f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0309() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -jpegcompress";
		String reference	= "33ae0523ba2ce9cd102ff79933c9ea6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0310() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -jpegcompress";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0311() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "bac872fa5bbe6f2d218696cd3b9a9763";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0312() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "39c5709a1db9378b5a03907ea4ac8e2c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0313() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "01c797533480943134af07608fce5d5f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0314() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "01c797533480943134af07608fce5d5f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0315() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "172d9f6b08bfba1b57e597fa5a022f2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0316() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "6729022bb2eefd3650fdb7f5314f68aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0317() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "6729022bb2eefd3650fdb7f5314f68aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0318() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "01c797533480943134af07608fce5d5f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0319() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "ee7e97e0684aaaed9aa7e9ff8f329a9a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0320() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "eebb1a6860aa68135ebce6c495089e0e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0321() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0322() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "21973e33e105f2b03f9de7a2c651faac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0323() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0324() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "020e201c9940ab6d4930017d4bc4b0f7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0325() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "ddd6b673cd1c03576cd8b4a9811a9991";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0326() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "020e201c9940ab6d4930017d4bc4b0f7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0327() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0328() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0329() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0330() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "4ed4a52bd2ff6086a5ab393ee97dc583";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0331() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "28c59b3ae4384649c3deb96f9e56ed4f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0332() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "71257e8d2c0eaa9ac41c4b01e5f872f0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0333() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "e742222111bc6131411ea72d7d49339f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0334() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "c102fa8cd26fd418dad831835231f895";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0335() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "92b974a22b05488f9d65c045aa2ff401";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0336() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "a38583e6ef5821d4fd6b3db4e04adc80";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0337() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0338() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "97731117b9f9b24122bd3646a485097e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0339() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0340() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "55af4dc1d6da1fdeb6de4b7c2840d0d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0341() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "9557cffba7333d8043fba047a2b2ac81";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0342() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "523259a00b419c2954ed15a8a4366fdd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0343() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0344() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "99e0a79c9227f31e6322c520092e74ba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0345() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "474fe1cf5800f9b8fdf5bf37cbb10f26";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0346() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "474fe1cf5800f9b8fdf5bf37cbb10f26";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0347() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "474fe1cf5800f9b8fdf5bf37cbb10f26";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0348() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "b4123b040c6091e69a8e18e2d9866564";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0349() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "d59563b7cb47a9df6233455a839b032c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0350() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0351() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "194f2c3733a89605d18029bf12f8a143";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0352() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0353() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "194f2c3733a89605d18029bf12f8a143";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0354() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "2bdc29a2d21015245e64f016dc342a6c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0355() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "909373057a12e65c00f578ae9ea661df";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0356() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "194f2c3733a89605d18029bf12f8a143";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0357() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "abf27e194084018363733d0fb7fc16a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0358() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "909373057a12e65c00f578ae9ea661df";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0359() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "cbcbdf42ae9fd30bc1769eb0360e9e07";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0360() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0361() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "364728ac81fc02edd8fdbeb7d40c866b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0362() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "909373057a12e65c00f578ae9ea661df";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0363() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "825b13211d91511f37013415800d796f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0364() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0365() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0366() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "fba54c696a7da94ac4f4ec2d59d37ca7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0367() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "fba54c696a7da94ac4f4ec2d59d37ca7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0368() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "fba54c696a7da94ac4f4ec2d59d37ca7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0369() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "acfdcad3c6b715f89abcba2f392c16d9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0370() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "96c88721167342f3dfc138c50662fb6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0371() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "d4fa9f64615c29e1aab0db83632c5eda";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0372() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -jpegcompress -jpegquality 0";
		String reference	= "fba54c696a7da94ac4f4ec2d59d37ca7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0373() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "4f89ab5d470551d0e67c7d4493de54a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0374() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "0eaf10f69c19876e5531578fe0de163e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0375() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "121f98898f207910d9f3ef8ce59035ac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0376() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "121f98898f207910d9f3ef8ce59035ac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0377() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "cc158f8564708a4f6f4f8b55f5f58387";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0378() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "638824577ef877be657a004c4d29dc66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0379() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "638824577ef877be657a004c4d29dc66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0380() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "121f98898f207910d9f3ef8ce59035ac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0381() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "9217ff8c43fa7fe58cdfa997ae0cb1db";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0382() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "40630e508bc8a88b97a0adc888fb5390";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0383() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0384() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "232b725903c4cb9dd83aa3c66ffc7262";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0385() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0386() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "80730698b72c74443e8984637a5e9a92";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0387() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "2496ddc236c000fe4d031d6c0b3ffdd5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0388() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "80730698b72c74443e8984637a5e9a92";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0389() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0390() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0391() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0392() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "0d7b8ff506942e220f4ba82663ee5852";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0393() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "5f64d223c9a5e618bc198afea3894146";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0394() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "68a649045de411f6a6d6268f270270bb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0395() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "e742222111bc6131411ea72d7d49339f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0396() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "c102fa8cd26fd418dad831835231f895";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0397() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "92b974a22b05488f9d65c045aa2ff401";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0398() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "a38583e6ef5821d4fd6b3db4e04adc80";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0399() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0400() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "196d9cd5997645e403c19a519b64be73";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0401() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0402() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "0d2e193edaa153c6effe89cc6ab33954";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0403() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "cf240a88e92b375ca920733651e5af4f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0404() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "cc922742efe95c72a2c591f27f47f091";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0405() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0406() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "72293ba510f693af169f6ae905ecb444";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0407() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "823bb473f5bc5a4b556ebe8f4b167bc8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0408() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "823bb473f5bc5a4b556ebe8f4b167bc8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0409() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "823bb473f5bc5a4b556ebe8f4b167bc8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0410() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "48b4628efe2e8f3da95da7da8bd56428";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0411() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "35393715455d5a6c0047e511386b11c8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0412() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0413() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "5c7a2b73d4812aa20b475289740fded2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0414() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0415() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "5c7a2b73d4812aa20b475289740fded2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0416() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "277ae4c0a69ff103c1435098a25a0dde";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0417() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "b676838a95d56338c8ef25e342395d36";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0418() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "5c7a2b73d4812aa20b475289740fded2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0419() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "df1b1a6f43e76cf746833f1d399ddbc4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0420() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "b676838a95d56338c8ef25e342395d36";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0421() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "33751561cea7855524787898e8abc92f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0422() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0423() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "9f6563709d928c6c53e87cd6b4a2bfc4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0424() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "b676838a95d56338c8ef25e342395d36";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0425() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "ed76785c6ee94f81164ae715ef5b7b9a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0426() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0427() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0428() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "ccc4ba4e983bdddbb36cb4dc4f49d1a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0429() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "ccc4ba4e983bdddbb36cb4dc4f49d1a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0430() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "ccc4ba4e983bdddbb36cb4dc4f49d1a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0431() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "a9783bcf2e551fd00b2c591f56e20fbb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0432() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "72c761c436046abe1ac2056cd080e95a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0433() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "ab8c585e388bb14e57c5e17f832bba5b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0434() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -jpegcompress -jpegquality 1";
		String reference	= "ccc4ba4e983bdddbb36cb4dc4f49d1a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0435() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "0a532a4dde189efad4b7fb65a157675b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0436() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "5e69c9f8282500d7738de905dc004c85";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0437() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "1ce990c10a6cab8602e64a8ff7b4c9e0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0438() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "1ce990c10a6cab8602e64a8ff7b4c9e0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0439() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "365d23b186c51ed55e11767ba1aa3f36";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0440() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "df20e38b61e058d5423ca75092e2bdff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0441() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "df20e38b61e058d5423ca75092e2bdff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0442() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "1ce990c10a6cab8602e64a8ff7b4c9e0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0443() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "3100f3d9e1cf7c6569a7fb626fb34aa7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0444() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "d95db67ed71b68325785384d9e6047de";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0445() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0446() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "078f0d756fa557b7fba9d64363618976";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0447() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0448() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "3f3c30ea0ae38e7c716947f7f5a00f83";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0449() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "10bf493bb8bc52b021b9c4629835b200";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0450() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "3f3c30ea0ae38e7c716947f7f5a00f83";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0451() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0452() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0453() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0454() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "f40faaab143a1699a7ff2fcf4136eb71";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0455() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "8f7f006f9313fad7aa395a165e85dce7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0456() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "ed0eb5553b55f530ac1c164e213d3d7a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0457() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "84d24d0be9ef83161db04121ee056519";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0458() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "4804e4b0eea4d989ec5308457960b686";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0459() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "0b5da852befa45504b33d0c0fbf49c25";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0460() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "189057a79d8b8e5accc392cc11151a14";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0461() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0462() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "35e0d98ed5c1134f600666f83fe73ff9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0463() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0464() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "ba3572dec7a48aeba91aa181f46ee01b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0465() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "b3896664e8b3832851861158a1defa95";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0466() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "9f7ba2b526e88e7644438bf2b9f7f91a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0467() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0468() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "0c8e0ebdd3b0d9d035fb32d5c1884f13";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0469() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "8c9d24ec0813fe37a65d6c6e1db990a4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0470() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "8c9d24ec0813fe37a65d6c6e1db990a4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0471() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "8c9d24ec0813fe37a65d6c6e1db990a4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0472() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "80719d9cdeb65ec75a6360e6deb10f40";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0473() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "2d095cc8af802c42f7b2fa0de39f9a54";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0474() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0475() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "c6e0bb1d528b2e6ebaa0d6721dd0d7d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0476() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0477() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "c6e0bb1d528b2e6ebaa0d6721dd0d7d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0478() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "e8c3281be958e7f76506ed6dbd5d6907";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0479() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "9cd132750b57a7f7bd391a7b10159df6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0480() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "c6e0bb1d528b2e6ebaa0d6721dd0d7d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0481() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "117216acffece5dcf8bf330c5c50e9f4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0482() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "9cd132750b57a7f7bd391a7b10159df6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0483() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "19b40593c98dd449e7a94cf52a93ee46";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0484() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0485() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "4254b046fdfdcb5c91571437fb52f4fc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0486() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "9cd132750b57a7f7bd391a7b10159df6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0487() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "1dd2b378a629dd10af2d077bb642adbe";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0488() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0489() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0490() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "133a69f2ac431220edddcedfdfb41e10";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0491() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "133a69f2ac431220edddcedfdfb41e10";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0492() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "133a69f2ac431220edddcedfdfb41e10";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0493() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "a7b767a9da8d9a8cbc1642169f7140ed";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0494() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "f1029b821c605505b4bcebb3ba00e3a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0495() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "0f2ed353c0a353ea5957f0b05486e0dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0496() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -jpegcompress -jpegquality 50";
		String reference	= "133a69f2ac431220edddcedfdfb41e10";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0497() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "5207be0c259ee10e867808f12a9d92a7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0498() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "f87940abb040cb5913caabf9b7f63fbf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0499() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "9663316095768276616bf4e83332033d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0500() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "9663316095768276616bf4e83332033d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0501() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "159700b315c9aa16a0521214ece98be9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0502() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "1e153d3afe75cf13786b7236557b4fc9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0503() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "1e153d3afe75cf13786b7236557b4fc9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0504() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "9663316095768276616bf4e83332033d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0505() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "236566dc7232a43a78b227afeb24a086";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0506() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "d51fe4ce969c31932f0b80b4d2c876ed";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0507() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0508() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "f9b4342abac9c985a1b253618bbbac42";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0509() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0510() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "7df0ed8fc8a53748f313330e2d59ae95";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0511() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "b845603eb7e55f88086f95ca100fec27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0512() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "7df0ed8fc8a53748f313330e2d59ae95";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0513() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0514() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0515() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0516() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "33dcb11c589f964d91af38da6096276c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0517() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "0b7a5792b6da79a9a1ce8467e4d4de73";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0518() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "4993aee9a4b07d6834646d1bf7a638f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0519() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "3d96239651d61d1816b0965cebfa506d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0520() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "6f99f4b0a5ee698802105d0e57b3c698";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0521() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "5f5f27a777d223a002ff90812f8da7dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0522() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "1c445fb78384dd431ccebdcb286feff9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0523() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0524() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "380d85d0d41cd0a0108da0d9ca4a958f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0525() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0526() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "72edaf855162836ff5ffd84baf5b9125";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0527() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "70c61ef01be6ee0d136afe6140f7cf1d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0528() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "2c158d0dd1c7fa1581fbce6fe49ca4f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0529() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0530() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "e9c022b1a6f8e2b74e61f7a6482cad23";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0531() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "abf637a73df25b788aed039461b34957";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0532() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "abf637a73df25b788aed039461b34957";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0533() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "abf637a73df25b788aed039461b34957";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0534() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "28afd334afa0f5b69777086ef3808e1e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0535() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "49901059df26e4c5f42e8e7f8194d8d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0536() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0537() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0538() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0539() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0540() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "3bb534871ab8f05ad9176a09e37a07ba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0541() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "db36f13f56330e8ab3cf977dced20278";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0542() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0543() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "5daafad985c5821f93450a04356536f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0544() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "db36f13f56330e8ab3cf977dced20278";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0545() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "d9952c24b73da9e07b74071d92a83be2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0546() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0547() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "36f3e60c327f58f9d36d1c1128b9eada";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0548() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "db36f13f56330e8ab3cf977dced20278";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0549() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "c289848a773931580936b5b8d871aff3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0550() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0551() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0552() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0553() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0554() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0555() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "f2eafc9bb468b2a8e971a6d91c3d109b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0556() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "2ccb2cd8942d3833f7a11a2e4882f49f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0557() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "33ae0523ba2ce9cd102ff79933c9ea6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0558() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -jpegcompress -jpegquality 95";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0559() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "e447943571d5cc44218113927640ed47";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0560() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "91662ce49358a68507e844a6c5eb1bae";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0561() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "fe66dc1a884985a442ea51ad565d08c1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0562() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "fe66dc1a884985a442ea51ad565d08c1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0563() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "350de8685ace92490913cdfb01ad1052";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0564() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "5c5d4b1dbf4e2851d909b577743c3dae";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0565() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "5c5d4b1dbf4e2851d909b577743c3dae";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0566() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "fe66dc1a884985a442ea51ad565d08c1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0567() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "ffc9aaaf1639fee3b9d24cb612d82030";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0568() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "5ef111c64facb65f51d95d2df7329854";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0569() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0570() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "f59ace0bf39a1a4d401f0d9cdd81003b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0571() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0572() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "fd87c5e764e12a21ab671aef4975dc4a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0573() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "a37fed9ca4133f5be6fe4fc53ee8cd3c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0574() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "fd87c5e764e12a21ab671aef4975dc4a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0575() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0576() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0577() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0578() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "cbd77b2041831c921e9bac22a7615652";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0579() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "0d1846ac153555c8ff8bacdff1db4205";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0580() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "c252963089118812ff1ca0cd57b87034";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0581() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "4929b86ece8fbf6f77cc60b623530061";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0582() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "1322878dd86a2996b6351ec64688cf65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0583() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "714cb6851dfa24659cf2fba13be59c62";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0584() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "d7e24bf48c744e90694cdf9fde3e076a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0585() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0586() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "4e3342e42d9ba98d53eea1d9a5868b6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0587() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0588() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "8da61679bf1ffab530405bce9f375def";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0589() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "343b170965e725884b50763da8f75e81";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0590() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "9e8ea98cf459181cf712b503d39f584c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0591() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0592() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "649ba6583b9804f731f9117121a572b4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0593() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "46cb428a72ab7a45afaaa51847b2f3bb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0594() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "46cb428a72ab7a45afaaa51847b2f3bb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0595() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "46cb428a72ab7a45afaaa51847b2f3bb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0596() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "1ae80249ca11807796d9f8558ffa65b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0597() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "8a077ebbe3713472af4d1d99f99121fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0598() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0599() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "3d8225447012554c32eac669c6252971";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0600() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0601() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "3d8225447012554c32eac669c6252971";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0602() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "b65f1b60cbe307448d9357358a07a1b3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0603() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "f520bbb3acc556e79b812881fa944a78";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0604() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "3d8225447012554c32eac669c6252971";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0605() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "62b83a9ec77722da2eb8f6b6f3f1c561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0606() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "f520bbb3acc556e79b812881fa944a78";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0607() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "d72754d9cf19c16c1a3b69ba365f1162";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0608() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0609() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "d11088c7b5f55fad837d1222984b6302";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0610() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "f520bbb3acc556e79b812881fa944a78";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0611() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "95f1bf8ccd1fce2167706aa307047ebc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0612() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0613() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0614() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "2bf0423350ecf802bb6b223f77bd2338";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0615() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "2bf0423350ecf802bb6b223f77bd2338";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0616() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "2bf0423350ecf802bb6b223f77bd2338";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0617() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "729dc710f894fe3042bf5dd2be84bcf0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0618() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "12b7810e8eaa597a99b7a6855263de84";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0619() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "27600225f70b6ff0f57d74fccb2d62e6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0620() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -jpegcompress -jpegquality 100";
		String reference	= "2bf0423350ecf802bb6b223f77bd2338";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0621() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "78d97f73e73718ae01140c21a401fe6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0622() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "4305b9cffe1fed7238d11c74a22d1486";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0623() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "46a97e20d3aa270558d0946b8b712f54";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0624() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "46a97e20d3aa270558d0946b8b712f54";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0625() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "b875b09abd304faa055aa24e7d47aee4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0626() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "7d8fef9221a856e4b175b514ca47ced1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0627() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "7d8fef9221a856e4b175b514ca47ced1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0628() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "46a97e20d3aa270558d0946b8b712f54";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0629() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "a3c7e86c72f153d0477584753eeba7b6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0630() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "a0a4441d06e8c56deeb2be8bcea105b4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0631() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0632() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "f9b4342abac9c985a1b253618bbbac42";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0633() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0634() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "55bf38f1edb8eb9fd106b3bf03577a7d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0635() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "b845603eb7e55f88086f95ca100fec27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0636() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "55bf38f1edb8eb9fd106b3bf03577a7d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0637() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0638() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0639() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0640() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "431e7f03388b4aca615d2056d0c34a12";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0641() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "87fb567be17d3f7a8e4ab92a833e511f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0642() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "df8c2db0fcca4f9133462ed83432dbe7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0643() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "82ddfdb6d456da4defcdd87b1b312169";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0644() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "cbc640a79415ff5ce1312dee3758a14c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0645() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "5f5f27a777d223a002ff90812f8da7dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0646() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "1c445fb78384dd431ccebdcb286feff9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0647() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0648() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "380d85d0d41cd0a0108da0d9ca4a958f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0649() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0650() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "6902e66b332ca08cfbfcc43c22079396";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0651() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "70c61ef01be6ee0d136afe6140f7cf1d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0652() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "9b02338481ac7d74eeea75d750c028fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0653() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0654() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "b90290ca121e539a509261617d85d5c7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0655() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "90033001d3de2765a86acce950fdcfa7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0656() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "90033001d3de2765a86acce950fdcfa7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0657() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "90033001d3de2765a86acce950fdcfa7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0658() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "b0ead559cf84053cc5bcf8ebbc5166d2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0659() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "48ab2955bff8445c359dd420d29a6c1e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0660() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0661() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0662() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0663() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0664() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "3bb534871ab8f05ad9176a09e37a07ba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0665() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "d65c84f701a3694bd743481120598d06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0666() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0667() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "5daafad985c5821f93450a04356536f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0668() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "d65c84f701a3694bd743481120598d06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0669() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "9af822f77d8f0c94a9cc43bf572f5ae8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0670() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0671() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "a61a5d1c8c5feab9ed83def1ded79ba4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0672() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "d65c84f701a3694bd743481120598d06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0673() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "b5c97836320be742b6133b057095b983";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0674() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0675() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0676() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "4e0b596089d5e3c98c18225d92db6738";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0677() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "4e0b596089d5e3c98c18225d92db6738";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0678() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "4e0b596089d5e3c98c18225d92db6738";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0679() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "38fc6d4ed470f14d7ae6fa498d5813f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0680() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "2ccb2cd8942d3833f7a11a2e4882f49f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0681() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "4a45c8a3213c58c6817c26ced7338707";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0682() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -jpegcompress -fullsamplechrominance";
		String reference	= "4e0b596089d5e3c98c18225d92db6738";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0683() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -forceJPEGDecompress";
		String reference	= "ed7481d746dfcac300f66a473fbd943e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0684() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -forceJPEGDecompress";
		String reference	= "dae31f4fda694b02ec4985228053fecf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0685() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -forceJPEGDecompress";
		String reference	= "c55f25017d009ba1ebe0f2c3a3a7c690";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0686() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -forceJPEGDecompress";
		String reference	= "10cc6b4cf4c8fd6fb9d0ba602493d90a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0687() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -forceJPEGDecompress";
		String reference	= "1a5be366000559964d469d8e4cfeaeac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0688() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -forceJPEGDecompress";
		String reference	= "9e80474e48ebcba6d4fec9e32d53c13f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0689() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -downsample2x2";
		String reference	= "69b285691c1ff333dd99c5bb7a4673e9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0690() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -downsample2x2";
		String reference	= "80c88ef8bc9e45e545d0d1e95bb68284";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0691() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -downsample2x2";
		String reference	= "ae5f5bc2cf6c19324c9013eeb9f2cc44";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0692() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -downsample2x2";
		String reference	= "ae5f5bc2cf6c19324c9013eeb9f2cc44";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0693() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -downsample2x2";
		String reference	= "aabaf19010ae189d7559eb8a88a95db8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0694() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -downsample2x2";
		String reference	= "810a570ba46733f82929733f591a2d88";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0695() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -downsample2x2";
		String reference	= "810a570ba46733f82929733f591a2d88";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0696() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -downsample2x2";
		String reference	= "ae5f5bc2cf6c19324c9013eeb9f2cc44";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0697() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -downsample2x2";
		String reference	= "8ea1d695d9ab87436aec1dcfa9df08be";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0698() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "1a0498eca3f3d9480df591dc1b6c785c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0699() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "8ca3c9d6578cea54fcee47a0099128d0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0700() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0701() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "dfa05127651f2df2f0fd2cd64e649b9a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0702() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "8666d5c19cb44529e7734b7de2476de3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0703() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "4f5ef0b935074e27e42a16ff5431f005";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0704() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "8666d5c19cb44529e7734b7de2476de3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0705() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0706() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0707() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "289755e6bf17be571de012537506d8d8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0708() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -downsample2x2";
		String reference	= "bc17c47d92e129442d2e05f43f4ec5a5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0709() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -downsample2x2";
		String reference	= "0a5bb3a61c7615f233821dee37945e50";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0710() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -downsample2x2";
		String reference	= "85bec6dc4926937a927c27bef018f5f2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0711() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -downsample2x2";
		String reference	= "736145a42556bb68f27c89111b82ec9c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0712() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -downsample2x2";
		String reference	= "85e6a3324dc28d2e12b17370fcc6e01d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0713() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -downsample2x2";
		String reference	= "6f1410290a05114e102d7fb41176b44c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0714() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -downsample2x2";
		String reference	= "95136e5ab8f69161c2c667b5c02ea241";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0715() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -downsample2x2";
		String reference	= "827d44afa9de23667d11e25743c228ac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0716() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -downsample2x2";
		String reference	= "0dd55a3c47735ae63066525a0795b7e5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0717() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -downsample2x2";
		String reference	= "f6e5b30219b41fae641cfdb078658a79";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0718() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -downsample2x2";
		String reference	= "dbd1f715c16978a5c4ee5fff3cfa6a39";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0719() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -downsample2x2";
		String reference	= "e563e3f8bcdebaa3dc7f249fda8b0c42";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0720() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -downsample2x2";
		String reference	= "51d77b03c3b5911e442225ab86105633";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0721() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -downsample2x2";
		String reference	= "ea82bd87f124772dea5a6919acb4e6f3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0722() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -downsample2x2";
		String reference	= "8f144b7796057cdad90b8e6ef3207fe8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0723() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "5f03b203ecff0db60a337f22aa226b6a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0724() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "5f03b203ecff0db60a337f22aa226b6a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0725() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "5f03b203ecff0db60a337f22aa226b6a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0726() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "9841496b4725b04ef81ab500f3a5f35b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0727() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -downsample2x2";
		String reference	= "b7b0ebe000822ab350cd13cf765a50ac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0728() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "09234a7c0e35022eee06f165b846fc01";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0729() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "c6e1875b452d9536d33fac25425c2c65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0730() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "fb57bfdc6b1ce4500c4af845cd46e7e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0731() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "c6e1875b452d9536d33fac25425c2c65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0732() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "a804d0ef1b3d1768665549ab33cccc4b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0733() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "7a7dd6372dc9d6f991631299aeb649e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0734() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "c6e1875b452d9536d33fac25425c2c65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0735() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "d4a372d196b31f46e1609a67b5f8b1da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0736() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "7a7dd6372dc9d6f991631299aeb649e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0737() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "8d8756b8e06430a153a5eab5d451716d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0738() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "e3ca3971b3172b4a0d912c844c8bf25c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0739() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "44de5756d88dac68e23e72308f504f83";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0740() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -downsample2x2";
		String reference	= "ec9ccb6bcefcdf93ddcd39d810720621";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0741() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -downsample2x2";
		String reference	= "5bfacf1b0af46da19853d75087868ebc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0742() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -downsample2x2";
		String reference	= "252d8a4737a1e4da63ec20af545c65a9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0743() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -downsample2x2";
		String reference	= "26894f0419483af617cf512344835379";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0744() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -downsample2x2";
		String reference	= "0711bee610e1ed20048425d448edbd8f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0745() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -downsample2x2";
		String reference	= "0711bee610e1ed20048425d448edbd8f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0746() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -downsample2x2";
		String reference	= "0711bee610e1ed20048425d448edbd8f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0747() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -downsample2x2";
		String reference	= "30b189ff42e1689cb59b58ec5e59a3e9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0748() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -downsample2x2";
		String reference	= "61477deed117eda1cdd66fd2adc0e3b0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0749() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -downsample2x2";
		String reference	= "f628fa40d6f20cbd8eab368529e0ed71";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0750() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -downsample2x2";
		String reference	= "0711bee610e1ed20048425d448edbd8f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0751() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -downsample8x8";
		String reference	= "9c599c730d188a89a6285c12d06a0921";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0752() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -downsample8x8";
		String reference	= "6511012a80a08acfb49b8ac859319084";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0753() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -downsample8x8";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0754() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -downsample8x8";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0755() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -downsample8x8";
		String reference	= "57b7570fb4f73e41b30647d4b6bda0e4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0756() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -downsample8x8";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0757() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -downsample8x8";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0758() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -downsample8x8";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0759() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -downsample8x8";
		String reference	= "4c401817dee1b5ef0d662e3edbb5ea86";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0760() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "3dc43328382c424d7844d3a960fc29f3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0761() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "17454507590b894c9ae6cd41fb6e4d25";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0762() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0763() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "ec0caed7483b8889010dcb7904af6cf6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0764() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0765() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "6f993e796c1fdaf55ac533f49fdca349";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0766() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0767() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0768() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0769() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "5feb37282b5ba8a5c0b24ccc8870d8b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0770() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -downsample8x8";
		String reference	= "8c318dc91a6e68d9971ddcae5586e51a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0771() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -downsample8x8";
		String reference	= "ed7481d746dfcac300f66a473fbd943e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0772() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -downsample8x8";
		String reference	= "dae31f4fda694b02ec4985228053fecf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0773() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -downsample8x8";
		String reference	= "f077a9c7b530e20a9138860bccdd42c3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0774() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -downsample8x8";
		String reference	= "247ee34d097da7ed4c695bfa559ada73";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0775() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -downsample8x8";
		String reference	= "5813da7947f1101f8ba6e1f3d87ab10a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0776() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -downsample8x8";
		String reference	= "e758a141d60722d263ffec7bc4925c24";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0777() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -downsample8x8";
		String reference	= "c6dfdb0cd934612fd76402b5c1f5be7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0778() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -downsample8x8";
		String reference	= "8ed88d9a97e1077e06e910ceca8377c5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0779() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -downsample8x8";
		String reference	= "f0ff98bb6fff98f302966c5d279d51d8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0780() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -downsample8x8";
		String reference	= "c4c28ecafe15f7ef024278291287f562";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0781() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -downsample8x8";
		String reference	= "ad9c05e06aaffb4ebcc7730a8c2a1d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0782() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -downsample8x8";
		String reference	= "9635d11fca86ee8044d4ed5bff011149";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0783() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -downsample8x8";
		String reference	= "15ab2efca793c8014298c426b1ff013a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0784() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -downsample8x8";
		String reference	= "15fb20519748110b9359d0712f9de983";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0785() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0786() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0787() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0788() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "27a7c8a5a438eb6aee01a465413469a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0789() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -downsample8x8";
		String reference	= "84a2f2ce9033af64626f48c8ac70c92d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0790() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "116d3a2781445c271dd74245ac137114";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0791() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0792() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "259d7f724fddfb6a47832e36ba1e1190";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0793() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0794() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "b5b14f891f40fb2833e149fe9727973e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0795() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0796() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0797() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "43a33abbd2dc0710232ed92dc4ce86af";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0798() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0799() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "c4f5795e76429f78efe9ab1f2bc25ff2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0800() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "f312986f715178ef3185a6c80fa90a60";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0801() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "c0de80ce588bb9e45bcd32efbfeedc4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0802() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -downsample8x8";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0803() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -downsample8x8";
		String reference	= "3683926382e24effbbe82a0e1fec72dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0804() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -downsample8x8";
		String reference	= "d7b62480a61401a388939cda36d8f075";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0805() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -downsample8x8";
		String reference	= "366527b338adc54504a6e14d8c9308f7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0806() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -downsample8x8";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0807() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -downsample8x8";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0808() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -downsample8x8";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0809() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -downsample8x8";
		String reference	= "8a3f657ee891648a572cd3cefa42f101";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0810() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -downsample8x8";
		String reference	= "dd324171c7555e15cc3cd4640b115c3d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0811() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -downsample8x8";
		String reference	= "dde88d57456444f3143b1b3d86e9cfc4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0812() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -downsample8x8";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0813() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "d7fb21572220a843d24588348a95d90e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0814() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "db5ad8d07e19f71d7fa96948a62fa30d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0815() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "6abb816aaa6f4ca8b40e3e6e8cd4e992";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0816() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "6abb816aaa6f4ca8b40e3e6e8cd4e992";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0817() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "ce644470981147589870dae3a9bd3937";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0818() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "295160f33b11a2e5405ca14746da42fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0819() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "295160f33b11a2e5405ca14746da42fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0820() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "6abb816aaa6f4ca8b40e3e6e8cd4e992";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0821() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "a34be3d81cab0cf78d9308b31580d846";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0822() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "7b3b4d552fb3926627bda2bfe352c2f0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0823() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "dd049e027cc78019fc7df35a3d617a5b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0824() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0825() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "a46e98c2c0e3917bf6a04c93922078d3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0826() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "2f1c182b26a0b5ae79dd4f1e583c9154";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0827() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "1d5d3f3574a8580a8b8f189a8e0eeee1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0828() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "2f1c182b26a0b5ae79dd4f1e583c9154";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0829() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0830() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0831() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "f99ecd3b75d645a7bd72ecfaf23feb91";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0832() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "7f7dd3e83027e4cf7bd4b6fd160e40e1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0833() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "9f8f9bbcc8c216a4af3f76306e6dc0d2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0834() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "2582a89e2d8deb3bcf6170c780ce7016";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0835() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "55d7016290f4f8ede22d9031ca483373";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0836() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "2a6f304278bcab0ac31388c64295f93b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0837() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "674cefb014c56d9289ec9ba598d905be";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0838() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "c6856ce684e9dbda51a2be53937455a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0839() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "ebb90edfa3b39d45c358311ddd9684f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0840() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "279551ab0ed2d00fab2376df24119526";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0841() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "6d224cc8a3980e512af338137252ebae";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0842() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "5a4477aa2d6e87b7d863d4cfb275775c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0843() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "57653c256f2e187260a1ba0d04d52a1a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0844() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "d4007b4480bbae09b75ab6578bdfffe5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0845() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "a458796b4812dcd19100250217a1daf9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0846() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "c95301a4c66869122e715b584d82f446";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0847() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "b901876c56dedd6fb30c99fd819c82dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0848() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "b901876c56dedd6fb30c99fd819c82dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0849() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "b901876c56dedd6fb30c99fd819c82dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0850() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "c6aee0d51d676b8d9aafd3af811525ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0851() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "45ac5f3269cce0145fbfcc35a19ae015";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0852() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "3c28ec549889ba9ed6345de202fd1fc3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0853() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "3cc3ce1c063ab3157e48ba4abe66a452";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0854() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "30c4e3398751890637c39c066993a2c7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0855() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "3cc3ce1c063ab3157e48ba4abe66a452";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0856() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "00a1de2502ffe5e93e559067349495e7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0857() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "440b9a15cb93888553028a811b8ee8f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0858() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "3cc3ce1c063ab3157e48ba4abe66a452";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0859() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "eccf86f45e66c848857943c041cbeacc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0860() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "440b9a15cb93888553028a811b8ee8f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0861() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "c6dbe7f63fbe1d76e64baab808764829";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0862() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "85b0e8c61084ebb05a3cf941820098ec";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0863() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "5f9991ace8bd501892ecea6597d0a474";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0864() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "440b9a15cb93888553028a811b8ee8f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0865() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "a96ffb65b201139a5b3900750de53e3f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0866() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "d4d4f37dcce312519bad367a3ecfb2cf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0867() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "ae7e6485e659c7873f96434d551739a9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0868() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "9f42ad68eed756d5b9200b91f8befd0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0869() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "9f42ad68eed756d5b9200b91f8befd0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0870() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "9f42ad68eed756d5b9200b91f8befd0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0871() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "87edff08019ea38f390f42ff460bb710";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0872() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "8212b97bfc6b6b8e9960b960e173bc4b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0873() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "7ec07363db90fa185d9195399244366d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0874() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -downsample8x8FlashPix";
		String reference	= "9f42ad68eed756d5b9200b91f8befd0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0875() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "3dc43328382c424d7844d3a960fc29f3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0876() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "17454507590b894c9ae6cd41fb6e4d25";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0877() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0878() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "ec0caed7483b8889010dcb7904af6cf6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0879() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0880() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "6f993e796c1fdaf55ac533f49fdca349";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0881() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0882() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0883() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0884() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "5feb37282b5ba8a5c0b24ccc8870d8b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0885() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "8c318dc91a6e68d9971ddcae5586e51a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0886() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0887() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0888() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0889() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "27a7c8a5a438eb6aee01a465413469a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0890() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "84a2f2ce9033af64626f48c8ac70c92d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0891() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "116d3a2781445c271dd74245ac137114";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0892() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0893() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "259d7f724fddfb6a47832e36ba1e1190";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0894() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0895() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "b5b14f891f40fb2833e149fe9727973e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0896() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0897() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0898() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "43a33abbd2dc0710232ed92dc4ce86af";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0899() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0900() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "c4f5795e76429f78efe9ab1f2bc25ff2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0901() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "f312986f715178ef3185a6c80fa90a60";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0902() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "c0de80ce588bb9e45bcd32efbfeedc4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0903() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0904() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -usm 0 0 0 0";
		String reference	= "3683926382e24effbbe82a0e1fec72dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0905() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "1dcf253c5e3e42ae913e0a9d62117a73";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0906() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "8299b67b2ecc3af4c313b5656598a689";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0907() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0908() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "e2ca20183a76553639e8bc63b69ef0b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0909() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "efad7738fe6511433d6f62280d142e05";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0910() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "550c2d12c22a5b4c3f7d899aa49293b8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0911() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "efad7738fe6511433d6f62280d142e05";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0912() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0913() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0914() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "68e568d10925ffd6c493578f13454620";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0915() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "7217f72723101390012de17c660be802";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0916() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "f7eb284f59bbd76bc84ee94d545e91ff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0917() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "f7eb284f59bbd76bc84ee94d545e91ff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0918() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "f7eb284f59bbd76bc84ee94d545e91ff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0919() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "545e79741d14f4653a825462fc1eaec6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0920() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "8754be1a9a67177d6227d87256a43a76";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0921() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "3659dee17b72ce13c49710e6010cb6d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0922() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "9985380b023ee76a14c8138b6dd36428";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0923() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "e470fca8ff7e66690d5cd24c99ce6134";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0924() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "9985380b023ee76a14c8138b6dd36428";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0925() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "5e73c5ed128aaf661900fa62649b720f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0926() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "27274789b80b535edf362aba4f207f6c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0927() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "9985380b023ee76a14c8138b6dd36428";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0928() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "634b0f356f69efd5a0151bdf245ce7b5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0929() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "27274789b80b535edf362aba4f207f6c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0930() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "75e14fa3a642550bd4856faaee525cc1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0931() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "c08d94d523e1664d3a526ca667e7ed18";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0932() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "509f89adb973bb6b3d32730972a3a544";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0933() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "27274789b80b535edf362aba4f207f6c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0934() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -usm 2.5 100 200 0";
		String reference	= "8e90d845d9e1a9fb65a0bc2ddce2332c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0935() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "a8a5332b6e4289c5544ddd7486c59e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0936() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "a7b47c5b7a27d96c927a5e81423e8311";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0937() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0938() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "e2ca20183a76553639e8bc63b69ef0b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0939() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "15dfef03e1dbcd22da2b9b9a58a72c76";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0940() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "550c2d12c22a5b4c3f7d899aa49293b8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0941() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "15dfef03e1dbcd22da2b9b9a58a72c76";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0942() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0943() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0944() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "d091e63ad5b09f100fdafe0342455841";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0945() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "36a16b11693119a5953c06743a2b9746";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0946() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "9fc7376a74f047a1e7c68317027a76eb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0947() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "9fc7376a74f047a1e7c68317027a76eb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0948() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "9fc7376a74f047a1e7c68317027a76eb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0949() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "9a1cbecb5453e709323a5b9daeacd7d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0950() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "b70967385a5ae45d8eb3b7e3a857a888";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0951() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "55fae21a77a5b222082d09118775b4f6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0952() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "9985380b023ee76a14c8138b6dd36428";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0953() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "e470fca8ff7e66690d5cd24c99ce6134";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0954() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "9985380b023ee76a14c8138b6dd36428";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0955() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "5e73c5ed128aaf661900fa62649b720f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0956() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "fd22f96919807d88cf79cb65751023f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0957() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "9985380b023ee76a14c8138b6dd36428";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0958() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "634b0f356f69efd5a0151bdf245ce7b5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0959() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "fd22f96919807d88cf79cb65751023f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0960() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "40e8f673f300204d64970205f3ea94d0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0961() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "56ad3a9e94121f5c2df72bc3f0f54425";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0962() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "4ab031a290da66deaf73983ef1883ad9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0963() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "fd22f96919807d88cf79cb65751023f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0964() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -usm 2.5 100 200 1";
		String reference	= "cac1e2815bdc9c35115da73053cc3590";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0965() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "b5ba90a76a6b857e9f3de9fe102fe376";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0966() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "eb72a22013e6eec0f6eb4e43b3c05675";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0967() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0968() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "7ac4e7aea989621b313826e667b9519d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0969() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "73e91b71b6c4c5b10ee4b51f8fdd0f35";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0970() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "031d491f6db15732c1b355e233c4b1c7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0971() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "73e91b71b6c4c5b10ee4b51f8fdd0f35";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0972() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0973() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0974() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "525bc8d6ea5910bbf4d2151e2cb3c696";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0975() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "60c2fbb88e59ad44cc59dd01feda5d3b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0976() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "b63641c0b0b86a04dde84a03a6279114";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0977() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "b63641c0b0b86a04dde84a03a6279114";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0978() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "b63641c0b0b86a04dde84a03a6279114";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0979() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "3cec5a5850c33efbb2a1d1f6b06b6d32";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0980() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "837049456da32f347cd5cd4cfd6bbd96";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0981() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "385ac0de2b5970654b091000fc0bbb85";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0982() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "fb7c6e235dea33597ea17dc4e6526a6d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0983() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "4e8158c3b4d66fe43584e4e6a24835eb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0984() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "fb7c6e235dea33597ea17dc4e6526a6d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0985() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "a9c4ad0ccb9bd092f395d520998cd435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0986() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "23dc6514353d625b5a43ea2bb2bd8f14";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0987() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "fb7c6e235dea33597ea17dc4e6526a6d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0988() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "cd8457a630885a3c913069e24b9ab7fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0989() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "23dc6514353d625b5a43ea2bb2bd8f14";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0990() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "0378fa0400d3030d08432a9f6378d238";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0991() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "a201003670d0f07ad6f886cce1f44dd6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0992() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "3030beff3a44038fa35183989038fef6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0993() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "23dc6514353d625b5a43ea2bb2bd8f14";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0994() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -usm 5 250 250 0";
		String reference	= "c52e8f8c6b8ac7a54ba4f0b2ad71a27c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0995() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "0305a56f79c05a9ad366bdd667a8da43";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0996() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "0b18d8812b12520379c4f8520b23b4e9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0997() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0998() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "ddffc670040cb2bd18f9af68c6a7cdd4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_0999() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "67063b2735dc23069d5a2b04135a2a66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1000() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "d97536dc2c321771c62b22b9fea34a34";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1001() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "67063b2735dc23069d5a2b04135a2a66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1002() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1003() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1004() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "3cf723adaade248d12852fd94d4f87c5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1005() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "c742327bfb22f0ca16a7b3fd4b4ad86f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1006() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "8b0db784e7f962766662f26536ffa523";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1007() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "8b0db784e7f962766662f26536ffa523";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1008() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "8b0db784e7f962766662f26536ffa523";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1009() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "7bb772a4ddaab6f885d9566ce204fad1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1010() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "e1da4211c5f2e75c56138778ac78f71f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1011() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "8bd943715b971f178a9b84e9c2136013";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1012() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "f1bd9f2d788ab43351ba40946e2916bd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1013() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "7e583574f0d2fc31558d1f3de8f2d09e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1014() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "f1bd9f2d788ab43351ba40946e2916bd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1015() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "29d3579132812bfceb473ca01da5e4ed";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1016() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "59b634202e8a6fd29b2bca2eb950f570";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1017() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "f1bd9f2d788ab43351ba40946e2916bd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1018() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "d8813bcae81806e33bce237ee4f8afea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1019() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "59b634202e8a6fd29b2bca2eb950f570";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1020() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "e6eed6f9bceba7a8d55fd6a57f2e11ed";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1021() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "36b6d90a57eca51396f89e5018c1b7e4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1022() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "4ab031a290da66deaf73983ef1883ad9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1023() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "59b634202e8a6fd29b2bca2eb950f570";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1024() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -usm 5 250 255 1";
		String reference	= "4fba389fb7b46ebfe1ee77cf15bc4437";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1025() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.tif";
		String options		= "-convert -applyClippath";
		String reference	= "630989a2e2205ed38b001c5c25e0f25a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1026() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.psd";
		String options		= "-convert -applyClippath";
		String reference	= "5a3ac118862641154f4e5828adc50199";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1027() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -dpi 75";
		String reference	= "ca5c9ebe3f4009f85c200121dcf83e4f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1028() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -dpi 75";
		String reference	= "b3d575fe5293cd03749edfac284a8468";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1029() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -dpi 75";
		String reference	= "68bac1ed959bfe7439ee0c825194561e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1030() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -dpi 75";
		String reference	= "68bac1ed959bfe7439ee0c825194561e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1031() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -dpi 75";
		String reference	= "487b67dd6319f4d68e995f0e443ab16e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1032() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -dpi 75";
		String reference	= "23dd4516288824e16b1201ca1a13c1cd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1033() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -dpi 75";
		String reference	= "23dd4516288824e16b1201ca1a13c1cd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1034() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -dpi 75";
		String reference	= "68bac1ed959bfe7439ee0c825194561e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1035() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -dpi 75";
		String reference	= "69f037738acd49663872550c115cfbbf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1036() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -dpi 75";
		String reference	= "4f4da9a7a2707c627a62383ca1e1dad2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1037() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -dpi 75";
		String reference	= "86b2887d65dc54ac5d8f3358c09404f6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1038() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -dpi 75";
		String reference	= "dd6ca34972797af4bbe004ec0f074550";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1039() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -dpi 75";
		String reference	= "936d8b5d538a7ca734e7cd9581fdac54";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1040() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -dpi 75";
		String reference	= "9673f3931d200adb3c7545752ccc7176";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1041() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -dpi 75";
		String reference	= "26dce921387bf4b794e7689084d63647";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1042() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -dpi 75";
		String reference	= "9673f3931d200adb3c7545752ccc7176";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1043() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -dpi 75";
		String reference	= "ee87c724cb858d0d9efe9d39cec809b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1044() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -dpi 75";
		String reference	= "ee87c724cb858d0d9efe9d39cec809b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1045() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -dpi 75";
		String reference	= "0255d368c8271e55de80d6d7f6d6a670";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1046() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -dpi 75";
		String reference	= "ed354908c411dccca66fb80f593e6099";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1047() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -dpi 75";
		String reference	= "34c3bde058e83199a369a69524c0f49e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1048() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -dpi 75";
		String reference	= "e8fa22a30e344e617c42c8b7d8350fd5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1049() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -dpi 75";
		String reference	= "0fb6bf117533d1541fba323d15552a1e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1050() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -dpi 75";
		String reference	= "f186331c6358bf05b43baba5ce150edf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1051() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -dpi 75";
		String reference	= "2f045a2df6d7e314e2a15019b556a710";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1052() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -dpi 75";
		String reference	= "f3f32e1eef4d6bbca7f3270c35147271";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1053() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -dpi 75";
		String reference	= "c80c5240c80368f3ceb51e50e9e25460";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1054() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -dpi 75";
		String reference	= "8da3863d4065b9a8e58815a693070fdf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1055() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -dpi 75";
		String reference	= "48a117210b450a52aa852cfae6e0d691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1056() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -dpi 75";
		String reference	= "24e617f26ee6472cac67f7be3f788494";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1057() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -dpi 75";
		String reference	= "2d36d0374062796bc3034a2c93b1f01a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1058() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -dpi 75";
		String reference	= "d41ddb908449f4957d27568237a095bd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1059() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -dpi 75";
		String reference	= "f7a5b9dde68af0944d5fab7ab47a2a7f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1060() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -dpi 75";
		String reference	= "3913704aff305083723a64cf44e7c740";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1061() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -dpi 75";
		String reference	= "4e0b1c2a323bdb9bed4ad4be5650ddd1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1062() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -dpi 75";
		String reference	= "4e0b1c2a323bdb9bed4ad4be5650ddd1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1063() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -dpi 75";
		String reference	= "4e0b1c2a323bdb9bed4ad4be5650ddd1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1064() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -dpi 75";
		String reference	= "a176cef79c1ab6c33e07d619e197a558";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1065() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -dpi 75";
		String reference	= "4f51fe584e2a48fa8afc4b19c0ed36c1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1066() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -dpi 75";
		String reference	= "45777646ebc7bfe2c7c57dffe4104ea5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1067() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -dpi 75";
		String reference	= "2f35c4aef73d348659fc1f26efb8dc08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1068() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -dpi 75";
		String reference	= "7b92643a6bab4e93410f65654f08f96d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1069() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -dpi 75";
		String reference	= "2f35c4aef73d348659fc1f26efb8dc08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1070() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -dpi 75";
		String reference	= "51c6697ba032ed9914c7967ac6c796c5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1071() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -dpi 75";
		String reference	= "23dd4516288824e16b1201ca1a13c1cd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1072() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -dpi 75";
		String reference	= "2f35c4aef73d348659fc1f26efb8dc08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1073() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -dpi 75";
		String reference	= "553efd0d78b2276c4f44e872ecc192f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1074() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -dpi 75";
		String reference	= "23dd4516288824e16b1201ca1a13c1cd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1075() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -dpi 75";
		String reference	= "2063dc9fbe8d8d24210a75bf29eed713";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1076() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -dpi 75";
		String reference	= "611ebe1f44cf6cceaa88d5f369cc6f91";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1077() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -dpi 75";
		String reference	= "d17119e3190fde8843d60b74736a2200";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1078() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -dpi 75";
		String reference	= "23dd4516288824e16b1201ca1a13c1cd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1079() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -dpi 75";
		String reference	= "73209f69d3495ff894dc8f60bde9a001";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1080() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -dpi 75";
		String reference	= "d5c9ca8c8ce742cb6ed2ba7967b80902";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1081() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -dpi 75";
		String reference	= "942780ebbddc56fdc719088ec83a9ed0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1082() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -dpi 75";
		String reference	= "9db4b7b45c0ab227613c2f2482b2a0e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1083() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -dpi 75";
		String reference	= "9db4b7b45c0ab227613c2f2482b2a0e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1084() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -dpi 75";
		String reference	= "9db4b7b45c0ab227613c2f2482b2a0e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1085() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -dpi 75";
		String reference	= "8c8116513f3035932eb7c445daa45556";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1086() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -dpi 75";
		String reference	= "3d41f7cbf2701ce7f61a95169c70e05f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1087() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -dpi 75";
		String reference	= "41e6fa2c80433d083a9aceffb486bd2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1088() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -dpi 75";
		String reference	= "9db4b7b45c0ab227613c2f2482b2a0e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1089() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -dpi 150";
		String reference	= "e77e462dca0d3f1a836ce1a41437abc0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1090() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -dpi 150";
		String reference	= "18898a4727ed9a8e237abb8a8f722969";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1091() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -dpi 150";
		String reference	= "80ff2e494a63b289ad58f30e0e7844e0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1092() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -dpi 150";
		String reference	= "80ff2e494a63b289ad58f30e0e7844e0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1093() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -dpi 150";
		String reference	= "d12092d0c73ba766569b0bb6b6c27743";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1094() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -dpi 150";
		String reference	= "5d5c5fa85db3157ace389a855f2d97f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1095() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -dpi 150";
		String reference	= "5d5c5fa85db3157ace389a855f2d97f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1096() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -dpi 150";
		String reference	= "80ff2e494a63b289ad58f30e0e7844e0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1097() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -dpi 150";
		String reference	= "965890142c3837f82ba402d2cecb893d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1098() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -dpi 150";
		String reference	= "054dbdb8439b8763f8c10f7ea47cee07";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1099() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -dpi 150";
		String reference	= "85bb1a6adf1cc32d68091711a310bea7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1100() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -dpi 150";
		String reference	= "a3635a71ee964188e4afe59cd982cd98";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1101() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -dpi 150";
		String reference	= "e8e57fdd5791e65b9816b922ef7617ca";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1102() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -dpi 150";
		String reference	= "4d1b5938759195353e1d1ec6455e47bc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1103() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -dpi 150";
		String reference	= "636f798d3fb81cc651cad7d6a9a756d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1104() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -dpi 150";
		String reference	= "4d1b5938759195353e1d1ec6455e47bc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1105() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -dpi 150";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1106() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -dpi 150";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1107() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -dpi 150";
		String reference	= "4981737ff5f8b9a2530ea705b26b24ac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1108() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -dpi 150";
		String reference	= "abef9c877661163398262868972b1ff4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1109() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -dpi 150";
		String reference	= "b04cb8cce9f3db77a878a7da9861af32";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1110() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -dpi 150";
		String reference	= "aeb1731d0d6371976a2b52a8144a7462";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1111() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -dpi 150";
		String reference	= "a9262baa81c1e82440142cfa30221334";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1112() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -dpi 150";
		String reference	= "5c09563ee56ce95b71c4a5e0c4a8e26e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1113() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -dpi 150";
		String reference	= "d374c165ce8a82534ac4b5e234ef16d4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1114() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -dpi 150";
		String reference	= "8c02d2010c7f4ccce50944003f75c526";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1115() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -dpi 150";
		String reference	= "ff5208eaaa9c82938f40296a553a8abd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1116() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -dpi 150";
		String reference	= "320a56a885d6be1b116b48aae4e21d21";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1117() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -dpi 150";
		String reference	= "34bcfa253cad49cde48a4956a9f282f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1118() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -dpi 150";
		String reference	= "7a12b5fc413594171c18b16687963eab";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1119() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -dpi 150";
		String reference	= "76a7fec0c8cbada7eca7e45a7364553f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1120() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -dpi 150";
		String reference	= "fcea88ce4e74cc1d69ec3323755cc6d9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1121() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -dpi 150";
		String reference	= "4602a9598527cfaeb7ad52f16223ee69";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1122() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -dpi 150";
		String reference	= "149c6bcca355e3c1d6c1f9b366cc0788";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1123() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -dpi 150";
		String reference	= "981e5dc9ea7382a4f0a598cf9960e727";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1124() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -dpi 150";
		String reference	= "981e5dc9ea7382a4f0a598cf9960e727";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1125() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -dpi 150";
		String reference	= "981e5dc9ea7382a4f0a598cf9960e727";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1126() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -dpi 150";
		String reference	= "8ccf1bd5f15d8364a3ce73e174da089c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1127() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -dpi 150";
		String reference	= "3fc6bdb827ec2a145988f0e1f46e7a42";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1128() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -dpi 150";
		String reference	= "3ee41f43e0f922046a6aaa17db8b5cd6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1129() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -dpi 150";
		String reference	= "73f292a4d6beb37c259f9ed91858a790";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1130() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -dpi 150";
		String reference	= "217bdd23bae06f98d8651ac95402d464";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1131() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -dpi 150";
		String reference	= "73f292a4d6beb37c259f9ed91858a790";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1132() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -dpi 150";
		String reference	= "df6c01e19dcdaa869e3c453f57609532";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1133() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -dpi 150";
		String reference	= "5d5c5fa85db3157ace389a855f2d97f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1134() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -dpi 150";
		String reference	= "73f292a4d6beb37c259f9ed91858a790";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1135() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -dpi 150";
		String reference	= "ff0774b9f49360c4d63e9028bab988e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1136() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -dpi 150";
		String reference	= "5d5c5fa85db3157ace389a855f2d97f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1137() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -dpi 150";
		String reference	= "a50bb7f73fca0bfcee4e9243c829d197";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1138() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -dpi 150";
		String reference	= "f73f0781d4e144623a0c4489c914fcc4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1139() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -dpi 150";
		String reference	= "c9604d68dcb78daae5939f119cbc2686";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1140() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -dpi 150";
		String reference	= "5d5c5fa85db3157ace389a855f2d97f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1141() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -dpi 150";
		String reference	= "17a304d017027f0554d223455f6a06f6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1142() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -dpi 150";
		String reference	= "a3dbd6727211561a02f5af3865e36dca";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1143() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -dpi 150";
		String reference	= "a17ab488174c9b53f5c81216dc80c016";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1144() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -dpi 150";
		String reference	= "6a38587024ca3167d3d2ab4fdb14eedf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1145() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -dpi 150";
		String reference	= "6a38587024ca3167d3d2ab4fdb14eedf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1146() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -dpi 150";
		String reference	= "6a38587024ca3167d3d2ab4fdb14eedf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1147() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -dpi 150";
		String reference	= "dba4ecdda45cbef42423a888dbde67ab";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1148() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -dpi 150";
		String reference	= "65cd85d0aea01b922c3b825bf2dfd09d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1149() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -dpi 150";
		String reference	= "3482a9d6e070555a5a99b7fcabd92666";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1150() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -dpi 150";
		String reference	= "6a38587024ca3167d3d2ab4fdb14eedf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1151() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -dpi 400";
		String reference	= "cb46784d3caf9bbdaa8550b0bc620a74";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1152() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -dpi 400";
		String reference	= "e97a70c3fb6d78dd3e63647d36bd87f8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1153() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -dpi 400";
		String reference	= "f57f842492d74cb935e67b603209f6a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1154() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -dpi 400";
		String reference	= "f57f842492d74cb935e67b603209f6a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1155() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -dpi 400";
		String reference	= "e61f825ccd8b4fcaaea58b56e48716aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1156() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -dpi 400";
		String reference	= "aacec7a5a70080647afe9b99cb0b390e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1157() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -dpi 400";
		String reference	= "aacec7a5a70080647afe9b99cb0b390e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1158() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -dpi 400";
		String reference	= "f57f842492d74cb935e67b603209f6a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1159() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -dpi 400";
		String reference	= "b6ea9cafbdcb5fa631e9f0912d33346c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1160() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -dpi 400";
		String reference	= "b2d01d7238964605735a00b4c6c27538";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1161() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -dpi 400";
		String reference	= "f6916702f67f4c3c4d04dc8c570aff90";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1162() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -dpi 400";
		String reference	= "0deb4202620a2c6fafa8c048681c1f2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1163() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -dpi 400";
		String reference	= "207a013f31487c5415e05f46b816229b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1164() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -dpi 400";
		String reference	= "95c7cc095f6fd01009db72662cfd645f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1165() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -dpi 400";
		String reference	= "7810f9c682402f462ceb8045e2c731b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1166() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -dpi 400";
		String reference	= "95c7cc095f6fd01009db72662cfd645f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1167() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -dpi 400";
		String reference	= "b5e8b788df1672bc2f27b714cf309bc3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1168() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -dpi 400";
		String reference	= "b5e8b788df1672bc2f27b714cf309bc3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1169() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -dpi 400";
		String reference	= "f5122f3563fef146fd947f963b4659b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1170() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -dpi 400";
		String reference	= "6063cb54700bea6231d5573780439055";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1171() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -dpi 400";
		String reference	= "5498d2d81661453623fb594eab370509";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1172() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -dpi 400";
		String reference	= "a1340f8013a52bca32253edd80d7aa74";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1173() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -dpi 400";
		String reference	= "a3c705f22300dead4a83620effa667af";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1174() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -dpi 400";
		String reference	= "91bfeaf2d5edaed2325b7d1cf6187bee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1175() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -dpi 400";
		String reference	= "6e9dd2336363bd90a0f50e102c99af23";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1176() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -dpi 400";
		String reference	= "a7a9666151f4ed860c9d3da43c64693f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1177() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -dpi 400";
		String reference	= "32065339b56ba27cb19fb2e270abfcb9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1178() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -dpi 400";
		String reference	= "55a564fea7db4a505a2704b38018484e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1179() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -dpi 400";
		String reference	= "1456607d77dad36c1538b704ba75a1f2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1180() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -dpi 400";
		String reference	= "ff2aa0d98d5c209d39ce8b57194c14b3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1181() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -dpi 400";
		String reference	= "7e88473e235e38a3c06acb9a1e879541";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1182() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -dpi 400";
		String reference	= "7bcba7b2988fc35ba28c53592c9f0dcc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1183() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -dpi 400";
		String reference	= "fa8542c10fe517abbc32eac2bb5fb56e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1184() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -dpi 400";
		String reference	= "d1c46cbd20b2f3b766f01679c0e6beeb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1185() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -dpi 400";
		String reference	= "288e42eb07ecab3568fd9ed3c8d9e647";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1186() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -dpi 400";
		String reference	= "288e42eb07ecab3568fd9ed3c8d9e647";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1187() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -dpi 400";
		String reference	= "288e42eb07ecab3568fd9ed3c8d9e647";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1188() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -dpi 400";
		String reference	= "72ed97f1f1e389157c33340a41319fa2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1189() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -dpi 400";
		String reference	= "772ec3de5cc0ebdea8e21f1a416d9be1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1190() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -dpi 400";
		String reference	= "f19add83be6b96bbf0a1ab84be212ef3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1191() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -dpi 400";
		String reference	= "57a65803a9e586af1248619f1811c686";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1192() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -dpi 400";
		String reference	= "e1db072bae3f0af68c9daabc877d373a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1193() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -dpi 400";
		String reference	= "57a65803a9e586af1248619f1811c686";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1194() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -dpi 400";
		String reference	= "2b162f94ca715b9939e8c5f8ca8089c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1195() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -dpi 400";
		String reference	= "aacec7a5a70080647afe9b99cb0b390e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1196() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -dpi 400";
		String reference	= "57a65803a9e586af1248619f1811c686";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1197() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -dpi 400";
		String reference	= "4144f597d6d2abdf6185a48a0efc230d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1198() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -dpi 400";
		String reference	= "aacec7a5a70080647afe9b99cb0b390e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1199() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -dpi 400";
		String reference	= "a0648c23e58141dbde89f0ab3c674ea9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1200() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -dpi 400";
		String reference	= "06eca4d4de7cdc46a41123cffe314331";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1201() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -dpi 400";
		String reference	= "8e9a9778118de69e73be35e71924be32";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1202() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -dpi 400";
		String reference	= "aacec7a5a70080647afe9b99cb0b390e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1203() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -dpi 400";
		String reference	= "eafc0d8a4fad85b3603bfff4f7dc32de";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1204() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -dpi 400";
		String reference	= "bb05c9222f99d1eba2c7a6deb80093c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1205() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -dpi 400";
		String reference	= "a83e6155b8d3d5c0ef348c0a10934f26";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1206() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -dpi 400";
		String reference	= "6ece220c72ee45bc2a217f75cad89e4d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1207() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -dpi 400";
		String reference	= "6ece220c72ee45bc2a217f75cad89e4d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1208() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -dpi 400";
		String reference	= "6ece220c72ee45bc2a217f75cad89e4d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1209() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -dpi 400";
		String reference	= "73e2a0dfba19b4f82c8cc18f5c61e671";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1210() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -dpi 400";
		String reference	= "72f94e1e8081da509de5e47131131b01";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1211() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -dpi 400";
		String reference	= "4172e105a893f799f67878209a9be142";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1212() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -dpi 400";
		String reference	= "6ece220c72ee45bc2a217f75cad89e4d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1213() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -dpi 1000";
		String reference	= "566e59cf864aabd4b23de4db01ed35ac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1214() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -dpi 1000";
		String reference	= "eb82e9049b07a06d3cab922f9d927bb9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1215() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -dpi 1000";
		String reference	= "73c34ad356b3190456a1ee0d918ed593";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1216() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -dpi 1000";
		String reference	= "73c34ad356b3190456a1ee0d918ed593";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1217() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -dpi 1000";
		String reference	= "6af8954152d8ee9ee60779f54fc94bda";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1218() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -dpi 1000";
		String reference	= "ac6ed2a39f2f5884185ecbdc60af207a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1219() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -dpi 1000";
		String reference	= "ac6ed2a39f2f5884185ecbdc60af207a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1220() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -dpi 1000";
		String reference	= "73c34ad356b3190456a1ee0d918ed593";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1221() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -dpi 1000";
		String reference	= "5949370e33e607f491b07a61a9fb0eba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1222() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "569d56166b948a938b5d344feaa2dfce";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1223() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "a434d35251f17faeb6f6d5ae16dfef5f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1224() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "75128e7e7ff99064a73c5d458472ea0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1225() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "670666b414f2d589a57623b098caa318";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1226() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "8652f42a54420765d5545e8c5790c8ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1227() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "e0bdb7f914d0c8955ff3bbc23597be99";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1228() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "8652f42a54420765d5545e8c5790c8ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1229() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "5b4ad8422c8d88488847531dd6217567";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1230() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "5b4ad8422c8d88488847531dd6217567";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1231() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "9ebb7c46e48f90dfed3125e135710253";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1232() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -dpi 1000";
		String reference	= "f95cf953f34b8f3df0d55740ad6a3997";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1233() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -dpi 1000";
		String reference	= "4ad3adce76bde5264d0208a0192046a9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1234() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -dpi 1000";
		String reference	= "e5fe19c4a021411b4bc5cbaa09e9c2d3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1235() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -dpi 1000";
		String reference	= "e63d39bfbf147ee1a52afe34055bfc01";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1236() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -dpi 1000";
		String reference	= "2e5e29a5afbb5bc8ac2878cf3f02a0be";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1237() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -dpi 1000";
		String reference	= "583369b7faf146b3046ab269236af827";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1238() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -dpi 1000";
		String reference	= "1268b0a4a87c0cf3d8dcd6ada73876fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1239() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -dpi 1000";
		String reference	= "50359037329ab8bc81d79ade5bc1e4bc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1240() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -dpi 1000";
		String reference	= "cd72e9d0b270b14c0578f814e5077b76";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1241() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -dpi 1000";
		String reference	= "e2f34a520053e9c3ec22197709f41965";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1242() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -dpi 1000";
		String reference	= "48211025d944f3db590a6546c64c9158";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1243() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -dpi 1000";
		String reference	= "a6bc128a489834466621716af1647421";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1244() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -dpi 1000";
		String reference	= "8bef6e6b16e9cee705aec31363036401";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1245() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -dpi 1000";
		String reference	= "0ba9747e2dbc38c057bd0df894ffde38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1246() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -dpi 1000";
		String reference	= "29f0f3395bb481f825e2705c44866cce";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1247() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "40940db432e1e1574ad030a6daa2577f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1248() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "40940db432e1e1574ad030a6daa2577f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1249() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "40940db432e1e1574ad030a6daa2577f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1250() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "91fc6ef2c30184e641cd017ca1f2d312";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1251() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -dpi 1000";
		String reference	= "afaf8d6e124615ea85a877625fc58ab5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1252() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "df5452995c6dac8c299506938e2ac008";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1253() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "5547dba0d66053e9b57945a464082e2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1254() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "8c7dae06ba3b6d7f49de59208cf3303f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1255() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "5547dba0d66053e9b57945a464082e2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1256() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "cd51dc94f8787aaec52b01c1934e7a38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1257() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "ac6ed2a39f2f5884185ecbdc60af207a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1258() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "5547dba0d66053e9b57945a464082e2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1259() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "c0304d8c48c6c87d779da7d40cfe404d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1260() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "ac6ed2a39f2f5884185ecbdc60af207a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1261() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "853014d33d38d407437d19b6ae938538";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1262() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "c3da767e49f97e5a791058a27a2050df";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1263() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "15c1d7c5fa870c2d4b5ee450831dbe5f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1264() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -dpi 1000";
		String reference	= "ac6ed2a39f2f5884185ecbdc60af207a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1265() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -dpi 1000";
		String reference	= "9bfc45daa764f8d042a209809b7269cd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1266() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -dpi 1000";
		String reference	= "5c30d1f14887c78a81327ecb57d60c89";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1267() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -dpi 1000";
		String reference	= "b025987b40a841114ee5a245b7080d70";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1268() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -dpi 1000";
		String reference	= "a2d419138f6f539fcb51b8d03b46bb31";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1269() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -dpi 1000";
		String reference	= "a2d419138f6f539fcb51b8d03b46bb31";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1270() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -dpi 1000";
		String reference	= "a2d419138f6f539fcb51b8d03b46bb31";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1271() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -dpi 1000";
		String reference	= "7df77195da89326ee785bb1fcd4dc269";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1272() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -dpi 1000";
		String reference	= "4ad92878f392b7f745cae48564b94f61";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1273() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -dpi 1000";
		String reference	= "366fb9ee574730f17254586e93c9a998";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1274() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -dpi 1000";
		String reference	= "a2d419138f6f539fcb51b8d03b46bb31";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1275() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ul/Quince_UL.tif";
		String options		= "-convert -autocrop ul 0 0 /tmp/tmp_autocrop.xml";
		String reference	= "5f5c55e5340fbf7c5644ef621a12095a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1276() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ur/Quince_UR.tif";
		String options		= "-convert -autocrop ur 0 0 /tmp/tmp_autocrop.xml";
		String reference	= "0bac668021c41137a9b03a04efb3ca6b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1277() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ll/Quince_LL.tif";
		String options		= "-convert -autocrop ll 0 0 /tmp/tmp_autocrop.xml";
		String reference	= "7974de79642986e7c6fef8cd16839e03";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1278() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/lr/Quince_LR.tif";
		String options		= "-convert -autocrop lr 0 0 /tmp/tmp_autocrop.xml";
		String reference	= "622e7d5f6b04bd33dc0a2337e29c0df2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1279() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/mode1/crop_alpha.tif";
		String options		= "-convert -autocrop ur 1 0 /tmp/tmp_autocrop.xml";
		String reference	= "b2159d08f590517c26a3caa55bd0cb0a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1280() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/center/solid_rectangle_center.tif";
		String options		= "-convert -autocrop ll 1 0 /tmp/tmp_autocrop.xml";
		String reference	= "6459feb90737cf1fa556410a0966422c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1281() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -embedXmpData";
		String reference	= "9c599c730d188a89a6285c12d06a0921";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1282() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -embedXmpData";
		String reference	= "6511012a80a08acfb49b8ac859319084";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1283() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -embedXmpData";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1284() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -embedXmpData";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1285() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -embedXmpData";
		String reference	= "57b7570fb4f73e41b30647d4b6bda0e4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1286() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -embedXmpData";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1287() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -embedXmpData";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1288() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -embedXmpData";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1289() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -embedXmpData";
		String reference	= "4c401817dee1b5ef0d662e3edbb5ea86";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1290() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "a9b6a32608c1549c3d047b3125c194dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1291() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "c2d2bbc45b68749c7af8918fd81d6998";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1292() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "737548a6d8d8a2b4e57970f98b4eacee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1293() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "07d637f4e1c9cad0f6d18c55dd638bf7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1294() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "5e614d906054efe7f9e8bfb2114a387e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1295() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "294e9f2e0f01ea417285e3d9725d78e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1296() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "5e614d906054efe7f9e8bfb2114a387e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1297() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "b530271b483e2516d6d1351e0f189d55";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1298() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "b530271b483e2516d6d1351e0f189d55";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1299() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "560b7ac9394a2d8707e4592fd5936751";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1300() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -embedXmpData";
		String reference	= "93d65f831756446b615b7c496ad3e1e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1301() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -embedXmpData";
		String reference	= "665fb9ed774a32007b37163841c50517";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1302() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -embedXmpData";
		String reference	= "f8a45a477c027d1bdb6133f7f81ede70";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1303() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -embedXmpData";
		String reference	= "56f1ac9a43bac3b43489e1aeca97186c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1304() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -embedXmpData";
		String reference	= "f51df09b3820e88b0657854054785971";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1305() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -embedXmpData";
		String reference	= "455bdc59c433e71892ee942f48508ce5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1306() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -embedXmpData";
		String reference	= "51ddb8c2e93359f73b08eb1df7fa2c2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1307() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -embedXmpData";
		String reference	= "c6dfdb0cd934612fd76402b5c1f5be7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1308() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -embedXmpData";
		String reference	= "8ed88d9a97e1077e06e910ceca8377c5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1309() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -embedXmpData";
		String reference	= "f0ff98bb6fff98f302966c5d279d51d8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1310() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -embedXmpData";
		String reference	= "c4c28ecafe15f7ef024278291287f562";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1311() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -embedXmpData";
		String reference	= "ad9c05e06aaffb4ebcc7730a8c2a1d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1312() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -embedXmpData";
		String reference	= "9635d11fca86ee8044d4ed5bff011149";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1313() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -embedXmpData";
		String reference	= "15ab2efca793c8014298c426b1ff013a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1314() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -embedXmpData";
		String reference	= "15fb20519748110b9359d0712f9de983";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1315() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "6867d416b347dbb2d9b5af8d20a4c785";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1316() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "aeac7f8aa5bfb76f97cfe5ef5ea70d3d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1317() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "6867d416b347dbb2d9b5af8d20a4c785";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1318() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "0e725bff0ee4edbf68264288d233d092";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1319() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -embedXmpData";
		String reference	= "84a2f2ce9033af64626f48c8ac70c92d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1320() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "116d3a2781445c271dd74245ac137114";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1321() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "506931e0d4400339f0395251e9c077a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1322() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "259d7f724fddfb6a47832e36ba1e1190";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1323() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1324() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "b5b14f891f40fb2833e149fe9727973e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1325() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1326() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1327() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "e6f887ee04e83fb3d733ce30082906cd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1328() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1329() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "c4f5795e76429f78efe9ab1f2bc25ff2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1330() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "9b49dd3e174b9ca53e9e121b250b19d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1331() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "c0de80ce588bb9e45bcd32efbfeedc4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1332() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -embedXmpData";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1333() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -embedXmpData";
		String reference	= "4e9cf9ab5e9433b9837fba53dd00a610";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1334() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -embedXmpData";
		String reference	= "d7b62480a61401a388939cda36d8f075";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1335() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -embedXmpData";
		String reference	= "366527b338adc54504a6e14d8c9308f7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1336() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -embedXmpData";
		String reference	= "ca77d01a6024c18a582b920e4007f411";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1337() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -embedXmpData";
		String reference	= "e60d19664a3834fc1224d37eb68dda74";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1338() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -embedXmpData";
		String reference	= "da043cbca8080b949f273b05d7b34287";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1339() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -embedXmpData";
		String reference	= "72c160b39521fb91dfa4b032aaf12c8f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1340() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -embedXmpData";
		String reference	= "901e81f93805d6e700fc92361020651b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1341() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -embedXmpData";
		String reference	= "6c9af5def152f9aa27d0aec5578dc43a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1342() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -embedXmpData";
		String reference	= "8efaf524a316d5b909ccb33d91b2be88";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1343() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -embedColorProfile -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc";
		String reference	= "b55203fc5c30848a0c0171667f1ad91f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1344() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -embedColorProfile -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc";
		String reference	= "df83c0275571059618ed0bae4e36f3f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1345() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -embedColorProfile -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/EuroscaleUncoated.icc -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/rgb/ColorMatch_display_xyz_perceptual_RGB.icc";
		String reference	= "c5aee668944474b9e65519407742f80d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1346() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -embedColorProfile -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/EuroscaleUncoated.icc -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/rgb/ColorMatch_display_xyz_perceptual_RGB.icc";
		String reference	= "c5aee668944474b9e65519407742f80d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1347() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -embedColorProfile -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/EuroscaleUncoated.icc -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/rgb/ColorMatch_display_xyz_perceptual_RGB.icc";
		String reference	= "c5aee668944474b9e65519407742f80d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1348() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -embedColorProfile -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/EuroscaleUncoated.icc -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/rgb/ColorMatch_display_xyz_perceptual_RGB.icc";
		String reference	= "c5aee668944474b9e65519407742f80d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1349() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc -intentPerceptual";
		String reference	= "dfcca61b8bc5501acc7986f66ffbdad8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1350() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc -intentPerceptual";
		String reference	= "c530435a4352598c2d7b77e179099062";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1351() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc -intentRelColorimetric";
		String reference	= "f35a041fa71d475babfd5aeab0e2ecd1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1352() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc -intentRelColorimetric";
		String reference	= "92c038f64e52dac103f17bcc0a11bf17";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1353() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc -intentAbsColorimetric";
		String reference	= "998c7250bd77616905afec2f5da98b2b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1354() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc -intentAbsColorimetric";
		String reference	= "65882280e337b64936f19f61fa7bcc17";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1355() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc -intentSaturation";
		String reference	= "c2dd42846843237731c2b6a75cdb8a2a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1356() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/USWebCoatedSWOP.icc -intentSaturation";
		String reference	= "8fd3636998162588e6ccf07ab7c0b1a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1357() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -embedColorProfile -cmsNoBlackPointCompensation -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/EuroscaleUncoated.icc -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/rgb/ColorMatch_display_xyz_perceptual_RGB.icc";
		String reference	= "dea58e966e9aa3679610da79cd70082e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1358() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -embedColorProfile -cmsNoBlackPointCompensation -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/EuroscaleUncoated.icc -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/rgb/ColorMatch_display_xyz_perceptual_RGB.icc";
		String reference	= "dea58e966e9aa3679610da79cd70082e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1359() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -embedColorProfile -cmsNoDither8 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/EuroscaleUncoated.icc -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/rgb/ColorMatch_display_xyz_perceptual_RGB.icc";
		String reference	= "94999e8859720ccc4985835ae588245a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1360() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -embedColorProfile -cmsNoDither8 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/cmyk/EuroscaleUncoated.icc -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/ICC/rgb/ColorMatch_display_xyz_perceptual_RGB.icc";
		String reference	= "94999e8859720ccc4985835ae588245a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1361() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "83cfbf9620024e0bea87cc0af71b13f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1362() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "841b72347318233c1c0bc7fd3ca46f9a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1363() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "ec36499ca493cd4959860fd56552132f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1364() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "ec36499ca493cd4959860fd56552132f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1365() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "de829f456c17bcb2664d80a684b96fba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1366() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "2c380af041873ac4d25894fe22aa36fe";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1367() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "2c380af041873ac4d25894fe22aa36fe";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1368() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "ec36499ca493cd4959860fd56552132f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1369() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "83d03901fb82e089f1a79baae5df9700";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1370() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "8e5db484e96a9032505a585e0cfb7642";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1371() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1372() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "ceec08dcd834d8046cadc459db3d869e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1373() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1374() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "e2b4447546aaff13e9801bf270137701";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1375() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "6bbcc9f969c8662b8a2ee15584a055ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1376() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "e2b4447546aaff13e9801bf270137701";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1377() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1378() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1379() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1380() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "271ce8a0552d7690e8552ab1daf64369";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1381() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "fbc7468a316de49d3daf42a1c619d214";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1382() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "b1b2148d8a5e05b7309a8d076b455331";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1383() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "49e06fcdfcf961507294a88a29759d2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1384() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "5cb1b1806648a125f6276f6419db4ab0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1385() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "c3c1fa66e7e5c82f41bdee447d173db4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1386() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "7c47cc83bdb79fe00b6adb52ea78e015";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1387() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1388() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "946925039cf8d7a180bdac89ef7a1e7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1389() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1390() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "67e3763f63646366d62b522ad7cc69fc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1391() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "686f3ed3bf6ab5db0554fd896cfcc812";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1392() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "7226c971ff2e149f0bfb35d6ca482b66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1393() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1394() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "9f8f600a6021c967cbcb6289a083d4d9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1395() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "4438dce3ab2e80cbb6c8f113ce7c61e7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1396() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "4438dce3ab2e80cbb6c8f113ce7c61e7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1397() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "4438dce3ab2e80cbb6c8f113ce7c61e7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1398() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "b95612100f184f5047e920ab0f634cf1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1399() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "549f75112bc36e084fc996f9a69b165a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1400() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1401() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "5ed1adedeba040a729f4f74a7bded877";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1402() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1403() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "5ed1adedeba040a729f4f74a7bded877";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1404() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "9871f91ee6c0d907200ec618941150c1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1405() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "8d4ec2ffd8af5889885cee7bbb0be4a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1406() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "5ed1adedeba040a729f4f74a7bded877";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1407() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "de3088533ad5f35eb8316daef059d520";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1408() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "8d4ec2ffd8af5889885cee7bbb0be4a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1409() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "520cbf7e1af01bb93f812be518f7534d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1410() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1411() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "41d9c40f7b8006c2d05bc91837a56106";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1412() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "8d4ec2ffd8af5889885cee7bbb0be4a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1413() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "5a9589a8d562fb9ad5428c5428030837";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1414() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1415() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1416() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "a5a09b6b51f51fa2a66e3af90988ac4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1417() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "a5a09b6b51f51fa2a66e3af90988ac4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1418() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "a5a09b6b51f51fa2a66e3af90988ac4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1419() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "39adef8e0f6c0b4cababa13b0dd4b450";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1420() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "d1df8a571864a99c13842077726c11d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1421() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "839da0546dc840e0206399242b1751e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1422() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -uncompressed -forceJPEGDecompress";
		String reference	= "a5a09b6b51f51fa2a66e3af90988ac4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1423() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "9c599c730d188a89a6285c12d06a0921";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1424() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "6511012a80a08acfb49b8ac859319084";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1425() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1426() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1427() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "57b7570fb4f73e41b30647d4b6bda0e4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1428() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1429() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "e8b4c512ebde5fc567d4b0e59489a959";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1430() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "e2092d6d3b0f1c01cbfef01f50efd758";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1431() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "4c401817dee1b5ef0d662e3edbb5ea86";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1432() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "3dc43328382c424d7844d3a960fc29f3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1433() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "17454507590b894c9ae6cd41fb6e4d25";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1434() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "981e9273dee30d6ca45bedecd76f2561";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1435() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "ec0caed7483b8889010dcb7904af6cf6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1436() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1437() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "6f993e796c1fdaf55ac533f49fdca349";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1438() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "01f4da84c8e4ab05af0c9b34dbad57a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1439() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1440() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "14c0b74a3b7364e6e39a97e7f6975510";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1441() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "5feb37282b5ba8a5c0b24ccc8870d8b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1442() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "8c318dc91a6e68d9971ddcae5586e51a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1443() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "ed7481d746dfcac300f66a473fbd943e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1444() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "dae31f4fda694b02ec4985228053fecf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1445() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "c55f25017d009ba1ebe0f2c3a3a7c690";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1446() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "10cc6b4cf4c8fd6fb9d0ba602493d90a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1447() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "1a5be366000559964d469d8e4cfeaeac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1448() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "9e80474e48ebcba6d4fec9e32d53c13f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1449() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "c6dfdb0cd934612fd76402b5c1f5be7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1450() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "8ed88d9a97e1077e06e910ceca8377c5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1451() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "f0ff98bb6fff98f302966c5d279d51d8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1452() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "c4c28ecafe15f7ef024278291287f562";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1453() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "ad9c05e06aaffb4ebcc7730a8c2a1d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1454() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "9635d11fca86ee8044d4ed5bff011149";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1455() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "15ab2efca793c8014298c426b1ff013a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1456() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "15fb20519748110b9359d0712f9de983";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1457() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1458() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1459() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "d91e689515536adfe3064f1c5bfb1469";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1460() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "27a7c8a5a438eb6aee01a465413469a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1461() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "84a2f2ce9033af64626f48c8ac70c92d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1462() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "116d3a2781445c271dd74245ac137114";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1463() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1464() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "259d7f724fddfb6a47832e36ba1e1190";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1465() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1466() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "b5b14f891f40fb2833e149fe9727973e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1467() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1468() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "ec73b91bf8df85574f380e2febf25691";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1469() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "43a33abbd2dc0710232ed92dc4ce86af";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1470() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1471() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "c4f5795e76429f78efe9ab1f2bc25ff2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1472() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "f312986f715178ef3185a6c80fa90a60";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1473() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "c0de80ce588bb9e45bcd32efbfeedc4e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1474() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "fd7ef283c8ca00debf0f764049bde0aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1475() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "3683926382e24effbbe82a0e1fec72dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1476() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "d7b62480a61401a388939cda36d8f075";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1477() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "366527b338adc54504a6e14d8c9308f7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1478() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1479() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1480() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1481() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "8a3f657ee891648a572cd3cefa42f101";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1482() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "dd324171c7555e15cc3cd4640b115c3d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1483() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "dde88d57456444f3143b1b3d86e9cfc4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1484() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -deflatecompress -forceJPEGDecompress";
		String reference	= "452474936752f3c683ae47315aebe641";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1485() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "4f7dc7243da63c6d95732f68e22809f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1486() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "e2a415e9d6f5381ec57705b7bad8e95b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1487() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "76ffc8ad552563f8eaed2ea3ab4d01dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1488() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "76ffc8ad552563f8eaed2ea3ab4d01dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1489() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "1eac7a8483d357d601aac14af6620f36";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1490() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "7f2b7a7c536dae93a377b75dca57f07b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1491() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "7f2b7a7c536dae93a377b75dca57f07b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1492() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "76ffc8ad552563f8eaed2ea3ab4d01dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1493() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "28cca55e84c9946016c1be30bbf0dc79";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1494() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "2ac9a3adb38a092718a545e4c35a89a5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1495() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "a5a7cada2225a4117fc7b78574832e83";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1496() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "8e7cc2aadffa1ee2da90c221a0384936";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1497() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "a45492a7aa4e68ccddabeb8c7e8f559c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1498() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "ad8809b18e8d00601ed5219c9f8e58ea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1499() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "aa4f9855c06de198f0bc2d288f7ab406";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1500() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "ad8809b18e8d00601ed5219c9f8e58ea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1501() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "93943a4a4125dcd416d5940e0911732e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1502() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "93943a4a4125dcd416d5940e0911732e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1503() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "578536cfd0e8fb8d0f2a8bf25a544992";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1504() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "18a03b122c480f54953969fa3130ca18";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1505() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "e22672286926d43cfca8924578bc7527";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1506() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "86f810b1380ab9f0b79f060dc41327a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1507() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "dc6b35cab42668d6443bbe2018a183ea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1508() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "83fb2917e27d2fec49b359cb3e236ebb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1509() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "b9f8f63679ddbfa392b28d3c9f850041";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1510() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "f37e8001a3bcddc9068f56cd701eff23";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1511() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "a8a6b5c17673b954b284a0ef8f618e6c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1512() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "f512702a12db0c7966770a5ce84b0786";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1513() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "6540f5adfc87e14d2d299884b58b2429";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1514() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "c1382cc410f2f0990cd92a87b55b32c6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1515() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "68f2fa5a041b9e0ba1d440ecfc81904f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1516() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "acd3a67960773f5ba6568242228c869a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1517() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "c2c80e564bfc231a59f19b0a20ce52f2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1518() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "8c8ddac616d76106df79d16cf01c4e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1519() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "a1a58d9fd119f7d48bc368a3593aec41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1520() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "a1a58d9fd119f7d48bc368a3593aec41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1521() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "a1a58d9fd119f7d48bc368a3593aec41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1522() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "d9d3bb32b275944642fa20e792b25843";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1523() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "45d3960ce0d3f12a7e58f1cb87cc8759";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1524() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "e1902040f911b0ade866533f4b3113d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1525() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "9d10c2610731989237fc99e0d393b7b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1526() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "449a19b181f1d50114cf217087de44dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1527() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "9d10c2610731989237fc99e0d393b7b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1528() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "1b2f32ce2c2c2f66249d80fc3c559b6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1529() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "9a8f8856ba34954d7d148afa3151a2e5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1530() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "9d10c2610731989237fc99e0d393b7b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1531() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "3f56821764c7fc12782b768ad79aa971";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1532() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "9a8f8856ba34954d7d148afa3151a2e5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1533() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "9643af0c9efe1f9f0dc524d897b87514";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1534() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "dfe6ca04003d9bb8973c481912bcc317";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1535() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "cb42b6dabecefa6d2f63f43193741d2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1536() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "9a8f8856ba34954d7d148afa3151a2e5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1537() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "cdc3e19df466463bd246a96bd4755409";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1538() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "b59d472027f1bc2582b4009a4f191090";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1539() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "27b9626d9b8d4f4691263c0804d0d056";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1540() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "eba3c4ddb3fc13b53a2b6124f74b5be7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1541() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "eba3c4ddb3fc13b53a2b6124f74b5be7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1542() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "eba3c4ddb3fc13b53a2b6124f74b5be7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1543() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "439691dc16dbce8e1b560e741d87fed8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1544() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "fccbf1fa0be9c3a21c216b7727fc9556";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1545() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "7ebd9cabba72841e4e245ffa93dbe150";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1546() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -lzwcompress -forceJPEGDecompress";
		String reference	= "eba3c4ddb3fc13b53a2b6124f74b5be7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1547() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "5207be0c259ee10e867808f12a9d92a7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1548() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "f87940abb040cb5913caabf9b7f63fbf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1549() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "9663316095768276616bf4e83332033d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1550() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "9663316095768276616bf4e83332033d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1551() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "159700b315c9aa16a0521214ece98be9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1552() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "1e153d3afe75cf13786b7236557b4fc9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1553() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "1e153d3afe75cf13786b7236557b4fc9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1554() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "9663316095768276616bf4e83332033d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1555() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "236566dc7232a43a78b227afeb24a086";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1556() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "d51fe4ce969c31932f0b80b4d2c876ed";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1557() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "66e928c275053bedda2df696e4d8f29b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1558() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "f9b4342abac9c985a1b253618bbbac42";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1559() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "bebfe6f9a21791098ffd2daefc9b6433";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1560() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "7df0ed8fc8a53748f313330e2d59ae95";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1561() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "b845603eb7e55f88086f95ca100fec27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1562() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "7df0ed8fc8a53748f313330e2d59ae95";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1563() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1564() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "8788f7c4ebed7f58bc3df2d6de3ec5da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1565() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "c339d035d811e0f642dc08cf852f937a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1566() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "33dcb11c589f964d91af38da6096276c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1567() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "0b7a5792b6da79a9a1ce8467e4d4de73";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1568() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "4993aee9a4b07d6834646d1bf7a638f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1569() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "9be9fb2c51ad06fe3c6801ba58edaa6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1570() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "c8b7df46fef856837ed4081b6a3bdc05";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1571() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "fdda9df405d3b96d268ea1f563b61136";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1572() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "297913ffddb7465f9478bd0743e862bc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1573() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "aa42c4f1f663a0d7db4f8f45af5e9d41";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1574() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "380d85d0d41cd0a0108da0d9ca4a958f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1575() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "6cca8eca546e0134820fa9ad9568a4d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1576() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "72edaf855162836ff5ffd84baf5b9125";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1577() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "70c61ef01be6ee0d136afe6140f7cf1d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1578() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "2c158d0dd1c7fa1581fbce6fe49ca4f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1579() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "1cc6112f3850048e547a44bf5aa5a9ee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1580() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "e9c022b1a6f8e2b74e61f7a6482cad23";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1581() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "abf637a73df25b788aed039461b34957";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1582() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "abf637a73df25b788aed039461b34957";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1583() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "abf637a73df25b788aed039461b34957";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1584() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "28afd334afa0f5b69777086ef3808e1e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1585() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "49901059df26e4c5f42e8e7f8194d8d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1586() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "35483a877c9a77414c8e0829a4f4ebea";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1587() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1588() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "282ae14834d49f2f259d0a40332f0f7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1589() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1590() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "3bb534871ab8f05ad9176a09e37a07ba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1591() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "db36f13f56330e8ab3cf977dced20278";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1592() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "b5c5b5dae86a6ea39884cd1b5bc8da66";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1593() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "5daafad985c5821f93450a04356536f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1594() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "db36f13f56330e8ab3cf977dced20278";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1595() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "d9952c24b73da9e07b74071d92a83be2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1596() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "adf6cc38b9125cc0b4994515434550fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1597() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "36f3e60c327f58f9d36d1c1128b9eada";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1598() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "db36f13f56330e8ab3cf977dced20278";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1599() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "c289848a773931580936b5b8d871aff3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1600() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "05ac3be79de52ff62a97719ae7e2ced2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1601() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "f78bd1d6eaf4bb3b4e92773e334d8508";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1602() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1603() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1604() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1605() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "f2eafc9bb468b2a8e971a6d91c3d109b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1606() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "2ccb2cd8942d3833f7a11a2e4882f49f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1607() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "33ae0523ba2ce9cd102ff79933c9ea6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIc_1608() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -jpegcompress -forceJPEGDecompress";
		String reference	= "f5eb3a830984528d8f9be9cf6117cccf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}
	
//	@Test
//	public void test_WrongPara_0001() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm -1 250 250 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0002() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm d 250 250 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0003() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 5.1 250 250 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0004() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 6 250 250 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0005() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 251 250 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0006() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 1000 250 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0007() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 -1 250 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0008() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 s 250 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0009() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 250 256 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0010() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 250 2000 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0011() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 250 a 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0012() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 250 -1 1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0013() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 250 255 -1";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0014() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 250 255 2";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0015() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 250 255 a";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
//
//	@Test
//	public void test_WrongPara_0016() {
//		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
//		String options = "-convert -usm 2 250 255 10";
//		ResultBean result = uHandler.executeICConv(UTILITY_PATH + " " + options
//				+ " " + srcFile);
//		assertTrue(result.getErrorMsg(), result.getExitValue() == 1);
//		assertTrue(result.getErrorMsg(), result.getStderr()
//				.startsWith("Usage:"));
//	}
}
