// first scanner example - returns a user input

package com.cognizant.Examples;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		ScannerExample scanner = new ScannerExample();
		System.out.println(scanner.input());
		
	}
	
	public String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String input = sc.nextLine();
		return input;
	}

}
