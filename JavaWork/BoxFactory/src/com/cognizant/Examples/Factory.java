package com.cognizant.Examples;

public class Factory {

	public static void main(String[] args) {
		
		NewBox box = new NewBox(10, 20);
		NewBox box2 = new NewBox(20, 40);
		System.out.println(box2.area);
	}
}
