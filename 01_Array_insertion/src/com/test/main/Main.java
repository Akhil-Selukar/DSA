package com.test.main;

public class Main {

	public static void main(String[] args) {
		
		SingleDimensionArray arr = new SingleDimensionArray(6);
		arr.insert(0, 0);	// Inserting value at index 0
		arr.insert(1, 15);	// Inserting value at index 1
		arr.insert(2, 18);	// Inserting value at index 2
		arr.insert(1, 20);	// Re-inserting value at index 1
		arr.insert(10, 19);	// Accessing index out of array size

	}

}
