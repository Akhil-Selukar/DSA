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
			for(int i=0; i<arr.length; i++) {				// O(n)
				System.out.print(arr[i]+" ");				// O(1)
			}
		}catch(Exception e){
			System.out.println("Array no longer exists.!");	// O(1)
		}
	}
	// From above time complexities we can see that the overall time complexity of array traversal is O(N)
	// As no additional memory is required to perform this operation and nothing is being stored in 
	// cache so the space complexity for array traversal is O(1)
}
