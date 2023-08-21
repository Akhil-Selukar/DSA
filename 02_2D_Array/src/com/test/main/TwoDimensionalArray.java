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
		System.out.println("Acccessing row "+rowIndex+" and column "+colIndex);
		try {
			System.out.println("cell value is = "+arr[rowIndex][colIndex]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This index is not valid");
		}
	}
	
	
	// Array traversal
	public void traversse2DArray() {
		for(int row=0; row < arr.length; row++) {
			for(int col=0; col < arr[0].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	
	// Searching given value in 2D array (Linear search)
	public void searchValue(int valueToSearch) {
		for(int row=0; row < arr.length; row++) {											// O(M)
			for(int col=0; col < arr[0].length; col++) {									// O(N)
				if(arr[row][col] == valueToSearch) {										// O(1)
					System.out.println("value fount at index row "+row+" column "+col);		// O(1)
					return;
				}
			}
		}
		System.out.println("given value is not present in the array");						// O(1)
	}
	
	// from above code it is very clear that the time complexity of linear search in 2D array is O(MN) and space complexity is O(1)
}
