package com.test.main;

import java.util.Arrays;

public class Main {

	/*
	 * Tow Sum - Leetcode 1
	 * Give an array of integers 'nums' and an integer 'target', return indices of the two numbers such that
	 * they add up to the 'target'. You may assume that each input would have exactly one solution and you may not use the same element twice.
	 * 
	 * Example:
	 * 
	 * input -> nums = [2,7,11,15] target = 9
	 * output -> [0, 1]
	 * explaination -> as nums[0]+nums[1] = 9
	 * hence [0, 1]
	 * 
	 * input -> nums = [3,2,4] target = 6
	 * output -> [1,2]
	 * explaination -> as nums[1]+nums[2] = 6
	 * hence [1, 2]
	 */
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
//		int[] nums = {3,2,4};
//		int target = 6;
//		int[] nums = {1,3,6,4,8,9};
//		int target = 14;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	private static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int firstIndex = 0;
		
		for(int i=1; i< nums.length; i++) {
			if(nums[firstIndex] + nums[i] == target) {
				result[0] = firstIndex;
				result[1] = i;
				return result;
			} else if(i == nums.length-1 && firstIndex < nums.length-1) {
				firstIndex++;
				i=1;
			}
		}
		throw new IllegalArgumentException("No two sum solution found");
	}
	
	// time complexity for the above code is O(N)
}
