// throws inputMismatchException code

package com.cognizant.Examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		
		InputMismatch e = new InputMismatch();
		
		System.out.println(e.method1());
		
	}
	
	public String method1() {
		try {
			return "Your number is " + method2();
		}
		catch (InputMismatchException e) {
			System.out.println("That's not a number!");
		}
		return "";
	}
	
	public int method2() throws InputMismatchException{		// works without 'throws InputMismatchException'
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		sc.close();
		return input;
	}
}