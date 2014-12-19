package org.odesk.utils;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.odesk.utils.RotationArrayUtil;

/**
 * This class contains all test cases for RotationArrayUtil class
 * 
 * @author Amjad Darwish
 */
public class RotationArrayUtilTest {
	/**
	 * Test the happy scenario
	 */
	@Test
	public void testRotation() {
		Integer [] values = new Integer[]{1, 2, 3, 4};
		RotationArrayUtil.rotate(values, 2);
		
		assertArrayEquals(new Integer[] {3, 4, 1, 2}, values);
	}
	
	/**
	 * Test the rotation when the passed array is null
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testNullArrayRotation () {
		RotationArrayUtil.rotate(null, 6);
	}
	
	/**
	 * Test the rotation when the passed array is empty
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyArrayRotation() {
		Integer[] values = new Integer[] {};
		RotationArrayUtil.rotate(values, 1);
	}
	
	/**
	 * Test the rotation when the passed position is less than ZERO
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidPosition () {
		Integer[] values = new Integer[] {1, 2, 3, 4};
		RotationArrayUtil.rotate(values, -1);	
	}
	
	/**
	 * Test the rotation when the passed position is greater than the passed array length
	 */
	@Test
	public void testPositionGreaterThanArrayLength () {
		Integer[] values = new Integer[] {1, 2, 3, 4};
		RotationArrayUtil.rotate(values, 6);
		
		assertArrayEquals(new Object[] {3, 4, 1, 2}, values);
	}
}
