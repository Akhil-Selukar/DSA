package com.test.main;

import java.util.Arrays;

public class Main {

	/*
	 * Write a function which takes integer array as a parameter and return a new integer array with unique elements (remove duplicates)
	 * 
	 * Example: given array = {1,1,2,2,3,4,5}
	 * output = {1,2,3,4,5}
	 */
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,4,5};
		int[] result = removeDuplicates(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] removeDuplicates(int[] arr) {
		Arrays.parallelSort(arr);
		int[] uniqueArr = new int[arr.length];					// O(n)
		int index = 0;											// O(1)
		for(int i=0; i<arr.length; i++) {						// O(n)
			boolean isDuplicate = false;						// O(1)
			for(int j=i+1; j< arr.length; j++) {				// O(n)
				if(arr[i] == arr[j]) {							// O(1)
					isDuplicate = true;							// O(1)
					break;										// O(1)
				}
			}
			if(!isDuplicate) {									// O(1)
				uniqueArr[index++] = arr[i];					// O(1)
			}
		}
//		System.out.println("==>>"+Arrays.toString(uniqueArr));		// [1,2,3,4,5,0,0]
//		System.out.println("==>>"+Arrays.toString(Arrays.copyOf(uniqueArr, index))); // [1,2,3,4,5]
		return Arrays.copyOf(uniqueArr, index);					// O(n)
		
		
		// overall complexity for the above code is O(n^2)
	}

}
