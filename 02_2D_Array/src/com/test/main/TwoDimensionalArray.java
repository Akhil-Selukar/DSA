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
		for(int row=0; row < arr.length; row++) {
			for(int col=0; col < arr[0].length; col++) {
				if(arr[row][col] == valueToSearch) {
					System.out.println("value fount at index row "+row+" column "+col);
					return;
				}
			}
		}
		System.out.println("given value is not present in the array");
	}
	
	
	// Deleting value at given index
	public void deleteArrayValue(int row, int col) {
		try {
			arr[row][col] = Integer.MIN_VALUE;						// O(1)
			System.out.println("Value deleted successfully.!!");	// O(1)
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalud index.!!");					// O(1)
		}
	}
	
	// It is very clear that the time and space complexity for above piece of code is O(1)
}
