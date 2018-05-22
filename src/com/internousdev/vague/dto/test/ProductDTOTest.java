package com.internousdev.vague.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.vague.dto.ProductDTO;

public class ProductDTOTest {

	// get Id test
		@Test
		public void testGetId1() {
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetId5() throws Exception{
			ProductDTO dto = new ProductDTO();
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
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetId5() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get ProductId test
		@Test
		public void testGetProductId1() {
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductId4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductId5() throws Exception{
			ProductDTO dto = new ProductDTO();
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
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductId4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductId5() throws Exception{
			ProductDTO dto = new ProductDTO();
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
			ProductDTO dto = new ProductDTO();
			String expected = "0";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName2() {
			ProductDTO dto = new ProductDTO();
			String expected = "2147483647";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName3() {
			ProductDTO dto = new ProductDTO();
			String expected = "-2147483647";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName4() {
			ProductDTO dto = new ProductDTO();
			String expected = "null";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName5() {
			ProductDTO dto = new ProductDTO();
			String expected = "";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName6() {
			ProductDTO dto = new ProductDTO();
			String expected = " ";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName7() {
			ProductDTO dto = new ProductDTO();
			String expected = "　";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName8() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName9() {
			ProductDTO dto = new ProductDTO();
			String expected = "あいう１２３";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName10() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName11() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductName12() {
			ProductDTO dto = new ProductDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		//set ProductName test
		@Test
		public void testSetProductName1() {
			ProductDTO dto = new ProductDTO();
			String expected="0";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName2() {
			ProductDTO dto = new ProductDTO();
			String expected="2147483647";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName3() {
			ProductDTO dto = new ProductDTO();
			String expected="-2147483647";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName4() {
			ProductDTO dto = new ProductDTO();
			String expected="null";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName5() {
			ProductDTO dto = new ProductDTO();
			String expected="";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName6() {
			ProductDTO dto = new ProductDTO();
			String expected=" ";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName7() {
			ProductDTO dto = new ProductDTO();
			String expected="　";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName8() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName9() {
			ProductDTO dto = new ProductDTO();
			String expected="あいう１２３";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName10() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123あいう１２３";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName11() {
			ProductDTO dto = new ProductDTO();
			String expected="abcあいう１２３漢字";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductName12() {
			ProductDTO dto = new ProductDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}
	//GetProductNameKana
		@Test
		public void testGetProductNameKana1() {
			ProductDTO dto = new ProductDTO();
			String expected = "0";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana2() {
			ProductDTO dto = new ProductDTO();
			String expected = "2147483647";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana3() {
			ProductDTO dto = new ProductDTO();
			String expected = "-2147483647";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana4() {
			ProductDTO dto = new ProductDTO();
			String expected = "null";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana5() {
			ProductDTO dto = new ProductDTO();
			String expected = "";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana6() {
			ProductDTO dto = new ProductDTO();
			String expected = " ";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana7() {
			ProductDTO dto = new ProductDTO();
			String expected = "　";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana8() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana9() {
			ProductDTO dto = new ProductDTO();
			String expected = "あいう１２３";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana10() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana11() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductNameKana12() {
			ProductDTO dto = new ProductDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}

		//set ProductNameKana test
		@Test
		public void testSetProductNameKana1() {
			ProductDTO dto = new ProductDTO();
			String expected="0";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana2() {
			ProductDTO dto = new ProductDTO();
			String expected="2147483647";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana3() {
			ProductDTO dto = new ProductDTO();
			String expected="-2147483647";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana4() {
			ProductDTO dto = new ProductDTO();
			String expected="null";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana5() {
			ProductDTO dto = new ProductDTO();
			String expected="";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana6() {
			ProductDTO dto = new ProductDTO();
			String expected=" ";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana7() {
			ProductDTO dto = new ProductDTO();
			String expected="　";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana8() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana9() {
			ProductDTO dto = new ProductDTO();
			String expected="あいう１２３";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana10() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123あいう１２３";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana11() {
			ProductDTO dto = new ProductDTO();
			String expected="abcあいう１２３漢字";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductNameKana12() {
			ProductDTO dto = new ProductDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setProductNameKana(expected);
			String actual = dto.getProductNameKana();
			assertEquals(expected, actual);
		}
	//GetProductDescription
		@Test
		public void testGetProductDescription1() {
			ProductDTO dto = new ProductDTO();
			String expected = "0";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription2() {
			ProductDTO dto = new ProductDTO();
			String expected = "2147483647";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription3() {
			ProductDTO dto = new ProductDTO();
			String expected = "-2147483647";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription4() {
			ProductDTO dto = new ProductDTO();
			String expected = "null";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription5() {
			ProductDTO dto = new ProductDTO();
			String expected = "";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription6() {
			ProductDTO dto = new ProductDTO();
			String expected = " ";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription7() {
			ProductDTO dto = new ProductDTO();
			String expected = "　";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription8() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription9() {
			ProductDTO dto = new ProductDTO();
			String expected = "あいう１２３";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription10() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription11() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetProductDescription12() {
			ProductDTO dto = new ProductDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}

		//set ProductDescription test
		@Test
		public void testSetProductDescription1() {
			ProductDTO dto = new ProductDTO();
			String expected="0";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription2() {
			ProductDTO dto = new ProductDTO();
			String expected="2147483647";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription3() {
			ProductDTO dto = new ProductDTO();
			String expected="-2147483647";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription4() {
			ProductDTO dto = new ProductDTO();
			String expected="null";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription5() {
			ProductDTO dto = new ProductDTO();
			String expected="";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription6() {
			ProductDTO dto = new ProductDTO();
			String expected=" ";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription7() {
			ProductDTO dto = new ProductDTO();
			String expected="　";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription8() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription9() {
			ProductDTO dto = new ProductDTO();
			String expected="あいう１２３";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription10() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123あいう１２３";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription11() {
			ProductDTO dto = new ProductDTO();
			String expected="abcあいう１２３漢字";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetProductDescription12() {
			ProductDTO dto = new ProductDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setProductDescription(expected);
			String actual = dto.getProductDescription();
			assertEquals(expected, actual);
		}
	// get CategoryId test
		@Test
		public void testGetCategoryId1() {
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetCategoryId2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetCategoryId3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetCategoryId4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setCategoryId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetCategoryId5() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setCategoryId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}


		//set CategoryId test
		@Test
		public void testSetCategoryId1() {
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetCategoryId2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetCategoryId3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setCategoryId(expected);
			int actual = dto.getCategoryId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetCategoryId4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setCategoryId(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetCategoryId5() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setCategoryId(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get ProductStock test
		@Test
		public void testGetProductStock1() {
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductStock2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductStock3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetProductStock4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductStock(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetProductStock5() throws Exception{
			ProductDTO dto = new ProductDTO();
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
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductStock2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductStock3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setProductStock(expected);
			int actual = dto.getProductStock();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetProductStock4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setProductStock(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetProductStock5() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setProductStock(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	// get Price test
		@Test
		public void testGetPrice1() {
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetPrice4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setPrice(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetPrice5() throws Exception{
			ProductDTO dto = new ProductDTO();
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
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setPrice(expected);
			int actual = dto.getPrice();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetPrice4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setPrice(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetPrice5() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setPrice(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetImageFilePath
		@Test
		public void testGetImageFilePath1() {
			ProductDTO dto = new ProductDTO();
			String expected = "0";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath2() {
			ProductDTO dto = new ProductDTO();
			String expected = "2147483647";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath3() {
			ProductDTO dto = new ProductDTO();
			String expected = "-2147483647";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath4() {
			ProductDTO dto = new ProductDTO();
			String expected = "null";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath5() {
			ProductDTO dto = new ProductDTO();
			String expected = "";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath6() {
			ProductDTO dto = new ProductDTO();
			String expected = " ";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath7() {
			ProductDTO dto = new ProductDTO();
			String expected = "　";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath8() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath9() {
			ProductDTO dto = new ProductDTO();
			String expected = "あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath10() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath11() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFilePath12() {
			ProductDTO dto = new ProductDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		//set ImageFilePath test
		@Test
		public void testSetImageFilePath1() {
			ProductDTO dto = new ProductDTO();
			String expected="0";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath2() {
			ProductDTO dto = new ProductDTO();
			String expected="2147483647";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath3() {
			ProductDTO dto = new ProductDTO();
			String expected="-2147483647";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath4() {
			ProductDTO dto = new ProductDTO();
			String expected="null";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath5() {
			ProductDTO dto = new ProductDTO();
			String expected="";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath6() {
			ProductDTO dto = new ProductDTO();
			String expected=" ";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath7() {
			ProductDTO dto = new ProductDTO();
			String expected="　";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath8() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath9() {
			ProductDTO dto = new ProductDTO();
			String expected="あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath10() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123あいう１２３";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath11() {
			ProductDTO dto = new ProductDTO();
			String expected="abcあいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFilePath12() {
			ProductDTO dto = new ProductDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}
	//GetImageFileName
		@Test
		public void testGetImageFileName1() {
			ProductDTO dto = new ProductDTO();
			String expected = "0";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName2() {
			ProductDTO dto = new ProductDTO();
			String expected = "2147483647";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName3() {
			ProductDTO dto = new ProductDTO();
			String expected = "-2147483647";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName4() {
			ProductDTO dto = new ProductDTO();
			String expected = "null";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName5() {
			ProductDTO dto = new ProductDTO();
			String expected = "";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName6() {
			ProductDTO dto = new ProductDTO();
			String expected = " ";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName7() {
			ProductDTO dto = new ProductDTO();
			String expected = "　";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName8() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName9() {
			ProductDTO dto = new ProductDTO();
			String expected = "あいう１２３";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName10() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName11() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetImageFileName12() {
			ProductDTO dto = new ProductDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		//set ImageFileName test
		@Test
		public void testSetImageFileName1() {
			ProductDTO dto = new ProductDTO();
			String expected="0";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName2() {
			ProductDTO dto = new ProductDTO();
			String expected="2147483647";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName3() {
			ProductDTO dto = new ProductDTO();
			String expected="-2147483647";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName4() {
			ProductDTO dto = new ProductDTO();
			String expected="null";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName5() {
			ProductDTO dto = new ProductDTO();
			String expected="";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName6() {
			ProductDTO dto = new ProductDTO();
			String expected=" ";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName7() {
			ProductDTO dto = new ProductDTO();
			String expected="　";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName8() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName9() {
			ProductDTO dto = new ProductDTO();
			String expected="あいう１２３";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName10() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123あいう１２３";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName11() {
			ProductDTO dto = new ProductDTO();
			String expected="abcあいう１２３漢字";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetImageFileName12() {
			ProductDTO dto = new ProductDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}
	//GetReleaseDate
		@Test
		public void testGetReleaseDate1() {
			ProductDTO dto = new ProductDTO();
			String expected = "0";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate2() {
			ProductDTO dto = new ProductDTO();
			String expected = "2147483647";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate3() {
			ProductDTO dto = new ProductDTO();
			String expected = "-2147483647";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate4() {
			ProductDTO dto = new ProductDTO();
			String expected = "null";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate5() {
			ProductDTO dto = new ProductDTO();
			String expected = "";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate6() {
			ProductDTO dto = new ProductDTO();
			String expected = " ";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate7() {
			ProductDTO dto = new ProductDTO();
			String expected = "　";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate8() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate9() {
			ProductDTO dto = new ProductDTO();
			String expected = "あいう１２３";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate10() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate11() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseDate12() {
			ProductDTO dto = new ProductDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}

		//set ReleaseDate test
		@Test
		public void testSetReleaseDate1() {
			ProductDTO dto = new ProductDTO();
			String expected="0";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate2() {
			ProductDTO dto = new ProductDTO();
			String expected="2147483647";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate3() {
			ProductDTO dto = new ProductDTO();
			String expected="-2147483647";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate4() {
			ProductDTO dto = new ProductDTO();
			String expected="null";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate5() {
			ProductDTO dto = new ProductDTO();
			String expected="";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate6() {
			ProductDTO dto = new ProductDTO();
			String expected=" ";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate7() {
			ProductDTO dto = new ProductDTO();
			String expected="　";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate8() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate9() {
			ProductDTO dto = new ProductDTO();
			String expected="あいう１２３";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate10() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123あいう１２３";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate11() {
			ProductDTO dto = new ProductDTO();
			String expected="abcあいう１２３漢字";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseDate12() {
			ProductDTO dto = new ProductDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setReleaseDate(expected);
			String actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}
	//GetReleaseCompany
		@Test
		public void testGetReleaseCompany1() {
			ProductDTO dto = new ProductDTO();
			String expected = "0";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany2() {
			ProductDTO dto = new ProductDTO();
			String expected = "2147483647";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany3() {
			ProductDTO dto = new ProductDTO();
			String expected = "-2147483647";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany4() {
			ProductDTO dto = new ProductDTO();
			String expected = "null";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany5() {
			ProductDTO dto = new ProductDTO();
			String expected = "";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany6() {
			ProductDTO dto = new ProductDTO();
			String expected = " ";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany7() {
			ProductDTO dto = new ProductDTO();
			String expected = "　";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany8() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany9() {
			ProductDTO dto = new ProductDTO();
			String expected = "あいう１２３";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany10() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany11() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetReleaseCompany12() {
			ProductDTO dto = new ProductDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		//set ReleaseCompany test
		@Test
		public void testSetReleaseCompany1() {
			ProductDTO dto = new ProductDTO();
			String expected="0";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany2() {
			ProductDTO dto = new ProductDTO();
			String expected="2147483647";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany3() {
			ProductDTO dto = new ProductDTO();
			String expected="-2147483647";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany4() {
			ProductDTO dto = new ProductDTO();
			String expected="null";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany5() {
			ProductDTO dto = new ProductDTO();
			String expected="";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany6() {
			ProductDTO dto = new ProductDTO();
			String expected=" ";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany7() {
			ProductDTO dto = new ProductDTO();
			String expected="　";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany8() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany9() {
			ProductDTO dto = new ProductDTO();
			String expected="あいう１２３";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany10() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123あいう１２３";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany11() {
			ProductDTO dto = new ProductDTO();
			String expected="abcあいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetReleaseCompany12() {
			ProductDTO dto = new ProductDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}
	// get Status test
		@Test
		public void testGetStatus1() {
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetStatus2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetStatus3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetStatus4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setStatus(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetStatus5() throws Exception{
			ProductDTO dto = new ProductDTO();
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
			ProductDTO dto = new ProductDTO();
			int expected = 0;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStatus2() {
			ProductDTO dto = new ProductDTO();
			int expected = 2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStatus3() {
			ProductDTO dto = new ProductDTO();
			int expected = -2147483647;

			dto.setStatus(expected);
			int actual = dto.getStatus();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetStatus4() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Max = Integer.parseInt("214748364");
				dto.setStatus(Max);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetStatus5() throws Exception{
			ProductDTO dto = new ProductDTO();
			try{
				int Min = Integer.parseInt("-214748364");
				dto.setStatus(Min);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
			}
		}
	//GetInsertDate
		@Test
		public void testGetInsertDate1() {
			ProductDTO dto = new ProductDTO();
			String expected = "0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate2() {
			ProductDTO dto = new ProductDTO();
			String expected = "2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate3() {
			ProductDTO dto = new ProductDTO();
			String expected = "-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate4() {
			ProductDTO dto = new ProductDTO();
			String expected = "null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate5() {
			ProductDTO dto = new ProductDTO();
			String expected = "";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate6() {
			ProductDTO dto = new ProductDTO();
			String expected = " ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate7() {
			ProductDTO dto = new ProductDTO();
			String expected = "　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate8() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate9() {
			ProductDTO dto = new ProductDTO();
			String expected = "あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate10() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate11() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetInsertDate12() {
			ProductDTO dto = new ProductDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}

		//set InsertDate test
		@Test
		public void testSetInsertDate1() {
			ProductDTO dto = new ProductDTO();
			String expected="0";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate2() {
			ProductDTO dto = new ProductDTO();
			String expected="2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate3() {
			ProductDTO dto = new ProductDTO();
			String expected="-2147483647";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate4() {
			ProductDTO dto = new ProductDTO();
			String expected="null";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate5() {
			ProductDTO dto = new ProductDTO();
			String expected="";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate6() {
			ProductDTO dto = new ProductDTO();
			String expected=" ";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate7() {
			ProductDTO dto = new ProductDTO();
			String expected="　";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate8() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate9() {
			ProductDTO dto = new ProductDTO();
			String expected="あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate10() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123あいう１２３";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate11() {
			ProductDTO dto = new ProductDTO();
			String expected="abcあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetInsertDate12() {
			ProductDTO dto = new ProductDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setInsertDate(expected);
			String actual = dto.getInsertDate();
			assertEquals(expected, actual);
		}
	//GetUpdateDate
		@Test
		public void testGetUpdateDate1() {
			ProductDTO dto = new ProductDTO();
			String expected = "0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate2() {
			ProductDTO dto = new ProductDTO();
			String expected = "2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate3() {
			ProductDTO dto = new ProductDTO();
			String expected = "-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate4() {
			ProductDTO dto = new ProductDTO();
			String expected = "null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate5() {
			ProductDTO dto = new ProductDTO();
			String expected = "";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate6() {
			ProductDTO dto = new ProductDTO();
			String expected = " ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate7() {
			ProductDTO dto = new ProductDTO();
			String expected = "　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate8() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate9() {
			ProductDTO dto = new ProductDTO();
			String expected = "あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate10() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate11() {
			ProductDTO dto = new ProductDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate12() {
			ProductDTO dto = new ProductDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}

		//set UpdateDate test
		@Test
		public void testSetUpdateDate1() {
			ProductDTO dto = new ProductDTO();
			String expected="0";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate2() {
			ProductDTO dto = new ProductDTO();
			String expected="2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate3() {
			ProductDTO dto = new ProductDTO();
			String expected="-2147483647";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate4() {
			ProductDTO dto = new ProductDTO();
			String expected="null";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate5() {
			ProductDTO dto = new ProductDTO();
			String expected="";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate6() {
			ProductDTO dto = new ProductDTO();
			String expected=" ";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate7() {
			ProductDTO dto = new ProductDTO();
			String expected="　";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate8() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate9() {
			ProductDTO dto = new ProductDTO();
			String expected="あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate10() {
			ProductDTO dto = new ProductDTO();
			String expected="abc123あいう１２３";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate11() {
			ProductDTO dto = new ProductDTO();
			String expected="abcあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate12() {
			ProductDTO dto = new ProductDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setUpdateDate(expected);
			String actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
}
