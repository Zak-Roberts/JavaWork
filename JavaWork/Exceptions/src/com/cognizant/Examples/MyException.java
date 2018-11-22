// showcasing creating my own exception in another class to throw here (linked class is 'ThrowException')

package com.cognizant.Examples;

import java.util.Scanner;

public class MyException {

	public static void main(String[] args) {
		
		MyException e = new MyException();
		
		try {
			System.out.println(e.method1());
		}
		catch(ThrowException e1) {
			System.out.println(e1.toString());
		}
	}

	public String method1() throws ThrowException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		float input = sc.nextFloat();
		sc.close();
		if(input == 0) {
			throw new ThrowException();
		}
		else {
			return "5 divided by your number is " + 5/input;
		}
	}

}


