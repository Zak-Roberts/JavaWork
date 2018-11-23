// finds the factorial relating to a user input (returns none if input is not a factorial number)

package com.cognizant.factorials;

import java.util.Scanner;

public class Factorials {
	
	public static void main(String[] args) {
		
		System.out.println("The factorial for your number is " + factorial(120));
		
	}
	public static String factorial(int number) {
		int i=1;
		String result;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = scanner.nextInt();
		
		do {
				
				if(number%i == 0) {
				number = number/i;
				result = (i) + "!";
				i++;
				
				}
				else {
					result = "None";
					break;
				}
	
		} while(number>1);
	return result; 
	}

}
