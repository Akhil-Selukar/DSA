package com.test.main;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

//		APPROACH 1: For loop
		for(int i = 0; i < numbers.size(); i++) {			// O(N) as number of iterations are directly proportional to number of elements.
			System.out.println(numbers.get(i));				// O(1)
		}
		// The overall time complexity for above piece of code is O(N).
		// And as no additional memory space is required hence the space complexity is O(1).
		
		System.out.println("----------------------");
//		APPROACH 2: For each loop
		for(Integer num : numbers) {
			System.out.println(num);
		}
		// Here also we are visiting each and every element and hence the time complexity is O(N).
		// And as no additional memory space is required the space complexity is O(1)
		
		System.out.println("----------------------");
//		APPROACH 3: Iterator
		Iterator<Integer> itr = numbers.iterator(); 		// Using iterator() method to get the iterator of arrayList.
		while(itr.hasNext()) {								// Check for next element.
			System.out.println(itr.next());					// Accessing the next element.
		}
		
		// Here also we are visiting each and every element hence the time complexity is O(N).
		// And as no additional space is required hence the space complexity is O(1).
	}

}
