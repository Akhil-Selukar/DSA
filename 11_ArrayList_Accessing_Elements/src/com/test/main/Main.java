package com.test.main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2,4);
//		System.out.println(numbers);
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(1));
		
		// We can access elements of arrayList by using .get(index) method.
		// here we know the index and same logic as that of Array is applied and hence
		// we can directly visit the location of given index and get the elements present there.
		// Hence the time complexity for accessing element in ArrayList is O(1).
		// As no additional memory space is required to access element at given index, the space complexity is also O(1)
	}

}
