package com.test.main;

public class Main {

	public static void main(String[] args) {
		
		SingleDimensionArray sda = new SingleDimensionArray(6);
		sda.insert(0, 0);	// Inserting value at index 0
		sda.insert(1, 15);	// Inserting value at index 1
		sda.insert(2, 18);	// Inserting value at index 2
		sda.insert(1, 20);	// Re-inserting value at index 1
		sda.insert(10, 19);	// Accessing index out of array size

		//Accessing elements in array
		var firstElement = sda.arr[0];
		System.out.println(firstElement);
		var secondElement = sda.arr[1];
		System.out.println(secondElement);
//		var invalidElement = sda.arr[8];
//		System.out.println(invalidElement);
		
		System.out.println("-------Array Traversal--------");
		sda.traverseArray();
	}

}
