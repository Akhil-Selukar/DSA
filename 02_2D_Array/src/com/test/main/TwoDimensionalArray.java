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
		for(int row=0; row < arr.length; row++) {				// O(M) where M is number of rows
			for(int col=0; col < arr[0].length; col++) {		// O(N) where N is number of columns
				System.out.print(arr[row][col]+" ");			// O(1)
			}
			System.out.println();								// O(1)
		}
	}
	
	// from above code we can see that in outer loop if M is the number of rows then O(M) is the time complexity for first loop
	// if N is the number of columns in the 2D array then O(N) will be the complexity for inner loop and the code is in the form of
	// do inner loop for each iteration/value of outer loop. Hence it will be multiplication of complexity so overall complexity for 
	// 2D array traversal is O(MN)
	// as we don't need any extra space during execution of the above code hence the space complexity of the above code is O(1)
	
}
