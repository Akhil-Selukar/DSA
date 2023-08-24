package com.test.main;

public class Main {
	
	/*
	 * Write a java function called findMissingNumberInArray which takes an integer array
	 * containing 'n-1' unique elements from a range of 1 to n,
	 * with one missing number.
	 * The function must identify which number is missing and return it. 
	 */
	
	public static void main(String[] args) {	
		
		int[] arr = {1,2,6,3,4,9,8,7};		// here the number missing is 5.
//		int[] arr = {1,2,6,3,4,5,8,7};		// here the number missing is 9.
//		int[] arr = {};		// here the number missing is 1.
		
		System.out.println(findMissingNumberInArray(arr));
	}

	private static int findMissingNumberInArray(int[] arr) {
		
		int n = arr.length;
		int naturalSum = ((n+1) * (n + 2))/2;			// sum of first n natural numbers. (n*(n+1)/2)
		int arraySum = 0;
		for(int i=0; i< arr.length; i++) {
			arraySum += arr[i];
		}
		return naturalSum - arraySum;
	}
	
	// time complexity for this program is O(N)
}
