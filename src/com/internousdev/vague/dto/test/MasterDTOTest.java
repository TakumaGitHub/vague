package com.internousdev.vague.dto.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.internousdev.vague.dto.MasterDTO;
import com.internousdev.vague.dto.ProductDTO;

public class MasterDTOTest {

	//GetProductDTO

		@Test
		public void testGetProductDTO1(){

			MasterDTO dto = new MasterDTO();
			ProductDTO productDTO = new ProductDTO();

			String expected = "0";
			productDTO.setProductName(expected);
			dto.setProductDTO(productDTO);

			String actual = dto.getProductDTO().getProductName();
			assertEquals(expected, actual);


		}

	//SetProductDTO
		@Test
		public void testSetProductDTO1() {

			MasterDTO dto = new MasterDTO();
			ProductDTO productDTO = new ProductDTO();

			String expected = "0";
			productDTO.setProductName(expected);
			dto.setProductDTO(productDTO);

			String actual = dto.getProductDTO().getProductName();
			assertEquals(expected, actual);

		}


	//GetToImageFilePath
		@Test
		public void testGetToImageFilePath1() {
			MasterDTO dto = new MasterDTO();
			String expected = "0";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);

		}
		@Test
		public void testGetToImageFilePath2() {
			MasterDTO dto = new MasterDTO();
			String expected = "2147483647";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath3() {
			MasterDTO dto = new MasterDTO();
			String expected = "-2147483647";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath4() {
			MasterDTO dto = new MasterDTO();
			String expected = "null";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath5() {
			MasterDTO dto = new MasterDTO();
			String expected = "";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath6() {
			MasterDTO dto = new MasterDTO();
			String expected = " ";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath7() {
			MasterDTO dto = new MasterDTO();
			String expected = "　";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath8() {
			MasterDTO dto = new MasterDTO();
			String expected = "abc123";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath9() {
			MasterDTO dto = new MasterDTO();
			String expected = "あいう１２３";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath10() {
			MasterDTO dto = new MasterDTO();
			String expected = "abc123あいう１２３";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath11() {
			MasterDTO dto = new MasterDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetToImageFilePath12() {
			MasterDTO dto = new MasterDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}

		//set ToImageFilePath test
		@Test
		public void testSetToImageFilePath1() {
			MasterDTO dto = new MasterDTO();
			String expected="0";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath2() {
			MasterDTO dto = new MasterDTO();
			String expected="2147483647";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath3() {
			MasterDTO dto = new MasterDTO();
			String expected="-2147483647";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath4() {
			MasterDTO dto = new MasterDTO();
			String expected="null";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath5() {
			MasterDTO dto = new MasterDTO();
			String expected="";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath6() {
			MasterDTO dto = new MasterDTO();
			String expected=" ";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath7() {
			MasterDTO dto = new MasterDTO();
			String expected="　";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath8() {
			MasterDTO dto = new MasterDTO();
			String expected="abc123";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath9() {
			MasterDTO dto = new MasterDTO();
			String expected="あいう１２３";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath10() {
			MasterDTO dto = new MasterDTO();
			String expected="abc123あいう１２３";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath11() {
			MasterDTO dto = new MasterDTO();
			String expected="abcあいう１２３漢字";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetToImageFilePath12() {
			MasterDTO dto = new MasterDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setToImageFilePath(expected);
			String actual = dto.getToImageFilePath();
			assertEquals(expected, actual);
		}
	//GetFromImageFilePath
		@Test
		public void testGetFromImageFilePath1() {
			MasterDTO dto = new MasterDTO();
			String expected = "0";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath2() {
			MasterDTO dto = new MasterDTO();
			String expected = "2147483647";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath3() {
			MasterDTO dto = new MasterDTO();
			String expected = "-2147483647";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath4() {
			MasterDTO dto = new MasterDTO();
			String expected = "null";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath5() {
			MasterDTO dto = new MasterDTO();
			String expected = "";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath6() {
			MasterDTO dto = new MasterDTO();
			String expected = " ";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath7() {
			MasterDTO dto = new MasterDTO();
			String expected = "　";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath8() {
			MasterDTO dto = new MasterDTO();
			String expected = "abc123";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath9() {
			MasterDTO dto = new MasterDTO();
			String expected = "あいう１２３";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath10() {
			MasterDTO dto = new MasterDTO();
			String expected = "abc123あいう１２３";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath11() {
			MasterDTO dto = new MasterDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFromImageFilePath12() {
			MasterDTO dto = new MasterDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}

		//set FromImageFilePath test
		@Test
		public void testSetFromImageFilePath1() {
			MasterDTO dto = new MasterDTO();
			String expected="0";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath2() {
			MasterDTO dto = new MasterDTO();
			String expected="2147483647";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath3() {
			MasterDTO dto = new MasterDTO();
			String expected="-2147483647";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath4() {
			MasterDTO dto = new MasterDTO();
			String expected="null";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath5() {
			MasterDTO dto = new MasterDTO();
			String expected="";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath6() {
			MasterDTO dto = new MasterDTO();
			String expected=" ";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath7() {
			MasterDTO dto = new MasterDTO();
			String expected="　";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath8() {
			MasterDTO dto = new MasterDTO();
			String expected="abc123";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath9() {
			MasterDTO dto = new MasterDTO();
			String expected="あいう１２３";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath10() {
			MasterDTO dto = new MasterDTO();
			String expected="abc123あいう１２３";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath11() {
			MasterDTO dto = new MasterDTO();
			String expected="abcあいう１２３漢字";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFromImageFilePath12() {
			MasterDTO dto = new MasterDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFromImageFilePath(new File(expected));
			String actual = dto.getFromImageFilePath().getPath();
			assertEquals(expected, actual);
		}
}
