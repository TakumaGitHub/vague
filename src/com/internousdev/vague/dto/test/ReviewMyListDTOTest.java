package com.internousdev.vague.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.vague.dto.ProductDTO;
import com.internousdev.vague.dto.ReviewDTO;
import com.internousdev.vague.dto.ReviewMyListDTO;

public class ReviewMyListDTOTest {

	@Test
	public void testGetReviewDTO() {

		ReviewMyListDTO dto = new ReviewMyListDTO();
		ReviewDTO reviewDTO = new ReviewDTO();

		String expected = "0";
		reviewDTO.setUserId(expected);
		dto.setReviewDTO(reviewDTO);

		String actual = dto.getReviewDTO().getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetReviewDTO() {

		ReviewMyListDTO dto = new ReviewMyListDTO();
		ReviewDTO reviewDTO = new ReviewDTO();

		String expected = "0";
		reviewDTO.setUserId(expected);
		dto.setReviewDTO(reviewDTO);

		String actual = dto.getReviewDTO().getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetProductDTO() {

		ReviewMyListDTO dto = new ReviewMyListDTO();
		ProductDTO productDTO = new ProductDTO();

		String expected = "0";
		productDTO.setProductName(expected);
		dto.setProductDTO(productDTO);

		String actual = dto.getProductDTO().getProductName();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetProductDTO() {

		ReviewMyListDTO dto = new ReviewMyListDTO();
		ProductDTO productDTO = new ProductDTO();

		String expected = "0";
		productDTO.setProductName(expected);
		dto.setProductDTO(productDTO);

		String actual = dto.getProductDTO().getProductName();
		assertEquals(expected, actual);

	}

}
