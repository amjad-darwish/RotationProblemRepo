package org.odesk.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class used to rotate the passed array based on the passed position value
 *  
 * @author Amjad Darwish
 */
public class RotationArrayUtil {
	private static final Logger logger = Logger.getLogger(RotationArrayUtil.class.getName());
	
	/**
	 * Used to rotate the passed array based on the passed position 
	 * 
	 * @param values	The array that must be rotated
	 * @param position	The position value that will be used to know how many items must be rotated
	 */
	public static <T> void rotate(T[] values, int position) {
		// Check the passed array must NOT be null or empty
		if (values == null || values.length == 0) {
			logger.log(Level.SEVERE, "The array must NOT be null or empty!");
			
			throw new IllegalArgumentException("The array must NOT be null or empty!");
		}
		
		// Check the position must NOT be less than ZERO
		if(position < 0) {
			logger.log(Level.SEVERE, "The position must NOT be less than Zero");
			
			throw new IllegalArgumentException("The position must NOT be less than Zero");
		}
		
		// Check if the position NOT Equal ZERO we will execute the rotation business logic
		// otherwise we don't need to run it
		if(position != 0) {
			// We need it in case the position greater than the length of the passed array
			position %= values.length;
			
			// Reverse all items in array
			// Assume the passed array {1, 2, 3, 4}, position 2
			// After reversing all items {4, 3, 2, 1}
			ReverseArrayUtil.reverse(values);
			
			// Reverse the first part of the array that include the items from 0 index until the passed position
			// the passed position will be excluded
			// After reversing the first part the array should be {3, 4, 2, 1}
			ReverseArrayUtil.reverse(values, 0, position);
			
			// Reverse the last part of array
			// After reversing the array will be {3, 4, 1, 2}
			ReverseArrayUtil.reverse(values, position);
		}
	}
}
