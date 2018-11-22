package com.cognizant.Examples;

// a program to find triangle numbers given an input - eg. triangle(4) will give 4th triangle number
// also sums triangle numbers up to a given input - eg. sumTriangle(4) will give the sum of first 4 triangle numbers

public class Recursion {

	public static void main(String[] args) {

		System.out.println(triangle(4));
		
	}
	
	public static long triangle (long num) {
		if(num == 1) {
			return 1;
		}
		else {
			return triangle(num-1) + num;
		}
	}
	
	public static long sumTriangle (long num) {
		if(num == 1) {
			return 1;
		}
		else {
			return sumTriangle(num-1) + triangle(num);
		}
	}

}
