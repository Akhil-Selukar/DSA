package com.test.main;

public class Main {

	/*
	 * Best time to buy and sell stocks - Leetcode 121 You are given an array
	 * 'price' where price[i] is the price of a given stock on the ith day. You want
	 * to maximize your profit by choosing a single day to buy one stock and
	 * choosing a different day in future to sell that stock Return the maximum
	 * profit you can achieve from this transaction. If you cannot achieve any
	 * profit, return 0.
	 * 
	 * Example: input -> price = [7,1,5,3,6,4] output -> 5
	 * 
	 * Explanation: Buy on day 2 (price=1) and sell on day 5 (price 6), profit = 6-1
	 * = 5.
	 */

	public static void main(String[] args) {
		int[] price = { 7, 1, 5, 3, 6, 4 };
//		int[] price = {};
//		int[] price = { 7, 1};
//		int[] price = { 7, 1, 1, 1};
//		int[] price = { 7, 2, 5, 1, 8, 4 };
		System.out.println(maxProfit1(price));
		System.out.println(maxProfit2(price));
	}

// APPROACH 1:
	private static int maxProfit1(int[] price) {

		if (price.length == 1)
			return 0;

		int profit = 0;

		for (int i = 0; i < price.length - 1; i++) {
			for (int j = i + 1; j < price.length; j++) {
				if ((price[j] - price[i]) > profit) {
					profit = price[j] - price[i];
				}
			}
		}
		return profit;
	}

// APPROACH 2:
	private static int maxProfit2(int[] prices) {

		int minPrice = Integer.MAX_VALUE;
		int profit = 0;

		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price;
			} else if(price - minPrice > profit) {
				profit = price - minPrice;
			}
		}
		return profit;
	}

//	Now from above two approach it is very clear that time complexity for Approach 1 is O(N^2) and that of Approach 2 is O(N).
//	Hence Approach 2 is better for this problem.
	
}
