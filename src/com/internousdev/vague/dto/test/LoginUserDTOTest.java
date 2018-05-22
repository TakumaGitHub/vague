package com.internousdev.vague.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.vague.dto.LoginUserDTO;

public class LoginUserDTOTest {

	// get Id test
		@Test
		public void testGetId1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetId5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
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
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetId5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
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
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//set UserId test
		@Test
		public void testSetUserId1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
	//GetPassword
		@Test
		public void testGetPassword1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetPassword12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}

		//set Password test
		@Test
		public void testSetPassword1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetPassword12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setPassword(expected);
			String actual = dto.getPassword();
			assertEquals(expected, actual);
		}
	//GetFamilyName
		@Test
		public void testGetFamilyName1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		//set FamilyName test
		@Test
		public void testSetFamilyName1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
	//GetFirstName
		@Test
		public void testGetFirstName1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		//set FirstName test
		@Test
		public void testSetFirstName1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
	//GetFamilyNameKana
		@Test
		public void testGetFamilyNameKana1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		//set FamilyNameKana test
		@Test
		public void testSetFamilyNameKana1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
	//GetFirstNameKana
		@Test
		public void testGetFirstNameKana1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		//set FirstNameKana test
		@Test
		public void testSetFirstNameKana1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
	// get Sex test
		@Test
		public void testGetSex1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetSex2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetSex3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetSex4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setSex(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetSex5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
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
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetSex2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetSex3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setSex(expected);
			int actual = dto.getSex();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetSex4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setSex(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetSex5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setSex(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetEmail
		@Test
		public void testGetEmail1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		//set Email test
		@Test
		public void testSetEmail1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
	// get Status test
		@Test
		public void testGetStatus1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetStatus2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetStatus3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetStatus4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setStatus(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetStatus5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setStatus(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set Status test
		@Test
		public void testSetStatus1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStatus2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStatus3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStatus4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setStatus(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetStatus5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setStatus(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get LoginFlg test
		@Test
		public void testGetLoginFlg1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setLoginFlg(expected);
			int actual = dto.getLoginFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetLoginFlg2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setLoginFlg(expected);
			int actual = dto.getLoginFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetLoginFlg3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setLoginFlg(expected);
			int actual = dto.getLoginFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetLoginFlg4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setLoginFlg(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetLoginFlg5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setLoginFlg(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set LoginFlg test
		@Test
		public void testSetLoginFlg1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setLoginFlg(expected);
			int actual = dto.getLoginFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetLoginFlg2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setLoginFlg(expected);
			int actual = dto.getLoginFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetLoginFlg3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setLoginFlg(expected);
			int actual = dto.getLoginFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetLoginFlg4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setLoginFlg(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetLoginFlg5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setLoginFlg(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get mFlg test
		@Test
		public void testGetmFlg1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setmFlg(expected);
			int actual = dto.getmFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetmFlg2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setmFlg(expected);
			int actual = dto.getmFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetmFlg3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setmFlg(expected);
			int actual = dto.getmFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetmFlg4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setmFlg(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetmFlg5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setmFlg(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set mFlg test
		@Test
		public void testSetmFlg1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setmFlg(expected);
			int actual = dto.getmFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetmFlg2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setmFlg(expected);
			int actual = dto.getmFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetmFlg3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setmFlg(expected);
			int actual = dto.getmFlg();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetmFlg4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setmFlg(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetmFlg5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setmFlg(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get Question test
		@Test
		public void testGetQuestion1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setQuestion(expected);
			int actual = dto.getQuestion();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetQuestion2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setQuestion(expected);
			int actual = dto.getQuestion();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetQuestion3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setQuestion(expected);
			int actual = dto.getQuestion();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetQuestion4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setQuestion(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetQuestion5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setQuestion(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set Question test
		@Test
		public void testSetQuestion1() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 0;

			dto.setQuestion(expected);
			int actual = dto.getQuestion();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetQuestion2() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = 2147483647;

			dto.setQuestion(expected);
			int actual = dto.getQuestion();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetQuestion3() {
			LoginUserDTO dto = new LoginUserDTO();
			int expected = -2147483647;

			dto.setQuestion(expected);
			int actual = dto.getQuestion();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetQuestion4() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setQuestion(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetQuestion5() throws Exception{
			LoginUserDTO dto = new LoginUserDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setQuestion(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetAnswer
		@Test
		public void testGetAnswer1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetAnswer12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}

		//set Answer test
		@Test
		public void testSetAnswer1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetAnswer12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setAnswer(expected);
			String actual = dto.getAnswer();
			assertEquals(expected, actual);
		}
	//GetInsertDate
		@Test
		public void testGetInsertDate1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}

		//set InsertDate test
		@Test
		public void testSetInsertDate1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
	//GetUpdateDate
		@Test
		public void testGetUpdateDate1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = " ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}

		//set UpdateDate test
		@Test
		public void testSetUpdateDate1() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate2() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate3() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate4() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate5() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate6() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected=" ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate7() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate8() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate9() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate10() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate11() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="abcあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate12() {
			LoginUserDTO dto = new LoginUserDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
}
