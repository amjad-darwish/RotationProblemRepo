package org.odesk.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class used as a util class to reverse all items in the array or part of array 
 * 
 * @author Amjad Darwish
 */
public class ReverseArrayUtil {
	private static final Logger logger = Logger.getLogger(ReverseArrayUtil.class.getName());
	
	/**
	 * Reverse all items in the passed array
	 * 
	 * @param values The array that must be reversed
	 */
	public static <T>void reverse(T[] values) {
		// Check if the passed array is NULL or Empty
		if (values == null || values.length == 0) {
			logger.log(Level.SEVERE, "The array must NOT be null or empty!");
			
			throw new IllegalArgumentException("The array must NOT be null or empty!");
		}
		
		reverse(values, 0, values.length);
	}

	/**
	 * Reverse the items that contained in the array beginning of the passed index until the end 
	 * 
	 * @param values	The array that must be reversed 
	 * @param start		The start index
	 */
	public static <T> void reverse(T[] values, int start) {
		// Check if the passed array is NULL or Empty
		if (values == null || values.length == 0) {
			logger.log(Level.SEVERE, "The array must NOT be null or empty!");
			
			throw new IllegalArgumentException("The array must NOT be null or empty!");
		}
		
		reverse(values, start, values.length);
	}

	public static <T> void reverse(T[] values, int start, int end) {
		// Check if the passed array is NULL or Empty
		if (values == null || values.length == 0) {
			logger.log(Level.SEVERE, "The array must NOT be null or empty!");
			
			throw new IllegalArgumentException("The array must NOT be null or empty!");
		}
		
		// Check if the start or end indices are smaller than 0
		if(start < 0 || end < 0) {
			logger.log(Level.SEVERE, "The start or end index must NOT be less than Zero!");
			
			throw new IllegalArgumentException("The start or end index must NOT be less than Zero!");
		}
		
		// Check if the start index greater than end index
		if(end < start) {
			logger.log(Level.SEVERE, "The start index must NOT be greater than end index!");
			
			throw new IllegalArgumentException("The start index must NOT be greater than end index!");
		}
		
		// Check if the start and end indices are NOT Equal
		// If equal we don't need execute the reverse logic
		if(start != end) {
			// Temp variable using in swipe process
			T temp;
			
			// Loop over the array items and swipe the related items
			// First item with last item
			// Second item with before last item, and so on
			for(int startCount = start, endCount = end-1; startCount < endCount; startCount++, endCount--) {
				temp = values[startCount];
				values[startCount] = values[endCount];
				values[endCount] = temp;
			}
		}
		
	}
}
