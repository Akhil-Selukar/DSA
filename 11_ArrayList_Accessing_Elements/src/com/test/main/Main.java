package com.test.main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		
		int valueToRemove = 3;
		
		numbers.remove(valueToRemove);					// remove(index) -> passing the index. here the value at index 3 will be removed.
		System.out.println(numbers);
		
		numbers.remove((Integer)valueToRemove);			// remove(object) -> passing the object (boxing). Here the first occurrence of 3 will be removed
		System.out.println(numbers);
		
		// Here as the shifting of all the elements present after the deleted element is involved the time complexity is O(N).
		// And as no extra space proportional to the number of element in ArrayList is required hence space complexity is O(1)
	}
}
