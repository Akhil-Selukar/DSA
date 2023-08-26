package com.test.main;

public class Main {

	/*
	 * Remove duplicates from sorted array - Leetcode 26
	 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once
	 * and return the new length. Do not allocate extra space for another array, 
	 * you must do this by modifying the input array in-place with O(1) space complexity.
	 */
	
	public static void main(String[] args) {
		
		int[] nums = {};
		System.out.println(removeDuplicates(nums));

	}

	private static int removeDuplicates(int[] nums) {
		
		if(nums.length == 0)
			return 0;
		
		int i=0;
		
		for(int j=1; j<nums.length; j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		
		return i+1;
	}

	// here as we are not creating any new array we are just using a 
	// counter variable i and that too will not have N number of elements it will only have 1 value at a time
	// hence the space complexity for this code will be O(1) and the time complexity will be O(N-1) (by dropping non dominant value it will be O(N))
	
}
