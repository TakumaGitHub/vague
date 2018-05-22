package com.internousdev.vague.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.vague.dto.BuyItemDTO;

public class BuyItemDTOTest {

	// get Id test
		@Test
		public void testGetId1() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetId5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
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
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetId5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
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
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId2() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId3() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId4() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId5() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId6() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId7() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId8() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId9() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId10() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId11() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId12() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//set UserId test
		@Test
		public void testSetUserId1() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId2() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId3() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId4() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId5() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId6() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected=" ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId7() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId8() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId9() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId10() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId11() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="abcあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId12() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
	// get ProductId test
		@Test
		public void testGetProductId1() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductId5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
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
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductId5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get ProductCount test
		@Test
		public void testGetProductCount1() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductCount2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductCount3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductCount4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductCount(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductCount5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
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
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductCount2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductCount3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setProductCount(expected);
			int actual = dto.getProductCount();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductCount4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductCount(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductCount5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductCount(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get Price test
		@Test
		public void testGetPrice1() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setPrice(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetPrice5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
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
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setPrice(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetPrice5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setPrice(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get AddressId test
		@Test
		public void testGetAddressId1() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setAddressId(expected);
			int actual = dto.getAddressId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetAddressId2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setAddressId(expected);
			int actual = dto.getAddressId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetAddressId3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setAddressId(expected);
			int actual = dto.getAddressId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetAddressId4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setAddressId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetAddressId5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setAddressId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set AddressId test
		@Test
		public void testSetAddressId1() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 0;

			dto.setAddressId(expected);
			int actual = dto.getAddressId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetAddressId2() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = 2147483647;

			dto.setAddressId(expected);
			int actual = dto.getAddressId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetAddressId3() {
			BuyItemDTO dto = new BuyItemDTO();
			int expected = -2147483647;

			dto.setAddressId(expected);
			int actual = dto.getAddressId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetAddressId4() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setAddressId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetAddressId5() throws Exception{
			BuyItemDTO dto = new BuyItemDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setAddressId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetInsertDate
		@Test
		public void testGetInsertDate1() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate2() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate3() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate4() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate5() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate6() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = " ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate7() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate8() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate9() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate10() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate11() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate12() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}

		//set InsertDate test
		@Test
		public void testSetInsertDate1() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate2() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate3() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate4() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate5() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate6() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected=" ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate7() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate8() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate9() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate10() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate11() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="abcあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate12() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
	//GetUpdateDate
		@Test
		public void testGetUpdateDate1() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate2() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate3() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate4() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate5() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate6() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = " ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate7() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate8() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate9() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate10() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate11() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate12() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}

		//set UpdateDate test
		@Test
		public void testSetUpdateDate1() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate2() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate3() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate4() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate5() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate6() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected=" ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate7() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate8() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate9() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate10() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate11() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="abcあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate12() {
			BuyItemDTO dto = new BuyItemDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
}
