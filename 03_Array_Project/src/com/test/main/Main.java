package com.test.main;

import java.util.Scanner;

public class Main {

	/*
	 * Problem statement:
	 * 
	 * Ask user for number of days for which he/she knows the highest temperature.
	 * Ask user to insert each days highest temperature.
	 * calculate the average temperature of given period and display it.
	 * identify how many days the highest temperature was above average temperature?
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("number of days : ");
		int days = sc.nextInt();
		
		int[] temp = new int[days];
		int sum = 0;
		int counter = 0;
		
		for(int i=0; i < days; i++) {
			System.out.println("day "+ (i+1) +", Highesttemprature : ");
			temp[i] = sc.nextInt();
			sum += temp[i];
		}
		
		System.out.println("Averagetemprature : "+sum/days);
		
		for(int i=0; i < days; i++) {
			if(temp[i] > sum/days) {
				counter++;
			}
		}
		System.out.println(counter+" days has abover average temprature.");
	}
}
