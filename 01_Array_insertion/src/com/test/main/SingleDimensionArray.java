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
	
	// Array insertion
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
	
	// Array traversal
	public void traverseArray() {
		try {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}catch(Exception e){
			System.out.println("Array no longer exists.!");
		}
	}
	
	// Array search
	public void searchInArray(int valueToSearch) {
		for(int i=0; i<arr.length; i++) {									// O(N)
			if(arr[i] == valueToSearch) {									// O(1)
				System.out.println("Value is found at the index of "+i);	// O(1)
				return;
			}
		}
		System.out.println(valueToSearch+" is not found.!");				// O(1)
	}
	// Time complexity for array search is O(N)
	// Space complexity for above code is O(1) as no extra memory is required to perform this peration.
}
