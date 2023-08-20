package com.test.main;

import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		// step 1 - Declaration
		int[][] int2DArray;										// O(1)
		// step 2 - Instantiate
		int2DArray = new int[2][2];								// O(1)
		// step 3 - Initialize
		int2DArray[0][0] = 1;				// O(1)
		int2DArray[0][1] = 2;				// O(1)				// O(MN) overall time complexity for step 3
		int2DArray[1][0] = 3;				// O(1)
		int2DArray[1][1] = 4;				// O(1)
		
		System.out.println(Arrays.deepToString(int2DArray));	// O(1)
		
		// Now from above we can clearly see that the time complexity for above
		// piece of code is O(MN) where M is number of rows and N is number of columns.
		
		// All steps together
		
		String s2DArray[][] = {{"a", "b"}, {"c", "d"}};			// O(1)
		System.out.println(Arrays.deepToString(s2DArray));		// O(1)
		
		// Now here with this approach the time complexity for 2D array creation is O(1) only
		
		// for both the approach as we will be using M*N memory spaces to store elements in array 
		// and these memory locations are allocated at instantiation, hence space complexity for 2D array creation is O(MN).
	}
}
