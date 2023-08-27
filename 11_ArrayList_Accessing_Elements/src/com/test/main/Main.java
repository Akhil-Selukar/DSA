package com.test.main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		int target = 3;

//      APPROACH 1: For loop
		for(int i=0; i<numbers.size(); i++) {
			if(numbers.get(i) == target) {
				System.out.println("element found");
				break;
			}
		}
		
//      APPROACH 2: For-each loop
		for(Integer num:numbers) {
			if(num == target) {
				System.out.println("element found");
				break;
			}
		}
		
//      APPROACH 2: indexOf()
		int index = numbers.indexOf(target);			// will return index of the element if found otherwise will return -1.
		if(index >= 0)
			System.out.println("element found");
	}
	
	// In all of the above approaches arrayList traversal is involved hence the time complexity is O(N).
	// While no additional memory is required in proportion with the number of elements hence space complexity is O(1).  

}
