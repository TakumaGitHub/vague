package com.internousdev.vague.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.vague.dto.CartDTO;

public class CartDTOTest {
	// get ProductId test
		@Test
		public void testGetProductId1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductId5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set ProductId test
		@Test
		public void testSetProductId1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductId5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetProductName
		@Test
		public void testGetProductName1() {
			CartDTO dto = new CartDTO();
			String expected = "0";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName2() {
			CartDTO dto = new CartDTO();
			String expected = "2147483647";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName3() {
			CartDTO dto = new CartDTO();
			String expected = "-2147483647";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName4() {
			CartDTO dto = new CartDTO();
			String expected = "null";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName5() {
			CartDTO dto = new CartDTO();
			String expected = "";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName6() {
			CartDTO dto = new CartDTO();
			String expected = " ";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName7() {
			CartDTO dto = new CartDTO();
			String expected = "　";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName8() {
			CartDTO dto = new CartDTO();
			String expected = "abc123";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName9() {
			CartDTO dto = new CartDTO();
			String expected = "あいう１２３";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName10() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName11() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName12() {
			CartDTO dto = new CartDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		//set ProductName test
		@Test
		public void testSetProductName1() {
			CartDTO dto = new CartDTO();
			String expected="0";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName2() {
			CartDTO dto = new CartDTO();
			String expected="2147483647";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName3() {
			CartDTO dto = new CartDTO();
			String expected="-2147483647";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName4() {
			CartDTO dto = new CartDTO();
			String expected="null";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName5() {
			CartDTO dto = new CartDTO();
			String expected="";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName6() {
			CartDTO dto = new CartDTO();
			String expected=" ";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName7() {
			CartDTO dto = new CartDTO();
			String expected="　";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName8() {
			CartDTO dto = new CartDTO();
			String expected="abc123";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName9() {
			CartDTO dto = new CartDTO();
			String expected="あいう１２３";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName10() {
			CartDTO dto = new CartDTO();
			String expected="abc123あいう１２３";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName11() {
			CartDTO dto = new CartDTO();
			String expected="abcあいう１２３漢字";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName12() {
			CartDTO dto = new CartDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
	//GetProductNameKana
		@Test
		public void testGetProductNameKana1() {
			CartDTO dto = new CartDTO();
			String expected = "0";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana2() {
			CartDTO dto = new CartDTO();
			String expected = "2147483647";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana3() {
			CartDTO dto = new CartDTO();
			String expected = "-2147483647";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana4() {
			CartDTO dto = new CartDTO();
			String expected = "null";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana5() {
			CartDTO dto = new CartDTO();
			String expected = "";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana6() {
			CartDTO dto = new CartDTO();
			String expected = " ";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana7() {
			CartDTO dto = new CartDTO();
			String expected = "　";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana8() {
			CartDTO dto = new CartDTO();
			String expected = "abc123";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana9() {
			CartDTO dto = new CartDTO();
			String expected = "あいう１２３";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana10() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana11() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana12() {
			CartDTO dto = new CartDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}

		//set ProductNameKana test
		@Test
		public void testSetProductNameKana1() {
			CartDTO dto = new CartDTO();
			String expected="0";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana2() {
			CartDTO dto = new CartDTO();
			String expected="2147483647";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana3() {
			CartDTO dto = new CartDTO();
			String expected="-2147483647";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana4() {
			CartDTO dto = new CartDTO();
			String expected="null";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana5() {
			CartDTO dto = new CartDTO();
			String expected="";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana6() {
			CartDTO dto = new CartDTO();
			String expected=" ";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana7() {
			CartDTO dto = new CartDTO();
			String expected="　";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana8() {
			CartDTO dto = new CartDTO();
			String expected="abc123";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana9() {
			CartDTO dto = new CartDTO();
			String expected="あいう１２３";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana10() {
			CartDTO dto = new CartDTO();
			String expected="abc123あいう１２３";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana11() {
			CartDTO dto = new CartDTO();
			String expected="abcあいう１２３漢字";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana12() {
			CartDTO dto = new CartDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
	//GetImageFilePath
		@Test
		public void testGetImageFilePath1() {
			CartDTO dto = new CartDTO();
			String expected = "0";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath2() {
			CartDTO dto = new CartDTO();
			String expected = "2147483647";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath3() {
			CartDTO dto = new CartDTO();
			String expected = "-2147483647";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath4() {
			CartDTO dto = new CartDTO();
			String expected = "null";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath5() {
			CartDTO dto = new CartDTO();
			String expected = "";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath6() {
			CartDTO dto = new CartDTO();
			String expected = " ";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath7() {
			CartDTO dto = new CartDTO();
			String expected = "　";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath8() {
			CartDTO dto = new CartDTO();
			String expected = "abc123";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath9() {
			CartDTO dto = new CartDTO();
			String expected = "あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath10() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath11() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath12() {
			CartDTO dto = new CartDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		//set ImageFilePath test
		@Test
		public void testSetImageFilePath1() {
			CartDTO dto = new CartDTO();
			String expected="0";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath2() {
			CartDTO dto = new CartDTO();
			String expected="2147483647";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath3() {
			CartDTO dto = new CartDTO();
			String expected="-2147483647";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath4() {
			CartDTO dto = new CartDTO();
			String expected="null";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath5() {
			CartDTO dto = new CartDTO();
			String expected="";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath6() {
			CartDTO dto = new CartDTO();
			String expected=" ";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath7() {
			CartDTO dto = new CartDTO();
			String expected="　";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath8() {
			CartDTO dto = new CartDTO();
			String expected="abc123";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath9() {
			CartDTO dto = new CartDTO();
			String expected="あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath10() {
			CartDTO dto = new CartDTO();
			String expected="abc123あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath11() {
			CartDTO dto = new CartDTO();
			String expected="abcあいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath12() {
			CartDTO dto = new CartDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
	// get Price test
		@Test
		public void testGetPrice1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setPrice(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetPrice5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setPrice(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set Price test
		@Test
		public void testSetPrice1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setPrice(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetPrice5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setPrice(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetReleaseCompany
		@Test
		public void testGetReleaseCompany1() {
			CartDTO dto = new CartDTO();
			String expected = "0";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany2() {
			CartDTO dto = new CartDTO();
			String expected = "2147483647";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany3() {
			CartDTO dto = new CartDTO();
			String expected = "-2147483647";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany4() {
			CartDTO dto = new CartDTO();
			String expected = "null";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany5() {
			CartDTO dto = new CartDTO();
			String expected = "";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany6() {
			CartDTO dto = new CartDTO();
			String expected = " ";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany7() {
			CartDTO dto = new CartDTO();
			String expected = "　";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany8() {
			CartDTO dto = new CartDTO();
			String expected = "abc123";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany9() {
			CartDTO dto = new CartDTO();
			String expected = "あいう１２３";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany10() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany11() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany12() {
			CartDTO dto = new CartDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		//set ReleaseCompany test
		@Test
		public void testSetReleaseCompany1() {
			CartDTO dto = new CartDTO();
			String expected="0";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany2() {
			CartDTO dto = new CartDTO();
			String expected="2147483647";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany3() {
			CartDTO dto = new CartDTO();
			String expected="-2147483647";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany4() {
			CartDTO dto = new CartDTO();
			String expected="null";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany5() {
			CartDTO dto = new CartDTO();
			String expected="";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany6() {
			CartDTO dto = new CartDTO();
			String expected=" ";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany7() {
			CartDTO dto = new CartDTO();
			String expected="　";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany8() {
			CartDTO dto = new CartDTO();
			String expected="abc123";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany9() {
			CartDTO dto = new CartDTO();
			String expected="あいう１２３";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany10() {
			CartDTO dto = new CartDTO();
			String expected="abc123あいう１２３";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany11() {
			CartDTO dto = new CartDTO();
			String expected="abcあいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany12() {
			CartDTO dto = new CartDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
	//GetReleaseDate
		@Test
		public void testGetReleaseDate1() {
			CartDTO dto = new CartDTO();
			String expected = "0";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate2() {
			CartDTO dto = new CartDTO();
			String expected = "2147483647";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate3() {
			CartDTO dto = new CartDTO();
			String expected = "-2147483647";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate4() {
			CartDTO dto = new CartDTO();
			String expected = "null";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate5() {
			CartDTO dto = new CartDTO();
			String expected = "";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate6() {
			CartDTO dto = new CartDTO();
			String expected = " ";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate7() {
			CartDTO dto = new CartDTO();
			String expected = "　";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate8() {
			CartDTO dto = new CartDTO();
			String expected = "abc123";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate9() {
			CartDTO dto = new CartDTO();
			String expected = "あいう１２３";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate10() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate11() {
			CartDTO dto = new CartDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate12() {
			CartDTO dto = new CartDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}

		//set ReleaseDate test
		@Test
		public void testSetReleaseDate1() {
			CartDTO dto = new CartDTO();
			String expected="0";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate2() {
			CartDTO dto = new CartDTO();
			String expected="2147483647";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate3() {
			CartDTO dto = new CartDTO();
			String expected="-2147483647";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate4() {
			CartDTO dto = new CartDTO();
			String expected="null";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate5() {
			CartDTO dto = new CartDTO();
			String expected="";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate6() {
			CartDTO dto = new CartDTO();
			String expected=" ";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate7() {
			CartDTO dto = new CartDTO();
			String expected="　";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate8() {
			CartDTO dto = new CartDTO();
			String expected="abc123";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate9() {
			CartDTO dto = new CartDTO();
			String expected="あいう１２３";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate10() {
			CartDTO dto = new CartDTO();
			String expected="abc123あいう１２３";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate11() {
			CartDTO dto = new CartDTO();
			String expected="abcあいう１２３漢字";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate12() {
			CartDTO dto = new CartDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
	// get ProductTotalPrice test
		@Test
		public void testGetProductTotalPrice1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setProductTotalPrice(expected);
			int actual = dto.getProductTotalPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductTotalPrice2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setProductTotalPrice(expected);
			int actual = dto.getProductTotalPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductTotalPrice3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setProductTotalPrice(expected);
			int actual = dto.getProductTotalPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductTotalPrice4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductTotalPrice(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductTotalPrice5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductTotalPrice(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set ProductTotalPrice test
		@Test
		public void testSetProductTotalPrice1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setProductTotalPrice(expected);
			int actual = dto.getProductTotalPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductTotalPrice2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setProductTotalPrice(expected);
			int actual = dto.getProductTotalPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductTotalPrice3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setProductTotalPrice(expected);
			int actual = dto.getProductTotalPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductTotalPrice4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductTotalPrice(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductTotalPrice5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductTotalPrice(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get ProductCount test
		@Test
		public void testGetProductCount1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductCount2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductCount3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductCount4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductCount(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductCount5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductCount(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set ProductCount test
		@Test
		public void testSetProductCount1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductCount2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductCount3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductCount4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductCount(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductCount5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductCount(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get ProductStock test
		@Test
		public void testGetProductStock1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductStock2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductStock3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductStock4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductStock(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductStock5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductStock(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set ProductStock test
		@Test
		public void testSetProductStock1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductStock2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductStock3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductStock4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductStock(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductStock5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductStock(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get TotalCount test
		@Test
		public void testGetTotalCount1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setTotalCount(expected);
			int actual = dto.getTotalCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetTotalCount2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setTotalCount(expected);
			int actual = dto.getTotalCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetTotalCount3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setTotalCount(expected);
			int actual = dto.getTotalCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetTotalCount4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setTotalCount(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetTotalCount5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setTotalCount(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set TotalCount test
		@Test
		public void testSetTotalCount1() {
			CartDTO dto = new CartDTO();
			int expected = 0;

			dto.setTotalCount(expected);
			int actual = dto.getTotalCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetTotalCount2() {
			CartDTO dto = new CartDTO();
			int expected = 2147483647;

			dto.setTotalCount(expected);
			int actual = dto.getTotalCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetTotalCount3() {
			CartDTO dto = new CartDTO();
			int expected = -2147483647;

			dto.setTotalCount(expected);
			int actual = dto.getTotalCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetTotalCount4() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setTotalCount(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetTotalCount5() throws Exception{
			CartDTO dto = new CartDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setTotalCount(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
}
