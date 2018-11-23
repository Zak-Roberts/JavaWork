// basic array example - using a for loop to add values

package com.cognizant.Examples;

public class arraypractice {
	public static void main(String[] args) {
		int [] numbers = new int [10];

		
		for (int i = 0; i<numbers.length; i++) {
			numbers[i] = i;
			System.out.println(numbers[i]);
		}
		
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]*10);
		}
	}
}