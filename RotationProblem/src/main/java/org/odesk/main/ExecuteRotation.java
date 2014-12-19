package org.odesk.main;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.odesk.utils.RotationArrayUtil;

/**
 * This class used as main class that received 2 parameters, the first parameter is the array that must be rotated by the passed position,
 * the array should be comma separated and contained within double quote "", the second parameter is a simple number that used to rotate the
 * passed array 
 * 
 * @author Amjad Darwish
 */
public class ExecuteRotation {
	private static final Logger logger = Logger.getLogger(ExecuteRotation.class.getName());

	public static void main(String[] args) {
		// Log the passed parameters
		logger.info("The passed parameters:");
		
		logger.info(Arrays.asList(args).toString());
		
		// Check the passed parameters match the expected count
		if(args.length != 2) {
			logger.log(Level.SEVERE, "The passed parameters should be 2 parameters!");
			throw new IllegalArgumentException("The passed parameters should be 2 parameters!");
		}
		
		int position = 0;
		
		// Get the position from the passed parameter, and convert it to integer value
		try {
			position = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			logger.log(Level.SEVERE, "The position value \"The second Item\" should be Integer!");
			throw new IllegalArgumentException("The position value \"The second Item\" should be Integer!");
		}
		
		// Get the arrays values
		// The expected array must be separated by ","
		// so we need to split the passed parameter to get the array's values
		String []values = args[0].split(",");
		
		// Call the rotation business
		RotationArrayUtil.rotate(values, position);
		
		// Log the passed array after execution the rotation business over it
		logger.info("The rotated array:");
		
		logger.info(Arrays.asList(values).toString());
	}

}
