package com.test.main;

public class Main {
	public static void main(String args[]) {
	
		TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
		tda.insertValueInArray(0, 0, 10);
		tda.insertValueInArray(0, 1, 20);
		tda.insertValueInArray(0, 0, 30);
		tda.insertValueInArray(1, 4, 40);
		
//		System.out.println(Arrays.deepToString(tda.arr));
		
		System.out.println("---------Access value at given index----------");
		tda.accessValueAtGivenIndex(0, 1);
	}
}
