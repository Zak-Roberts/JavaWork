// using conditional statements to iterate through and add numbers

package com.cognizant.Examples;

public class Conditionals {

	public static void main(String[] args) {
		int a = 3;
		int sum;
		for (int i = 0; i <= 10; i++) {
			sum = condition(a,i,false);
			System.out.println(sum);
		} 
	}
	public static int condition(int num1, int num2, boolean bool) {
		int result = 0;
		if (bool == true) {
			result = num1 + num2;
		}
		else if (bool == false) {
			result = num1 * num2;
		}
		return result;
	}
}
