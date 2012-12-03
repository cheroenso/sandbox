package com.cwb.request;

import static org.junit.Assert.assertTrue;

import java.io.File;
import org.junit.Before;
import org.junit.Test;

import com.cwb.request.UtilityHandler;

/**
 * This Junit automation test cases is testing usm parameter of "ic util"
 * command. It combine the usm parameter with others ic parameters for ensuring
 * others parameter will not impact the usm effects.
 * 
 * @author zjun
 * @since 2012-11-08
 */
public class UtilityICUsmTest{
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
	public void testIcUsm_0001() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "8cf29eb15e31ffa373420405b427f172";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0002() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "96eb13cc12b774fd16b7da9f018eb52d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0003() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0004() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0005() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "b0ee33bee5f7b69fc036268ccaa6f94b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0006() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0007() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0008() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0009() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "984ddaf3d2642582b6f5436c240669a5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0010() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "729f4aae73fc4b7b23768a3aa57ddaad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0011() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "294076dc7001d8e4642e58197e2c9c86";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0012() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "727b41a99edca8566e1641589f6de9b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0013() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "2b515752054f979050e0512aa4869646";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0014() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "52d9a2a76e723d5b99bf8dbb92211532";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0015() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "7aef985d83e5fd4e1c9fd5f4f428f74e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0016() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "52d9a2a76e723d5b99bf8dbb92211532";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0017() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "3750905498a4b7e291ec17becdf40718";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0018() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "b29c604a066b9ea64c53f1620d2b35f6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0019() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "99a29dffd11f4126f2f87cf76b0b3c0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0020() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "8cc1f343d318eab0495f7935d7e40ba0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0021() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "2b6c3af67849993f9e48d679cd7b10c3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0022() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "97848e4ea8a95fdf3df87d98c31bc15a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0023() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "aee091ab89bc98b12a65effc53b52cca";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0024() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "8f2d5b8d3c35b9f92484972e345b3d68";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0025() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "723e8e596ed54749c2e590209e12b60e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0026() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "70dcf7431feb9f87ab97874ac8b5b244";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0027() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "3136bb180f2df920f2d6305ff4909dcc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0028() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "22bf12d76aea19526e05ad56fce32668";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0029() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "ca1df96b34bbf550b119b7c441c0fb2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0030() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "b4a6d1bb395cb251698ca864caf20af8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0031() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "32990745d95d208ef24b99ed216554fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0032() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "fb29e520bd0ea8b02bb7d7a0ad71bf52";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0033() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0034() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0035() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0036() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "635eb722342ed52976d60db3b4568dba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0037() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "6ece2ac528b522e058ae3d292fdcf8a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0038() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "83e066ac97da7ff90b54e5290296b412";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0039() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "0ff305fed59c4380dddbe339e825e23d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0040() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "637ed86de8193eca5e0b0809d8625a35";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0041() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0042() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "cb4766ae57114d5b4bc45982397d89cb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0043() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0044() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "250214ece13dd57f8bc1f8fdd35e8286";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0045() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "15ac40b69964c71f2017064dbd507c71";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0046() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "42a3eae80dcc962e0ac70c539ae7df8d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0047() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0048() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "e4eedfa6f2b56c44a7a6ba5072ee9d49";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0049() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "455ea1c0f1920f7deee12911238d9d3a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0050() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0051() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0052() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0053() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "e3ded6656d3d506359d27fd9c0d49109";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0054() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "10b8a3c06c929cbcb010c504d6e91926";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0055() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "88f31c19c5ce692f64553a071251adae";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0056() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0057() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "cbc4cdec01d6067702b9924982f56e46";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0058() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "557169ffcfe81adf7d8541cff0d7146e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0059() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "d97acfb414104e5ba75cd9210933f1ad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0060() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "d97acfb414104e5ba75cd9210933f1ad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0061() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "089fb0b473686d187419a5b3e9893e53";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0062() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "02ed8255bd86dffa7aa89b85a2ce1675";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0063() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "02ed8255bd86dffa7aa89b85a2ce1675";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0064() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "d97acfb414104e5ba75cd9210933f1ad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0065() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "5dd77e572858edb7ccaa65e79566d8a2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0066() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "adb814bf23666c0ea0c61be58b5747a4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0067() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "3e90113cdd4eeaf2a492e899a5af65d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0068() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "5038f719bf27892f184573d7291e4680";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0069() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "ff9a7ae0522569fe4f9ccf8b6f54ab2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0070() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "433a27b04b627db78a221b818c3ffe10";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0071() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "b3f4fb57e99b66a31112c06ebbf9cf53";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0072() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "433a27b04b627db78a221b818c3ffe10";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0073() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "67729ccf88d28e808a2f7656c843c41a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0074() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "d30500034d5f40434baf5d5b8c02d0fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0075() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "0e068165e97d57821e83c538f330c6d8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0076() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "3833166c4545bf283667cd9254fcd013";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0077() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "e4b25d554800fd2b0266a71e3e0cd846";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0078() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "e48ce81a2f004399362be96278a5728f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0079() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "86eebcc635989be77609d3fbdf0ada24";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0080() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "040e6c104f14decb320e653f442541db";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0081() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "d2d0f2a0f63ddc3118d96b13cf264ddf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0082() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "db0553c91acc54d7063913dd83e5914a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0083() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "a712975b1e4b4492989e47ba514ae354";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0084() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "65894c409f6b6c33dcc6580ad1748872";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0085() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "796b9aa226bd8daed61d723bd53c5dd2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0086() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "b86cd8b9c236af7952a2bffb67b15d85";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0087() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "ddbf82de29cd858e665423459be6570c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0088() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "232403560b167d8a3e0ee0cfc2d217eb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0089() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "aff7493c26d4293ca0fd7e8e06824e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0090() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "aff7493c26d4293ca0fd7e8e06824e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0091() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "aff7493c26d4293ca0fd7e8e06824e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0092() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "61c42c1187bea340851dc4ed50883cdb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0093() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "02583501a93a41b1b89820523b8e6a36";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0094() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "77a73b3184a48fe6004b3ab32fc05c38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0095() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "5ab8c2d3329074a9f49fad78caf0f96b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0096() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "20361ea3a562b9b7974af385b611ac3f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0097() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "2c0834c1cf84481e0ef4978cc1406478";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0098() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "0971bd9a2a7a59a245653fb9a9eb8725";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0099() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "2c0834c1cf84481e0ef4978cc1406478";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0100() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "86ca280f535c18804b039ad6aa51c980";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0101() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "d4aa414037f9dda3d35725e88f87c924";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0102() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "ada3a0b9268422a4d43e7aacc3b5b066";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0103() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "2c0834c1cf84481e0ef4978cc1406478";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0104() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "715cd4423550bd3974954777d1ff4e6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0105() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "aa7514908e5d9e82925af0e9da8976fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0106() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "4ee7660c8c9935aa07eb2cecaa56e215";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0107() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "4ee7660c8c9935aa07eb2cecaa56e215";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0108() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "4ee7660c8c9935aa07eb2cecaa56e215";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0109() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "fcd5188058eda78bff0ebbb5ed44eb20";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0110() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "41364bf190832f5e5aa509e357da52d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0111() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "acde324f8c64550994c7e3afd3d2a1ff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0112() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed";
		String reference	= "4ee7660c8c9935aa07eb2cecaa56e215";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0113() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "8cf29eb15e31ffa373420405b427f172";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0114() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "96eb13cc12b774fd16b7da9f018eb52d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0115() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0116() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0117() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "b0ee33bee5f7b69fc036268ccaa6f94b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0118() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0119() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0120() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0121() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "984ddaf3d2642582b6f5436c240669a5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0122() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "729f4aae73fc4b7b23768a3aa57ddaad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0123() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "294076dc7001d8e4642e58197e2c9c86";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0124() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "727b41a99edca8566e1641589f6de9b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0125() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "2b515752054f979050e0512aa4869646";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0126() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "52d9a2a76e723d5b99bf8dbb92211532";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0127() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "7aef985d83e5fd4e1c9fd5f4f428f74e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0128() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "52d9a2a76e723d5b99bf8dbb92211532";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0129() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "3750905498a4b7e291ec17becdf40718";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0130() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "b29c604a066b9ea64c53f1620d2b35f6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0131() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "99a29dffd11f4126f2f87cf76b0b3c0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0132() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "8cc1f343d318eab0495f7935d7e40ba0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0133() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "2b6c3af67849993f9e48d679cd7b10c3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0134() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "97848e4ea8a95fdf3df87d98c31bc15a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0135() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "aee091ab89bc98b12a65effc53b52cca";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0136() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "8f2d5b8d3c35b9f92484972e345b3d68";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0137() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "723e8e596ed54749c2e590209e12b60e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0138() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "70dcf7431feb9f87ab97874ac8b5b244";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0139() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "3136bb180f2df920f2d6305ff4909dcc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0140() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "22bf12d76aea19526e05ad56fce32668";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0141() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "ca1df96b34bbf550b119b7c441c0fb2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0142() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "b4a6d1bb395cb251698ca864caf20af8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0143() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "32990745d95d208ef24b99ed216554fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0144() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "fb29e520bd0ea8b02bb7d7a0ad71bf52";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0145() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0146() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0147() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0148() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "635eb722342ed52976d60db3b4568dba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0149() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "6ece2ac528b522e058ae3d292fdcf8a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0150() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "83e066ac97da7ff90b54e5290296b412";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0151() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "0ff305fed59c4380dddbe339e825e23d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0152() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "637ed86de8193eca5e0b0809d8625a35";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0153() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0154() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "cb4766ae57114d5b4bc45982397d89cb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0155() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0156() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "250214ece13dd57f8bc1f8fdd35e8286";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0157() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "15ac40b69964c71f2017064dbd507c71";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0158() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "42a3eae80dcc962e0ac70c539ae7df8d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0159() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0160() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "e4eedfa6f2b56c44a7a6ba5072ee9d49";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0161() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "455ea1c0f1920f7deee12911238d9d3a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0162() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0163() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0164() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0165() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "e3ded6656d3d506359d27fd9c0d49109";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0166() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "10b8a3c06c929cbcb010c504d6e91926";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0167() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "88f31c19c5ce692f64553a071251adae";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0168() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0169() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "bbad333138d73847639fab13fad6f3d2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0170() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "0b84d51c9deb1efab79faa8556980385";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0171() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "216e9757423fc16f9bf070eee51918e3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0172() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "216e9757423fc16f9bf070eee51918e3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0173() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "2c9acb2accc9224575d73a0dda384eb6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0174() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "484011700e181363b345a8ecbd9296bb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0175() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "484011700e181363b345a8ecbd9296bb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0176() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "216e9757423fc16f9bf070eee51918e3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0177() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "8145e08aca30929647a01c96fd771443";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0178() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "4096c3424d3f5c5275244d350a8b40f4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0179() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "1e8d373e1d49e10287802ce517ca5ad1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0180() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "92067208f813a1ce183ecbaac1a85f47";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0181() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "8e7d2a36823e0202b9bc02763a3267de";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0182() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "52d3cd8c54c82ef8c61e09b31dbbdb85";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0183() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "ed9cf94dfc986b811b6350322df62312";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0184() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "52d3cd8c54c82ef8c61e09b31dbbdb85";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0185() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "0160cc7179c0163994c5c00ece98ec6b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0186() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "9ce78efd52ed7315745e1ad054bcdc8d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0187() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "77e30aa93e57114cc383595e4aaa04f3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0188() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "c7ac64055f760646ebef1944347e0aa2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0189() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "9f88fc4dc254c669a0e093bb3ec3cd4d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0190() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "1c229b3b87105363c3dd031c4248ee98";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0191() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "54b2e4b68480c5f6e9256a1f31f32f48";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0192() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "004c54818bf861b8b204ecf91fdd9ab7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0193() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "8b4907f8d71b7638debbd76629e58698";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0194() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "017c90cdf074d9fef168292ee475be4b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0195() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "3060f1604791da9fe6a30902fbd8581b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0196() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "1ce30082d7e299afac6dde65baa37d84";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0197() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "65629e984fa149a9a514699067cfb30f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0198() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "0a0a4b8614eb070320d0d1392b3f664a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0199() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "d4cacfe7a71c31d1f832589dc9646c4f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0200() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "44e3da0cf3e7b67e652593de525130b8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0201() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "28a1a7b8f73e4841f15cf195accb253a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0202() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "28a1a7b8f73e4841f15cf195accb253a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0203() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "28a1a7b8f73e4841f15cf195accb253a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0204() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "3af8414192379e2e64c0178df8940c27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0205() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "a30b6e74c126931220cb07cea4273994";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0206() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "20742b53e607ce96d8bd419cceacec95";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0207() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "e631caaea51b067103c1004585632895";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0208() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "85c6b3646b08d0e50ec1a7110540b62a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0209() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "a46bf45bee21c242160499c10cc0a182";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0210() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "968c9b3262c9a436bc6f2bff0f283a38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0211() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "a46bf45bee21c242160499c10cc0a182";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0212() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "cf5efe799a06ac9bb74140465c367c76";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0213() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "1fc5646e5d1cfea856d1d40a45827fd0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0214() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "27c04260f50f76c70cda561821288eca";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0215() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "a46bf45bee21c242160499c10cc0a182";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0216() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "3e1356fecfce84a9ebcacbffb68f0c5f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0217() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "cbeb785c8278f3ac99c7ca5e5cd5557b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0218() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "072661f49abd681186fc3597f2bd9ca4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0219() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "072661f49abd681186fc3597f2bd9ca4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0220() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "072661f49abd681186fc3597f2bd9ca4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0221() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "57476d39f76ea6ad555d2640fff44456";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0222() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "c5f9f64a223882a22cd017b62ecce74a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0223() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "74d7145995ecf4f7be2c1a416240f64c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0224() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress";
		String reference	= "072661f49abd681186fc3597f2bd9ca4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0225() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "b887ea6e1850cb942c8eebf484b69cf6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0226() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "8e748ee9ac21048d9f1ce9d833a259c7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0227() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "29557af32e54d17ef01d6c3ebaffecb4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0228() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "29557af32e54d17ef01d6c3ebaffecb4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0229() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "e8cf4dc1cdc6a9c971a81d249ab46456";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0230() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "25b99189498b6c8329c1af109434849e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0231() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "25b99189498b6c8329c1af109434849e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0232() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "29557af32e54d17ef01d6c3ebaffecb4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0233() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "943a89765bb7ba0aad7b6a28a13d5ace";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0234() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "46bbc3545b52db74c264dfba869d3db7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0235() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "3e90113cdd4eeaf2a492e899a5af65d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0236() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "5038f719bf27892f184573d7291e4680";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0237() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "ff9a7ae0522569fe4f9ccf8b6f54ab2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0238() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "cd01a1023a75d11a4e36009719ed15b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0239() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "ecc8de5364474bfd53e2cac03eeaab31";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0240() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "cd01a1023a75d11a4e36009719ed15b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0241() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "67729ccf88d28e808a2f7656c843c41a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0242() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "92e1b187ea1100cb5c8f9a7455d761de";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0243() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "2a5127bea6c0dd79bcee436b57d9df9d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0244() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "b18fa5f33a85d96e1afb7185b062034d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0245() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "f6c8bd740dea44a7cf48b158d9777f48";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0246() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "e67af2b553b20e51200e997911f7d917";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0247() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "afc773c25e952aa74a1c492bc4eaf52b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0248() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "121abaf9c5b82042fb8c45fcce3bd7f6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0249() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "d2d0f2a0f63ddc3118d96b13cf264ddf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0250() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "c3ed257001a63e1dee66097f21a0c448";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0251() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "a712975b1e4b4492989e47ba514ae354";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0252() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "2566e09943378765e6845cfe089b872a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0253() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "32afdb7fd5b38224b88b56b89fdcbd2a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0254() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "b7297a102f969139535fa0f3dbcd0343";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0255() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "ddbf82de29cd858e665423459be6570c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0256() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "e96fcb667d299cf060dacbf27e93b2ba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0257() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "7dd0d7129f0a4c1d5890c291481f80c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0258() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "7dd0d7129f0a4c1d5890c291481f80c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0259() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "7dd0d7129f0a4c1d5890c291481f80c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0260() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "a6cc494a075751a11b915c2c72866cf2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0261() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "38f4688e9749ed767add47156e7042a8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0262() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "77a73b3184a48fe6004b3ab32fc05c38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0263() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "5ab8c2d3329074a9f49fad78caf0f96b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0264() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "a382b0833eaee2e8864b7657d0e4890d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0265() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "7758e69e042435b4b2ef124d0cc34f6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0266() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "42e707e349061ec4ea84e32bb78fc320";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0267() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "7758e69e042435b4b2ef124d0cc34f6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0268() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "024fe9e8a26c5aa683346732d3d1c167";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0269() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "d4aa414037f9dda3d35725e88f87c924";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0270() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "04905a263a630992ed8b1a64280e0603";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0271() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "7758e69e042435b4b2ef124d0cc34f6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0272() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "715cd4423550bd3974954777d1ff4e6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0273() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "aa7514908e5d9e82925af0e9da8976fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0274() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "268dc76590af79d342ff697b8b74bde6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0275() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "268dc76590af79d342ff697b8b74bde6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0276() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "268dc76590af79d342ff697b8b74bde6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0277() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "aa23aea26135fca7bebdd2728bcde228";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0278() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "32b515bd31dc6aab83c6adcdefc383aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0279() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "81f7d0c01d5663c245425caad3585293";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0280() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress";
		String reference	= "268dc76590af79d342ff697b8b74bde6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0281() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "7f4bf5f7e67585985938f013f579573f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0282() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "f5a21fc795b3c9b3fa71f3e1457b5caa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0283() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "90c5f2b4aa03e5c069879531f20ad105";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0284() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "90c5f2b4aa03e5c069879531f20ad105";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0285() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "39defb55532dc2d56e92d5e098fc0140";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0286() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "ad28ecd1b6554e45b059e431a41241a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0287() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "ad28ecd1b6554e45b059e431a41241a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0288() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "90c5f2b4aa03e5c069879531f20ad105";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0289() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "afc921238a26b21ba1bfb8fd27f58166";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0290() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "c48fcdf56766fb4f560b0905c6c2efa4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0291() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "3e90113cdd4eeaf2a492e899a5af65d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0292() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "5038f719bf27892f184573d7291e4680";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0293() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "ff9a7ae0522569fe4f9ccf8b6f54ab2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0294() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "52d6c9e82686b18c3ceb45e0bed85701";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0295() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "ad006fc8c31c24e3ba381257c1662ed6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0296() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "52d6c9e82686b18c3ceb45e0bed85701";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0297() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "67729ccf88d28e808a2f7656c843c41a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0298() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "bb406a10f9d4985d02d1e9143dcd7b38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0299() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "19cbde27b131e29df7fa51265a9e7b62";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0300() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "6b64a4429e01b5952f8098144d006c8f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0301() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "4373115f4780467345c064108e4e7527";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0302() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "de8927d7edbc5eeb9f371746b4ff6005";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0303() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "96ac4191edca5a8bd5d0600085ef89d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0304() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "dced9401d9be1355bda62ff8999b88d6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0305() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "d2d0f2a0f63ddc3118d96b13cf264ddf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0306() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "c712887a5c0a49531f80f549c854a6cd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0307() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "a712975b1e4b4492989e47ba514ae354";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0308() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "42178382ceb26af0315829e48ae04ed2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0309() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "e771732f19e1dc4316763a3c5fafe7e4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0310() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "83015ee6d55bc88f13624031630f4bb2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0311() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "ddbf82de29cd858e665423459be6570c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0312() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "810d3822ecb39ee90b3fc8de538dbab4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0313() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "a45c6668a84601507ed9d61c10965cbc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0314() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "a45c6668a84601507ed9d61c10965cbc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0315() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "a45c6668a84601507ed9d61c10965cbc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0316() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "d63afc5fdd45c3af3d90dbdd656091ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0317() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "888ade437b4052c0789f296d8cdf54dc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0318() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "77a73b3184a48fe6004b3ab32fc05c38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0319() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "5ab8c2d3329074a9f49fad78caf0f96b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0320() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "d57b7f1c06dce7eead73d5a358a2e213";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0321() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "7201bc479c408e55484a165f31c6f3c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0322() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "6f687cd89029cd78f653bd16eda39a3d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0323() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "7201bc479c408e55484a165f31c6f3c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0324() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "103a0cc86664d5bfb5006acbdd903097";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0325() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "d4aa414037f9dda3d35725e88f87c924";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0326() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "d683ecfbafb289b0bbdbc97b66ea00b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0327() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "7201bc479c408e55484a165f31c6f3c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0328() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "715cd4423550bd3974954777d1ff4e6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0329() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "aa7514908e5d9e82925af0e9da8976fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0330() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "363175d42c5816b2c404cfb0d23cbf1b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0331() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "363175d42c5816b2c404cfb0d23cbf1b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0332() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "363175d42c5816b2c404cfb0d23cbf1b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0333() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "547c77b1f5eeb346ae1e86c37d234185";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0334() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "73b50c109f93c78fdf22a63b7187c07f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0335() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "db0a61223d7cd29d101d6ed9d5e19bcb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0336() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -jpegquality 80";
		String reference	= "363175d42c5816b2c404cfb0d23cbf1b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0337() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "0bfdb7c0938fb0cbd636d972a220d1ac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0338() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "74a057f2b9aab5e9fd2933c308664e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0339() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "8c70c0eff7c0c4a4da6f4f1da4207868";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0340() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "8c70c0eff7c0c4a4da6f4f1da4207868";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0341() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "76788c95c616247b60f44d97331fb567";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0342() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "e7ff581f4a2c35ad8b906bc605e23e5c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0343() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "e7ff581f4a2c35ad8b906bc605e23e5c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0344() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "8c70c0eff7c0c4a4da6f4f1da4207868";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0345() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "f16e6fe83349c54dd39fc5c7e4ab04e5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0346() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "1dacaded99688a967c5df187da35e047";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0347() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "3e90113cdd4eeaf2a492e899a5af65d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0348() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "5038f719bf27892f184573d7291e4680";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0349() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "ff9a7ae0522569fe4f9ccf8b6f54ab2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0350() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "163ec9e6636e66bc881164f0c11d4d65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0351() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "ecc8de5364474bfd53e2cac03eeaab31";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0352() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "163ec9e6636e66bc881164f0c11d4d65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0353() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "67729ccf88d28e808a2f7656c843c41a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0354() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "f6481a37d80938cb2c6cb8292dd67aad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0355() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "9b21d8585401c39ba85ee161e2a50c58";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0356() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "9e0a29a9869eefe395803259d9a7be07";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0357() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "9a1816567dcc696a26af2738c772fa4f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0358() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "a840c17b176ba5504d70966580bedc13";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0359() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "afc773c25e952aa74a1c492bc4eaf52b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0360() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "121abaf9c5b82042fb8c45fcce3bd7f6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0361() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "d2d0f2a0f63ddc3118d96b13cf264ddf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0362() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "c3ed257001a63e1dee66097f21a0c448";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0363() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "a712975b1e4b4492989e47ba514ae354";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0364() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "96d69b44f0bd593f3cc8f6bb40491f21";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0365() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "32afdb7fd5b38224b88b56b89fdcbd2a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0366() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "c9d422170b4d2fcd1fa3484a47971271";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0367() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "ddbf82de29cd858e665423459be6570c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0368() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "2a64c6a5a3f7cbeb13b627fee2e6d99a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0369() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "af7a3fb09e0f2a2ecf845e3154b1f7a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0370() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "af7a3fb09e0f2a2ecf845e3154b1f7a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0371() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "af7a3fb09e0f2a2ecf845e3154b1f7a3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0372() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "2b093f3f3eae975c3efe544a4bf91a55";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0373() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "1c77cb5960d0eb657688d21cab308467";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0374() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "77a73b3184a48fe6004b3ab32fc05c38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0375() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "5ab8c2d3329074a9f49fad78caf0f96b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0376() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "a382b0833eaee2e8864b7657d0e4890d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0377() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "ebdb341cc526c93ae8a4f931192dbc59";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0378() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "42e707e349061ec4ea84e32bb78fc320";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0379() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "ebdb341cc526c93ae8a4f931192dbc59";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0380() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "a3af820eaabb78107fe6f45c42d6faee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0381() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "d4aa414037f9dda3d35725e88f87c924";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0382() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "ce12c5aef71dd20f5bfedc0108944cc6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0383() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "ebdb341cc526c93ae8a4f931192dbc59";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0384() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "715cd4423550bd3974954777d1ff4e6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0385() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "aa7514908e5d9e82925af0e9da8976fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0386() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "6766f56d5720f3dcdc36219cd86e8a43";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0387() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "6766f56d5720f3dcdc36219cd86e8a43";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0388() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "6766f56d5720f3dcdc36219cd86e8a43";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0389() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "86f538f444bede39f1b8c54faadada9d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0390() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "32b515bd31dc6aab83c6adcdefc383aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0391() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "e6d01aa76dd6fa18562100a43302b12c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0392() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -fullsamplechrominance";
		String reference	= "6766f56d5720f3dcdc36219cd86e8a43";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0393() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -forceJPEGDecompress";
		String reference	= "99a29dffd11f4126f2f87cf76b0b3c0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0394() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -forceJPEGDecompress";
		String reference	= "8cc1f343d318eab0495f7935d7e40ba0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0395() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -forceJPEGDecompress";
		String reference	= "1b60a4b447ead686bbea06b9694d67cc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0396() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -forceJPEGDecompress";
		String reference	= "8ad895d2b59b23985a98fa8f94893bee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0397() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -forceJPEGDecompress";
		String reference	= "436cabd44d66161158ff8cd530241ac5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0398() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -forceJPEGDecompress";
		String reference	= "02347ddf8035c8fc5dc3480c0e0542f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0399() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "4179ec63b5ada3c4d9c0324553ff5b7e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0400() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "18e6b6a048f2567c9ee72383bc761480";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0401() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "1182da46f41f18b4c8d15777f8905f7a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0402() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "1182da46f41f18b4c8d15777f8905f7a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0403() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "45c67f439c93bcbd1cb8eb4b0025ff1b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0404() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "b5b212cb2f5962cc719c0e3c4f5c7582";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0405() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "b5b212cb2f5962cc719c0e3c4f5c7582";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0406() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "1182da46f41f18b4c8d15777f8905f7a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0407() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "dd819e0c84511cd9a7f7c31b5145c62b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0408() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "333c9031530c5dbd20ec7ebedb97b6d4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0409() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "1e5232d7ef5d4c91f683eb24f28e436b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0410() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "a337284c0699064df4222ed80fde1111";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0411() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "dff6ff6b11fac44c7684ef63c935d13f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0412() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "e19e846881b075184abe8e7397b2f318";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0413() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "cc5dfb126cf5d3f2a4647af762f845fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0414() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "e19e846881b075184abe8e7397b2f318";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0415() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "ee97d4e753929a2882d5fa1038e45d3f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0416() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "0078fffd3fec09bb0c4259900204c06d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0417() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "a9b4e833bdb7654daf560f131ce74268";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0418() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "6cbdb9d92f88ebbd733618500849969c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0419() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "1d0f32669452cc90e79a5f61e2bc6c43";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0420() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "0f2747c3cfca8f9c327b2b4f79bcd649";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0421() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "4b6747b59b1da511c9ee5eec729c303f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0422() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "4a1403f0cf57f18745f28c3a8816a28c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0423() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "ba7a79123c58716450feff7a0d652c2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0424() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "7a256296c60449e27ecb079b63549c6d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0425() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "3000b348028a9417e44f3ed8e1dbdd88";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0426() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "27970decb1952c4792e4615d5cbe22d0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0427() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "27a0d4eae199f409d013819500ec839b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0428() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "a62f0737e3d70e9fdf25dc2863bfa108";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0429() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "86b44ad2fa4e1e7ec6581dc672f76bf8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0430() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "0ef86e732bf21399f634c62d6d3de70b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0431() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "dd6ae2ecae5a7f3d033c8416b8647827";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0432() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "dd6ae2ecae5a7f3d033c8416b8647827";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0433() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "dd6ae2ecae5a7f3d033c8416b8647827";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0434() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "3ef129b272c5c4d0f64b1dff02e2a586";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0435() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "9fa39d92fcf40764636dce05d36e347c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0436() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "887469f13e54e7a13b33d7a42fe5f0a7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0437() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "b1bf2e4d6d27aab3f5560c5d73b61992";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0438() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "7cdef7dc613114a9042b5c30a59df325";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0439() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "3fc5427f605e6e7f3f0d626701b3ad49";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0440() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "43860f25456a80391d9530c4c826464d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0441() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "3fc5427f605e6e7f3f0d626701b3ad49";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0442() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "fe9786ad2074f997448527d737e3ce46";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0443() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "766dcfcd6f8352f711dd1b311c309dbf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0444() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "3a6d8dc9dbf4973a9713937ec7d73bd3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0445() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "419e2c7d6b8bcf6d33f71b3722b4f27c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0446() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "43ca4d99383a7c5bc923403351e3a7ca";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0447() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "c4df196d379d9109d5132082f39f7c6b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0448() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "f35ade86ac40dccef85030cc9671b1bc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0449() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "f35ade86ac40dccef85030cc9671b1bc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0450() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "f35ade86ac40dccef85030cc9671b1bc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0451() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "235de31cedc5c4d69f64ed01e93893b5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0452() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "4ab878fb34294c067a7e368b4c44af96";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0453() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "50a7ff759d01fee269919d6acd7f4369";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0454() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample2x2";
		String reference	= "f35ade86ac40dccef85030cc9671b1bc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0455() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "8cf29eb15e31ffa373420405b427f172";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0456() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "96eb13cc12b774fd16b7da9f018eb52d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0457() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0458() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0459() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "b0ee33bee5f7b69fc036268ccaa6f94b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0460() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0461() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0462() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0463() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "984ddaf3d2642582b6f5436c240669a5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0464() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "729f4aae73fc4b7b23768a3aa57ddaad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0465() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "294076dc7001d8e4642e58197e2c9c86";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0466() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "727b41a99edca8566e1641589f6de9b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0467() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "2b515752054f979050e0512aa4869646";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0468() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "52d9a2a76e723d5b99bf8dbb92211532";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0469() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "7aef985d83e5fd4e1c9fd5f4f428f74e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0470() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "52d9a2a76e723d5b99bf8dbb92211532";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0471() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "3750905498a4b7e291ec17becdf40718";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0472() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "b29c604a066b9ea64c53f1620d2b35f6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0473() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "99a29dffd11f4126f2f87cf76b0b3c0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0474() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "8cc1f343d318eab0495f7935d7e40ba0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0475() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "2b6c3af67849993f9e48d679cd7b10c3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0476() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "97848e4ea8a95fdf3df87d98c31bc15a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0477() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "aee091ab89bc98b12a65effc53b52cca";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0478() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "8f2d5b8d3c35b9f92484972e345b3d68";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0479() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "723e8e596ed54749c2e590209e12b60e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0480() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "70dcf7431feb9f87ab97874ac8b5b244";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0481() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "3136bb180f2df920f2d6305ff4909dcc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0482() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "22bf12d76aea19526e05ad56fce32668";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0483() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "ca1df96b34bbf550b119b7c441c0fb2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0484() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "b4a6d1bb395cb251698ca864caf20af8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0485() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "32990745d95d208ef24b99ed216554fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0486() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "fb29e520bd0ea8b02bb7d7a0ad71bf52";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0487() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0488() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0489() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0490() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "635eb722342ed52976d60db3b4568dba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0491() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "6ece2ac528b522e058ae3d292fdcf8a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0492() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "83e066ac97da7ff90b54e5290296b412";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0493() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "0ff305fed59c4380dddbe339e825e23d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0494() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "637ed86de8193eca5e0b0809d8625a35";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0495() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0496() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "cb4766ae57114d5b4bc45982397d89cb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0497() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0498() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "250214ece13dd57f8bc1f8fdd35e8286";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0499() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "15ac40b69964c71f2017064dbd507c71";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0500() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "42a3eae80dcc962e0ac70c539ae7df8d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0501() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0502() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "e4eedfa6f2b56c44a7a6ba5072ee9d49";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0503() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "455ea1c0f1920f7deee12911238d9d3a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0504() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0505() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0506() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0507() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "e3ded6656d3d506359d27fd9c0d49109";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0508() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "10b8a3c06c929cbcb010c504d6e91926";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0509() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "88f31c19c5ce692f64553a071251adae";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0510() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0511() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "8790690d7c88a11b0108ac78e38d88b9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0512() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "026fca88d5545e9857a4b9f2abd12347";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0513() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "c8d6be1c4ca78453830b677671e6ac2f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0514() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "c8d6be1c4ca78453830b677671e6ac2f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0515() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "19866a55131ffaa2de65d5812eb5f0a0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0516() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "22b1765004c09fa1f73c9aa1e31763fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0517() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "22b1765004c09fa1f73c9aa1e31763fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0518() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "c8d6be1c4ca78453830b677671e6ac2f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0519() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "cd349324b20250466ecf77f47e1d0727";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0520() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "53a41da19b8d47c95c74e34b86027381";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0521() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "438730f7c5c6172db5429e339fc9c21e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0522() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "2a5df67055354f4acbb750e4783c3a27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0523() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "c79488e09cb2b66ad82b9aa995f1a5eb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0524() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "321860c19114ce5a7c2332634d745a1a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0525() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "3b459ee967b0a50526726069087379f0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0526() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "321860c19114ce5a7c2332634d745a1a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0527() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "c305efc184c37225e91c6f37f51186df";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0528() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "9653c64b4ba8c69485d44bfcac8b0740";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0529() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "f1bbdc25bb8059b8f6fc06b66b76a135";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0530() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "675ecaa70fffbd5067514ecf1d6807ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0531() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "34d3ca618795096446a3ec588557ba6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0532() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "4dba1e2753e37597a653f255f1e3377a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0533() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "b6d20af30026727d344770650721053f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0534() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "317d3de9e3d4f8b021c2aa267ba1a7d8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0535() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "6def5691a5bd462027720331ca4a4c20";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0536() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "6a77cc7f92b1853ae361ee347f59dd7b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0537() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "2fbe8938866f46dbae08b7dc0c54e733";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0538() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "c6c0d83731b7d5395faa8c8e1529bc9d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0539() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "0b34926be46aec57809f7e2b87f40235";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0540() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "7e202dbfddfe5cf7679bc7150d53028e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0541() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "be266b196506a7a13edfc16d7816b9e0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0542() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "a021dc6b154c060887e70ee3116eb569";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0543() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "fcf0dafbec652a950a5abab691cacece";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0544() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "fcf0dafbec652a950a5abab691cacece";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0545() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "fcf0dafbec652a950a5abab691cacece";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0546() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "c1a9f3bd78e19c59945764d19065e7a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0547() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "06f55aaeb68742deacb3b06ef5036fef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0548() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "75fd99bc1a96eb6f1736dbbda9ce6e7c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0549() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "2178ea36305e7fedafa8e3c4c0d444e2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0550() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "45965f58dbbd9df95eccc679e0771b33";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0551() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "40d9d8022590ad303153371c97794cec";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0552() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "f92dd65fdca80d4a0d40464b06f5667c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0553() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "40d9d8022590ad303153371c97794cec";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0554() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "9266c4ee9d42e595bdb8470d4e071783";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0555() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "63eae1a47d7d5950e92092564d722620";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0556() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "ccb8961e0e8b8e10ef711b39826209d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0557() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "40d9d8022590ad303153371c97794cec";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0558() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "945745efb30a531a296952f6b467257a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0559() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "c9076973e5dec8ac1f80e61e6935f239";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0560() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "264063c62235ff0890181489f5773b27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0561() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "264063c62235ff0890181489f5773b27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0562() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "264063c62235ff0890181489f5773b27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0563() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "3bbfd62414f439a39ab569fb75e36d34";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0564() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "277a500d1279cc48216129544362ff07";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0565() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "174db67522e595ee8c28ada486261b74";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0566() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -downsample8x8FlashPix";
		String reference	= "264063c62235ff0890181489f5773b27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0567() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "cbc4cdec01d6067702b9924982f56e46";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0568() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "557169ffcfe81adf7d8541cff0d7146e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0569() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "d97acfb414104e5ba75cd9210933f1ad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0570() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "d97acfb414104e5ba75cd9210933f1ad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0571() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "089fb0b473686d187419a5b3e9893e53";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0572() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "02ed8255bd86dffa7aa89b85a2ce1675";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0573() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "02ed8255bd86dffa7aa89b85a2ce1675";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0574() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "d97acfb414104e5ba75cd9210933f1ad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0575() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "5dd77e572858edb7ccaa65e79566d8a2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0576() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "adb814bf23666c0ea0c61be58b5747a4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0577() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "3e90113cdd4eeaf2a492e899a5af65d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0578() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "5038f719bf27892f184573d7291e4680";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0579() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "ff9a7ae0522569fe4f9ccf8b6f54ab2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0580() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "433a27b04b627db78a221b818c3ffe10";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0581() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "b3f4fb57e99b66a31112c06ebbf9cf53";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0582() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "433a27b04b627db78a221b818c3ffe10";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0583() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "67729ccf88d28e808a2f7656c843c41a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0584() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "d30500034d5f40434baf5d5b8c02d0fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0585() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "0e068165e97d57821e83c538f330c6d8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0586() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "3833166c4545bf283667cd9254fcd013";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0587() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "5cf19d6f56ec7f0a08408708c0aad608";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0588() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "a843dbc40a29f9b432d5bb881c70ee12";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0589() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "a9a279afefa50ee10efb479de66d15d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0590() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "670f0229daf0c0eee592a50b548654ff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0591() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "d2d0f2a0f63ddc3118d96b13cf264ddf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0592() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "db0553c91acc54d7063913dd83e5914a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0593() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "a712975b1e4b4492989e47ba514ae354";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0594() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "65894c409f6b6c33dcc6580ad1748872";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0595() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "796b9aa226bd8daed61d723bd53c5dd2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0596() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "b86cd8b9c236af7952a2bffb67b15d85";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0597() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "ddbf82de29cd858e665423459be6570c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0598() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "232403560b167d8a3e0ee0cfc2d217eb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0599() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "aff7493c26d4293ca0fd7e8e06824e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0600() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "aff7493c26d4293ca0fd7e8e06824e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0601() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "aff7493c26d4293ca0fd7e8e06824e1c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0602() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "61c42c1187bea340851dc4ed50883cdb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0603() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "02583501a93a41b1b89820523b8e6a36";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0604() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "77a73b3184a48fe6004b3ab32fc05c38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0605() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "5ab8c2d3329074a9f49fad78caf0f96b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0606() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "20361ea3a562b9b7974af385b611ac3f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0607() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "2c0834c1cf84481e0ef4978cc1406478";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0608() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "0971bd9a2a7a59a245653fb9a9eb8725";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0609() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "2c0834c1cf84481e0ef4978cc1406478";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0610() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "86ca280f535c18804b039ad6aa51c980";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0611() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "d4aa414037f9dda3d35725e88f87c924";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0612() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "ada3a0b9268422a4d43e7aacc3b5b066";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0613() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "2c0834c1cf84481e0ef4978cc1406478";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0614() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "715cd4423550bd3974954777d1ff4e6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0615() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "aa7514908e5d9e82925af0e9da8976fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0616() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "4ee7660c8c9935aa07eb2cecaa56e215";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0617() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "4ee7660c8c9935aa07eb2cecaa56e215";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0618() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "4ee7660c8c9935aa07eb2cecaa56e215";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0619() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "fcd5188058eda78bff0ebbb5ed44eb20";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0620() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "41364bf190832f5e5aa509e357da52d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0621() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "acde324f8c64550994c7e3afd3d2a1ff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0622() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -uncompressed -forceJPEGDecompress";
		String reference	= "4ee7660c8c9935aa07eb2cecaa56e215";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0623() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "8cf29eb15e31ffa373420405b427f172";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0624() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "96eb13cc12b774fd16b7da9f018eb52d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0625() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0626() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0627() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "b0ee33bee5f7b69fc036268ccaa6f94b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0628() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0629() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0630() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0631() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "984ddaf3d2642582b6f5436c240669a5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0632() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "729f4aae73fc4b7b23768a3aa57ddaad";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0633() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "294076dc7001d8e4642e58197e2c9c86";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0634() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "727b41a99edca8566e1641589f6de9b1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0635() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "2b515752054f979050e0512aa4869646";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0636() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "52d9a2a76e723d5b99bf8dbb92211532";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0637() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "7aef985d83e5fd4e1c9fd5f4f428f74e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0638() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "52d9a2a76e723d5b99bf8dbb92211532";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0639() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "3750905498a4b7e291ec17becdf40718";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0640() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "b29c604a066b9ea64c53f1620d2b35f6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0641() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "99a29dffd11f4126f2f87cf76b0b3c0c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0642() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "8cc1f343d318eab0495f7935d7e40ba0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0643() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "1b60a4b447ead686bbea06b9694d67cc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0644() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "8ad895d2b59b23985a98fa8f94893bee";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0645() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "436cabd44d66161158ff8cd530241ac5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0646() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "02347ddf8035c8fc5dc3480c0e0542f5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0647() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "723e8e596ed54749c2e590209e12b60e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0648() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "70dcf7431feb9f87ab97874ac8b5b244";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0649() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "3136bb180f2df920f2d6305ff4909dcc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0650() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "22bf12d76aea19526e05ad56fce32668";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0651() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "ca1df96b34bbf550b119b7c441c0fb2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0652() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "b4a6d1bb395cb251698ca864caf20af8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0653() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "32990745d95d208ef24b99ed216554fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0654() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "fb29e520bd0ea8b02bb7d7a0ad71bf52";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0655() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0656() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0657() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "b35703f051932abf68420cc204afba06";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0658() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "635eb722342ed52976d60db3b4568dba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0659() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "6ece2ac528b522e058ae3d292fdcf8a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0660() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "83e066ac97da7ff90b54e5290296b412";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0661() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "0ff305fed59c4380dddbe339e825e23d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0662() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "637ed86de8193eca5e0b0809d8625a35";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0663() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0664() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "cb4766ae57114d5b4bc45982397d89cb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0665() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0666() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "250214ece13dd57f8bc1f8fdd35e8286";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0667() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "15ac40b69964c71f2017064dbd507c71";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0668() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "42a3eae80dcc962e0ac70c539ae7df8d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0669() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0670() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "e4eedfa6f2b56c44a7a6ba5072ee9d49";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0671() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "455ea1c0f1920f7deee12911238d9d3a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0672() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0673() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0674() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0675() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "e3ded6656d3d506359d27fd9c0d49109";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0676() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "10b8a3c06c929cbcb010c504d6e91926";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0677() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "88f31c19c5ce692f64553a071251adae";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0678() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -deflatecompress -forceJPEGDecompress";
		String reference	= "ccf77485328ff1d066567d82558ba435";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0679() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "bbad333138d73847639fab13fad6f3d2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0680() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "0b84d51c9deb1efab79faa8556980385";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0681() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "216e9757423fc16f9bf070eee51918e3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0682() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "216e9757423fc16f9bf070eee51918e3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0683() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "2c9acb2accc9224575d73a0dda384eb6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0684() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "484011700e181363b345a8ecbd9296bb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0685() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "484011700e181363b345a8ecbd9296bb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0686() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "216e9757423fc16f9bf070eee51918e3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0687() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "8145e08aca30929647a01c96fd771443";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0688() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "4096c3424d3f5c5275244d350a8b40f4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0689() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "1e8d373e1d49e10287802ce517ca5ad1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0690() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "92067208f813a1ce183ecbaac1a85f47";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0691() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "8e7d2a36823e0202b9bc02763a3267de";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0692() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "52d3cd8c54c82ef8c61e09b31dbbdb85";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0693() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "ed9cf94dfc986b811b6350322df62312";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0694() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "52d3cd8c54c82ef8c61e09b31dbbdb85";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0695() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "0160cc7179c0163994c5c00ece98ec6b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0696() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "9ce78efd52ed7315745e1ad054bcdc8d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0697() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "77e30aa93e57114cc383595e4aaa04f3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0698() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "c7ac64055f760646ebef1944347e0aa2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0699() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "8d7ed8fd4a1bd0ee5931ed6e84068bd4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0700() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "f060b8f5d060b2fcff8db2c235abd1cc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0701() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "542b1d99fd45fac82ff21f8811af78df";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0702() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "d4302269cde2a20aa1a8bbd25d1954b9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0703() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "8b4907f8d71b7638debbd76629e58698";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0704() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "017c90cdf074d9fef168292ee475be4b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0705() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "3060f1604791da9fe6a30902fbd8581b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0706() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "1ce30082d7e299afac6dde65baa37d84";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0707() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "65629e984fa149a9a514699067cfb30f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0708() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "0a0a4b8614eb070320d0d1392b3f664a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0709() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "d4cacfe7a71c31d1f832589dc9646c4f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0710() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "44e3da0cf3e7b67e652593de525130b8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0711() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "28a1a7b8f73e4841f15cf195accb253a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0712() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "28a1a7b8f73e4841f15cf195accb253a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0713() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "28a1a7b8f73e4841f15cf195accb253a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0714() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "3af8414192379e2e64c0178df8940c27";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0715() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "a30b6e74c126931220cb07cea4273994";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0716() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "20742b53e607ce96d8bd419cceacec95";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0717() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "e631caaea51b067103c1004585632895";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0718() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "85c6b3646b08d0e50ec1a7110540b62a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0719() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "a46bf45bee21c242160499c10cc0a182";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0720() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "968c9b3262c9a436bc6f2bff0f283a38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0721() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "a46bf45bee21c242160499c10cc0a182";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0722() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "cf5efe799a06ac9bb74140465c367c76";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0723() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "1fc5646e5d1cfea856d1d40a45827fd0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0724() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "27c04260f50f76c70cda561821288eca";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0725() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "a46bf45bee21c242160499c10cc0a182";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0726() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "3e1356fecfce84a9ebcacbffb68f0c5f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0727() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "cbeb785c8278f3ac99c7ca5e5cd5557b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0728() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "072661f49abd681186fc3597f2bd9ca4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0729() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "072661f49abd681186fc3597f2bd9ca4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0730() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "072661f49abd681186fc3597f2bd9ca4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0731() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "57476d39f76ea6ad555d2640fff44456";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0732() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "c5f9f64a223882a22cd017b62ecce74a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0733() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "74d7145995ecf4f7be2c1a416240f64c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0734() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -lzwcompress -forceJPEGDecompress";
		String reference	= "072661f49abd681186fc3597f2bd9ca4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0735() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "b887ea6e1850cb942c8eebf484b69cf6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0736() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "8e748ee9ac21048d9f1ce9d833a259c7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0737() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "29557af32e54d17ef01d6c3ebaffecb4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0738() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "29557af32e54d17ef01d6c3ebaffecb4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0739() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "e8cf4dc1cdc6a9c971a81d249ab46456";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0740() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "25b99189498b6c8329c1af109434849e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0741() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "25b99189498b6c8329c1af109434849e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0742() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "29557af32e54d17ef01d6c3ebaffecb4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0743() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "943a89765bb7ba0aad7b6a28a13d5ace";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0744() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "46bbc3545b52db74c264dfba869d3db7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0745() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "3e90113cdd4eeaf2a492e899a5af65d7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0746() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "5038f719bf27892f184573d7291e4680";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0747() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "ff9a7ae0522569fe4f9ccf8b6f54ab2e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0748() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "cd01a1023a75d11a4e36009719ed15b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0749() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "ecc8de5364474bfd53e2cac03eeaab31";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0750() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "cd01a1023a75d11a4e36009719ed15b7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0751() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "67729ccf88d28e808a2f7656c843c41a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0752() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "92e1b187ea1100cb5c8f9a7455d761de";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0753() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "2a5127bea6c0dd79bcee436b57d9df9d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0754() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "b18fa5f33a85d96e1afb7185b062034d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0755() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "bc194bbf354c6e8a587117340082dab4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0756() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "de1df043e81587527281b00ef8326de9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0757() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "36dae78c7d880362e63fda61daa2acb6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0758() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "8dc4e85de2b07f0bf4686dc77490fb32";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0759() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "d2d0f2a0f63ddc3118d96b13cf264ddf";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0760() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "c3ed257001a63e1dee66097f21a0c448";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0761() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "a712975b1e4b4492989e47ba514ae354";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0762() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "2566e09943378765e6845cfe089b872a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0763() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "32afdb7fd5b38224b88b56b89fdcbd2a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0764() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "b7297a102f969139535fa0f3dbcd0343";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0765() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "ddbf82de29cd858e665423459be6570c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0766() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "e96fcb667d299cf060dacbf27e93b2ba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0767() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "7dd0d7129f0a4c1d5890c291481f80c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0768() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "7dd0d7129f0a4c1d5890c291481f80c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0769() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "7dd0d7129f0a4c1d5890c291481f80c2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0770() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "a6cc494a075751a11b915c2c72866cf2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0771() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "38f4688e9749ed767add47156e7042a8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0772() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "77a73b3184a48fe6004b3ab32fc05c38";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0773() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "5ab8c2d3329074a9f49fad78caf0f96b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0774() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "a382b0833eaee2e8864b7657d0e4890d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0775() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "7758e69e042435b4b2ef124d0cc34f6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0776() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "42e707e349061ec4ea84e32bb78fc320";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0777() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "7758e69e042435b4b2ef124d0cc34f6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0778() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "024fe9e8a26c5aa683346732d3d1c167";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0779() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "d4aa414037f9dda3d35725e88f87c924";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0780() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "04905a263a630992ed8b1a64280e0603";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0781() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "7758e69e042435b4b2ef124d0cc34f6f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0782() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "715cd4423550bd3974954777d1ff4e6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0783() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "aa7514908e5d9e82925af0e9da8976fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0784() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "268dc76590af79d342ff697b8b74bde6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0785() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "268dc76590af79d342ff697b8b74bde6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0786() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "268dc76590af79d342ff697b8b74bde6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0787() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "aa23aea26135fca7bebdd2728bcde228";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0788() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "32b515bd31dc6aab83c6adcdefc383aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0789() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "81f7d0c01d5663c245425caad3585293";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0790() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -jpegcompress -forceJPEGDecompress";
		String reference	= "268dc76590af79d342ff697b8b74bde6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0791() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/ApplyClippath/clippingpath.tif";
		String options		= "-convert -usm 5 100 100 0 -applyClippath";
		String reference	= "aeebd04114baf08af17601f6371b14a2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0792() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/ApplyClippath/clippingpath.psd";
		String options		= "-convert -usm 5 100 100 0 -applyClippath";
		String reference	= "568c3b48bb30ff6c2a32fba7bd4f608d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0793() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "71c85ced516fb421d139d47ecccc8cde";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0794() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "0dc2d62d32361c4e982149e9ca8fa78e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0795() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "94893a0d3950665ac5c106e37c7c70aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0796() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "94893a0d3950665ac5c106e37c7c70aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0797() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "b83078992e19e91c80a16d597cc15d90";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0798() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "75a476a2a17fc36264ee72bc0362c2d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0799() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "75a476a2a17fc36264ee72bc0362c2d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0800() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "94893a0d3950665ac5c106e37c7c70aa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0801() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "e66817fb9cd5570aca7d313d70c89de0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0802() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "4b1d7dac0037c1d6d691923c085694de";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0803() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "4dc7c7a3f96b20baf2bd39dfc85d697c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0804() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "8a26262ac05c2686d61232b170251658";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0805() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "b18208e663bc73b20f83e44a7d748dd9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0806() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "accf4a979b3f59ffa65c48a0658a7340";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0807() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "a516730330bcf20af6cfa00db2f89075";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0808() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "accf4a979b3f59ffa65c48a0658a7340";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0809() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "f8d00802f65629971ad9e4248037e67b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0810() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "2b732e0674240146b71c404babe3c397";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0811() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "f1992df9e422d5fb2ba54f3833014cff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0812() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "70dd117025a9ad463ace0638901c9586";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0813() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "47d743f3272b5b1e2c2b0001ab86c5ab";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0814() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "a3a37d08b1cc094bdd58e1f47da043b5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0815() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "cdb5c91df990e0096ae500a916134492";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0816() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "3379c28cc094356e268b9618ceb3f264";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0817() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "e15b8d9105eb5adcac9816ecb5c27b26";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0818() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "7697873d7f9f11eafb07d02d6171c17c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0819() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "31c2e11dc25729e4e919a65d42610ec2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0820() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "86538726b548b4150801c793a821ace1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0821() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "93899e680ff000ad6758a475b79918a4";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0822() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "d6d448e1e06bc02a3f90904fcafd293b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0823() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "0d9bff4c213c00006c2a6ace8997b05c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0824() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "ad8b2707f89fb6534c61eda8348b1ecb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0825() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "3f6a00aae5b33c9c276623eb41ed8cdb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0826() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "3f6a00aae5b33c9c276623eb41ed8cdb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0827() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "3f6a00aae5b33c9c276623eb41ed8cdb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0828() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "cd121b1574bc376e1ff2761e8dddb0df";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0829() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "0c4a207b4f44c5b148d884068d0f9628";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0830() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "cb23f5ba09fc80cc1259bfa8297f40cd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0831() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "4841868b0a7822b80f3ec92e842e399f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0832() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "5b00f7ac0faf12a7d3bc780e843a8434";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0833() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "75a476a2a17fc36264ee72bc0362c2d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0834() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "a55e23fc1585c13607c1425b4053136e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0835() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "75a476a2a17fc36264ee72bc0362c2d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0836() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "017d4f4556765db800ee917b27662042";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0837() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "2be8ed2d0e44ea183382437010c6a422";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0838() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "de1d93988bbb7dd0d8883cfcc2f7e138";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0839() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "75a476a2a17fc36264ee72bc0362c2d1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0840() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "75b0ee76d58b4a7254bbc6dff10d91ce";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0841() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "020b9388e7884d05385a0566c1399211";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0842() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "64dcfa5c137c2f12c5784d2157bb5aa7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0843() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "64dcfa5c137c2f12c5784d2157bb5aa7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0844() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "64dcfa5c137c2f12c5784d2157bb5aa7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0845() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "8c265d628a6bbd00a0915ca31869e0da";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0846() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "b4e759de857fe8087b420c51bcf37a50";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0847() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "eef006b9ad65c1b61be5e1967c6e4e35";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0848() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -dpi 400";
		String reference	= "64dcfa5c137c2f12c5784d2157bb5aa7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0849() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "8cf29eb15e31ffa373420405b427f172";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0850() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "96eb13cc12b774fd16b7da9f018eb52d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0851() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0852() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0853() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "b0ee33bee5f7b69fc036268ccaa6f94b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0854() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0855() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "c31a8dc3b44ceb6c463e7d8bc92b060a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0856() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "5ef52e4947c3fd599af327ede7ac81c9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0857() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "984ddaf3d2642582b6f5436c240669a5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0858() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "4eed11a9188df0c3b9065160d43fbd67";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0859() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "7a547d9fa820998b8fc39c9479f5bb77";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0860() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_grayA/GreyA_5290827.psd";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "60317ad4b55bc63381780d5f2271b1b5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0861() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "8604b81e5a231f13e91aec4a0a2b8e32";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0862() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "77dab7ad010222bd42a46f71f40d0533";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0863() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/color_gray/Grey_CasementCS2.psd";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "8bf4ef1427461439a86a3ac69f7474cc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0864() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "77dab7ad010222bd42a46f71f40d0533";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0865() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "0cb02b3629fe5b63735db4973c5f2604";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0866() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PSD/bits_16/Bits16_usermask.psd";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "cc74bdc25faea4500b55688f3766a451";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0867() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "410bdf771835e99bfe75c8bd1531e22b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0868() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_CMYK/duckyCmyk.jpg";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "51adce36ad9d2ff5909e8656408f7ef0";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0869() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "091bc88a6543e86993ca3fdb71a52437";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0870() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "ca5a2af177a63c8be66b9508ecc9beff";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0871() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "b923a8b3484c8bcb8f0f0f1cc588b741";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0872() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/JPG/color_gray/DuckyGray.jpg";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "31b720ab8916eca898d4e58e762041ca";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0873() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "723e8e596ed54749c2e590209e12b60e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0874() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_1/Untitled-2.png";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "70dcf7431feb9f87ab97874ac8b5b244";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0875() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_grayA/f1.png";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "3136bb180f2df920f2d6305ff4909dcc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0876() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "22bf12d76aea19526e05ad56fce32668";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0877() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_gray/grayshirt.png";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "ca1df96b34bbf550b119b7c441c0fb2d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0878() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "b4a6d1bb395cb251698ca864caf20af8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0879() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "32990745d95d208ef24b99ed216554fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0880() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/PNG/bits_16/1.png";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "fb29e520bd0ea8b02bb7d7a0ad71bf52";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0881() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "781825a81ea74dc36b7b3fe5bf7ad6fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0882() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "8d03d307ff701b1e0907f1bf0425d66a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0883() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_LZW/Palm-lzw.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "781825a81ea74dc36b7b3fe5bf7ad6fa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0884() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "2c2d0c0fa4aaa033537abe33d3642657";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0885() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "6ece2ac528b522e058ae3d292fdcf8a1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0886() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_CMYKA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "83e066ac97da7ff90b54e5290296b412";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0887() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_grayA/f4.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "0ff305fed59c4380dddbe339e825e23d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0888() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "637ed86de8193eca5e0b0809d8625a35";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0889() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0890() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_gray/em.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "bf2c69070ec1c8c6cc949d84a8ff9f77";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0891() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0892() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_uncompressed/01STCOGA.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "250214ece13dd57f8bc1f8fdd35e8286";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0893() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "ad8d7e469e0be3b2ff9275ea60fd5b63";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0894() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "42a3eae80dcc962e0ac70c539ae7df8d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0895() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "43ab1195c5050ec2b42bdd47e657f7ef";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0896() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "e4eedfa6f2b56c44a7a6ba5072ee9d49";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0897() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "455ea1c0f1920f7deee12911238d9d3a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0898() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "763fe78f57bccfa05994c03afad34a3c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0899() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII/ASCII.eps";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "84fb344fba1e823084206e98ca725558";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0900() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_ASCII85/ASCII85.eps";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "5a8b512138f29ad42833b1b6d2c9b99a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0901() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "17d012b2ce519e8c59ae7258229a409e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0902() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/color_gray/PixelType_gray.eps";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "35d9bf9ca20304dd34b8e3c5ab205b02";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0903() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_JPEG/JPEG.eps";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "fcbfe79fe05009cf0e364afe4c0733fd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0904() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/All/EPS/compression_Binary/Binary.eps";
		String options		= "-convert -usm 5 100 100 0 -embedXmpData";
		String reference	= "de5d59be76a77e9bea2c1414a8ea1086";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0905() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "8783052f6ce0777b873e961f1cb17d4b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0906() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "ca53a3d9c38637108581b046a602f805";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0907() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "bb9a423b3772a3e3f2d89cc36d1b222f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0908() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "bb9a423b3772a3e3f2d89cc36d1b222f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0909() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "c4e26eb18290374c0da5d24e267e9d4c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0910() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "54c0a1be5bf1d7be83f6c3aa8804cbfa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0911() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "54c0a1be5bf1d7be83f6c3aa8804cbfa";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0912() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "8030ca59faf3f5db4d215de7837e65ed";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0913() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "4a5de70360e996dfa3e28ef0398d627d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0914() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "6e08c4afc3aa00f9cef8d5f76b97ab34";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0915() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "6e08c4afc3aa00f9cef8d5f76b97ab34";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0916() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "e9b5ec662ee7e8f020c3c54a4efddde9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0917() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "2976ac1bc7b4488c9c60b22c2a86df94";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0918() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "e774d46f2b1af88e2f0b354dd28bcaba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0919() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "5cce6984bf756af2c54f281080c9feab";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0920() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "67b9b734076a5eea29f3c39503cf149f";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0921() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "cd114376c14188f748dc5a89a19ab636";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0922() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "749d98c1d71ea92fce02e06580524b96";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0923() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "4e3074679b4296c1124fdfe90bb3b4a8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0924() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "63dc9ebfc2e96a6fdd5068c5b7d62f47";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0925() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "67bd6d5cbaa43a59c2c10473a658bc7c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0926() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "67bd6d5cbaa43a59c2c10473a658bc7c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0927() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "0614014986fda75ea91496b1fcc8d525";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0928() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "346aaee7a21329b0932ff4165a0cc9e5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0929() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "f6c5783ad89e0a0909568aacaa51d1f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0930() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "f72e04f57da4176b57189f689a572a6e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0931() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile";
		String reference	= "c04aebd0a056f324e751256c2a046c84";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0932() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "b4b4c6c493b14bc6ff5b9aef51f5e4b3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0933() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "371c317b69165ccc471e71abbd23e3ac";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0934() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "69aa3d39eb74d43cfaee027bbcc9265a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0935() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "69aa3d39eb74d43cfaee027bbcc9265a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0936() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "b0ee33bee5f7b69fc036268ccaa6f94b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0937() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "32395db1945b370074232a3a7a4f1db7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0938() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "32395db1945b370074232a3a7a4f1db7";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0939() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "3a06e0f01a3d9c1ddcda0acf8c6dd49a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0940() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "a7bf005967a6a7b3c63a02ae521457d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0941() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0942() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0943() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "682f7adaa349e3e051e04a69a3052b97";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0944() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "615b996c3da69100fdb7fcb723ae6c1e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0945() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "955b2b560172b92aff36b408b076bc65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0946() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "2363dd7a366886f05bd8fac3d2e5d7f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0947() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "726ca649733d20470232f5c307dc2971";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0948() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "bac1906fb6f850df0a6898d45afdb3b2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0949() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "735e7f5d003619388f1cce6586927d0e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0950() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "eaa8ff3d282825597fad9be8b9929719";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0951() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "1e8a9acfab03000d577984a13fb04fc9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0952() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "b26af8f6807cc0e9afe27a613e233e1a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0953() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "b26af8f6807cc0e9afe27a613e233e1a";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0954() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "91ddc075a3855bff748a7c24dd2cfee8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0955() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "9e530599c1a0c10b2bfbd10b49f95e84";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0956() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "96f1a8b257866560820416a1a47f93a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0957() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "6274083091787c2a8ee17aec329d3696";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0958() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoBlackPointCompensation";
		String reference	= "a33758857060692794690e9c8e8d6d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0959() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_56/Bit_565.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "36df1033e69d16b7296e34fd5a843423";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0960() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_56/Bits_555.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "80e9d784ec95d626e4ca8a4b7238e2a6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0961() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "86d200394eedaad5864bdd34dc12494c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0962() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/color_indexed/BMP_Indexed.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "86d200394eedaad5864bdd34dc12494c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0963() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_1/Bits_1.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "b0ee33bee5f7b69fc036268ccaa6f94b";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0964() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/color_RGB/RGB_Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "63c22eda6a974a4ebdb9a6a33fa2361e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0965() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/BMP/bits_8/Bits_8.bmp";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "63c22eda6a974a4ebdb9a6a33fa2361e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0966() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PICT/8rgb.pict";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "7156f688c276ff724ccf6e941cbc5638";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0967() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "da470ac986d60862f9ac3e953fe50f98";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0968() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "c9dc7e54509cabd18609453ee996e91d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0969() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "c9dc7e54509cabd18609453ee996e91d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0970() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "5956839914a48a9f3a4064fbbe6bacbb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0971() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "39e6057454438904f8da935167a898e1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0972() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "fcd753ba5d9484557ff1a5f9624d1749";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0973() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "d15b7683e64889b0ca987aac56cea280";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0974() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/color_RGB/0204bugdel2Chateau.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "58a59e9395ee0e97d979f3fb599d2751";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0975() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/bits_8/0204bugdel220010001-1.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "1fd38f43ecdd02dffa18a6c5c881330e";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0976() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "24817307f8c01d57775f6a4e95e03ad2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0977() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/color_indexed/f4-tif.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "a4d8896d49bb09f471a956b3f6819af8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0978() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/compression_Packbits/PIG.TIF";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "4f1fcae3163652c7de5ebe6d01c643f9";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0979() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "3aefa0813914bd32b2657aaf536c3731";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0980() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "3aefa0813914bd32b2657aaf536c3731";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0981() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "eba922eb2213ad2d07c0504b12351d7c";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0982() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/TIF/compression_JPEG/squareBkg.tif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "405a6973dadacce7324c9c3d642f303d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0983() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/GIF/compression_LZW/Flower_LZW.gif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "ccf8f7386a3bd32f6ef2ee006090e5dd";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0984() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/GIF/color_index/Flower_Index.gif";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "c3ab401fd2c00906cc2cf6319717e883";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0985() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/RGB/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -imageprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/sRGB.icm -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -cmsNoDither8";
		String reference	= "ff33019a926bc869f6e36ada01646a5d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0986() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "a7bf005967a6a7b3c63a02ae521457d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0987() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0988() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0989() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "3750905498a4b7e291ec17becdf40718";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0990() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "1b60a4b447ead686bbea06b9694d67cc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0991() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "955b2b560172b92aff36b408b076bc65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0992() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "2363dd7a366886f05bd8fac3d2e5d7f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0993() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "32990745d95d208ef24b99ed216554fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0994() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "91ddc075a3855bff748a7c24dd2cfee8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0995() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentPerceptual";
		String reference	= "a33758857060692794690e9c8e8d6d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0996() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "a7bf005967a6a7b3c63a02ae521457d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0997() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0998() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_0999() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "3750905498a4b7e291ec17becdf40718";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1000() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "1b60a4b447ead686bbea06b9694d67cc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1001() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "955b2b560172b92aff36b408b076bc65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1002() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "2363dd7a366886f05bd8fac3d2e5d7f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1003() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "32990745d95d208ef24b99ed216554fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1004() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "91ddc075a3855bff748a7c24dd2cfee8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1005() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentRelColorimetric";
		String reference	= "a33758857060692794690e9c8e8d6d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1006() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "a7bf005967a6a7b3c63a02ae521457d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1007() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1008() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1009() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "3750905498a4b7e291ec17becdf40718";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1010() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "1b60a4b447ead686bbea06b9694d67cc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1011() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "955b2b560172b92aff36b408b076bc65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1012() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "2363dd7a366886f05bd8fac3d2e5d7f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1013() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "32990745d95d208ef24b99ed216554fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1014() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "91ddc075a3855bff748a7c24dd2cfee8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1015() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentAbsColorimetric";
		String reference	= "a33758857060692794690e9c8e8d6d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1016() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "a7bf005967a6a7b3c63a02ae521457d5";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1017() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1018() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "abe6b221d7614369573df2548124cd08";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1019() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "3750905498a4b7e291ec17becdf40718";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1020() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "1b60a4b447ead686bbea06b9694d67cc";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1021() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "955b2b560172b92aff36b408b076bc65";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1022() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "2363dd7a366886f05bd8fac3d2e5d7f1";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1023() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "32990745d95d208ef24b99ed216554fb";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1024() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "91ddc075a3855bff748a7c24dd2cfee8";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1025() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -intentSaturation";
		String reference	= "a33758857060692794690e9c8e8d6d45";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1026() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/RGB_layers.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "4a5de70360e996dfa3e28ef0398d627d";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1027() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/color_RGB/color_RGB.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "6e08c4afc3aa00f9cef8d5f76b97ab34";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1028() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/bits_8/Bits8_IMG6437.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "6e08c4afc3aa00f9cef8d5f76b97ab34";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1029() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "dbd156580e968da8593108ddfa9e23b6";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1030() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "1c5e5e503a5da7b8d246446911888ee3";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1031() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/JPG/color_RGB/DuckyRGB.jpg";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "e774d46f2b1af88e2f0b354dd28bcaba";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1032() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_indexed/AvrilPoster.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "5cce6984bf756af2c54f281080c9feab";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1033() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/PNG/color_RGBA/107.png";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "879040ada4ac86e610f99326c1595eb2";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1034() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/TIF/color_RGBA/s7logo.tif";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "0614014986fda75ea91496b1fcc8d525";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}

	@Test
	public void testIcUsm_1035() {
		String srcFile		= "/mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/NoEmd/EPS/color_RGB/PixelType_RGB.eps";
		String options		= "-convert -usm 5 100 100 0 -viewprofile /mnt/sjshare/automation_assets_sync/IC_images/junit/src_usm/icc/adobe.icc -embedColorProfile ";
		String reference	= "c04aebd0a056f324e751256c2a046c84";
		String errorMsg		= uHandler.convertFileToTiff(UTILITY_PATH + " " + options + " " + srcFile, reference);
		assertTrue(errorMsg, (errorMsg.length() == 0));
	}
}
