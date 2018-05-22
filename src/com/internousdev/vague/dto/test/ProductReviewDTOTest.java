package com.internousdev.vague.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.vague.dto.ProductReviewDTO;
import com.internousdev.vague.dto.ReviewDTO;

public class ProductReviewDTOTest {

	//GetReviewDTO

		@Test
		public void testGetReviewDTO1(){

			ProductReviewDTO dto = new ProductReviewDTO();
			ReviewDTO reviewDTO = new ReviewDTO();

			String expected = "0";
			reviewDTO.setUserId(expected);
			dto.setReviewDTO(reviewDTO);

			String actual = dto.getReviewDTO().getUserId();
			assertEquals(expected, actual);


		}

	//SetReviewDTO

		@Test
		public void testSetReviewDTO1(){

			ProductReviewDTO dto = new ProductReviewDTO();
			ReviewDTO reviewDTO = new ReviewDTO();

			String expected = "0";
			reviewDTO.setUserId(expected);
			dto.setReviewDTO(reviewDTO);

			String actual = dto.getReviewDTO().getUserId();
			assertEquals(expected, actual);


		}


	//GetFamilyName
		@Test
		public void testGetFamilyName1() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName2() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName3() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName4() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName5() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName6() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = " ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName7() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName8() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName9() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName10() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName11() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName12() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		//set FamilyName test
		@Test
		public void testSetFamilyName1() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName2() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName3() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName4() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName5() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName6() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName7() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName8() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName9() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName10() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName11() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="abcあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName12() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
	//GetFirstName
		@Test
		public void testGetFirstName1() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName2() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName3() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName4() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName5() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName6() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName7() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName8() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName9() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName10() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName11() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName12() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		//set FirstName test
		@Test
		public void testSetFirstName1() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName2() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName3() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName4() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName5() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName6() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected=" ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName7() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName8() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName9() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName10() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName11() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="abcあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName12() {
			ProductReviewDTO dto = new ProductReviewDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
	// get Sex test
		@Test
		public void testGetSex1() {
			ProductReviewDTO dto = new ProductReviewDTO();
			int expected = 0;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetSex2() {
			ProductReviewDTO dto = new ProductReviewDTO();
			int expected = 2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetSex3() {
			ProductReviewDTO dto = new ProductReviewDTO();
			int expected = -2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetSex4() throws Exception{
			ProductReviewDTO dto = new ProductReviewDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setSex(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetSex5() throws Exception{
			ProductReviewDTO dto = new ProductReviewDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setSex(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set Sex test
		@Test
		public void testSetSex1() {
			ProductReviewDTO dto = new ProductReviewDTO();
			int expected = 0;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetSex2() {
			ProductReviewDTO dto = new ProductReviewDTO();
			int expected = 2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetSex3() {
			ProductReviewDTO dto = new ProductReviewDTO();
			int expected = -2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetSex4() throws Exception{
			ProductReviewDTO dto = new ProductReviewDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setSex(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetSex5() throws Exception{
			ProductReviewDTO dto = new ProductReviewDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setSex(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


}
