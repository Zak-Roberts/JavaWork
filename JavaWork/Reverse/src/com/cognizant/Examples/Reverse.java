// reverses and inputted string

package com.cognizant.Examples;

public class Reverse {

	public static void main(String[] args) {

		Reverse r = new Reverse();
		
		System.out.println(r.reverse("Hello"));
		
	}

	public String reverse(String str) {
		String reverse = "";
		for (int i = str.length()-1; i >=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
	
}
