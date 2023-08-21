package com.test.main;

public class Main {
	public static void main(String args[]) {
	
		TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
		tda.insertValueInArray(0, 0, 10);
		tda.insertValueInArray(0, 1, 20);
		tda.insertValueInArray(1, 0, 30);
		tda.insertValueInArray(1, 1, 40);
		tda.insertValueInArray(2, 0, 50);
		tda.insertValueInArray(2, 1, 60);
		tda.insertValueInArray(2, 2, 70);
		
//		System.out.println(Arrays.deepToString(tda.arr));
		
		System.out.println("---------Access value at given index----------");
		tda.accessValueAtGivenIndex(0, 1);
		
//		System.out.println("---------Array traversal----------");
//		tda.traversse2DArray();
		
		System.out.println("---------Searching 2D array----------");
		tda.searchValue(90);
		
		System.out.println("---------value deletion in 2D array----------");
		tda.traversse2DArray();
		tda.deleteArrayValue(1, 1);
		tda.traversse2DArray();
	}
}
