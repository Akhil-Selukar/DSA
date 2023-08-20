package com.test.main;

public class TwoDimensionalArray {

	int arr[][] = null;
	
	// Constructor to initialize the array
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	// Insert value at given index.
	public  void insertValueInArray(int rowIndex, int colIndex, int value) {
		try {
			if(arr[rowIndex][colIndex] == Integer.MIN_VALUE) {					// O(1)
				arr[rowIndex][colIndex] = value;								// O(1)
				System.out.println("Value is successfully inserted..!!");		// O(1)
			} else {
				System.out.println("The cell is already occupied..!!");			// O(1)
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This index is not valid");						// O(1)
		}
	}
	
	// As we can see in above code to insert value at given index the time complexity is O(1)
	// As no additional save operations are being performed hence the space complexity is also O(1)

}
