// basic inputMismatchException code

package com.cognizant.Examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicException {

	public static void main(String[] args) {

		BasicException e = new BasicException();
		
		System.out.println(e.userInput());
	}
	
	public String userInput() {
		
		int input = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		try {
			input = sc.nextInt();
			sc.close();
			return "Your number is " + input;
		}
		catch(InputMismatchException e){
			//e.printStackTrace();		this line prints red exceptions
			System.out.println("YOU'RE WRONG");
		}
		sc.close();
		return "";
	}
	
}