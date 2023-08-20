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
			if(arr[rowIndex][colIndex] == Integer.MIN_VALUE) {
				arr[rowIndex][colIndex] = value;
				System.out.println("Value is successfully inserted..!!");
			} else {
				System.out.println("The cell is already occupied..!!");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This index is not valid");
		}
	}
	
	
	// Access element at given index
	public void accessValueAtGivenIndex(int rowIndex, int colIndex) {
		System.out.println("Acccessing row "+rowIndex+" and column "+colIndex);		// O(1)
		try {
			System.out.println("cell value is = "+arr[rowIndex][colIndex]);			// O(1)
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This index is not valid");							// O(1)
		}
	}
	
	// here we can clearly see that the time complexity is O(1) and as now additional 
	// memory is involved the space complexity will also be O(1)
}
