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
			if(arr[location] == Integer.MIN_VALUE) {					// O(1)
				arr[location] = valueToInsert;							// O(1)
				System.out.println("successfully inserted.");			// O(1)
			} else {
				System.out.println("This index is already occupied.");	// O(1)
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index..!!");					// O(1)
		}
	}
	
	// As all the steps has time complexity of O(1) hence the time complexity of this code will be O(1)
}
