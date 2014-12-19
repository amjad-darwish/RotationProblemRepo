package org.odesk.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.odesk.utils.ReverseArrayUtil;

/**
 * This class contains all test cases for ReverseArrayUtil class
 * 
 * @author Amjad Darwish
 */
public class ReverseArrayUtilTest {
	/**
	 * Test the reverse business for whole array, we will not pass start or end indices
	 */
	@Test
	public void testFullItemsReverse() {
		Integer[] values = new Integer[] {1, 2, 3, 4};
		ReverseArrayUtil.reverse(values);
		
		assertArrayEquals(new Integer[] {4, 3, 2, 1}, values);
	}
	
	/**
	 * Test the reverse business for the last part of array, we will pass the start index, the item in the start index will be included
	 */
	@Test
	public void testLastItemsRevers() {
		Integer[] values = new Integer[] {1, 2, 3, 4};
		ReverseArrayUtil.reverse(values, 2);
		
		assertArrayEquals(new Integer[] {1, 2, 4, 3}, values);
	}
	
	/**
	 * Test the reverse business on partly array, we will pass the start and end indices, the item in the start index will be included but
	 * the item in the last index will be excluded 
	 */
	@Test
	public void testFirstItemsReverse() {
		Integer[] values = new Integer[] {1, 2, 3, 4};
		ReverseArrayUtil.reverse(values, 0, 2);
		
		assertArrayEquals(new Integer[] {2, 1, 3, 4}, values);
	}
	
	/**
	 * Test the reverse business behavior when the start index greater than the last index 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testStartIndexGreaterThanLastIndexReverse() {
		Integer[] values = new Integer[] {1, 2, 3, 4};
		ReverseArrayUtil.reverse(values, 10, 2);
	}
	
	/**
	 * Test the reverse business behavior when at least one of the indices are small than ZERO
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidPositionReverse() {
		Integer[] values = new Integer[] {1, 2, 3, 4};
		ReverseArrayUtil.reverse(values, 10, -1);
	}
	
	/**
	 * Test the reverse business when the passed indices are equal
	 */
	@Test
	public void testEqualPositionsReverse() {
		Integer[] values = new Integer[] {1, 2, 3, 4};
		ReverseArrayUtil.reverse(values, 2, 2);
		
		assertArrayEquals(new Integer[] {1, 2, 3, 4}, values);
	}
}
