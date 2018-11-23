package com.cognizant.Examples;

public class MoreForLoops {

	public static void main(String[] args) {
		for (int i = 0; i<=10; i+=2) {
			if (i==6) {
				continue;
				//break;
				//return;
			}
		System.out.println(i);
		}
	}
}
