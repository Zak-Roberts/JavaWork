package com.cognizant.Examples;

public class Loops {

	public static void main(String[] args) {
		int b = 0;
		boolean a = true;
		while(a) {
			for(int i = 0; i <= 10; i++) {
				System.out.println("I have " + i + " dogs");
			}
		if(b==10) {
			a = false;
		}
		else {
			b++;
		}
		}

	}

}
