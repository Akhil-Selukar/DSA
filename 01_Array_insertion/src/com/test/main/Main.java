package com.test.main;

public class Main {

	public static void main(String[] args) {
		
		SingleDimensionArray sda = new SingleDimensionArray(6);
		sda.insert(0, 0);	// Inserting value at index 0
		sda.insert(1, 15);	// Inserting value at index 1
		sda.insert(2, 18);	// Inserting value at index 2
		sda.insert(1, 20);	// Re-inserting value at index 1
		sda.insert(10, 19);	// Accessing index out of array size

		var firstElement = sda.arr[0];			// O(1)
		System.out.println(firstElement);		// O(1)
		var secondElement = sda.arr[1];			// O(1)
		System.out.println(secondElement);		// O(1)
		var invalidElement = sda.arr[8];		// O(1)
		System.out.println(invalidElement);		// O(1)
		
		// The overall time complexity of the code is O(1)
		// as no additional space is required to fetch the element from an array hence space complexity is also O(1)
	}

}
