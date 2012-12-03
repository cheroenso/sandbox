package com.cwb.request;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
//import org.custommonkey.xmlunit.XMLTestCase;
//import org.custommonkey.xmlunit.XMLUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import static org.custommonkey.xmlunit.XMLAssert.*;

/**
*
* @author Jun Zhang
* @author cbrann
* @since 2012-07-16
*
*/
//public class ImageInfoTest extends XMLTestCase{
public class ImageInfoTest{
	public String CMD_IMAGEINFO	= "/usr/local/scene7/ImageServing/bin64/ImageInfo";
	public String TMP_INFOFILE  = "/tmp";
	@Test
	public void testInfo_0001() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.tif\" ImageWidth=\"504\" ImageHeight=\"360\" ImagePixelEncoding=\"TIFF deflate\" ImageTileBytes=\"49152\" ImageBytes=\"115450\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"true\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Scene7 Image Converter 5.1.0\" /> <IptcInfo /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"Path 1\" > </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0002() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.psd\" ImageWidth=\"2048\" ImageHeight=\"1536\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"3145728\" ImageBytes=\"8723735\" ImageXRes=\"180\" ImageYRes=\"180\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"true\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon PowerShot A75\" Orientation=\"1\" DateTime=\"2012:06:07 14:33:13\" ExposureTime=\"0.003125\" FNumber=\"2.8\" IsoSpeedRating=\"50\" ExifVersion=\"0220\" DateTimeOriginal=\"2006:05:16 14:18:28\" DateTimeDigitized=\"2006:05:16 14:18:28\" CompressedBitsPerPixel=\"3\" ShutterSpeedValue=\"8.3125\" ApertureValue=\"2.96875\" ExposureBiasValue=\"0\" MaxApertureValue=\"2.96875\" MeteringMode=\"5\" Flash=\"73\" FocalLength=\"5.40625\" FlashPixVersion=\"0100\" ColorSpace=\"1\" PixelXDimension=\"2048\" PixelYDimension=\"1536\" FocalPlaneXResolution=\"9846.15\" FocalPlaneYResolution=\"9846.15\" FocalPlaneResolutionUnit=\"2\" SensingMethod=\"2\" CustomRendered=\"0\" ExposureMode=\"0\" WhiteBalance=\"0\" DigitalZoomRatio=\"1\" SceneCaptureType=\"0\" /> <IptcInfo DateCreated=\"20060516\" TimeCreated=\"141828+0000\" /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"Path 1\" > </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0003() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/center/solid_rectangle_center.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/center/solid_rectangle_center.tif\" ImageWidth=\"256\" ImageHeight=\"256\" ImagePixelEncoding=\"TIFF deflate\" ImageTileBytes=\"49152\" ImageBytes=\"1820\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Scene7 Image Converter 4.7.5\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0004() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/mode1/crop_alpha.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/mode1/crop_alpha.tif\" ImageWidth=\"256\" ImageHeight=\"256\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"196608\" ImageBytes=\"114272\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b90fe274cafc77e1d93769b99c15a061\" ImageIccProfileDescription=\"Generic RGB Profile\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Macintosh)\" ColorSpace=\"65535\" PixelXDimension=\"256\" PixelYDimension=\"256\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0005() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ll/Quince_LL.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ll/Quince_LL.tif\" ImageWidth=\"1000\" ImageHeight=\"600\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261000\" ImageBytes=\"1163496\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS2 Windows\" ColorSpace=\"1\" PixelXDimension=\"1000\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0006() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ur/Quince_UR.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ur/Quince_UR.tif\" ImageWidth=\"1000\" ImageHeight=\"600\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261000\" ImageBytes=\"1162400\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS2 Windows\" ColorSpace=\"1\" PixelXDimension=\"1000\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0007() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ul/Quince_UL.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ul/Quince_UL.tif\" ImageWidth=\"1000\" ImageHeight=\"600\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261000\" ImageBytes=\"1163560\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS2 Windows\" ColorSpace=\"1\" PixelXDimension=\"1000\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0008() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/lr/Quince_LR.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/lr/Quince_LR.tif\" ImageWidth=\"1000\" ImageHeight=\"600\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261000\" ImageBytes=\"1162076\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS2 Windows\" ColorSpace=\"1\" PixelXDimension=\"1000\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0009() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"BMP bitfields\" ImageTileBytes=\"2016000\" ImageBytes=\"1344072\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0010() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"BMP bitfields\" ImageTileBytes=\"2016000\" ImageBytes=\"1344072\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0011() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"673076\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0012() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"673076\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0013() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"85184\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0014() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"2016056\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0015() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"2016056\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0016() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"BMP rle 8\" ImageTileBytes=\"2016000\" ImageBytes=\"542608\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0017() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict\" ImageWidth=\"2667\" ImageHeight=\"1242\" ImagePixelEncoding=\"PICT RLE\" ImageTileBytes=\"2480310\" ImageBytes=\"2820382\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Pict/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0018() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd\" ImageWidth=\"1500\" ImageHeight=\"1500\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"3000000\" ImageBytes=\"12589961\" ImageXRes=\"300\" ImageYRes=\"300\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"00f196d48842240d75da610d6803edf7\" ImageIccProfileDescription=\"SWOP (Coated), 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 14:21:36\" ColorSpace=\"65535\" PixelXDimension=\"1500\" PixelYDimension=\"1500\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0019() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd\" ImageWidth=\"700\" ImageHeight=\"700\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"1960000\" ImageBytes=\"1260379\" ImageXRes=\"500\" ImageYRes=\"500\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 15:16:40\" ColorSpace=\"65535\" PixelXDimension=\"700\" PixelYDimension=\"700\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0020() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd\" ImageWidth=\"5000\" ImageHeight=\"5000\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"1000000\" ImageBytes=\"77482\" ImageXRes=\"500\" ImageYRes=\"500\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 15:29:14\" ColorSpace=\"65535\" PixelXDimension=\"5000\" PixelYDimension=\"5000\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0021() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd\" ImageWidth=\"700\" ImageHeight=\"700\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"490000\" ImageBytes=\"614743\" ImageXRes=\"300\" ImageYRes=\"300\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 15:19:20\" ColorSpace=\"65535\" PixelXDimension=\"700\" PixelYDimension=\"700\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0022() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/RGB_layers.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/RGB_layers.psd\" ImageWidth=\"432\" ImageHeight=\"398\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"515808\" ImageBytes=\"1887393\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"true\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2005:06:08 09:49:51\" ColorSpace=\"1\" PixelXDimension=\"432\" PixelYDimension=\"398\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0023() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd\" ImageWidth=\"700\" ImageHeight=\"525\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"1102500\" ImageBytes=\"1118562\" ImageXRes=\"616\" ImageYRes=\"616\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 10D\" Orientation=\"1\" DateTime=\"2004:01:28 15:33:18\" ExposureTime=\"0.04\" FNumber=\"22\" IsoSpeedRating=\"200\" ExifVersion=\"0220\" DateTimeOriginal=\"2003:12:05 12:26:46\" DateTimeDigitized=\"2003:12:05 12:26:46\" CompressedBitsPerPixel=\"3\" ShutterSpeedValue=\"4.64386\" ApertureValue=\"8.91887\" ExposureBiasValue=\"1\" MaxApertureValue=\"4\" MeteringMode=\"5\" Flash=\"0\" FocalLength=\"40\" FlashPixVersion=\"0100\" ColorSpace=\"1\" PixelXDimension=\"700\" PixelYDimension=\"525\" FocalPlaneXResolution=\"3443.95\" FocalPlaneYResolution=\"3442.02\" FocalPlaneResolutionUnit=\"2\" SensingMethod=\"2\" CustomRendered=\"0\" ExposureMode=\"2\" WhiteBalance=\"0\" SceneCaptureType=\"0\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0024() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd\" ImageWidth=\"600\" ImageHeight=\"600\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"360000\" ImageBytes=\"729800\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2006:10:12 12:38:51\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0025() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd\" ImageWidth=\"700\" ImageHeight=\"525\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"1102500\" ImageBytes=\"1118562\" ImageXRes=\"616\" ImageYRes=\"616\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 10D\" Orientation=\"1\" DateTime=\"2004:01:28 15:33:18\" ExposureTime=\"0.04\" FNumber=\"22\" IsoSpeedRating=\"200\" ExifVersion=\"0220\" DateTimeOriginal=\"2003:12:05 12:26:46\" DateTimeDigitized=\"2003:12:05 12:26:46\" CompressedBitsPerPixel=\"3\" ShutterSpeedValue=\"4.64386\" ApertureValue=\"8.91887\" ExposureBiasValue=\"1\" MaxApertureValue=\"4\" MeteringMode=\"5\" Flash=\"0\" FocalLength=\"40\" FlashPixVersion=\"0100\" ColorSpace=\"1\" PixelXDimension=\"700\" PixelYDimension=\"525\" FocalPlaneXResolution=\"3443.95\" FocalPlaneYResolution=\"3442.02\" FocalPlaneResolutionUnit=\"2\" SensingMethod=\"2\" CustomRendered=\"0\" ExposureMode=\"2\" WhiteBalance=\"0\" SceneCaptureType=\"0\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0026() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd\" ImageWidth=\"100\" ImageHeight=\"100\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"30000\" ImageBytes=\"68978\" ImageXRes=\"150\" ImageYRes=\"150\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 14:50:49\" ColorSpace=\"65535\" PixelXDimension=\"100\" PixelYDimension=\"100\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0027() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd\" ImageWidth=\"100\" ImageHeight=\"100\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"30000\" ImageBytes=\"68978\" ImageXRes=\"150\" ImageYRes=\"150\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 14:50:49\" ColorSpace=\"65535\" PixelXDimension=\"100\" PixelYDimension=\"100\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0028() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd\" ImageWidth=\"400\" ImageHeight=\"424\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"508800\" ImageBytes=\"2655146\" ImageXRes=\"100\" ImageYRes=\"100\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"true\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"50b9125494306a6fc1b7c4f2a1a8d49d\" ImageIccProfileDescription=\"Adobe RGB (1998)\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2006:09:26 11:40:01\" ColorSpace=\"65535\" PixelXDimension=\"400\" PixelYDimension=\"424\" /> <IptcInfo /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"type\" > </PhotoshopPath> <PhotoshopPath PhotoshopPathName=\"petite vase path\" > </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0029() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd\" ImageWidth=\"560\" ImageHeight=\"647\" ImagePixelEncoding=\"Photoshop uncompressed\" ImageTileBytes=\"2173920\" ImageBytes=\"2511360\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"2\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 10:14:48\" ColorSpace=\"1\" PixelXDimension=\"560\" PixelYDimension=\"647\" /> <IptcInfo /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"Circles a\" > </PhotoshopPath> <PhotoshopPath PhotoshopPathName=\"Circles b\" > </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0030() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg\" ImageWidth=\"2500\" ImageHeight=\"1666\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"4160000\" ImageBytes=\"2695651\" ImageXRes=\"240\" ImageYRes=\"240\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"79d7e984ea3ac74eed7cc92bf6b22a0d\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 5D Mark II\" Orientation=\"1\" DateTime=\"2012:06:07 16:56:26\" ExposureTime=\"0.0333333\" FNumber=\"2.8\" ExposureProgram=\"2\" IsoSpeedRating=\"2500\" /> <IptcInfo DateCreated=\"20081104\" TimeCreated=\"003820+0000\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0031() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg\" ImageWidth=\"250\" ImageHeight=\"273\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"273000\" ImageBytes=\"598716\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2003:06:23 16:43:35\" ColorSpace=\"65535\" PixelXDimension=\"250\" PixelYDimension=\"273\" /> <IptcInfo CopyrightNotice=\"(c) EyeWire, Inc.\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0032() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg\" ImageWidth=\"1960\" ImageHeight=\"1307\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"2634240\" ImageBytes=\"684498\" ImageXRes=\"240\" ImageYRes=\"240\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"33bc7f1c156fa0d72f8f717ae5886bd4\" ImageIccProfileDescription=\"Adobe RGB (1998)\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 5D Mark II\" Orientation=\"1\" DateTime=\"2012:06:07 16:55:57\" ExposureTime=\"0.0333333\" FNumber=\"2.8\" ExposureProgram=\"2\" IsoSpeedRating=\"2500\" /> <IptcInfo DateCreated=\"20081104\" TimeCreated=\"003820\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0033() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg\" ImageWidth=\"500\" ImageHeight=\"546\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"819000\" ImageBytes=\"89615\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 16:27:55\" ColorSpace=\"1\" PixelXDimension=\"500\" PixelYDimension=\"546\" /> <IptcInfo CopyrightNotice=\"(c) EyeWire, Inc.\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0034() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg\" ImageWidth=\"3612\" ImageHeight=\"2408\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"982464\" ImageBytes=\"2373572\" ImageXRes=\"240\" ImageYRes=\"240\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"00cadb2a58fc34cf82a611474ea54292\" ImageIccProfileDescription=\"Dot Gain 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 5D Mark II\" Orientation=\"1\" DateTime=\"2012:06:07 16:54:20\" ExposureTime=\"0.0333333\" FNumber=\"2.8\" ExposureProgram=\"2\" IsoSpeedRating=\"2500\" /> <IptcInfo DateCreated=\"20081104\" TimeCreated=\"003820+0000\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0035() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg\" ImageWidth=\"500\" ImageHeight=\"546\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"273000\" ImageBytes=\"65171\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"016635b9c37ef876d224fee78ef54e43\" ImageIccProfileDescription=\"Dot Gain 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 16:28:27\" ColorSpace=\"65535\" PixelXDimension=\"500\" PixelYDimension=\"546\" /> <IptcInfo CopyrightNotice=\"(c) EyeWire, Inc.\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0036() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png\" ImageWidth=\"880\" ImageHeight=\"710\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"1874400\" ImageBytes=\"371811\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0037() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png\" ImageWidth=\"880\" ImageHeight=\"710\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"624800\" ImageBytes=\"78953\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0038() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"160000\" ImageBytes=\"55698\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0039() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"480000\" ImageBytes=\"202443\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0040() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png\" ImageWidth=\"1951\" ImageHeight=\"1863\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"3634713\" ImageBytes=\"2251650\" ImageXRes=\"304.8\" ImageYRes=\"304.8\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"016635b9c37ef876d224fee78ef54e43\" ImageIccProfileDescription=\"Dot Gain 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0041() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"480000\" ImageBytes=\"203688\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0042() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png\" ImageWidth=\"1500\" ImageHeight=\"1577\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"7096500\" ImageBytes=\"1915790\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"33bc7f1c156fa0d72f8f717ae5886bd4\" ImageIccProfileDescription=\"Adobe RGB (1998)\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0043() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png\" ImageWidth=\"880\" ImageHeight=\"710\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"3748800\" ImageBytes=\"3752864\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"2\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0044() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif\" ImageWidth=\"421\" ImageHeight=\"640\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"6736\" ImageBytes=\"1525756\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"257fbfece5c155398f6661bfb0554713\" ImageIccProfileDescription=\"Photoshop 5 Default CMYK\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop 7.0\" ColorSpace=\"65535\" PixelXDimension=\"421\" PixelYDimension=\"640\" /> <IptcInfo Caption=\"D17033\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0045() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif\" ImageWidth=\"421\" ImageHeight=\"640\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261020\" ImageBytes=\"817868\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS5.1 Windows\" ColorSpace=\"65535\" PixelXDimension=\"421\" PixelYDimension=\"640\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0046() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif\" ImageWidth=\"421\" ImageHeight=\"640\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"6736\" ImageBytes=\"1525756\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"257fbfece5c155398f6661bfb0554713\" ImageIccProfileDescription=\"Photoshop 5 Default CMYK\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop 7.0\" ColorSpace=\"65535\" PixelXDimension=\"421\" PixelYDimension=\"640\" /> <IptcInfo Caption=\"D17033\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0047() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"480000\" ImageBytes=\"186336\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Windows)\" ColorSpace=\"65535\" PixelXDimension=\"400\" PixelYDimension=\"400\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0048() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF\" ImageWidth=\"813\" ImageHeight=\"559\" ImagePixelEncoding=\"TIFF packbits\" ImageTileBytes=\"46341\" ImageBytes=\"30953\" ImageXRes=\"300\" ImageYRes=\"300\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0049() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"640000\" ImageBytes=\"808192\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0050() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif\" ImageWidth=\"504\" ImageHeight=\"360\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"181440\" ImageBytes=\"43648\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Windows)\" ColorSpace=\"65535\" PixelXDimension=\"504\" PixelYDimension=\"360\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0051() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"160000\" ImageBytes=\"328192\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0052() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif\" ImageWidth=\"504\" ImageHeight=\"360\" ImagePixelEncoding=\"TIFF CCITTFAX3\" ImageTileBytes=\"65520\" ImageBytes=\"3916\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Windows)\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0053() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"TIFF CCITTRLE\" ImageTileBytes=\"65200\" ImageBytes=\"32835\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Created by fCoder Graphics Processor\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0054() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"49152\" ImageBytes=\"3653632\" ImageXRes=\"144\" ImageYRes=\"144\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0055() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif\" ImageWidth=\"504\" ImageHeight=\"360\" ImagePixelEncoding=\"TIFF CCITTFAX4\" ImageTileBytes=\"65520\" ImageBytes=\"658\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Windows)\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0056() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"223200\" ImageBytes=\"681972\" ImageXRes=\"144\" ImageYRes=\"144\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"bc68b61a86d1c847d755b519f77d9eb6\" ImageIccProfileDescription=\"Gray Gamma 1.8\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop 7.0\" ColorSpace=\"65535\" PixelXDimension=\"1200\" PixelYDimension=\"560\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0057() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"49152\" ImageBytes=\"3653632\" ImageXRes=\"144\" ImageYRes=\"144\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0058() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif\" ImageWidth=\"3110\" ImageHeight=\"2441\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"1219120\" ImageBytes=\"30371550\" ImageXRes=\"305.067\" ImageYRes=\"305.067\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0059() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif\" ImageWidth=\"300\" ImageHeight=\"300\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"196200\" ImageBytes=\"35080\" ImageXRes=\"304.8\" ImageYRes=\"304.8\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS Windows\" ColorSpace=\"1\" PixelXDimension=\"300\" PixelYDimension=\"300\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0060() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif\" ImageWidth=\"512\" ImageHeight=\"512\" ImagePixelEncoding=\"TIFF JPEG\" ImageTileBytes=\"49152\" ImageBytes=\"69358\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0061() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"98304\" ImageBytes=\"7290880\" ImageXRes=\"144\" ImageYRes=\"144\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"2\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0062() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF\" ImageWidth=\"5616\" ImageHeight=\"3744\" ImagePixelEncoding=\"TIFF deflate\" ImageTileBytes=\"269568\" ImageBytes=\"20649530\" ImageXRes=\"240\" ImageYRes=\"240\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"33bc7f1c156fa0d72f8f717ae5886bd4\" ImageIccProfileDescription=\"Adobe RGB (1998)\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop Camera Raw 7.0 (Windows)\" Make=\"Canon\" Model=\"Canon EOS K215\" ExposureTime=\"0.04\" FNumber=\"2.8\" ExposureProgram=\"3\" IsoSpeedRating=\"100\" ExifVersion=\"0230\" DateTimeOriginal=\"2007:09:12 06:06:50\" DateTimeDigitized=\"2007:09:12 06:06:50\" ShutterSpeedValue=\"4.64386\" ApertureValue=\"2.97085\" ExposureBiasValue=\"0\" MaxApertureValue=\"3\" MeteringMode=\"5\" Flash=\"0\" FocalLength=\"200\" SubSecTimeOriginal=\"00\" SubSecTimeDigitized=\"00\" FocalPlaneXResolution=\"3957.72\" FocalPlaneYResolution=\"3961.9\" FocalPlaneResolutionUnit=\"2\" CustomRendered=\"0\" ExposureMode=\"0\" WhiteBalance=\"0\" SceneCaptureType=\"0\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0063() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif\" ImageWidth=\"2592\" ImageHeight=\"3888\" ImagePixelEncoding=\"GIF LZW\" ImageTileBytes=\"3017088\" ImageBytes=\"4281522\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Gif/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0064() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif\" ImageWidth=\"2592\" ImageHeight=\"3888\" ImagePixelEncoding=\"GIF LZW\" ImageTileBytes=\"3017088\" ImageBytes=\"6183139\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Gif/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0065() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS ASCII85\" ImageTileBytes=\"672000\" ImageBytes=\"2312794\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:43:00\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0066() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS hexadecimal\" ImageTileBytes=\"672000\" ImageBytes=\"3097809\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:50:29\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0067() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS ASCII85\" ImageTileBytes=\"672000\" ImageBytes=\"2312824\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:50:11\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0068() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS ASCII85\" ImageTileBytes=\"504000\" ImageBytes=\"1038128\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:44:34\" ColorSpace=\"1\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0069() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS ASCII85\" ImageTileBytes=\"168000\" ImageBytes=\"380835\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"016635b9c37ef876d224fee78ef54e43\" ImageIccProfileDescription=\"Dot Gain 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:46:22\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0070() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS JPEG\" ImageTileBytes=\"672000\" ImageBytes=\"1455398\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:51:18\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0071() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS binary\" ImageTileBytes=\"672000\" ImageBytes=\"2205322\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:51:03\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0072() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.tif\" ImageWidth=\"504\" ImageHeight=\"360\" ImagePixelEncoding=\"TIFF deflate\" ImageTileBytes=\"49152\" ImageBytes=\"115450\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"true\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Scene7 Image Converter 5.1.0\" /> <IptcInfo /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"Path 1\" > <Bezier IsClosed=\"true\" BezierPath=\"M359.042,125.481C359.042,125.481,432.334,125.481,432.334,125.481C428.803,97.7041,427.045,79.5891,426.864,54.8955C434.897,97.4696,445.339,119.638,457.958,140.484C445.339,160.451,435.357,184.822,426.864,226.105C427.406,199.267,428.871,183.06,432.444,153.521C432.444,153.521,359.042,153.521,359.042,153.521C359.042,153.521,359.042,125.481,359.042,125.481\" NativePath=\"S6S0K0S2P94.8047,59.125,94.8047,59.125,94.8047,59.125S2P-102.797,59.125,-102.797,59.125,-50.0273,122.496S2P-22.6055,-103.25,-46.082,9.41798,-25.5586,79.8008S2P52.2656,19.3633,-98.8672,-25.6289,52.2656,25.2774S2P34.2656,109.77,-46.082,-54.9297,24.3867,-76.5156S2P-41.1328,45.0274,-88.543,43.6524,-88.543,43.6524S2P94.8047,43.6524,94.8047,43.6524,94.8047,43.6524\" /> </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0073() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.psd\" ImageWidth=\"2048\" ImageHeight=\"1536\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"3145728\" ImageBytes=\"8723735\" ImageXRes=\"180\" ImageYRes=\"180\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"true\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon PowerShot A75\" Orientation=\"1\" DateTime=\"2012:06:07 14:33:13\" ExposureTime=\"0.003125\" FNumber=\"2.8\" IsoSpeedRating=\"50\" ExifVersion=\"0220\" DateTimeOriginal=\"2006:05:16 14:18:28\" DateTimeDigitized=\"2006:05:16 14:18:28\" CompressedBitsPerPixel=\"3\" ShutterSpeedValue=\"8.3125\" ApertureValue=\"2.96875\" ExposureBiasValue=\"0\" MaxApertureValue=\"2.96875\" MeteringMode=\"5\" Flash=\"73\" FocalLength=\"5.40625\" FlashPixVersion=\"0100\" ColorSpace=\"1\" PixelXDimension=\"2048\" PixelYDimension=\"1536\" FocalPlaneXResolution=\"9846.15\" FocalPlaneYResolution=\"9846.15\" FocalPlaneResolutionUnit=\"2\" SensingMethod=\"2\" CustomRendered=\"0\" ExposureMode=\"0\" WhiteBalance=\"0\" DigitalZoomRatio=\"1\" SceneCaptureType=\"0\" /> <IptcInfo DateCreated=\"20060516\" TimeCreated=\"141828+0000\" /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"Path 1\" > <Bezier IsClosed=\"true\" BezierPath=\"M406,288C406,288,369,831,369,831C369,831,949,879,949,879C949,879,949,282,949,282C949,282,406,288,406,288\" NativePath=\"S6S8I8S0K0S1P-64,1.52588e-05,-64,2.98023e-06,-64,2.98023e-06S1P32,-128,32,-128,32,-128S1P-96,-128,-96,-128,-96,-128S1P-96,1.52588e-05,-96,7.03335e-06,-96,7.03335e-06\" /> </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0074() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/center/solid_rectangle_center.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/center/solid_rectangle_center.tif\" ImageWidth=\"256\" ImageHeight=\"256\" ImagePixelEncoding=\"TIFF deflate\" ImageTileBytes=\"49152\" ImageBytes=\"1820\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Scene7 Image Converter 4.7.5\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0075() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/mode1/crop_alpha.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/mode1/crop_alpha.tif\" ImageWidth=\"256\" ImageHeight=\"256\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"196608\" ImageBytes=\"114272\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b90fe274cafc77e1d93769b99c15a061\" ImageIccProfileDescription=\"Generic RGB Profile\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Macintosh)\" ColorSpace=\"65535\" PixelXDimension=\"256\" PixelYDimension=\"256\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0076() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ll/Quince_LL.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ll/Quince_LL.tif\" ImageWidth=\"1000\" ImageHeight=\"600\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261000\" ImageBytes=\"1163496\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS2 Windows\" ColorSpace=\"1\" PixelXDimension=\"1000\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0077() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ur/Quince_UR.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ur/Quince_UR.tif\" ImageWidth=\"1000\" ImageHeight=\"600\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261000\" ImageBytes=\"1162400\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS2 Windows\" ColorSpace=\"1\" PixelXDimension=\"1000\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0078() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ul/Quince_UL.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ul/Quince_UL.tif\" ImageWidth=\"1000\" ImageHeight=\"600\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261000\" ImageBytes=\"1163560\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS2 Windows\" ColorSpace=\"1\" PixelXDimension=\"1000\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0079() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/lr/Quince_LR.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/lr/Quince_LR.tif\" ImageWidth=\"1000\" ImageHeight=\"600\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261000\" ImageBytes=\"1162076\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS2 Windows\" ColorSpace=\"1\" PixelXDimension=\"1000\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0080() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"BMP bitfields\" ImageTileBytes=\"2016000\" ImageBytes=\"1344072\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0081() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"BMP bitfields\" ImageTileBytes=\"2016000\" ImageBytes=\"1344072\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0082() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"673076\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0083() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"673076\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0084() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"85184\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0085() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"2016056\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0086() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"uncompressed\" ImageTileBytes=\"2016000\" ImageBytes=\"2016056\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0087() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"BMP rle 8\" ImageTileBytes=\"2016000\" ImageBytes=\"542608\" ImageXRes=\"143.967\" ImageYRes=\"143.967\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Bmp/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0088() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict\" ImageWidth=\"2667\" ImageHeight=\"1242\" ImagePixelEncoding=\"PICT RLE\" ImageTileBytes=\"2480310\" ImageBytes=\"2820382\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Pict/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0089() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd\" ImageWidth=\"1500\" ImageHeight=\"1500\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"3000000\" ImageBytes=\"12589961\" ImageXRes=\"300\" ImageYRes=\"300\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"00f196d48842240d75da610d6803edf7\" ImageIccProfileDescription=\"SWOP (Coated), 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 14:21:36\" ColorSpace=\"65535\" PixelXDimension=\"1500\" PixelYDimension=\"1500\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0090() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd\" ImageWidth=\"700\" ImageHeight=\"700\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"1960000\" ImageBytes=\"1260379\" ImageXRes=\"500\" ImageYRes=\"500\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 15:16:40\" ColorSpace=\"65535\" PixelXDimension=\"700\" PixelYDimension=\"700\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0091() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd\" ImageWidth=\"5000\" ImageHeight=\"5000\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"1000000\" ImageBytes=\"77482\" ImageXRes=\"500\" ImageYRes=\"500\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 15:29:14\" ColorSpace=\"65535\" PixelXDimension=\"5000\" PixelYDimension=\"5000\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0092() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd\" ImageWidth=\"700\" ImageHeight=\"700\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"490000\" ImageBytes=\"614743\" ImageXRes=\"300\" ImageYRes=\"300\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 15:19:20\" ColorSpace=\"65535\" PixelXDimension=\"700\" PixelYDimension=\"700\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0093() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/RGB_layers.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/RGB_layers.psd\" ImageWidth=\"432\" ImageHeight=\"398\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"515808\" ImageBytes=\"1887393\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"true\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2005:06:08 09:49:51\" ColorSpace=\"1\" PixelXDimension=\"432\" PixelYDimension=\"398\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0094() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd\" ImageWidth=\"700\" ImageHeight=\"525\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"1102500\" ImageBytes=\"1118562\" ImageXRes=\"616\" ImageYRes=\"616\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 10D\" Orientation=\"1\" DateTime=\"2004:01:28 15:33:18\" ExposureTime=\"0.04\" FNumber=\"22\" IsoSpeedRating=\"200\" ExifVersion=\"0220\" DateTimeOriginal=\"2003:12:05 12:26:46\" DateTimeDigitized=\"2003:12:05 12:26:46\" CompressedBitsPerPixel=\"3\" ShutterSpeedValue=\"4.64386\" ApertureValue=\"8.91887\" ExposureBiasValue=\"1\" MaxApertureValue=\"4\" MeteringMode=\"5\" Flash=\"0\" FocalLength=\"40\" FlashPixVersion=\"0100\" ColorSpace=\"1\" PixelXDimension=\"700\" PixelYDimension=\"525\" FocalPlaneXResolution=\"3443.95\" FocalPlaneYResolution=\"3442.02\" FocalPlaneResolutionUnit=\"2\" SensingMethod=\"2\" CustomRendered=\"0\" ExposureMode=\"2\" WhiteBalance=\"0\" SceneCaptureType=\"0\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0095() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd\" ImageWidth=\"600\" ImageHeight=\"600\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"360000\" ImageBytes=\"729800\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2006:10:12 12:38:51\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"600\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0096() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd\" ImageWidth=\"700\" ImageHeight=\"525\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"1102500\" ImageBytes=\"1118562\" ImageXRes=\"616\" ImageYRes=\"616\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 10D\" Orientation=\"1\" DateTime=\"2004:01:28 15:33:18\" ExposureTime=\"0.04\" FNumber=\"22\" IsoSpeedRating=\"200\" ExifVersion=\"0220\" DateTimeOriginal=\"2003:12:05 12:26:46\" DateTimeDigitized=\"2003:12:05 12:26:46\" CompressedBitsPerPixel=\"3\" ShutterSpeedValue=\"4.64386\" ApertureValue=\"8.91887\" ExposureBiasValue=\"1\" MaxApertureValue=\"4\" MeteringMode=\"5\" Flash=\"0\" FocalLength=\"40\" FlashPixVersion=\"0100\" ColorSpace=\"1\" PixelXDimension=\"700\" PixelYDimension=\"525\" FocalPlaneXResolution=\"3443.95\" FocalPlaneYResolution=\"3442.02\" FocalPlaneResolutionUnit=\"2\" SensingMethod=\"2\" CustomRendered=\"0\" ExposureMode=\"2\" WhiteBalance=\"0\" SceneCaptureType=\"0\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0097() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd\" ImageWidth=\"100\" ImageHeight=\"100\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"30000\" ImageBytes=\"68978\" ImageXRes=\"150\" ImageYRes=\"150\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 14:50:49\" ColorSpace=\"65535\" PixelXDimension=\"100\" PixelYDimension=\"100\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0098() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd\" ImageWidth=\"100\" ImageHeight=\"100\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"30000\" ImageBytes=\"68978\" ImageXRes=\"150\" ImageYRes=\"150\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 14:50:49\" ColorSpace=\"65535\" PixelXDimension=\"100\" PixelYDimension=\"100\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0099() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd\" ImageWidth=\"400\" ImageHeight=\"424\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"508800\" ImageBytes=\"2655146\" ImageXRes=\"100\" ImageYRes=\"100\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"true\" ImageHasLayerMasks=\"true\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"50b9125494306a6fc1b7c4f2a1a8d49d\" ImageIccProfileDescription=\"Adobe RGB (1998)\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2006:09:26 11:40:01\" ColorSpace=\"65535\" PixelXDimension=\"400\" PixelYDimension=\"424\" /> <IptcInfo /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"type\" > <Bezier IsClosed=\"false\" BezierPath=\"M-0.666666,187C72.3333,146.667,159.178,145.415,206.667,151.667C261.91,158.939,335.667,185.667,400,243.333\" NativePath=\"S6S8I8S3K3S4P51.0977,-48.3945,-109.227,-24.1523,75.0898,-114.316S4P-32.2227,-51.7656,68.2656,-109.488,-96.6992,-9.42187S4P-44.375,25.7579,8.70228e-06,-20.9375,-120.887,48.625\" /> </PhotoshopPath> <PhotoshopPath PhotoshopPathName=\"petite vase path\" > <Bezier IsClosed=\"true\" BezierPath=\"M65.2101,253.339C69.2715,249.612,95.4622,239.898,127.395,233.177C159.328,226.457,170.756,224.777,193.613,224.441C216.471,224.105,248.739,228.137,274.622,233.513C300.504,238.89,324.37,246.282,332.101,251.323C339.832,256.363,335.224,259.507,332.537,262.493C329.851,265.478,311.642,283.985,305.373,291.746C299.104,299.507,261.791,339.806,251.343,369.657C245.373,389.06,241.194,387.567,229.851,390.552C218.507,393.537,191.045,393.836,176.119,389.657C161.194,385.478,161.791,382.493,155.522,370.254C149.254,358.015,119.701,311.448,102.388,296.522C83.8806,278.313,83.2836,276.821,76.7164,270.851C70.1492,264.881,65.0746,261,64.4776,259.507C63.8806,258.015,63.8254,254.609,65.2101,253.339\" NativePath=\"S6S8I8S0K0S1P-38.8476,-70.043,-67.9805,-10.4414,85.4414,-74.5117S1P24.5234,-39.9453,-119.613,-54.6953,-7.74609,-69.4453S1P72.7109,-73.1328,-22.375,-125.07,-117.461,78.9922S1P49.4766,-65.7578,-61.957,-2.7578,82.6055,60.2422S1P-103.262,-77.1289,-116.602,-66.0664,126.063,-55.0039S1P-116.922,-80.9648,-45.0898,124.426,26.7461,73.8203S1P115.391,118.441,112.332,38.0625,109.277,-42.3242S2P-116.156,42.461,-35.918,48.3711,9.93361,-24.5859S1P93.2266,0.714859,26.7461,-49.8906,-39.7383,-100.504S1P68.7735,-54.3594,-72.5976,67.6914,42.0274,-66.2539S1P-116.156,-15.6484,-119.215,-115.352,-122.27,40.9453S2P-100.109,11.2422,-120.742,8.28907,-81.0039,9.80079S1P77.1797,35.1055,25.2149,-119.68,-26.75,-18.4609S1P-90.1758,-106.27,68.0117,-80.9648,-29.8047,-55.6562\" /> </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0100() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd\" ImageWidth=\"560\" ImageHeight=\"647\" ImagePixelEncoding=\"Photoshop uncompressed\" ImageTileBytes=\"2173920\" ImageBytes=\"2511360\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"2\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 10:14:48\" ColorSpace=\"1\" PixelXDimension=\"560\" PixelYDimension=\"647\" /> <IptcInfo /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"Circles a\" > <Bezier IsClosed=\"true\" BezierPath=\"M68.836,50.7619C68.836,58.4134,62.6334,64.6161,54.982,64.6161C47.3306,64.6161,41.128,58.4134,41.128,50.7619C41.128,43.1107,47.3306,36.9079,54.982,36.9079C62.6334,36.9079,68.836,43.1107,68.836,50.7619M221.702,78.3279C221.702,85.9792,215.499,92.1819,207.848,92.1819C200.196,92.1819,193.994,85.9792,193.994,78.3279C193.994,70.6765,200.196,64.474,207.848,64.474C215.499,64.474,221.702,70.6765,221.702,78.3279M146.792,81.973C146.792,92.2904,138.429,100.654,128.111,100.654C117.794,100.654,109.43,92.2904,109.43,81.973C109.43,71.6556,117.794,63.2918,128.111,63.2918C138.429,63.2918,146.792,71.6556,146.792,81.973M126.606,122.069C126.606,130.499,119.772,137.333,111.342,137.333C102.912,137.333,96.0782,130.499,96.0782,122.069C96.0782,113.639,102.912,106.805,111.342,106.805C119.772,106.805,126.606,113.639,126.606,122.069M196.229,122.069C196.229,130.499,189.396,137.333,180.965,137.333C172.536,137.333,165.702,130.499,165.702,122.069C165.702,113.639,172.536,106.805,180.965,106.805C189.396,106.805,196.229,113.639,196.229,122.069M104.874,165.721C104.874,175.032,97.3262,182.58,88.0157,182.58C78.7051,182.58,71.1573,175.032,71.1573,165.721C71.1573,156.411,78.7051,148.863,88.0157,148.863C97.3262,148.863,104.874,156.411,104.874,165.721M226.25,162.988C226.25,172.298,218.703,179.846,209.392,179.846C200.082,179.846,192.534,172.298,192.534,162.988C192.534,153.677,200.082,146.129,209.392,146.129C218.703,146.129,226.25,153.677,226.25,162.988\" NativePath=\"S6S8I8S0K0S1P119.773,14.7695,119.773,21.7852,119.773,28.8125S1P-94.1055,-110.902,34.4609,-110.902,-92.9727,-110.902S1P-50.8516,28.8125,-50.8516,21.7852,-50.8516,14.7695S1P-92.9727,-101.516,34.4609,-101.516,-94.1055,-101.516S0K0S1P89.4297,-9.02342,89.4297,-1.99609,89.4297,5.01954S1P-124.453,121.305,4.11328,121.305,-123.316,121.305S1P-81.1992,5.01955,-81.1992,-1.99609,-81.1992,-9.02343S1P-123.316,-125.297,4.11328,-125.297,-124.453,-125.297S0K0S1P26.9141,90.1445,26.9141,111.215,26.9141,-123.715S1P72.1211,-44.539,-111.309,-44.5391,-38.7422,-44.5391S1P6.45703,-123.715,6.45703,111.215,6.45703,90.1445S1P-38.7422,10.957,-111.309,10.957,72.1211,10.957S0K0S1P-31.4844,-9.21873,-31.4844,76.6445,-31.4844,-93.4453S1P-63.2578,86.7774,-25.832,86.7773,11.6641,86.7773S1P-20.1094,-93.4453,-20.1094,76.6445,-20.1094,-9.21875S1P11.6641,66.5508,-25.832,66.5508,-63.2578,66.5508S0K0S1P-75.5469,-9.21873,-75.5469,76.6445,-75.5469,-93.4453S1P-107.309,86.7774,-69.8828,86.7773,-32.3984,86.7773S1P-64.1719,-93.4453,-64.1719,76.6445,-64.1719,-9.21875S1P-32.3984,66.5508,-69.8828,66.5508,-107.309,66.5508S0K0S1P-14.7383,-28.8047,-14.7383,-109.723,-14.7383,65.3672S1P125.941,61.8985,60.3477,61.8984,-5.25781,61.8984S1P-120.566,65.3672,-120.566,-109.723,-120.566,-28.8047S1P-5.25781,-25.3476,60.3477,-25.3477,125.941,-25.3477S0K0S1P109.77,-49.7265,109.77,125.355,109.77,44.4453S1P-5.53906,40.9766,-71.1445,40.9766,119.258,40.9766S1P3.94141,44.4453,3.94141,125.355,3.94141,-49.7266S1P119.258,-46.2695,-71.1445,-46.2695,-5.53906,-46.2695S3K3S4P-44.4531,-95.1328,105.602,-95.1328,-0.343739,-95.1328\" /> </PhotoshopPath> <PhotoshopPath PhotoshopPathName=\"Circles b\" > <Bezier IsClosed=\"true\" BezierPath=\"M459.995,245.997C459.995,252.99,454.326,258.658,447.334,258.658C440.342,258.658,434.673,252.99,434.673,245.997C434.673,239.005,440.342,233.337,447.334,233.337C454.326,233.337,459.995,239.005,459.995,245.997M410.984,282.346C410.984,289.339,405.315,295.007,398.323,295.007C391.331,295.007,385.662,289.339,385.662,282.346C385.662,275.354,391.331,269.685,398.323,269.685C405.315,269.685,410.984,275.354,410.984,282.346M560.872,263.356C560.872,269.784,555.66,274.995,549.232,274.995C542.804,274.995,537.593,269.784,537.593,263.356C537.593,256.927,542.804,251.716,549.232,251.716C555.66,251.716,560.872,256.927,560.872,263.356M489.81,287.451C489.81,297.715,481.489,306.034,471.227,306.034C460.963,306.034,452.644,297.715,452.644,287.451C452.644,277.189,460.963,268.869,471.227,268.869C481.489,268.869,489.81,277.189,489.81,287.451M437.531,324.412C437.531,332.985,430.583,339.933,422.011,339.933C413.439,339.933,406.491,332.985,406.491,324.412C406.491,315.841,413.439,308.893,422.011,308.893C430.583,308.893,437.531,315.841,437.531,324.412M345.229,365.459C345.229,375.045,337.458,382.817,327.872,382.817C318.285,382.817,310.514,375.045,310.514,365.459C310.514,355.872,318.285,348.101,327.872,348.101C337.458,348.101,345.229,355.872,345.229,365.459M399.549,372.811C399.549,382.398,391.777,390.169,382.19,390.169C372.604,390.169,364.833,382.398,364.833,372.811C364.833,363.225,372.604,355.453,382.19,355.453C391.777,355.453,399.549,363.225,399.549,372.811M509.412,324.617C509.412,333.075,502.555,339.933,494.097,339.933C485.638,339.933,478.78,333.075,478.78,324.617C478.78,316.158,485.638,309.301,494.097,309.301C502.555,309.301,509.412,316.158,509.412,324.617M532.692,367.705C532.692,376.953,525.195,384.45,515.947,384.45C506.699,384.45,499.202,376.953,499.202,367.705C499.202,358.457,506.699,350.96,515.947,350.96C525.195,350.96,532.692,358.457,532.692,367.705M431.407,442.65C431.407,454.492,421.808,464.092,409.965,464.092C398.122,464.092,388.522,454.492,388.522,442.65C388.522,430.807,398.122,421.207,409.965,421.207C421.808,421.207,431.407,430.807,431.407,442.65\" NativePath=\"S6S8I8S0K0S1P72.5781,-110.66,72.5781,85.5938,72.5781,25.8985S1P-78.8594,88.0625,126.855,88.0625,76.5664,88.0625S1P-74.8555,25.8985,-74.8555,85.5938,-74.8555,-110.66S1P76.5664,83.1758,126.855,83.1758,-78.8594,83.1758S0K0S1P-31.0859,-12.8359,-31.0859,-72.582,-31.0859,123.727S1P73.4883,-70.1015,23.2031,-70.1016,-27.0859,-70.1016S1P77.4922,123.727,77.4922,-72.582,77.4922,-12.8359S1P-27.0859,-75,23.2031,-75,73.4883,-75S0K0S1P102.055,-87.3164,102.055,51.8633,102.055,-65.0117S1P4.11329,-49.1797,19.8906,-49.1797,35.5508,-49.1797S1P-62.2851,-65.0117,-62.2852,51.8633,-62.2852,-87.3164S1P35.5508,-103.148,19.8906,-103.148,4.11329,-103.148S0K0S1P-22.2851,-82.9648,-22.2851,-67.4336,-22.2851,-51.8515S1P28,22.8789,106.973,22.8789,-70.1758,22.8789S1P-19.7695,-51.8515,-19.7695,-67.4336,-19.7695,-82.9648S1P-70.1758,98.3047,106.973,98.3047,28,98.3047S0K0S1P3.66016,-7.78905,3.66016,92.4141,3.66016,-63.2812S1P-41.4805,-127.48,-20.6836,-127.48,0.230477,-127.48S1P-44.9062,-63.2812,-44.9062,92.4141,-44.9062,-7.78905S1P0.230476,56.4102,-20.6836,56.4102,-41.4805,56.4102S0K0S1P-46.2891,-48.9375,-46.2891,-101.859,-46.2891,101.117S1P68.2344,120.309,-29.6016,120.309,-127.543,120.309S1P-13.0312,101.117,-13.0312,-101.859,-13.0312,-48.9375S1P-127.543,-68.1289,-29.6016,-68.1289,68.2344,-68.1289S0K0S1P-89.3672,-72.1836,-89.3672,-125.199,-89.3672,77.8789S1P25.1445,97.0703,-72.7969,97.0703,85.3672,97.0703S1P-56.1094,77.8789,-56.1094,-125.199,-56.1094,-72.1836S1P85.3672,-91.3672,-72.7969,-91.3672,25.1445,-91.3672S0K0S1P-32.2226,24.3594,-32.2226,113.188,-32.2226,-54.082S1P-66.7461,-127.48,-32.5742,-127.48,1.48048,-127.48S1P-33.0312,-54.082,-33.0312,113.188,-33.0312,24.3594S1P1.48048,97.7578,-32.5742,97.7578,-66.7461,97.7578S0K0S1P-123.773,-43.0937,-123.773,125.652,-123.773,38.4141S1P22.8633,29.8008,-35.4297,29.8008,-93.7109,29.8008S1P52.918,38.4141,52.918,125.652,52.918,-43.0937S1P-93.7109,-34.4922,-35.4297,-34.4922,22.8633,-34.4922S0K0S1P54.9766,117.348,54.9766,36.9219,54.9766,-43.4961S1P-44.4531,-95.1328,105.602,-95.1328,-0.343739,-95.1328S1P-99.7695,-43.4961,-99.7695,36.9219,-99.7695,117.348S1P-0.34374,-87.0156,105.602,-87.0156,-44.4531,-87.0156\" /> </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0101() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg\" ImageWidth=\"2500\" ImageHeight=\"1666\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"4160000\" ImageBytes=\"2695651\" ImageXRes=\"240\" ImageYRes=\"240\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"79d7e984ea3ac74eed7cc92bf6b22a0d\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 5D Mark II\" Orientation=\"1\" DateTime=\"2012:06:07 16:56:26\" ExposureTime=\"0.0333333\" FNumber=\"2.8\" ExposureProgram=\"2\" IsoSpeedRating=\"2500\" /> <IptcInfo DateCreated=\"20081104\" TimeCreated=\"003820+0000\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0102() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg\" ImageWidth=\"250\" ImageHeight=\"273\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"273000\" ImageBytes=\"598716\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2003:06:23 16:43:35\" ColorSpace=\"65535\" PixelXDimension=\"250\" PixelYDimension=\"273\" /> <IptcInfo CopyrightNotice=\"(c) EyeWire, Inc.\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0103() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg\" ImageWidth=\"1960\" ImageHeight=\"1307\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"2634240\" ImageBytes=\"684498\" ImageXRes=\"240\" ImageYRes=\"240\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"33bc7f1c156fa0d72f8f717ae5886bd4\" ImageIccProfileDescription=\"Adobe RGB (1998)\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 5D Mark II\" Orientation=\"1\" DateTime=\"2012:06:07 16:55:57\" ExposureTime=\"0.0333333\" FNumber=\"2.8\" ExposureProgram=\"2\" IsoSpeedRating=\"2500\" /> <IptcInfo DateCreated=\"20081104\" TimeCreated=\"003820\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0104() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg\" ImageWidth=\"500\" ImageHeight=\"546\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"819000\" ImageBytes=\"89615\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 16:27:55\" ColorSpace=\"1\" PixelXDimension=\"500\" PixelYDimension=\"546\" /> <IptcInfo CopyrightNotice=\"(c) EyeWire, Inc.\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0105() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg\" ImageWidth=\"3612\" ImageHeight=\"2408\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"982464\" ImageBytes=\"2373572\" ImageXRes=\"240\" ImageYRes=\"240\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"00cadb2a58fc34cf82a611474ea54292\" ImageIccProfileDescription=\"Dot Gain 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon EOS 5D Mark II\" Orientation=\"1\" DateTime=\"2012:06:07 16:54:20\" ExposureTime=\"0.0333333\" FNumber=\"2.8\" ExposureProgram=\"2\" IsoSpeedRating=\"2500\" /> <IptcInfo DateCreated=\"20081104\" TimeCreated=\"003820+0000\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0106() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg\" ImageWidth=\"500\" ImageHeight=\"546\" ImagePixelEncoding=\"JPEG Standard\" ImageTileBytes=\"273000\" ImageBytes=\"65171\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"016635b9c37ef876d224fee78ef54e43\" ImageIccProfileDescription=\"Dot Gain 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Jpeg/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 16:28:27\" ColorSpace=\"65535\" PixelXDimension=\"500\" PixelYDimension=\"546\" /> <IptcInfo CopyrightNotice=\"(c) EyeWire, Inc.\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0107() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png\" ImageWidth=\"880\" ImageHeight=\"710\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"1874400\" ImageBytes=\"371811\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0108() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png\" ImageWidth=\"880\" ImageHeight=\"710\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"624800\" ImageBytes=\"78953\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0109() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"160000\" ImageBytes=\"55698\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0110() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"480000\" ImageBytes=\"202443\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0111() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png\" ImageWidth=\"1951\" ImageHeight=\"1863\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"3634713\" ImageBytes=\"2251650\" ImageXRes=\"304.8\" ImageYRes=\"304.8\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"016635b9c37ef876d224fee78ef54e43\" ImageIccProfileDescription=\"Dot Gain 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0112() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"480000\" ImageBytes=\"203688\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0113() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png\" ImageWidth=\"1500\" ImageHeight=\"1577\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"7096500\" ImageBytes=\"1915790\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"33bc7f1c156fa0d72f8f717ae5886bd4\" ImageIccProfileDescription=\"Adobe RGB (1998)\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0114() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png\" ImageWidth=\"880\" ImageHeight=\"710\" ImagePixelEncoding=\"PNG deflate\" ImageTileBytes=\"3748800\" ImageBytes=\"3752864\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"2\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Png/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0115() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif\" ImageWidth=\"421\" ImageHeight=\"640\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"6736\" ImageBytes=\"1525756\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"257fbfece5c155398f6661bfb0554713\" ImageIccProfileDescription=\"Photoshop 5 Default CMYK\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop 7.0\" ColorSpace=\"65535\" PixelXDimension=\"421\" PixelYDimension=\"640\" /> <IptcInfo Caption=\"D17033\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0116() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif\" ImageWidth=\"421\" ImageHeight=\"640\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"261020\" ImageBytes=\"817868\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS5.1 Windows\" ColorSpace=\"65535\" PixelXDimension=\"421\" PixelYDimension=\"640\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0117() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif\" ImageWidth=\"421\" ImageHeight=\"640\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"6736\" ImageBytes=\"1525756\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"257fbfece5c155398f6661bfb0554713\" ImageIccProfileDescription=\"Photoshop 5 Default CMYK\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop 7.0\" ColorSpace=\"65535\" PixelXDimension=\"421\" PixelYDimension=\"640\" /> <IptcInfo Caption=\"D17033\" /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0118() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"480000\" ImageBytes=\"186336\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Windows)\" ColorSpace=\"65535\" PixelXDimension=\"400\" PixelYDimension=\"400\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0119() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF\" ImageWidth=\"813\" ImageHeight=\"559\" ImagePixelEncoding=\"TIFF packbits\" ImageTileBytes=\"46341\" ImageBytes=\"30953\" ImageXRes=\"300\" ImageYRes=\"300\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0120() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"640000\" ImageBytes=\"808192\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0121() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif\" ImageWidth=\"504\" ImageHeight=\"360\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"181440\" ImageBytes=\"43648\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Windows)\" ColorSpace=\"65535\" PixelXDimension=\"504\" PixelYDimension=\"360\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0122() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"160000\" ImageBytes=\"328192\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0123() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif\" ImageWidth=\"504\" ImageHeight=\"360\" ImagePixelEncoding=\"TIFF CCITTFAX3\" ImageTileBytes=\"65520\" ImageBytes=\"3916\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Windows)\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0124() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif\" ImageWidth=\"400\" ImageHeight=\"400\" ImagePixelEncoding=\"TIFF CCITTRLE\" ImageTileBytes=\"65200\" ImageBytes=\"32835\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Created by fCoder Graphics Processor\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0125() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"49152\" ImageBytes=\"3653632\" ImageXRes=\"144\" ImageYRes=\"144\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0126() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif\" ImageWidth=\"504\" ImageHeight=\"360\" ImagePixelEncoding=\"TIFF CCITTFAX4\" ImageTileBytes=\"65520\" ImageBytes=\"658\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS6 (Windows)\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0127() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"223200\" ImageBytes=\"681972\" ImageXRes=\"144\" ImageYRes=\"144\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"bc68b61a86d1c847d755b519f77d9eb6\" ImageIccProfileDescription=\"Gray Gamma 1.8\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop 7.0\" ColorSpace=\"65535\" PixelXDimension=\"1200\" PixelYDimension=\"560\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0128() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"49152\" ImageBytes=\"3653632\" ImageXRes=\"144\" ImageYRes=\"144\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0129() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif\" ImageWidth=\"3110\" ImageHeight=\"2441\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"1219120\" ImageBytes=\"30371550\" ImageXRes=\"305.067\" ImageYRes=\"305.067\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0130() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif\" ImageWidth=\"300\" ImageHeight=\"300\" ImagePixelEncoding=\"TIFF LZW\" ImageTileBytes=\"196200\" ImageBytes=\"35080\" ImageXRes=\"304.8\" ImageYRes=\"304.8\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop CS Windows\" ColorSpace=\"1\" PixelXDimension=\"300\" PixelYDimension=\"300\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0131() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif\" ImageWidth=\"512\" ImageHeight=\"512\" ImagePixelEncoding=\"TIFF JPEG\" ImageTileBytes=\"49152\" ImageBytes=\"69358\" ImageXRes=\"72.009\" ImageYRes=\"72.009\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0132() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif\" ImageWidth=\"1200\" ImageHeight=\"560\" ImagePixelEncoding=\"TIFF uncompressed\" ImageTileBytes=\"98304\" ImageBytes=\"7290880\" ImageXRes=\"144\" ImageYRes=\"144\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"2\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0133() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF\" ImageWidth=\"5616\" ImageHeight=\"3744\" ImagePixelEncoding=\"TIFF deflate\" ImageTileBytes=\"269568\" ImageBytes=\"20649530\" ImageXRes=\"240\" ImageYRes=\"240\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"33bc7f1c156fa0d72f8f717ae5886bd4\" ImageIccProfileDescription=\"Adobe RGB (1998)\" ImageHasClipPath=\"false\"> <ImageFormat> <Tiff/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Software=\"Adobe Photoshop Camera Raw 7.0 (Windows)\" Make=\"Canon\" Model=\"Canon EOS K215\" ExposureTime=\"0.04\" FNumber=\"2.8\" ExposureProgram=\"3\" IsoSpeedRating=\"100\" ExifVersion=\"0230\" DateTimeOriginal=\"2007:09:12 06:06:50\" DateTimeDigitized=\"2007:09:12 06:06:50\" ShutterSpeedValue=\"4.64386\" ApertureValue=\"2.97085\" ExposureBiasValue=\"0\" MaxApertureValue=\"3\" MeteringMode=\"5\" Flash=\"0\" FocalLength=\"200\" SubSecTimeOriginal=\"00\" SubSecTimeDigitized=\"00\" FocalPlaneXResolution=\"3957.72\" FocalPlaneYResolution=\"3961.9\" FocalPlaneResolutionUnit=\"2\" CustomRendered=\"0\" ExposureMode=\"0\" WhiteBalance=\"0\" SceneCaptureType=\"0\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0134() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif\" ImageWidth=\"2592\" ImageHeight=\"3888\" ImagePixelEncoding=\"GIF LZW\" ImageTileBytes=\"3017088\" ImageBytes=\"4281522\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Gif/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0135() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif\" ImageWidth=\"2592\" ImageHeight=\"3888\" ImagePixelEncoding=\"GIF LZW\" ImageTileBytes=\"3017088\" ImageBytes=\"6183139\" ImageXRes=\"0\" ImageYRes=\"0\" ImageHasAlpha=\"true\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"false\" ImageIccProfileSignature=\"00000000000000000000000000000000\" ImageIccProfileDescription=\"\" ImageHasClipPath=\"false\"> <ImageFormat> <Gif/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <UnknownColorSpace/> </ImageIccProfileColorSpace> <ExifInfo /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0136() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS ASCII85\" ImageTileBytes=\"672000\" ImageBytes=\"2312794\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:43:00\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0137() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS hexadecimal\" ImageTileBytes=\"672000\" ImageBytes=\"3097809\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:50:29\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0138() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS ASCII85\" ImageTileBytes=\"672000\" ImageBytes=\"2312824\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:50:11\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0139() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS ASCII85\" ImageTileBytes=\"504000\" ImageBytes=\"1038128\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"eeef5cb5b45f412a0135c5f6fa10ab2a\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:44:34\" ColorSpace=\"1\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0140() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS ASCII85\" ImageTileBytes=\"168000\" ImageBytes=\"380835\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"016635b9c37ef876d224fee78ef54e43\" ImageIccProfileDescription=\"Dot Gain 20%\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Grayscale/> </ImageColorSpace> <ImageIccProfileColorSpace> <Grayscale/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:46:22\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0141() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS JPEG\" ImageTileBytes=\"672000\" ImageBytes=\"1455398\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:51:18\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testInfo_0142() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-beziers" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps\" ImageWidth=\"600\" ImageHeight=\"280\" ImagePixelEncoding=\"EPS binary\" ImageTileBytes=\"672000\" ImageBytes=\"2205322\" ImageXRes=\"72\" ImageYRes=\"72\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"b1f58a8ecbd0a84de029cab7b55a2e75\" ImageIccProfileDescription=\"U.S. Web Coated (SWOP) v2\" ImageHasClipPath=\"false\"> <ImageFormat> <Eps/> </ImageFormat> <ImageColorSpace> <Cmyk/> </ImageColorSpace> <ImageIccProfileColorSpace> <Cmyk/> </ImageIccProfileColorSpace> <ExifInfo Orientation=\"1\" DateTime=\"2012:06:06 13:51:03\" ColorSpace=\"65535\" PixelXDimension=\"600\" PixelYDimension=\"280\" /> <IptcInfo /> <PhotoshopPathList> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Ignore
	public void testInfo_0143() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.psd";
		String infocontent = getInfo(CMD_IMAGEINFO + " " + "-quadfrompath 'Path 1'" + " " + srcFile);
		String infoExpect  = "<ImageInfoList><ImageInfo ImageName=\"/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.psd\" ImageWidth=\"2048\" ImageHeight=\"1536\" ImagePixelEncoding=\"Photoshop RLE\" ImageTileBytes=\"3145728\" ImageBytes=\"8723735\" ImageXRes=\"180\" ImageYRes=\"180\" ImageHasAlpha=\"false\" ImageHasMultipleImages=\"false\" ImageExtraChannels=\"0\" ImageBytesPerComponent=\"1\" ImageHasLayers=\"false\" ImageHasLayerMasks=\"false\" ImageHasIccProfile=\"true\" ImageIccProfileSignature=\"1d3fda2edb4a89ab60a23c5f7c7d81dd\" ImageIccProfileDescription=\"sRGB IEC61966-2.1\" ImageHasClipPath=\"true\"> <ImageFormat> <Photoshop/> </ImageFormat> <ImageColorSpace> <Rgb/> </ImageColorSpace> <ImageIccProfileColorSpace> <Rgb/> </ImageIccProfileColorSpace> <ExifInfo Make=\"Canon\" Model=\"Canon PowerShot A75\" Orientation=\"1\" DateTime=\"2012:06:07 14:33:13\" ExposureTime=\"0.003125\" FNumber=\"2.8\" IsoSpeedRating=\"50\" ExifVersion=\"0220\" DateTimeOriginal=\"2006:05:16 14:18:28\" DateTimeDigitized=\"2006:05:16 14:18:28\" CompressedBitsPerPixel=\"3\" ShutterSpeedValue=\"8.3125\" ApertureValue=\"2.96875\" ExposureBiasValue=\"0\" MaxApertureValue=\"2.96875\" MeteringMode=\"5\" Flash=\"73\" FocalLength=\"5.40625\" FlashPixVersion=\"0100\" ColorSpace=\"1\" PixelXDimension=\"2048\" PixelYDimension=\"1536\" FocalPlaneXResolution=\"9846.15\" FocalPlaneYResolution=\"9846.15\" FocalPlaneResolutionUnit=\"2\" SensingMethod=\"2\" CustomRendered=\"0\" ExposureMode=\"0\" WhiteBalance=\"0\" DigitalZoomRatio=\"1\" SceneCaptureType=\"0\" /> <IptcInfo DateCreated=\"20060516\" TimeCreated=\"141828+0000\" /> <PhotoshopPathList> <PhotoshopPath PhotoshopPathName=\"Path 1\" > </PhotoshopPath> </PhotoshopPathList> <WarningList> </WarningList></ImageInfo></ImageInfoList>";
		assertXMLEqual("Compare image info result", infoExpect, infocontent);
	}

	@Test
	public void testXMP_0001() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" tiff:ImageWidth=\"504\" tiff:ImageLength=\"360\" tiff:Compression=\"8\" tiff:PhotometricInterpretation=\"2\" tiff:SamplesPerPixel=\"3\" tiff:XResolution=\"1207959552/16777216\" tiff:YResolution=\"1207959552/16777216\" tiff:ResolutionUnit=\"2\" xmp:CreatorTool=\"Scene7 Image Converter 5.1.0\" xmp:ModifyDate=\"2012-06-07T05:18:36\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0002() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/ApplyClippath/clippingpath.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:aux=\"http://ns.adobe.com/exif/1.0/aux/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" aux:LensInfo=\"173/32 519/32 0/0 0/0\" aux:Lens=\"5.4-16.2 mm\" aux:ApproximateFocusDistance=\"88/100\" aux:FlashCompensation=\"0/1\" aux:Firmware=\"1.01\" xmp:ModifyDate=\"2012-06-07T14:33:13+08:00\" xmp:CreateDate=\"2006-05-16T14:18:28\" xmp:MetadataDate=\"2012-06-07T14:33:13+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Macintosh)\" photoshop:DateCreated=\"2006-05-16T14:18:28\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"sRGB IEC61966-2.1\" xmpMM:DocumentID=\"BE2810FB4D29704D9A2C0854F013F836\" xmpMM:InstanceID=\"xmp.iid:BFD85EDF22206811822A982ED0E5672C\" xmpMM:OriginalDocumentID=\"BE2810FB4D29704D9A2C0854F013F836\" dc:format=\"application/vnd.adobe.photoshop\" tiff:ImageWidth=\"2048\" tiff:ImageLength=\"1536\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"3\" tiff:YCbCrPositioning=\"1\" tiff:XResolution=\"1800000/10000\" tiff:YResolution=\"1800000/10000\" tiff:ResolutionUnit=\"2\" tiff:Make=\"Canon\" tiff:Model=\"Canon PowerShot A75\" exif:ColorSpace=\"1\" exif:CompressedBitsPerPixel=\"3/1\" exif:PixelXDimension=\"2048\" exif:PixelYDimension=\"1536\" exif:ExposureTime=\"1/320\" exif:FNumber=\"28/10\" exif:ShutterSpeedValue=\"266/32\" exif:ApertureValue=\"95/32\" exif:ExposureBiasValue=\"0/3\" exif:MaxApertureValue=\"95/32\" exif:MeteringMode=\"5\" exif:FocalLength=\"173/32\" exif:FocalPlaneXResolution=\"2048000/208\" exif:FocalPlaneYResolution=\"1536000/156\" exif:FocalPlaneResolutionUnit=\"2\" exif:SensingMethod=\"2\" exif:CustomRendered=\"0\" exif:ExposureMode=\"0\" exif:WhiteBalance=\"0\" exif:DigitalZoomRatio=\"2048/2048\" exif:SceneCaptureType=\"0\" exif:DateTimeOriginal=\"2006-05-16T14:18:28\" exif:ExifVersion=\"0220\" exif:FlashpixVersion=\"0100\" exif:FileSource=\"3\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:BED85EDF22206811822A982ED0E5672C\" stEvt:when=\"2012-06-07T14:33:13+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/jpeg to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"derived\" stEvt:parameters=\"converted from image/jpeg to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:BFD85EDF22206811822A982ED0E5672C\" stEvt:when=\"2012-06-07T14:33:13+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <xmpMM:DerivedFrom stRef:instanceID=\"xmp.iid:BED85EDF22206811822A982ED0E5672C\" stRef:documentID=\"BE2810FB4D29704D9A2C0854F013F836\" stRef:originalDocumentID=\"BE2810FB4D29704D9A2C0854F013F836\"/> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> <exif:ISOSpeedRatings> <rdf:Seq> <rdf:li>50</rdf:li> </rdf:Seq> </exif:ISOSpeedRatings> <exif:ComponentsConfiguration> <rdf:Seq> <rdf:li>1</rdf:li> <rdf:li>2</rdf:li> <rdf:li>3</rdf:li> <rdf:li>0</rdf:li> </rdf:Seq> </exif:ComponentsConfiguration> <exif:Flash exif:Fired=\"True\" exif:Return=\"0\" exif:Mode=\"1\" exif:Function=\"False\" exif:RedEyeMode=\"True\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0003() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/center/solid_rectangle_center.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" tiff:ImageWidth=\"256\" tiff:ImageLength=\"256\" tiff:Compression=\"8\" tiff:PhotometricInterpretation=\"2\" tiff:SamplesPerPixel=\"3\" tiff:XResolution=\"1207959552/16777216\" tiff:YResolution=\"1207959552/16777216\" tiff:ResolutionUnit=\"2\" xmp:CreatorTool=\"Scene7 Image Converter 4.7.5\" xmp:ModifyDate=\"2012-06-07T10:02:11\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0004() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/mode1/crop_alpha.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Macintosh)\" xmp:CreateDate=\"2012-06-13T16:27:54+08:00\" xmp:MetadataDate=\"2012-06-13T16:27:54+08:00\" xmp:ModifyDate=\"2012-06-13T16:27:54+08:00\" xmpMM:InstanceID=\"xmp.iid:E87CAC49202068118083983A12F8801C\" xmpMM:DocumentID=\"xmp.did:0A801174072068118083983A12F8801C\" xmpMM:OriginalDocumentID=\"xmp.did:0A801174072068118083983A12F8801C\" dc:format=\"image/tiff\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"Generic RGB Profile\" tiff:ImageWidth=\"256\" tiff:ImageLength=\"256\" tiff:Compression=\"5\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"4\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"256\" exif:PixelYDimension=\"256\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:0A801174072068118083983A12F8801C\" stEvt:when=\"2012-06-13T16:27:54+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:E87CAC49202068118083983A12F8801C\" stEvt:when=\"2012-06-13T16:27:54+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0005() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ll/Quince_LL.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" dc:format=\"image/tiff\" xmp:CreatorTool=\"Adobe Photoshop CS2 Windows\" xmp:CreateDate=\"2006-09-26T14:22:16-07:00\" xmp:ModifyDate=\"2006-09-26T14:22:16-07:00\" xmp:MetadataDate=\"2006-09-26T14:22:16-07:00\" xmpMM:DocumentID=\"uuid:04250B11A54DDB11A772CF9CC05D2878\" xmpMM:InstanceID=\"uuid:05250B11A54DDB11A772CF9CC05D2878\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"sRGB IEC61966-2.1\" tiff:ImageWidth=\"1000\" tiff:ImageLength=\"600\" tiff:Compression=\"5\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"3\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"1\" exif:PixelXDimension=\"1000\" exif:PixelYDimension=\"600\"> <xmpMM:DerivedFrom stRef:instanceID=\"uuid:69B40ED7A44DDB11A772CF9CC05D2878\" stRef:documentID=\"uuid:68B40ED7A44DDB11A772CF9CC05D2878\"/> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0006() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ur/Quince_UR.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" dc:format=\"image/tiff\" xmp:CreatorTool=\"Adobe Photoshop CS2 Windows\" xmp:CreateDate=\"2006-09-26T14:21:59-07:00\" xmp:ModifyDate=\"2006-09-26T14:21:59-07:00\" xmp:MetadataDate=\"2006-09-26T14:21:59-07:00\" xmpMM:DocumentID=\"uuid:65B40ED7A44DDB11A772CF9CC05D2878\" xmpMM:InstanceID=\"uuid:66B40ED7A44DDB11A772CF9CC05D2878\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"sRGB IEC61966-2.1\" tiff:ImageWidth=\"1000\" tiff:ImageLength=\"600\" tiff:Compression=\"5\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"3\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"1\" exif:PixelXDimension=\"1000\" exif:PixelYDimension=\"600\"> <xmpMM:DerivedFrom stRef:instanceID=\"uuid:63B40ED7A44DDB11A772CF9CC05D2878\" stRef:documentID=\"uuid:62B40ED7A44DDB11A772CF9CC05D2878\"/> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0007() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/ul/Quince_UL.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" dc:format=\"image/tiff\" xmp:CreatorTool=\"Adobe Photoshop CS2 Windows\" xmp:CreateDate=\"2006-09-26T14:22:08-07:00\" xmp:ModifyDate=\"2006-09-26T14:22:08-07:00\" xmp:MetadataDate=\"2006-09-26T14:22:08-07:00\" xmpMM:DocumentID=\"uuid:68B40ED7A44DDB11A772CF9CC05D2878\" xmpMM:InstanceID=\"uuid:69B40ED7A44DDB11A772CF9CC05D2878\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"sRGB IEC61966-2.1\" tiff:ImageWidth=\"1000\" tiff:ImageLength=\"600\" tiff:Compression=\"5\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"3\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"1\" exif:PixelXDimension=\"1000\" exif:PixelYDimension=\"600\"> <xmpMM:DerivedFrom stRef:instanceID=\"uuid:66B40ED7A44DDB11A772CF9CC05D2878\" stRef:documentID=\"uuid:65B40ED7A44DDB11A772CF9CC05D2878\"/> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0008() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/Autocrop/lr/Quince_LR.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" dc:format=\"image/tiff\" xmp:CreatorTool=\"Adobe Photoshop CS2 Windows\" xmp:CreateDate=\"2006-09-26T14:20:46-07:00\" xmp:ModifyDate=\"2006-09-26T14:21:46-07:00\" xmp:MetadataDate=\"2006-09-26T14:21:46-07:00\" xmpMM:DocumentID=\"uuid:62B40ED7A44DDB11A772CF9CC05D2878\" xmpMM:InstanceID=\"uuid:63B40ED7A44DDB11A772CF9CC05D2878\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"sRGB IEC61966-2.1\" tiff:ImageWidth=\"1000\" tiff:ImageLength=\"600\" tiff:Compression=\"5\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"3\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"1\" exif:PixelXDimension=\"1000\" exif:PixelYDimension=\"600\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0009() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bit_565.bmp";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0010() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_56/Bits_555.bmp";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0011() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_uncompression/RGB_uncom_bit8.bmp";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0012() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_indexed/BMP_Indexed.bmp";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0013() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_1/Bits_1.bmp";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0014() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/color_RGB/RGB_Bits_8.bmp";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0015() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/bits_8/Bits_8.bmp";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0016() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/BMP/compression_RLE/RGB_RLE_bit8.bmp";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0017() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PICT/8rgb.pict";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0018() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYK/CMYK_Colortest.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpRights=\"http://ns.adobe.com/xap/1.0/rights/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmpMM:DocumentID=\"adobe:docid:photoshop:db7c5ce5-0e31-11d9-b5ce-dd9a018a2f1f\" xmpMM:InstanceID=\"xmp.iid:3A8191DE9FAFE11180EDCE9747EBF356\" xmpMM:OriginalDocumentID=\"adobe:docid:photoshop:db7c5ce5-0e31-11d9-b5ce-dd9a018a2f1f\" xmp:ModifyDate=\"2012-06-06T14:21:36+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" xmp:CreateDate=\"2012-06-06T10:09:53+08:00\" xmp:MetadataDate=\"2012-06-06T14:21:36+08:00\" dc:format=\"application/vnd.adobe.photoshop\" photoshop:ColorMode=\"4\" photoshop:ICCProfile=\"SWOP (Coated), 20%\" xmpRights:Marked=\"False\" tiff:Orientation=\"1\" tiff:XResolution=\"3000000/10000\" tiff:YResolution=\"3000000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"1500\" exif:PixelYDimension=\"1500\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:3A8191DE9FAFE11180EDCE9747EBF356\" stEvt:when=\"2012-06-06T14:21:36+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0019() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_CMYKA/CMYKA_101freewaySouthOfCarpenteria.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreateDate=\"2012-06-06T15:15:54+08:00\" xmp:ModifyDate=\"2012-06-06T15:16:40+08:00\" xmp:MetadataDate=\"2012-06-06T15:16:40+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" dc:format=\"application/vnd.adobe.photoshop\" photoshop:ColorMode=\"4\" xmpMM:InstanceID=\"xmp.iid:3239898FA7AFE111983C9C704B69C5F9\" xmpMM:DocumentID=\"xmp.did:3139898FA7AFE111983C9C704B69C5F9\" xmpMM:OriginalDocumentID=\"xmp.did:3139898FA7AFE111983C9C704B69C5F9\" tiff:ImageWidth=\"700\" tiff:ImageLength=\"700\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"5\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"5\" tiff:XResolution=\"5000000/10000\" tiff:YResolution=\"5000000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"700\" exif:PixelYDimension=\"700\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:3139898FA7AFE111983C9C704B69C5F9\" stEvt:when=\"2012-06-06T15:15:54+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/tiff to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:3239898FA7AFE111983C9C704B69C5F9\" stEvt:when=\"2012-06-06T15:16:40+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0020() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_1/bit1.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" xmp:CreateDate=\"2012-06-06T15:29:14+08:00\" xmp:MetadataDate=\"2012-06-06T15:29:14+08:00\" xmp:ModifyDate=\"2012-06-06T15:29:14+08:00\" dc:format=\"application/vnd.adobe.photoshop\" xmpMM:InstanceID=\"xmp.iid:9C804B51A9AFE111979DDB6318EC2553\" xmpMM:DocumentID=\"xmp.did:9C804B51A9AFE111979DDB6318EC2553\" xmpMM:OriginalDocumentID=\"xmp.did:9C804B51A9AFE111979DDB6318EC2553\" photoshop:ColorMode=\"0\" tiff:Orientation=\"1\" tiff:XResolution=\"5000000/10000\" tiff:YResolution=\"5000000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"5000\" exif:PixelYDimension=\"5000\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:9C804B51A9AFE111979DDB6318EC2553\" stEvt:when=\"2012-06-06T15:29:14+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\"/> </rdf:Seq> </xmpMM:History> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0021() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_grayA/GreyA_5290827.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreateDate=\"2012-06-06T15:19:03+08:00\" xmp:ModifyDate=\"2012-06-06T15:19:20+08:00\" xmp:MetadataDate=\"2012-06-06T15:19:20+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" dc:format=\"application/vnd.adobe.photoshop\" photoshop:ColorMode=\"1\" xmpMM:InstanceID=\"xmp.iid:12572BEFA7AFE11184DFFDF8C12944A9\" xmpMM:DocumentID=\"xmp.did:11572BEFA7AFE11184DFFDF8C12944A9\" xmpMM:OriginalDocumentID=\"xmp.did:11572BEFA7AFE11184DFFDF8C12944A9\" tiff:ImageWidth=\"700\" tiff:ImageLength=\"700\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"1\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"2\" tiff:XResolution=\"3000000/10000\" tiff:YResolution=\"3000000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"700\" exif:PixelYDimension=\"700\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:11572BEFA7AFE11184DFFDF8C12944A9\" stEvt:when=\"2012-06-06T15:19:03+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/tiff to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:12572BEFA7AFE11184DFFDF8C12944A9\" stEvt:when=\"2012-06-06T15:19:20+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0022() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/RGB_layers.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreateDate=\"2005-06-08T09:49:51-08:00\" xmp:ModifyDate=\"2005-06-08T09:49:51-08:00\" xmp:MetadataDate=\"2005-06-08T09:49:51-08:00\" xmp:CreatorTool=\"Adobe Photoshop CS Windows\" xmpMM:DocumentID=\"adobe:docid:photoshop:d731031e-d83c-11d9-8112-89d55646fce4\" xmpMM:InstanceID=\"uuid:d731031f-d83c-11d9-8112-89d55646fce4\" dc:format=\"application/vnd.adobe.photoshop\" tiff:Orientation=\"1\" tiff:XResolution=\"72/1\" tiff:YResolution=\"72/1\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"1\" exif:PixelXDimension=\"432\" exif:PixelYDimension=\"398\"> <xmpMM:DerivedFrom stRef:instanceID=\"uuid:f850661b-e9fd-11d7-bf98-8587ebb049ce\" stRef:documentID=\"adobe:docid:photoshop:b57d669d-e9fc-11d7-bf98-8587ebb049ce\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0023() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGB/color_RGB.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" photoshop:History=\"2004-01-28T15:13:11-08:00&#x9;File IMG_6437.psd opened&#xA;\" photoshop:DateCreated=\"2003-12-05T12:26:46-08:00\" xmp:CreateDate=\"2004-01-28T15:33:18-08:00\" xmp:ModifyDate=\"2004-01-28T15:33:18-08:00\" xmp:MetadataDate=\"2004-01-28T15:33:18-08:00\" xmp:CreatorTool=\"Adobe Photoshop CS Windows\" xmpMM:DocumentID=\"adobe:docid:photoshop:390d15e1-51ea-11d8-a29a-f990558457c1\" xmpMM:InstanceID=\"uuid:390d15e2-51ea-11d8-a29a-f990558457c1\" dc:format=\"application/vnd.adobe.photoshop\" exif:DateTimeOriginal=\"2003-12-05T12:26:46-08:00\" exif:ColorSpace=\"1\" exif:CompressedBitsPerPixel=\"3/1\" exif:PixelXDimension=\"700\" exif:PixelYDimension=\"525\" exif:ExposureTime=\"1/25\" exif:FNumber=\"22/1\" exif:ShutterSpeedValue=\"304340/65536\" exif:ApertureValue=\"584507/65536\" exif:ExposureBiasValue=\"3/3\" exif:MaxApertureValue=\"262144/65536\" exif:MeteringMode=\"5\" exif:FocalLength=\"40/1\" exif:FocalPlaneXResolution=\"3072000/892\" exif:FocalPlaneYResolution=\"2048000/595\" exif:FocalPlaneResolutionUnit=\"2\" exif:SensingMethod=\"2\" exif:CustomRendered=\"0\" exif:ExposureMode=\"2\" exif:WhiteBalance=\"0\" exif:SceneCaptureType=\"0\" exif:ExifVersion=\"0220\" exif:FlashpixVersion=\"0100\" exif:FileSource=\"3\" tiff:Orientation=\"1\" tiff:YCbCrPositioning=\"1\" tiff:XResolution=\"616/1\" tiff:YResolution=\"616/1\" tiff:ResolutionUnit=\"2\" tiff:Make=\"Canon\" tiff:Model=\"Canon EOS 10D\"> <xmpMM:DerivedFrom stRef:instanceID=\"uuid:e0df23d8-51cd-11d8-bfea-dce0ea0fff2a\" stRef:documentID=\"adobe:docid:photoshop:e0df23d5-51cd-11d8-bfea-dce0ea0fff2a\"/> <exif:ISOSpeedRatings> <rdf:Seq> <rdf:li>200</rdf:li> </rdf:Seq> </exif:ISOSpeedRatings> <exif:ComponentsConfiguration> <rdf:Seq> <rdf:li>1</rdf:li> <rdf:li>2</rdf:li> <rdf:li>3</rdf:li> <rdf:li>0</rdf:li> </rdf:Seq> </exif:ComponentsConfiguration> <exif:Flash exif:Fired=\"False\" exif:Return=\"0\" exif:Mode=\"0\" exif:Function=\"False\" exif:RedEyeMode=\"False\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0024() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_gray/Grey_CasementCS2.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmpMM:DocumentID=\"uuid:C1705131295ADB11B7EED67A461517F2\" xmpMM:InstanceID=\"uuid:EDDD084A295ADB11B7EED67A461517F2\" xmp:CreateDate=\"2006-10-12T12:38:51-07:00\" xmp:ModifyDate=\"2006-10-12T12:38:51-07:00\" xmp:MetadataDate=\"2006-10-12T12:38:51-07:00\" xmp:CreatorTool=\"Adobe Photoshop CS2 Windows\" dc:format=\"application/vnd.adobe.photoshop\" photoshop:ColorMode=\"1\" tiff:Orientation=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"600\" exif:PixelYDimension=\"600\"> <xmpMM:DerivedFrom stRef:instanceID=\"uuid:C0705131295ADB11B7EED67A461517F2\" stRef:documentID=\"uuid:C0705131295ADB11B7EED67A461517F2\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0025() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_8/Bits8_IMG6437.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" photoshop:History=\"2004-01-28T15:13:11-08:00&#x9;File IMG_6437.psd opened&#xA;\" photoshop:DateCreated=\"2003-12-05T12:26:46-08:00\" xmp:CreateDate=\"2004-01-28T15:33:18-08:00\" xmp:ModifyDate=\"2004-01-28T15:33:18-08:00\" xmp:MetadataDate=\"2004-01-28T15:33:18-08:00\" xmp:CreatorTool=\"Adobe Photoshop CS Windows\" xmpMM:DocumentID=\"adobe:docid:photoshop:390d15e1-51ea-11d8-a29a-f990558457c1\" xmpMM:InstanceID=\"uuid:390d15e2-51ea-11d8-a29a-f990558457c1\" dc:format=\"application/vnd.adobe.photoshop\" exif:DateTimeOriginal=\"2003-12-05T12:26:46-08:00\" exif:ColorSpace=\"1\" exif:CompressedBitsPerPixel=\"3/1\" exif:PixelXDimension=\"700\" exif:PixelYDimension=\"525\" exif:ExposureTime=\"1/25\" exif:FNumber=\"22/1\" exif:ShutterSpeedValue=\"304340/65536\" exif:ApertureValue=\"584507/65536\" exif:ExposureBiasValue=\"3/3\" exif:MaxApertureValue=\"262144/65536\" exif:MeteringMode=\"5\" exif:FocalLength=\"40/1\" exif:FocalPlaneXResolution=\"3072000/892\" exif:FocalPlaneYResolution=\"2048000/595\" exif:FocalPlaneResolutionUnit=\"2\" exif:SensingMethod=\"2\" exif:CustomRendered=\"0\" exif:ExposureMode=\"2\" exif:WhiteBalance=\"0\" exif:SceneCaptureType=\"0\" exif:ExifVersion=\"0220\" exif:FlashpixVersion=\"0100\" exif:FileSource=\"3\" tiff:Orientation=\"1\" tiff:YCbCrPositioning=\"1\" tiff:XResolution=\"616/1\" tiff:YResolution=\"616/1\" tiff:ResolutionUnit=\"2\" tiff:Make=\"Canon\" tiff:Model=\"Canon EOS 10D\"> <xmpMM:DerivedFrom stRef:instanceID=\"uuid:e0df23d8-51cd-11d8-bfea-dce0ea0fff2a\" stRef:documentID=\"adobe:docid:photoshop:e0df23d5-51cd-11d8-bfea-dce0ea0fff2a\"/> <exif:ISOSpeedRatings> <rdf:Seq> <rdf:li>200</rdf:li> </rdf:Seq> </exif:ISOSpeedRatings> <exif:ComponentsConfiguration> <rdf:Seq> <rdf:li>1</rdf:li> <rdf:li>2</rdf:li> <rdf:li>3</rdf:li> <rdf:li>0</rdf:li> </rdf:Seq> </exif:ComponentsConfiguration> <exif:Flash exif:Fired=\"False\" exif:Return=\"0\" exif:Mode=\"0\" exif:Function=\"False\" exif:RedEyeMode=\"False\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0026() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_uncompressed/Uncompressed_050306.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreateDate=\"2012-06-06T14:49:20+08:00\" xmp:ModifyDate=\"2012-06-06T14:50:49+08:00\" xmp:MetadataDate=\"2012-06-06T14:50:49+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" dc:format=\"application/vnd.adobe.photoshop\" photoshop:ColorMode=\"3\" xmpMM:InstanceID=\"xmp.iid:529B63F3A3AFE111BF21A9195AF78F89\" xmpMM:DocumentID=\"xmp.did:519B63F3A3AFE111BF21A9195AF78F89\" xmpMM:OriginalDocumentID=\"xmp.did:519B63F3A3AFE111BF21A9195AF78F89\" tiff:ImageWidth=\"100\" tiff:ImageLength=\"100\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"4\" tiff:XResolution=\"1500000/10000\" tiff:YResolution=\"1500000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"100\" exif:PixelYDimension=\"100\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:519B63F3A3AFE111BF21A9195AF78F89\" stEvt:when=\"2012-06-06T14:49:20+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/tiff to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:529B63F3A3AFE111BF21A9195AF78F89\" stEvt:when=\"2012-06-06T14:50:49+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0027() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/color_RGBA/RGBA_050306.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreateDate=\"2012-06-06T14:49:20+08:00\" xmp:ModifyDate=\"2012-06-06T14:50:49+08:00\" xmp:MetadataDate=\"2012-06-06T14:50:49+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" dc:format=\"application/vnd.adobe.photoshop\" photoshop:ColorMode=\"3\" xmpMM:InstanceID=\"xmp.iid:529B63F3A3AFE111BF21A9195AF78F89\" xmpMM:DocumentID=\"xmp.did:519B63F3A3AFE111BF21A9195AF78F89\" xmpMM:OriginalDocumentID=\"xmp.did:519B63F3A3AFE111BF21A9195AF78F89\" tiff:ImageWidth=\"100\" tiff:ImageLength=\"100\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"4\" tiff:XResolution=\"1500000/10000\" tiff:YResolution=\"1500000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"100\" exif:PixelYDimension=\"100\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:519B63F3A3AFE111BF21A9195AF78F89\" stEvt:when=\"2012-06-06T14:49:20+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/tiff to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:529B63F3A3AFE111BF21A9195AF78F89\" stEvt:when=\"2012-06-06T14:50:49+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0028() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/compression_compressed/Compressed_LayerCompsClipsample.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreateDate=\"2006-09-26T11:40:01-07:00\" xmp:ModifyDate=\"2006-09-26T11:40:01-07:00\" xmp:MetadataDate=\"2006-09-26T11:40:01-07:00\" xmp:CreatorTool=\"Adobe Photoshop CS2 Windows\" xmpMM:DocumentID=\"uuid:0D7D03358E4DDB11AA64F175550443D3\" xmpMM:InstanceID=\"uuid:0E7D03358E4DDB11AA64F175550443D3\" dc:format=\"application/vnd.adobe.photoshop\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"Adobe RGB (1998)\" tiff:Orientation=\"1\" tiff:XResolution=\"1000000/10000\" tiff:YResolution=\"1000000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"400\" exif:PixelYDimension=\"424\"> <xmpMM:DerivedFrom stRef:instanceID=\"uuid:E49F7218D789D9118D6ADFB0D7DFBD46\" stRef:documentID=\"adobe:docid:photoshop:5def92b3-77da-11d9-8557-9d27eff4b81f\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0029() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PSD/bits_16/Bits16_usermask.psd";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpRights=\"http://ns.adobe.com/xap/1.0/rights/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" xmp:CreateDate=\"2003-01-17T00:00+08:00\" xmp:ModifyDate=\"2012-06-06T10:14:48+08:00\" xmp:MetadataDate=\"2012-06-06T10:14:48+08:00\" dc:format=\"application/vnd.adobe.photoshop\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"sRGB IEC61966-2.1\" xmpRights:Marked=\"False\" xmpMM:InstanceID=\"xmp.iid:317001647DAFE111A0B99E043FF0B65E\" xmpMM:DocumentID=\"xmp.did:307001647DAFE111A0B99E043FF0B65E\" xmpMM:OriginalDocumentID=\"xmp.did:307001647DAFE111A0B99E043FF0B65E\" tiff:Orientation=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"1\" exif:PixelXDimension=\"560\" exif:PixelYDimension=\"647\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:307001647DAFE111A0B99E043FF0B65E\" stEvt:when=\"2003-01-17T00:00+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:317001647DAFE111A0B99E043FF0B65E\" stEvt:when=\"2012-06-06T10:14:48+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0030() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/5D_Mark_II_CMYK.jpg";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:aux=\"http://ns.adobe.com/exif/1.0/aux/\" xmlns:crs=\"http://ns.adobe.com/camera-raw-settings/1.0/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:ModifyDate=\"2012-06-07T16:56:26+08:00\" xmp:CreateDate=\"2008-11-04T00:38:20.69+08:00\" xmp:Rating=\"0\" xmp:MetadataDate=\"2012-06-07T16:56:26+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS5.1 Windows\" aux:SerialNumber=\"29900087\" aux:LensInfo=\"16/1 35/1 0/0 0/0\" aux:Lens=\"EF16-35mm f/2.8L USM\" aux:LensID=\"229\" aux:ImageNumber=\"0\" aux:ApproximateFocusDistance=\"31/100\" aux:FlashCompensation=\"0/1\" aux:Firmware=\"4.1.1\" crs:RawFileName=\"5D_Mark_II.CR2\" crs:Version=\"6.3\" crs:ProcessVersion=\"5.7\" crs:WhiteBalance=\"As Shot\" crs:Temperature=\"3750\" crs:Tint=\"+26\" crs:Exposure=\"+0.60\" crs:Shadows=\"5\" crs:Brightness=\"+48\" crs:Contrast=\"+26\" crs:Saturation=\"0\" crs:Sharpness=\"25\" crs:LuminanceSmoothing=\"0\" crs:ColorNoiseReduction=\"25\" crs:ChromaticAberrationR=\"0\" crs:ChromaticAberrationB=\"0\" crs:VignetteAmount=\"0\" crs:ShadowTint=\"0\" crs:RedHue=\"0\" crs:RedSaturation=\"0\" crs:GreenHue=\"0\" crs:GreenSaturation=\"0\" crs:BlueHue=\"0\" crs:BlueSaturation=\"0\" crs:FillLight=\"0\" crs:Vibrance=\"0\" crs:HighlightRecovery=\"0\" crs:Clarity=\"0\" crs:Defringe=\"0\" crs:HueAdjustmentRed=\"0\" crs:HueAdjustmentOrange=\"0\" crs:HueAdjustmentYellow=\"0\" crs:HueAdjustmentGreen=\"0\" crs:HueAdjustmentAqua=\"0\" crs:HueAdjustmentBlue=\"0\" crs:HueAdjustmentPurple=\"0\" crs:HueAdjustmentMagenta=\"0\" crs:SaturationAdjustmentRed=\"0\" crs:SaturationAdjustmentOrange=\"0\" crs:SaturationAdjustmentYellow=\"0\" crs:SaturationAdjustmentGreen=\"0\" crs:SaturationAdjustmentAqua=\"0\" crs:SaturationAdjustmentBlue=\"0\" crs:SaturationAdjustmentPurple=\"0\" crs:SaturationAdjustmentMagenta=\"0\" crs:LuminanceAdjustmentRed=\"0\" crs:LuminanceAdjustmentOrange=\"0\" crs:LuminanceAdjustmentYellow=\"0\" crs:LuminanceAdjustmentGreen=\"0\" crs:LuminanceAdjustmentAqua=\"0\" crs:LuminanceAdjustmentBlue=\"0\" crs:LuminanceAdjustmentPurple=\"0\" crs:LuminanceAdjustmentMagenta=\"0\" crs:SplitToningShadowHue=\"0\" crs:SplitToningShadowSaturation=\"0\" crs:SplitToningHighlightHue=\"0\" crs:SplitToningHighlightSaturation=\"0\" crs:SplitToningBalance=\"0\" crs:ParametricShadows=\"0\" crs:ParametricDarks=\"0\" crs:ParametricLights=\"0\" crs:ParametricHighlights=\"0\" crs:ParametricShadowSplit=\"25\" crs:ParametricMidtoneSplit=\"50\" crs:ParametricHighlightSplit=\"75\" crs:SharpenRadius=\"+1.0\" crs:SharpenDetail=\"25\" crs:SharpenEdgeMasking=\"0\" crs:PostCropVignetteAmount=\"0\" crs:GrainAmount=\"0\" crs:ColorNoiseReductionDetail=\"50\" crs:LensProfileEnable=\"0\" crs:LensManualDistortionAmount=\"0\" crs:PerspectiveVertical=\"0\" crs:PerspectiveHorizontal=\"0\" crs:PerspectiveRotate=\"0.0\" crs:PerspectiveScale=\"100\" crs:ConvertToGrayscale=\"False\" crs:ToneCurveName=\"Medium Contrast\" crs:CameraProfile=\"Adobe Standard\" crs:CameraProfileDigest=\"3DA8CE4A626CE36A1D0C55BF157793C9\" crs:LensProfileSetup=\"LensDefaults\" crs:HasSettings=\"True\" crs:HasCrop=\"False\" crs:AlreadyApplied=\"True\" photoshop:DateCreated=\"2008-11-04T00:38:20.069\" photoshop:LegacyIPTCDigest=\"8C66F04E338D7FB17B1C540D8F0ED5D9\" photoshop:ColorMode=\"4\" photoshop:ICCProfile=\"U.S. Web Coated (SWOP) v2\" dc:format=\"image/jpeg\" xmpMM:InstanceID=\"xmp.iid:853226AA7EB0E111B78C80D46CFB38BF\" xmpMM:DocumentID=\"xmp.did:DD9F624D9FAFE111858DE4E2BA491F5C\" xmpMM:OriginalDocumentID=\"xmp.did:DD9F624D9FAFE111858DE4E2BA491F5C\" tiff:ImageWidth=\"5616\" tiff:ImageLength=\"3744\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"3\" tiff:XResolution=\"2400000/10000\" tiff:YResolution=\"2400000/10000\" tiff:ResolutionUnit=\"2\" tiff:Make=\"Canon\" tiff:Model=\"Canon EOS 5D Mark II\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"2500\" exif:PixelYDimension=\"1666\" exif:ExposureTime=\"1/30\" exif:FNumber=\"28/10\" exif:ExposureProgram=\"2\" exif:ShutterSpeedValue=\"4906891/1000000\" exif:ApertureValue=\"2970854/1000000\" exif:ExposureBiasValue=\"0/1\" exif:MaxApertureValue=\"3/1\" exif:SubjectDistance=\"31/100\" exif:MeteringMode=\"5\" exif:FocalLength=\"35/1\" exif:FocalPlaneXResolution=\"5616000/1459\" exif:FocalPlaneYResolution=\"3744000/958\" exif:FocalPlaneResolutionUnit=\"2\" exif:CustomRendered=\"0\" exif:ExposureMode=\"0\" exif:WhiteBalance=\"0\" exif:SceneCaptureType=\"0\" exif:DateTimeOriginal=\"2008-11-04T00:38:20.69\" exif:ExifVersion=\"0221\"> <crs:ToneCurve> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>32, 22</rdf:li> <rdf:li>64, 56</rdf:li> <rdf:li>128, 128</rdf:li> <rdf:li>192, 196</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurve> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:DD9F624D9FAFE111858DE4E2BA491F5C\" stEvt:when=\"2012-06-06T14:17:33+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:5ABDE2CB7DB0E1118E62ACA473036DC6\" stEvt:when=\"2012-06-07T16:50:13+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:FB345B3D7EB0E111BD37C5E3789C0AF5\" stEvt:when=\"2012-06-07T16:53:23+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:853226AA7EB0E111B78C80D46CFB38BF\" stEvt:when=\"2012-06-07T16:56:26+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> <exif:ISOSpeedRatings> <rdf:Seq> <rdf:li>2500</rdf:li> </rdf:Seq> </exif:ISOSpeedRatings> <exif:Flash exif:Fired=\"False\" exif:Return=\"0\" exif:Mode=\"2\" exif:Function=\"False\" exif:RedEyeMode=\"False\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0031() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_CMYK/duckyCmyk.jpg";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:xmpRights=\"http://ns.adobe.com/xap/1.0/rights/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmpMM:DocumentID=\"adobe:docid:photoshop:7cf10ec6-a1d2-11d7-a73c-f35b25a665c0\" xmpMM:InstanceID=\"uuid:6afcc4ca-a5d4-11d7-a130-828db6b07494\" xmpRights:Marked=\"True\" tiff:Orientation=\"1\" tiff:XResolution=\"72/1\" tiff:YResolution=\"72/1\" tiff:ResolutionUnit=\"2\" xmp:CreatorTool=\"Adobe Photoshop 7.0\" xmp:ModifyDate=\"2003-06-23T16:43:35\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"250\" exif:PixelYDimension=\"273\"> <dc:rights> <rdf:Alt> <rdf:li xml:lang=\"x-default\">(c) EyeWire, Inc.</rdf:li> </rdf:Alt> </dc:rights> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0032() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/5D_Mark_II_RGB.jpg";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:aux=\"http://ns.adobe.com/exif/1.0/aux/\" xmlns:crs=\"http://ns.adobe.com/camera-raw-settings/1.0/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:ModifyDate=\"2012-06-07T16:55:57+08:00\" xmp:CreateDate=\"2008-11-04T00:38:20.69+08:00\" xmp:Rating=\"0\" xmp:MetadataDate=\"2012-06-07T16:55:57+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS5.1 Windows\" aux:SerialNumber=\"29900087\" aux:LensInfo=\"16/1 35/1 0/0 0/0\" aux:Lens=\"EF16-35mm f/2.8L USM\" aux:LensID=\"229\" aux:ImageNumber=\"0\" aux:ApproximateFocusDistance=\"31/100\" aux:FlashCompensation=\"0/1\" aux:Firmware=\"4.1.1\" crs:RawFileName=\"5D_Mark_II.CR2\" crs:Version=\"6.3\" crs:ProcessVersion=\"5.7\" crs:WhiteBalance=\"As Shot\" crs:Temperature=\"3750\" crs:Tint=\"+26\" crs:Exposure=\"+0.60\" crs:Shadows=\"5\" crs:Brightness=\"+48\" crs:Contrast=\"+26\" crs:Saturation=\"0\" crs:Sharpness=\"25\" crs:LuminanceSmoothing=\"0\" crs:ColorNoiseReduction=\"25\" crs:ChromaticAberrationR=\"0\" crs:ChromaticAberrationB=\"0\" crs:VignetteAmount=\"0\" crs:ShadowTint=\"0\" crs:RedHue=\"0\" crs:RedSaturation=\"0\" crs:GreenHue=\"0\" crs:GreenSaturation=\"0\" crs:BlueHue=\"0\" crs:BlueSaturation=\"0\" crs:FillLight=\"0\" crs:Vibrance=\"0\" crs:HighlightRecovery=\"0\" crs:Clarity=\"0\" crs:Defringe=\"0\" crs:HueAdjustmentRed=\"0\" crs:HueAdjustmentOrange=\"0\" crs:HueAdjustmentYellow=\"0\" crs:HueAdjustmentGreen=\"0\" crs:HueAdjustmentAqua=\"0\" crs:HueAdjustmentBlue=\"0\" crs:HueAdjustmentPurple=\"0\" crs:HueAdjustmentMagenta=\"0\" crs:SaturationAdjustmentRed=\"0\" crs:SaturationAdjustmentOrange=\"0\" crs:SaturationAdjustmentYellow=\"0\" crs:SaturationAdjustmentGreen=\"0\" crs:SaturationAdjustmentAqua=\"0\" crs:SaturationAdjustmentBlue=\"0\" crs:SaturationAdjustmentPurple=\"0\" crs:SaturationAdjustmentMagenta=\"0\" crs:LuminanceAdjustmentRed=\"0\" crs:LuminanceAdjustmentOrange=\"0\" crs:LuminanceAdjustmentYellow=\"0\" crs:LuminanceAdjustmentGreen=\"0\" crs:LuminanceAdjustmentAqua=\"0\" crs:LuminanceAdjustmentBlue=\"0\" crs:LuminanceAdjustmentPurple=\"0\" crs:LuminanceAdjustmentMagenta=\"0\" crs:SplitToningShadowHue=\"0\" crs:SplitToningShadowSaturation=\"0\" crs:SplitToningHighlightHue=\"0\" crs:SplitToningHighlightSaturation=\"0\" crs:SplitToningBalance=\"0\" crs:ParametricShadows=\"0\" crs:ParametricDarks=\"0\" crs:ParametricLights=\"0\" crs:ParametricHighlights=\"0\" crs:ParametricShadowSplit=\"25\" crs:ParametricMidtoneSplit=\"50\" crs:ParametricHighlightSplit=\"75\" crs:SharpenRadius=\"+1.0\" crs:SharpenDetail=\"25\" crs:SharpenEdgeMasking=\"0\" crs:PostCropVignetteAmount=\"0\" crs:GrainAmount=\"0\" crs:ColorNoiseReductionDetail=\"50\" crs:LensProfileEnable=\"0\" crs:LensManualDistortionAmount=\"0\" crs:PerspectiveVertical=\"0\" crs:PerspectiveHorizontal=\"0\" crs:PerspectiveRotate=\"0.0\" crs:PerspectiveScale=\"100\" crs:ConvertToGrayscale=\"False\" crs:ToneCurveName=\"Medium Contrast\" crs:CameraProfile=\"Adobe Standard\" crs:CameraProfileDigest=\"3DA8CE4A626CE36A1D0C55BF157793C9\" crs:LensProfileSetup=\"LensDefaults\" crs:HasSettings=\"True\" crs:HasCrop=\"False\" crs:AlreadyApplied=\"True\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"Adobe RGB (1998)\" photoshop:DateCreated=\"2008-11-04T00:38:20.069\" dc:format=\"image/jpeg\" xmpMM:InstanceID=\"xmp.iid:53D096987EB0E111B821A468C85A6BF2\" xmpMM:DocumentID=\"xmp.did:53D096987EB0E111B821A468C85A6BF2\" xmpMM:OriginalDocumentID=\"xmp.did:53D096987EB0E111B821A468C85A6BF2\" tiff:ImageWidth=\"5616\" tiff:ImageLength=\"3744\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"3\" tiff:XResolution=\"2400000/10000\" tiff:YResolution=\"2400000/10000\" tiff:ResolutionUnit=\"2\" tiff:Make=\"Canon\" tiff:Model=\"Canon EOS 5D Mark II\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"1960\" exif:PixelYDimension=\"1307\" exif:ExposureTime=\"1/30\" exif:FNumber=\"28/10\" exif:ExposureProgram=\"2\" exif:ShutterSpeedValue=\"4906891/1000000\" exif:ApertureValue=\"2970854/1000000\" exif:ExposureBiasValue=\"0/1\" exif:MaxApertureValue=\"3/1\" exif:SubjectDistance=\"31/100\" exif:MeteringMode=\"5\" exif:FocalLength=\"35/1\" exif:FocalPlaneXResolution=\"5616000/1459\" exif:FocalPlaneYResolution=\"3744000/958\" exif:FocalPlaneResolutionUnit=\"2\" exif:CustomRendered=\"0\" exif:ExposureMode=\"0\" exif:WhiteBalance=\"0\" exif:SceneCaptureType=\"0\" exif:DateTimeOriginal=\"2008-11-04T00:38:20.69\" exif:ExifVersion=\"0221\"> <crs:ToneCurve> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>32, 22</rdf:li> <rdf:li>64, 56</rdf:li> <rdf:li>128, 128</rdf:li> <rdf:li>192, 196</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurve> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:53D096987EB0E111B821A468C85A6BF2\" stEvt:when=\"2012-06-07T16:55:57+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> <exif:ISOSpeedRatings> <rdf:Seq> <rdf:li>2500</rdf:li> </rdf:Seq> </exif:ISOSpeedRatings> <exif:Flash exif:Fired=\"False\" exif:Return=\"0\" exif:Mode=\"2\" exif:Function=\"False\" exif:RedEyeMode=\"False\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0033() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_RGB/DuckyRGB.jpg";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpRights=\"http://ns.adobe.com/xap/1.0/rights/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreatorTool=\"Adobe Photoshop CS5.1 Windows\" xmp:CreateDate=\"2012-06-06T16:26:49+08:00\" xmp:ModifyDate=\"2012-06-06T16:27:55+08:00\" xmp:MetadataDate=\"2012-06-06T16:27:55+08:00\" dc:format=\"image/jpeg\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"sRGB IEC61966-2.1\" xmpRights:Marked=\"True\" xmpMM:InstanceID=\"xmp.iid:FD93E983B1AFE111A599EBF57614AD79\" xmpMM:DocumentID=\"xmp.did:FC93E983B1AFE111A599EBF57614AD79\" xmpMM:OriginalDocumentID=\"xmp.did:FC93E983B1AFE111A599EBF57614AD79\" tiff:Orientation=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"1\" exif:PixelXDimension=\"500\" exif:PixelYDimension=\"546\"> <dc:rights> <rdf:Alt> <rdf:li xml:lang=\"x-default\">(c) EyeWire, Inc.</rdf:li> </rdf:Alt> </dc:rights> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:FC93E983B1AFE111A599EBF57614AD79\" stEvt:when=\"2012-06-06T16:26:49+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from application/vnd.adobe.photoshop to image/jpeg\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:FD93E983B1AFE111A599EBF57614AD79\" stEvt:when=\"2012-06-06T16:27:55+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0034() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/5D_Mark_II_Gray.jpg";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:aux=\"http://ns.adobe.com/exif/1.0/aux/\" xmlns:crs=\"http://ns.adobe.com/camera-raw-settings/1.0/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:ModifyDate=\"2012-06-07T16:54:20+08:00\" xmp:CreateDate=\"2008-11-04T00:38:20.69+08:00\" xmp:Rating=\"0\" xmp:MetadataDate=\"2012-06-07T16:54:20+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS5.1 Windows\" aux:SerialNumber=\"29900087\" aux:LensInfo=\"16/1 35/1 0/0 0/0\" aux:Lens=\"EF16-35mm f/2.8L USM\" aux:LensID=\"229\" aux:ImageNumber=\"0\" aux:ApproximateFocusDistance=\"31/100\" aux:FlashCompensation=\"0/1\" aux:Firmware=\"4.1.1\" crs:RawFileName=\"5D_Mark_II.CR2\" crs:Version=\"6.3\" crs:ProcessVersion=\"5.7\" crs:WhiteBalance=\"As Shot\" crs:Temperature=\"3750\" crs:Tint=\"+26\" crs:Exposure=\"+0.60\" crs:Shadows=\"5\" crs:Brightness=\"+48\" crs:Contrast=\"+26\" crs:Saturation=\"0\" crs:Sharpness=\"25\" crs:LuminanceSmoothing=\"0\" crs:ColorNoiseReduction=\"25\" crs:ChromaticAberrationR=\"0\" crs:ChromaticAberrationB=\"0\" crs:VignetteAmount=\"0\" crs:ShadowTint=\"0\" crs:RedHue=\"0\" crs:RedSaturation=\"0\" crs:GreenHue=\"0\" crs:GreenSaturation=\"0\" crs:BlueHue=\"0\" crs:BlueSaturation=\"0\" crs:FillLight=\"0\" crs:Vibrance=\"0\" crs:HighlightRecovery=\"0\" crs:Clarity=\"0\" crs:Defringe=\"0\" crs:HueAdjustmentRed=\"0\" crs:HueAdjustmentOrange=\"0\" crs:HueAdjustmentYellow=\"0\" crs:HueAdjustmentGreen=\"0\" crs:HueAdjustmentAqua=\"0\" crs:HueAdjustmentBlue=\"0\" crs:HueAdjustmentPurple=\"0\" crs:HueAdjustmentMagenta=\"0\" crs:SaturationAdjustmentRed=\"0\" crs:SaturationAdjustmentOrange=\"0\" crs:SaturationAdjustmentYellow=\"0\" crs:SaturationAdjustmentGreen=\"0\" crs:SaturationAdjustmentAqua=\"0\" crs:SaturationAdjustmentBlue=\"0\" crs:SaturationAdjustmentPurple=\"0\" crs:SaturationAdjustmentMagenta=\"0\" crs:LuminanceAdjustmentRed=\"0\" crs:LuminanceAdjustmentOrange=\"0\" crs:LuminanceAdjustmentYellow=\"0\" crs:LuminanceAdjustmentGreen=\"0\" crs:LuminanceAdjustmentAqua=\"0\" crs:LuminanceAdjustmentBlue=\"0\" crs:LuminanceAdjustmentPurple=\"0\" crs:LuminanceAdjustmentMagenta=\"0\" crs:SplitToningShadowHue=\"0\" crs:SplitToningShadowSaturation=\"0\" crs:SplitToningHighlightHue=\"0\" crs:SplitToningHighlightSaturation=\"0\" crs:SplitToningBalance=\"0\" crs:ParametricShadows=\"0\" crs:ParametricDarks=\"0\" crs:ParametricLights=\"0\" crs:ParametricHighlights=\"0\" crs:ParametricShadowSplit=\"25\" crs:ParametricMidtoneSplit=\"50\" crs:ParametricHighlightSplit=\"75\" crs:SharpenRadius=\"+1.0\" crs:SharpenDetail=\"25\" crs:SharpenEdgeMasking=\"0\" crs:PostCropVignetteAmount=\"0\" crs:GrainAmount=\"0\" crs:ColorNoiseReductionDetail=\"50\" crs:LensProfileEnable=\"0\" crs:LensManualDistortionAmount=\"0\" crs:PerspectiveVertical=\"0\" crs:PerspectiveHorizontal=\"0\" crs:PerspectiveRotate=\"0.0\" crs:PerspectiveScale=\"100\" crs:ConvertToGrayscale=\"False\" crs:ToneCurveName=\"Medium Contrast\" crs:CameraProfile=\"Adobe Standard\" crs:CameraProfileDigest=\"3DA8CE4A626CE36A1D0C55BF157793C9\" crs:LensProfileSetup=\"LensDefaults\" crs:HasSettings=\"True\" crs:HasCrop=\"False\" crs:AlreadyApplied=\"True\" photoshop:DateCreated=\"2008-11-04T00:38:20.069\" photoshop:LegacyIPTCDigest=\"39ABECFF58B2A74044031CD131BFCD51\" photoshop:ColorMode=\"1\" photoshop:ICCProfile=\"Dot Gain 20%\" dc:format=\"image/jpeg\" xmpMM:InstanceID=\"xmp.iid:939C3F5F7EB0E111912187567847C567\" xmpMM:DocumentID=\"xmp.did:CED6BE23A0AFE11188A8ACBF7294711A\" xmpMM:OriginalDocumentID=\"xmp.did:CED6BE23A0AFE11188A8ACBF7294711A\" tiff:ImageWidth=\"5616\" tiff:ImageLength=\"3744\" tiff:PhotometricInterpretation=\"2\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"3\" tiff:XResolution=\"2400000/10000\" tiff:YResolution=\"2400000/10000\" tiff:ResolutionUnit=\"2\" tiff:Make=\"Canon\" tiff:Model=\"Canon EOS 5D Mark II\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"3612\" exif:PixelYDimension=\"2408\" exif:ExposureTime=\"1/30\" exif:FNumber=\"28/10\" exif:ExposureProgram=\"2\" exif:ShutterSpeedValue=\"4906891/1000000\" exif:ApertureValue=\"2970854/1000000\" exif:ExposureBiasValue=\"0/1\" exif:MaxApertureValue=\"3/1\" exif:SubjectDistance=\"31/100\" exif:MeteringMode=\"5\" exif:FocalLength=\"35/1\" exif:FocalPlaneXResolution=\"5616000/1459\" exif:FocalPlaneYResolution=\"3744000/958\" exif:FocalPlaneResolutionUnit=\"2\" exif:CustomRendered=\"0\" exif:ExposureMode=\"0\" exif:WhiteBalance=\"0\" exif:SceneCaptureType=\"0\" exif:DateTimeOriginal=\"2008-11-04T00:38:20.69\" exif:ExifVersion=\"0221\"> <crs:ToneCurve> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>32, 22</rdf:li> <rdf:li>64, 56</rdf:li> <rdf:li>128, 128</rdf:li> <rdf:li>192, 196</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurve> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:CED6BE23A0AFE11188A8ACBF7294711A\" stEvt:when=\"2012-06-06T14:23:32+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:939C3F5F7EB0E111912187567847C567\" stEvt:when=\"2012-06-07T16:54:20+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> <exif:ISOSpeedRatings> <rdf:Seq> <rdf:li>2500</rdf:li> </rdf:Seq> </exif:ISOSpeedRatings> <exif:Flash exif:Fired=\"False\" exif:Return=\"0\" exif:Mode=\"2\" exif:Function=\"False\" exif:RedEyeMode=\"False\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0035() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/JPG/color_gray/DuckyGray.jpg";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpRights=\"http://ns.adobe.com/xap/1.0/rights/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreatorTool=\"Adobe Photoshop CS5.1 Windows\" xmp:CreateDate=\"2012-06-06T16:26:49+08:00\" xmp:ModifyDate=\"2012-06-06T16:28:27+08:00\" xmp:MetadataDate=\"2012-06-06T16:28:27+08:00\" dc:format=\"image/jpeg\" photoshop:ColorMode=\"1\" photoshop:ICCProfile=\"Dot Gain 20%\" xmpRights:Marked=\"True\" xmpMM:InstanceID=\"xmp.iid:FF93E983B1AFE111A599EBF57614AD79\" xmpMM:DocumentID=\"xmp.did:FE93E983B1AFE111A599EBF57614AD79\" xmpMM:OriginalDocumentID=\"xmp.did:FE93E983B1AFE111A599EBF57614AD79\" tiff:Orientation=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"500\" exif:PixelYDimension=\"546\"> <dc:rights> <rdf:Alt> <rdf:li xml:lang=\"x-default\">(c) EyeWire, Inc.</rdf:li> </rdf:Alt> </dc:rights> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:FE93E983B1AFE111A599EBF57614AD79\" stEvt:when=\"2012-06-06T16:26:49+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from application/vnd.adobe.photoshop to image/jpeg\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:FF93E983B1AFE111A599EBF57614AD79\" stEvt:when=\"2012-06-06T16:28:27+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0036() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_indexed/AvrilPoster.png";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0037() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_1/Untitled-2.png";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0038() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_grayA/f1.png";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0039() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGB/0204bugdel2Chateau.png";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0040() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_gray/grayshirt.png";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0041() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_8/0204bugdel220010001-1.png";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0042() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/color_RGBA/107.png";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0043() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/PNG/bits_16/1.png";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0044() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/Palm.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmpMM:DocumentID=\"adobe:docid:photoshop:16e58120-49ba-11d6-b5df-c96fb51277dc\" xmpMM:InstanceID=\"uuid:c8835315-980c-11da-99ee-a21d107e5cb0\" tiff:ImageWidth=\"421\" tiff:ImageLength=\"640\" tiff:Compression=\"5\" tiff:PhotometricInterpretation=\"5\" tiff:SamplesPerPixel=\"4\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" xmp:CreatorTool=\"Adobe Photoshop 7.0\" xmp:ModifyDate=\"2006-02-07T11:25:22\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"421\" exif:PixelYDimension=\"640\"> <dc:description> <rdf:Alt> <rdf:li xml:lang=\"x-default\">D17033</rdf:li> </rdf:Alt> </dc:description> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0045() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYK/non_colorprofile_Palm.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpRights=\"http://ns.adobe.com/xap/1.0/rights/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmpMM:DocumentID=\"adobe:docid:photoshop:16e58120-49ba-11d6-b5df-c96fb51277dc\" xmpMM:InstanceID=\"xmp.iid:E459435D89B0E111960B89BE6C132790\" xmpMM:OriginalDocumentID=\"adobe:docid:photoshop:16e58120-49ba-11d6-b5df-c96fb51277dc\" dc:format=\"image/tiff\" xmp:ModifyDate=\"2012-06-07T18:13:01+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS5.1 Windows\" xmp:CreateDate=\"2012-06-07T09:55:59+08:00\" xmp:MetadataDate=\"2012-06-07T18:13:01+08:00\" photoshop:ColorMode=\"4\" xmpRights:Marked=\"False\" tiff:ImageWidth=\"421\" tiff:ImageLength=\"640\" tiff:Compression=\"5\" tiff:PhotometricInterpretation=\"5\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"4\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"421\" exif:PixelYDimension=\"640\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:E359435D89B0E111960B89BE6C132790\" stEvt:when=\"2012-06-07T18:13:01+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:E459435D89B0E111960B89BE6C132790\" stEvt:when=\"2012-06-07T18:13:01+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS5.1 Windows\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <dc:description> <rdf:Alt> <rdf:li xml:lang=\"x-default\">D17033</rdf:li> </rdf:Alt> </dc:description> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0046() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_LZW/Palm-lzw.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmpMM:DocumentID=\"adobe:docid:photoshop:16e58120-49ba-11d6-b5df-c96fb51277dc\" xmpMM:InstanceID=\"uuid:c8835315-980c-11da-99ee-a21d107e5cb0\" tiff:ImageWidth=\"421\" tiff:ImageLength=\"640\" tiff:Compression=\"5\" tiff:PhotometricInterpretation=\"5\" tiff:SamplesPerPixel=\"4\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" xmp:CreatorTool=\"Adobe Photoshop 7.0\" xmp:ModifyDate=\"2006-02-07T11:25:22\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"421\" exif:PixelYDimension=\"640\"> <dc:description> <rdf:Alt> <rdf:li xml:lang=\"x-default\">D17033</rdf:li> </rdf:Alt> </dc:description> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0047() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_indexed/f4-tif.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreateDate=\"2012-06-06T14:53:13+08:00\" xmp:ModifyDate=\"2012-06-06T14:55:10+08:00\" xmp:MetadataDate=\"2012-06-06T14:55:10+08:00\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" dc:format=\"image/tiff\" photoshop:ColorMode=\"2\" xmpMM:InstanceID=\"xmp.iid:14ED318FA4AFE111BA3ED26E40F1C193\" xmpMM:DocumentID=\"xmp.did:14ED318FA4AFE111BA3ED26E40F1C193\" xmpMM:OriginalDocumentID=\"xmp.did:14ED318FA4AFE111BA3ED26E40F1C193\" tiff:ImageWidth=\"400\" tiff:ImageLength=\"400\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"3\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"400\" exif:PixelYDimension=\"400\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:14ED318FA4AFE111BA3ED26E40F1C193\" stEvt:when=\"2012-06-06T14:53:13+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0048() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_Packbits/PIG.TIF";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" tiff:ImageWidth=\"813\" tiff:ImageLength=\"559\" tiff:Compression=\"32773\" tiff:PhotometricInterpretation=\"3\" tiff:SamplesPerPixel=\"1\" tiff:XResolution=\"300/1\" tiff:YResolution=\"300/1\" tiff:ResolutionUnit=\"2\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0049() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_CMYKA/f4.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" tiff:ImageWidth=\"400\" tiff:ImageLength=\"400\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"5\" tiff:SamplesPerPixel=\"5\" tiff:XResolution=\"1207959552/16777216\" tiff:YResolution=\"1207959552/16777216\" tiff:ResolutionUnit=\"2\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0050() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_1/xx.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" xmp:CreateDate=\"2012-06-06T15:11:48+08:00\" xmp:MetadataDate=\"2012-06-06T15:13:29+08:00\" xmp:ModifyDate=\"2012-06-06T15:13:29+08:00\" dc:format=\"image/tiff\" xmpMM:InstanceID=\"xmp.iid:480AF41DA7AFE111BFFAD9810D633D04\" xmpMM:DocumentID=\"xmp.did:5ABEDFE1A6AFE1119F8886F154D51F53\" xmpMM:OriginalDocumentID=\"xmp.did:5ABEDFE1A6AFE1119F8886F154D51F53\" photoshop:ColorMode=\"0\" tiff:ImageWidth=\"504\" tiff:ImageLength=\"360\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"0\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"1\" tiff:XResolution=\"720000/10000\" tiff:YResolution=\"720000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"504\" exif:PixelYDimension=\"360\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:5ABEDFE1A6AFE1119F8886F154D51F53\" stEvt:when=\"2012-06-06T15:11:48+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:480AF41DA7AFE111BFFAD9810D633D04\" stEvt:when=\"2012-06-06T15:13:29+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Windows)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>1</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0051() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_grayA/f4.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" tiff:ImageWidth=\"400\" tiff:ImageLength=\"400\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"1\" tiff:SamplesPerPixel=\"2\" tiff:XResolution=\"1207959552/16777216\" tiff:YResolution=\"1207959552/16777216\" tiff:ResolutionUnit=\"2\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0052() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG3/xg3.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" tiff:ImageWidth=\"504\" tiff:ImageLength=\"360\" tiff:Compression=\"3\" tiff:PhotometricInterpretation=\"0\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"1\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"1207959552/16777216\" tiff:YResolution=\"1207959552/16777216\" tiff:ResolutionUnit=\"2\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" xmp:ModifyDate=\"2012-06-06T15:13:29\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>1</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0053() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTRLE/f4-tif-rle.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" tiff:ImageWidth=\"400\" tiff:ImageLength=\"400\" tiff:Compression=\"2\" tiff:PhotometricInterpretation=\"1\" tiff:SamplesPerPixel=\"1\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"72/1\" tiff:YResolution=\"72/1\" tiff:ResolutionUnit=\"2\" xmp:CreatorTool=\"Created by fCoder Graphics Processor\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>1</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0054() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGB/xTIFp_mode_RGB08.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" tiff:ImageWidth=\"1200\" tiff:ImageLength=\"560\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"2\" tiff:SamplesPerPixel=\"3\" tiff:XResolution=\"301989888/2097152\" tiff:YResolution=\"301989888/2097152\" tiff:ResolutionUnit=\"2\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0055() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_CCITTG4/xg4.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" tiff:ImageWidth=\"504\" tiff:ImageLength=\"360\" tiff:Compression=\"4\" tiff:PhotometricInterpretation=\"0\" tiff:Orientation=\"1\" tiff:SamplesPerPixel=\"1\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"1207959552/16777216\" tiff:YResolution=\"1207959552/16777216\" tiff:ResolutionUnit=\"2\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Windows)\" xmp:ModifyDate=\"2012-06-06T15:13:29\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>1</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0056() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_gray/em.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" xmpMM:DocumentID=\"adobe:docid:photoshop:4eddc222-aa6d-11db-beb3-bb09e4c91f39\" xmpMM:InstanceID=\"uuid:4eddc228-aa6d-11db-beb3-bb09e4c91f39\" tiff:ImageWidth=\"1200\" tiff:ImageLength=\"560\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"1\" tiff:SamplesPerPixel=\"1\" tiff:XResolution=\"1440000/10000\" tiff:YResolution=\"1440000/10000\" tiff:ResolutionUnit=\"2\" xmp:CreatorTool=\"Adobe Photoshop 7.0\" xmp:ModifyDate=\"2007-01-22T15:08:45\" exif:ColorSpace=\"65535\" exif:PixelXDimension=\"1200\" exif:PixelYDimension=\"560\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0057() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_8/xTIFp_mode_RGB08.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" tiff:ImageWidth=\"1200\" tiff:ImageLength=\"560\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"2\" tiff:SamplesPerPixel=\"3\" tiff:XResolution=\"301989888/2097152\" tiff:YResolution=\"301989888/2097152\" tiff:ResolutionUnit=\"2\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0058() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_uncompressed/01STCOGA.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" tiff:ImageWidth=\"3110\" tiff:ImageLength=\"2441\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"5\" tiff:SamplesPerPixel=\"4\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"3050670/10000\" tiff:YResolution=\"3050670/10000\" tiff:ResolutionUnit=\"2\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0059() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/color_RGBA/s7logo.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" photoshop:History=\"2004-02-27T13:54:18-08:00&#x9;File Untitled-1 opened&#xA;\" xmp:CreateDate=\"2004-02-27T13:54:29-08:00\" xmp:ModifyDate=\"2004-02-27T13:54:29-08:00\" xmp:MetadataDate=\"2004-02-27T13:54:29-08:00\" xmp:CreatorTool=\"Adobe Photoshop CS Windows\" xmpMM:DocumentID=\"adobe:docid:photoshop:7e1f117e-696f-11d8-ab16-8af063677b84\" xmpMM:InstanceID=\"uuid:7e1f117f-696f-11d8-ab16-8af063677b84\" dc:format=\"image/tiff\" tiff:ImageWidth=\"300\" tiff:ImageLength=\"300\" tiff:Compression=\"5\" tiff:PhotometricInterpretation=\"2\" tiff:SamplesPerPixel=\"4\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"3048000/10000\" tiff:YResolution=\"3048000/10000\" tiff:ResolutionUnit=\"2\" exif:ColorSpace=\"1\" exif:PixelXDimension=\"300\" exif:PixelYDimension=\"300\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0060() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_JPEG/squareBkg.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" tiff:ImageWidth=\"512\" tiff:ImageLength=\"512\" tiff:Compression=\"7\" tiff:PhotometricInterpretation=\"6\" tiff:SamplesPerPixel=\"3\" tiff:XResolution=\"1208110547/16777216\" tiff:YResolution=\"1208110547/16777216\" tiff:ResolutionUnit=\"2\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0061() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/bits_16/xTIFp_mode_RGB16.tif";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" tiff:ImageWidth=\"1200\" tiff:ImageLength=\"560\" tiff:Compression=\"1\" tiff:PhotometricInterpretation=\"2\" tiff:SamplesPerPixel=\"3\" tiff:XResolution=\"301989888/2097152\" tiff:YResolution=\"301989888/2097152\" tiff:ResolutionUnit=\"2\"> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>16</rdf:li> <rdf:li>16</rdf:li> <rdf:li>16</rdf:li> </rdf:Seq> </tiff:BitsPerSample> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0062() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/TIF/compression_ZIP/1dsMarkIII.TIF";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:aux=\"http://ns.adobe.com/exif/1.0/aux/\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:crs=\"http://ns.adobe.com/camera-raw-settings/1.0/\" xmlns:tiff=\"http://ns.adobe.com/tiff/1.0/\" xmlns:exif=\"http://ns.adobe.com/exif/1.0/\" aux:SerialNumber=\"600048\" aux:LensInfo=\"70/1 200/1 0/0 0/0\" aux:Lens=\"EF70-200mm f/2.8L IS USM\" aux:LensID=\"224\" aux:ImageNumber=\"0\" aux:ApproximateFocusDistance=\"240/100\" aux:FlashCompensation=\"0/1\" aux:Firmware=\"2.0.1\" xmp:ModifyDate=\"2012-06-06T14:08:27+08:00\" xmp:CreateDate=\"2007-09-12T06:06:50.00\" xmp:CreatorTool=\"Adobe Photoshop Camera Raw 7.0 (Windows)\" xmp:MetadataDate=\"2012-06-06T14:08:27+08:00\" photoshop:DateCreated=\"2007-09-12T06:06:50.00\" xmpMM:DocumentID=\"xmp.did:207FEA079EAFE1119086B75D170FF0A1\" xmpMM:OriginalDocumentID=\"9C2352B54A9290643B72B5E3A868FB39\" xmpMM:InstanceID=\"xmp.iid:207FEA079EAFE1119086B75D170FF0A1\" dc:format=\"image/tiff\" crs:RawFileName=\"1dsMarkIII.CR2\" crs:Version=\"7.0\" crs:ProcessVersion=\"6.7\" crs:WhiteBalance=\"As Shot\" crs:Temperature=\"3900\" crs:Tint=\"+15\" crs:Exposure=\"0.00\" crs:Shadows=\"5\" crs:Brightness=\"+50\" crs:Contrast=\"+25\" crs:Saturation=\"0\" crs:Sharpness=\"25\" crs:LuminanceSmoothing=\"0\" crs:ColorNoiseReduction=\"25\" crs:VignetteAmount=\"0\" crs:ShadowTint=\"0\" crs:RedHue=\"0\" crs:RedSaturation=\"0\" crs:GreenHue=\"0\" crs:GreenSaturation=\"0\" crs:BlueHue=\"0\" crs:BlueSaturation=\"0\" crs:FillLight=\"0\" crs:Vibrance=\"0\" crs:HighlightRecovery=\"0\" crs:Clarity=\"0\" crs:Defringe=\"0\" crs:HueAdjustmentRed=\"0\" crs:HueAdjustmentOrange=\"0\" crs:HueAdjustmentYellow=\"0\" crs:HueAdjustmentGreen=\"0\" crs:HueAdjustmentAqua=\"0\" crs:HueAdjustmentBlue=\"0\" crs:HueAdjustmentPurple=\"0\" crs:HueAdjustmentMagenta=\"0\" crs:SaturationAdjustmentRed=\"0\" crs:SaturationAdjustmentOrange=\"0\" crs:SaturationAdjustmentYellow=\"0\" crs:SaturationAdjustmentGreen=\"0\" crs:SaturationAdjustmentAqua=\"0\" crs:SaturationAdjustmentBlue=\"0\" crs:SaturationAdjustmentPurple=\"0\" crs:SaturationAdjustmentMagenta=\"0\" crs:LuminanceAdjustmentRed=\"0\" crs:LuminanceAdjustmentOrange=\"0\" crs:LuminanceAdjustmentYellow=\"0\" crs:LuminanceAdjustmentGreen=\"0\" crs:LuminanceAdjustmentAqua=\"0\" crs:LuminanceAdjustmentBlue=\"0\" crs:LuminanceAdjustmentPurple=\"0\" crs:LuminanceAdjustmentMagenta=\"0\" crs:SplitToningShadowHue=\"0\" crs:SplitToningShadowSaturation=\"0\" crs:SplitToningHighlightHue=\"0\" crs:SplitToningHighlightSaturation=\"0\" crs:SplitToningBalance=\"0\" crs:ParametricShadows=\"0\" crs:ParametricDarks=\"0\" crs:ParametricLights=\"0\" crs:ParametricHighlights=\"0\" crs:ParametricShadowSplit=\"25\" crs:ParametricMidtoneSplit=\"50\" crs:ParametricHighlightSplit=\"75\" crs:SharpenRadius=\"+1.0\" crs:SharpenDetail=\"25\" crs:SharpenEdgeMasking=\"0\" crs:PostCropVignetteAmount=\"0\" crs:GrainAmount=\"0\" crs:ColorNoiseReductionDetail=\"50\" crs:LensProfileEnable=\"0\" crs:LensManualDistortionAmount=\"0\" crs:PerspectiveVertical=\"0\" crs:PerspectiveHorizontal=\"0\" crs:PerspectiveRotate=\"0.0\" crs:PerspectiveScale=\"100\" crs:AutoLateralCA=\"0\" crs:Exposure2012=\"0.00\" crs:Contrast2012=\"0\" crs:Highlights2012=\"0\" crs:Shadows2012=\"0\" crs:Whites2012=\"0\" crs:Blacks2012=\"0\" crs:Clarity2012=\"0\" crs:ConvertToGrayscale=\"False\" crs:ToneCurveName=\"Medium Contrast\" crs:ToneCurveName2012=\"Linear\" crs:CameraProfile=\"Adobe Standard\" crs:CameraProfileDigest=\"930647FC2CF206CCA2485C59E64AA8FA\" crs:LensProfileSetup=\"LensDefaults\" crs:HasSettings=\"True\" crs:HasCrop=\"False\" crs:AlreadyApplied=\"True\" tiff:ImageWidth=\"5616\" tiff:ImageLength=\"3744\" tiff:Compression=\"8\" tiff:PhotometricInterpretation=\"2\" tiff:SamplesPerPixel=\"3\" tiff:PlanarConfiguration=\"1\" tiff:XResolution=\"240/1\" tiff:YResolution=\"240/1\" tiff:ResolutionUnit=\"2\" tiff:Make=\"Canon\" tiff:Model=\"Canon EOS K215\" exif:ExposureTime=\"1/25\" exif:FNumber=\"28/10\" exif:ExposureProgram=\"3\" exif:ShutterSpeedValue=\"4643856/1000000\" exif:ApertureValue=\"2970854/1000000\" exif:ExposureBiasValue=\"0/1\" exif:MaxApertureValue=\"3/1\" exif:MeteringMode=\"5\" exif:FocalLength=\"200/1\" exif:FocalPlaneXResolution=\"5616000/1419\" exif:FocalPlaneYResolution=\"3744000/945\" exif:FocalPlaneResolutionUnit=\"2\" exif:CustomRendered=\"0\" exif:ExposureMode=\"0\" exif:WhiteBalance=\"0\" exif:SceneCaptureType=\"0\" exif:DateTimeOriginal=\"2007-09-12T06:06:50\" exif:ExifVersion=\"0230\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"derived\" stEvt:parameters=\"converted from image/x-canon-cr2 to image/tiff, saved to new location\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:207FEA079EAFE1119086B75D170FF0A1\" stEvt:when=\"2012-06-06T14:08:27+08:00\" stEvt:softwareAgent=\"Adobe Photoshop Camera Raw 7.0 (Windows)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <xmpMM:DerivedFrom stRef:documentID=\"9C2352B54A9290643B72B5E3A868FB39\" stRef:originalDocumentID=\"9C2352B54A9290643B72B5E3A868FB39\"/> <crs:ToneCurve> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>32, 22</rdf:li> <rdf:li>64, 56</rdf:li> <rdf:li>128, 128</rdf:li> <rdf:li>192, 196</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurve> <crs:ToneCurveRed> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurveRed> <crs:ToneCurveGreen> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurveGreen> <crs:ToneCurveBlue> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurveBlue> <crs:ToneCurvePV2012> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurvePV2012> <crs:ToneCurvePV2012Red> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurvePV2012Red> <crs:ToneCurvePV2012Green> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurvePV2012Green> <crs:ToneCurvePV2012Blue> <rdf:Seq> <rdf:li>0, 0</rdf:li> <rdf:li>255, 255</rdf:li> </rdf:Seq> </crs:ToneCurvePV2012Blue> <tiff:BitsPerSample> <rdf:Seq> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> <rdf:li>8</rdf:li> </rdf:Seq> </tiff:BitsPerSample> <exif:ISOSpeedRatings> <rdf:Seq> <rdf:li>100</rdf:li> </rdf:Seq> </exif:ISOSpeedRatings> <exif:Flash exif:Fired=\"False\" exif:Return=\"0\" exif:Mode=\"0\" exif:Function=\"False\" exif:RedEyeMode=\"False\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0063() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/compression_LZW/Flower_LZW.gif";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0064() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/GIF/color_index/Flower_Index.gif";
		String xmpcontent  = getXmpInfo(srcFile);
		assertTrue("No xmp result", "".equals(xmpcontent));
	}

	@Test
	public void testXMP_0065() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_CMYK/PixelType_CMYK.eps";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Macintosh)\" xmp:CreateDate=\"2012-06-06T08:53:31+08:00\" xmp:ModifyDate=\"2012-06-06T13:43+08:00\" xmp:MetadataDate=\"2012-06-06T13:43+08:00\" dc:format=\"image/epsf\" photoshop:ColorMode=\"4\" photoshop:ICCProfile=\"U.S. Web Coated (SWOP) v2\" xmpMM:InstanceID=\"xmp.iid:C386FDC51A2068118083C1B613A40337\" xmpMM:DocumentID=\"xmp.did:C286FDC51A2068118083C1B613A40337\" xmpMM:OriginalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:C086FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T08:53:31+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/bmp to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:C186FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:37:05+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/epsf to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:C286FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:43+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"derived\" stEvt:parameters=\"converted from application/vnd.adobe.photoshop to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:C386FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:43+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <xmpMM:DerivedFrom stRef:instanceID=\"xmp.iid:C286FDC51A2068118083C1B613A40337\" stRef:documentID=\"xmp.did:C286FDC51A2068118083C1B613A40337\" stRef:originalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0066() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII/ASCII.eps";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Macintosh)\" xmp:CreateDate=\"2012-06-06T08:53:31+08:00\" xmp:ModifyDate=\"2012-06-06T13:50:29+08:00\" xmp:MetadataDate=\"2012-06-06T13:50:29+08:00\" dc:format=\"image/epsf\" photoshop:ColorMode=\"4\" photoshop:ICCProfile=\"U.S. Web Coated (SWOP) v2\" xmpMM:InstanceID=\"xmp.iid:96EC98CF1C2068118083C1B613A40337\" xmpMM:DocumentID=\"xmp.did:95EC98CF1C2068118083C1B613A40337\" xmpMM:OriginalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:C086FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T08:53:31+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/bmp to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:C186FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:37:05+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/epsf to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:95EC98CF1C2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:50:29+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"derived\" stEvt:parameters=\"converted from application/vnd.adobe.photoshop to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:96EC98CF1C2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:50:29+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <xmpMM:DerivedFrom stRef:instanceID=\"xmp.iid:95EC98CF1C2068118083C1B613A40337\" stRef:documentID=\"xmp.did:95EC98CF1C2068118083C1B613A40337\" stRef:originalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0067() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_ASCII85/ASCII85.eps";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Macintosh)\" xmp:CreateDate=\"2012-06-06T08:53:31+08:00\" xmp:ModifyDate=\"2012-06-06T13:50:11+08:00\" xmp:MetadataDate=\"2012-06-06T13:50:11+08:00\" dc:format=\"image/epsf\" photoshop:ColorMode=\"4\" photoshop:ICCProfile=\"U.S. Web Coated (SWOP) v2\" xmpMM:InstanceID=\"xmp.iid:94EC98CF1C2068118083C1B613A40337\" xmpMM:DocumentID=\"xmp.did:93EC98CF1C2068118083C1B613A40337\" xmpMM:OriginalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:C086FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T08:53:31+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/bmp to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:C186FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:37:05+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/epsf to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:93EC98CF1C2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:50:11+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"derived\" stEvt:parameters=\"converted from application/vnd.adobe.photoshop to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:94EC98CF1C2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:50:11+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <xmpMM:DerivedFrom stRef:instanceID=\"xmp.iid:93EC98CF1C2068118083C1B613A40337\" stRef:documentID=\"xmp.did:93EC98CF1C2068118083C1B613A40337\" stRef:originalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0068() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_RGB/PixelType_RGB.eps";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Macintosh)\" xmp:CreateDate=\"2012-06-06T08:53:31+08:00\" xmp:ModifyDate=\"2012-06-06T13:44:34+08:00\" xmp:MetadataDate=\"2012-06-06T13:44:34+08:00\" dc:format=\"image/epsf\" photoshop:ColorMode=\"3\" photoshop:ICCProfile=\"sRGB IEC61966-2.1\" xmpMM:InstanceID=\"xmp.iid:8EEC98CF1C2068118083C1B613A40337\" xmpMM:DocumentID=\"xmp.did:8DEC98CF1C2068118083C1B613A40337\" xmpMM:OriginalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:C086FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T08:53:31+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/bmp to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:C186FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:37:05+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/epsf to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:8DEC98CF1C2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:44:34+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"derived\" stEvt:parameters=\"converted from application/vnd.adobe.photoshop to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:8EEC98CF1C2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:44:34+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <xmpMM:DerivedFrom stRef:instanceID=\"xmp.iid:8DEC98CF1C2068118083C1B613A40337\" stRef:documentID=\"xmp.did:8DEC98CF1C2068118083C1B613A40337\" stRef:originalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0069() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/color_gray/PixelType_gray.eps";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Macintosh)\" xmp:CreateDate=\"2012-06-06T08:53:31+08:00\" xmp:ModifyDate=\"2012-06-06T13:46:22+08:00\" xmp:MetadataDate=\"2012-06-06T13:46:22+08:00\" dc:format=\"image/epsf\" photoshop:ColorMode=\"1\" photoshop:ICCProfile=\"Dot Gain 20%\" xmpMM:InstanceID=\"xmp.iid:90EC98CF1C2068118083C1B613A40337\" xmpMM:DocumentID=\"xmp.did:8FEC98CF1C2068118083C1B613A40337\" xmpMM:OriginalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:C086FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T08:53:31+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/bmp to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:C186FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:37:05+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/epsf to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:8FEC98CF1C2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:46:22+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"derived\" stEvt:parameters=\"converted from application/vnd.adobe.photoshop to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:90EC98CF1C2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:46:22+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <xmpMM:DerivedFrom stRef:instanceID=\"xmp.iid:8FEC98CF1C2068118083C1B613A40337\" stRef:documentID=\"xmp.did:8FEC98CF1C2068118083C1B613A40337\" stRef:originalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0070() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_JPEG/JPEG.eps";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Macintosh)\" xmp:CreateDate=\"2012-06-06T08:53:31+08:00\" xmp:ModifyDate=\"2012-06-06T13:51:18+08:00\" xmp:MetadataDate=\"2012-06-06T13:51:18+08:00\" dc:format=\"image/epsf\" photoshop:ColorMode=\"4\" photoshop:ICCProfile=\"U.S. Web Coated (SWOP) v2\" xmpMM:InstanceID=\"xmp.iid:E1F1DCB71D2068118083C1B613A40337\" xmpMM:DocumentID=\"xmp.did:E0F1DCB71D2068118083C1B613A40337\" xmpMM:OriginalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:C086FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T08:53:31+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/bmp to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:C186FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:37:05+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/epsf to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:E0F1DCB71D2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:51:18+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"derived\" stEvt:parameters=\"converted from application/vnd.adobe.photoshop to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:E1F1DCB71D2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:51:18+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <xmpMM:DerivedFrom stRef:instanceID=\"xmp.iid:E0F1DCB71D2068118083C1B613A40337\" stRef:documentID=\"xmp.did:E0F1DCB71D2068118083C1B613A40337\" stRef:originalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
	}

	@Test
	public void testXMP_0071() throws Exception {
		String srcFile = "/mnt/sjshare/automation_assets_sync/IC_images/junit/src/All/EPS/compression_Binary/Binary.eps";
		String xmpcontent  = getXmpInfo(srcFile);
		String xmpExpect   = " <rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"> <rdf:Description rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:photoshop=\"http://ns.adobe.com/photoshop/1.0/\" xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\" xmlns:stEvt=\"http://ns.adobe.com/xap/1.0/sType/ResourceEvent#\" xmlns:stRef=\"http://ns.adobe.com/xap/1.0/sType/ResourceRef#\" xmp:CreatorTool=\"Adobe Photoshop CS6 (Macintosh)\" xmp:CreateDate=\"2012-06-06T08:53:31+08:00\" xmp:ModifyDate=\"2012-06-06T13:51:03+08:00\" xmp:MetadataDate=\"2012-06-06T13:51:03+08:00\" dc:format=\"image/epsf\" photoshop:ColorMode=\"4\" photoshop:ICCProfile=\"U.S. Web Coated (SWOP) v2\" xmpMM:InstanceID=\"xmp.iid:DFF1DCB71D2068118083C1B613A40337\" xmpMM:DocumentID=\"xmp.did:DEF1DCB71D2068118083C1B613A40337\" xmpMM:OriginalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"> <xmpMM:History> <rdf:Seq> <rdf:li stEvt:action=\"created\" stEvt:instanceID=\"xmp.iid:C086FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T08:53:31+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/bmp to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:C186FDC51A2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:37:05+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"converted\" stEvt:parameters=\"from image/epsf to application/vnd.adobe.photoshop\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:DEF1DCB71D2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:51:03+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> <rdf:li stEvt:action=\"derived\" stEvt:parameters=\"converted from application/vnd.adobe.photoshop to image/epsf\"/> <rdf:li stEvt:action=\"saved\" stEvt:instanceID=\"xmp.iid:DFF1DCB71D2068118083C1B613A40337\" stEvt:when=\"2012-06-06T13:51:03+08:00\" stEvt:softwareAgent=\"Adobe Photoshop CS6 (Macintosh)\" stEvt:changed=\"/\"/> </rdf:Seq> </xmpMM:History> <xmpMM:DerivedFrom stRef:instanceID=\"xmp.iid:DEF1DCB71D2068118083C1B613A40337\" stRef:documentID=\"xmp.did:DEF1DCB71D2068118083C1B613A40337\" stRef:originalDocumentID=\"xmp.did:C086FDC51A2068118083C1B613A40337\"/> </rdf:Description> </rdf:RDF>";
		assertXMLEqual("Compare xmp info result", xmpExpect, xmpcontent);
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
	public String getXmpInfo(String srcFile) {
		try {
			String xmpfile = TMP_INFOFILE + "/result_xmp.xml";
			String cmd = CMD_IMAGEINFO + " -xmpfile " + xmpfile + " " + srcFile;
			Process p = Runtime.getRuntime().exec(cmd);
			String line = null;
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			while ((line = stdError.readLine()) != null) {
				System.out.println("Error: returned: \n" + line);
			}
			BufferedReader in = new BufferedReader(new FileReader(xmpfile));
			String xmpcontent = "";
			for (int i = 0; (line = in.readLine()) != null; i++) {
				if (i != 0) {
					xmpcontent += line;
				}
			}
			xmpcontent = xmpcontent.replaceAll("</x:xmpmeta>","").replaceAll("\\s+|\\t+", " ");
			File file = new File(xmpfile);
			file.delete();
			return xmpcontent;
		} catch (Exception e) {
			System.out.println( e.getMessage() );
			return "error";
		}
	}
}
