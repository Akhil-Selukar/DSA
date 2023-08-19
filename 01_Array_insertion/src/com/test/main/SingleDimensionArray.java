package com.test.main;

public class SingleDimensionArray {
	int[] arr = null;
	
	// Initializing the array to MIN_VALUE of integer using constructor.
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void insert(int location, int valueToInsert) {
		try {
			if(arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToInsert;
				System.out.println("successfully inserted.");
			} else {
				System.out.println("This index is already occupied.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index..!!");
		}
	}
}
