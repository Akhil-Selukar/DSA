package com.text.main;

public class Main {

	/*
	 * Given a 2D array, calculate the sum of diagonal elements
	 * Example :
	 * myArray = {{1,2,3},{4,5,6},{7,8,9}}
	 * sumDiagonalElements(myArray)  ->  15 (i.e. 1+5+9)
	 */
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(sumDIagonalElements(arr));
		System.out.println(sumDIagonalElements1(arr));
	}
	
//	APPROACH 1
	public static int sumDIagonalElements(int[][] array){
		int sum =0;
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[0].length; j++){
				if(i == j)
					sum += array[i][j];
			}
		}
		return sum;
	}
//	Here time complexity for above code is O(N^2)
	
	
//	APPROACH 2
	public static int sumDIagonalElements1(int[][] array){
		int sum =0;
		for(int i=0; i<array.length; i++){
			sum += array[i][i];
		}
		return sum;
	}
//	Here time complexity for above code is O(N)
//	Hence 2nd approach is much more better that the first one.
	
}
