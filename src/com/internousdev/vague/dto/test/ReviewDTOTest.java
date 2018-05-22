package com.internousdev.vague.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.vague.dto.ReviewDTO;

public class ReviewDTOTest {

	// get Id test
		@Test
		public void testGetId1() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId2() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId3() {
			ReviewDTO dto = new ReviewDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId4() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetId5() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set Id test
		@Test
		public void testSetId1() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId2() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId3() {
			ReviewDTO dto = new ReviewDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId4() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetId5() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetUserId
		@Test
		public void testGetUserId1() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId2() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId3() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId4() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId5() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId6() {
			ReviewDTO dto = new ReviewDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId7() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId8() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId9() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId10() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId11() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId12() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//set UserId test
		@Test
		public void testSetUserId1() {
			ReviewDTO dto = new ReviewDTO();
			String expected="0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId2() {
			ReviewDTO dto = new ReviewDTO();
			String expected="2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId3() {
			ReviewDTO dto = new ReviewDTO();
			String expected="-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId4() {
			ReviewDTO dto = new ReviewDTO();
			String expected="null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId5() {
			ReviewDTO dto = new ReviewDTO();
			String expected="";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId6() {
			ReviewDTO dto = new ReviewDTO();
			String expected=" ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId7() {
			ReviewDTO dto = new ReviewDTO();
			String expected="　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId8() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId9() {
			ReviewDTO dto = new ReviewDTO();
			String expected="あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId10() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId11() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abcあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId12() {
			ReviewDTO dto = new ReviewDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
	// get ProductId test
		@Test
		public void testGetProductId1() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId2() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId3() {
			ReviewDTO dto = new ReviewDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId4() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductId5() throws Exception{
			ReviewDTO dto = new ReviewDTO();
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
			ReviewDTO dto = new ReviewDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId2() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId3() {
			ReviewDTO dto = new ReviewDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId4() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductId5() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetReviewTitle
		@Test
		public void testGetReviewTitle1() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "0";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle2() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "2147483647";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle3() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "-2147483647";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle4() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "null";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle5() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle6() {
			ReviewDTO dto = new ReviewDTO();
			String expected = " ";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle7() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "　";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle8() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle9() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "あいう１２３";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle10() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle11() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewTitle12() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}

		//set ReviewTitle test
		@Test
		public void testSetReviewTitle1() {
			ReviewDTO dto = new ReviewDTO();
			String expected="0";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle2() {
			ReviewDTO dto = new ReviewDTO();
			String expected="2147483647";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle3() {
			ReviewDTO dto = new ReviewDTO();
			String expected="-2147483647";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle4() {
			ReviewDTO dto = new ReviewDTO();
			String expected="null";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle5() {
			ReviewDTO dto = new ReviewDTO();
			String expected="";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle6() {
			ReviewDTO dto = new ReviewDTO();
			String expected=" ";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle7() {
			ReviewDTO dto = new ReviewDTO();
			String expected="　";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle8() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle9() {
			ReviewDTO dto = new ReviewDTO();
			String expected="あいう１２３";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle10() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123あいう１２３";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle11() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abcあいう１２３漢字";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewTitle12() {
			ReviewDTO dto = new ReviewDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setReviewTitle(expected);
			String actual = dto.getReviewTitle();
			assertEquals(expected, actual);
		}
	//GetReviewBody
		@Test
		public void testGetReviewBody1() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "0";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody2() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "2147483647";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody3() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "-2147483647";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody4() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "null";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody5() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody6() {
			ReviewDTO dto = new ReviewDTO();
			String expected = " ";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody7() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "　";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody8() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody9() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "あいう１２３";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody10() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody11() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReviewBody12() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}

		//set ReviewBody test
		@Test
		public void testSetReviewBody1() {
			ReviewDTO dto = new ReviewDTO();
			String expected="0";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody2() {
			ReviewDTO dto = new ReviewDTO();
			String expected="2147483647";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody3() {
			ReviewDTO dto = new ReviewDTO();
			String expected="-2147483647";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody4() {
			ReviewDTO dto = new ReviewDTO();
			String expected="null";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody5() {
			ReviewDTO dto = new ReviewDTO();
			String expected="";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody6() {
			ReviewDTO dto = new ReviewDTO();
			String expected=" ";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody7() {
			ReviewDTO dto = new ReviewDTO();
			String expected="　";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody8() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody9() {
			ReviewDTO dto = new ReviewDTO();
			String expected="あいう１２３";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody10() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123あいう１２３";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody11() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abcあいう１２３漢字";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReviewBody12() {
			ReviewDTO dto = new ReviewDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setReviewBody(expected);
			String actual = dto.getReviewBody();
			assertEquals(expected, actual);
		}
	// get ReviewScore test
		@Test
		public void testGetReviewScore1() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 0;

			dto.setReviewScore(expected);
			int actual = dto.getReviewScore();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetReviewScore2() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 2147483647;

			dto.setReviewScore(expected);
			int actual = dto.getReviewScore();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetReviewScore3() {
			ReviewDTO dto = new ReviewDTO();
			int expected = -2147483647;

			dto.setReviewScore(expected);
			int actual = dto.getReviewScore();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetReviewScore4() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setReviewScore(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetReviewScore5() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setReviewScore(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set ReviewScore test
		@Test
		public void testSetReviewScore1() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 0;

			dto.setReviewScore(expected);
			int actual = dto.getReviewScore();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetReviewScore2() {
			ReviewDTO dto = new ReviewDTO();
			int expected = 2147483647;

			dto.setReviewScore(expected);
			int actual = dto.getReviewScore();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetReviewScore3() {
			ReviewDTO dto = new ReviewDTO();
			int expected = -2147483647;

			dto.setReviewScore(expected);
			int actual = dto.getReviewScore();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetReviewScore4() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setReviewScore(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetReviewScore5() throws Exception{
			ReviewDTO dto = new ReviewDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setReviewScore(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetInsertDate
		@Test
		public void testGetInsertDate1() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate2() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate3() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate4() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate5() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate6() {
			ReviewDTO dto = new ReviewDTO();
			String expected = " ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate7() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate8() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate9() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate10() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate11() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate12() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}

		//set InsertDate test
		@Test
		public void testSetInsertDate1() {
			ReviewDTO dto = new ReviewDTO();
			String expected="0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate2() {
			ReviewDTO dto = new ReviewDTO();
			String expected="2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate3() {
			ReviewDTO dto = new ReviewDTO();
			String expected="-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate4() {
			ReviewDTO dto = new ReviewDTO();
			String expected="null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate5() {
			ReviewDTO dto = new ReviewDTO();
			String expected="";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate6() {
			ReviewDTO dto = new ReviewDTO();
			String expected=" ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate7() {
			ReviewDTO dto = new ReviewDTO();
			String expected="　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate8() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate9() {
			ReviewDTO dto = new ReviewDTO();
			String expected="あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate10() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate11() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abcあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate12() {
			ReviewDTO dto = new ReviewDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
	//GetUpdateDate
		@Test
		public void testGetUpdateDate1() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate2() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate3() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate4() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate5() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate6() {
			ReviewDTO dto = new ReviewDTO();
			String expected = " ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate7() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate8() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate9() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate10() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate11() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate12() {
			ReviewDTO dto = new ReviewDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}

		//set UpdateDate test
		@Test
		public void testSetUpdateDate1() {
			ReviewDTO dto = new ReviewDTO();
			String expected="0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate2() {
			ReviewDTO dto = new ReviewDTO();
			String expected="2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate3() {
			ReviewDTO dto = new ReviewDTO();
			String expected="-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate4() {
			ReviewDTO dto = new ReviewDTO();
			String expected="null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate5() {
			ReviewDTO dto = new ReviewDTO();
			String expected="";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate6() {
			ReviewDTO dto = new ReviewDTO();
			String expected=" ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate7() {
			ReviewDTO dto = new ReviewDTO();
			String expected="　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate8() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate9() {
			ReviewDTO dto = new ReviewDTO();
			String expected="あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate10() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate11() {
			ReviewDTO dto = new ReviewDTO();
			String expected="abcあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate12() {
			ReviewDTO dto = new ReviewDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
}
