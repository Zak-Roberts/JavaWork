// returns higher value (as long as it's 21 or less)

package com.cognizant.Examples;

public class Blackjack {

	public static void main(String[] args) {
		
		System.out.println(blackjack(21,17));	
	}
	
	public static int blackjack(int a, int b) {
		
		int result = 0;
		if (b > a && b <= 21) {
			result = b;
		}
		else if (a > b && a <= 21) {
			result = a;
		}
		else if (a > 21 && b <= 21)
		{
			result = b;
		}
		else if (b > 21 && a <= 21) {
			result = a;
		}
		else if (b > 21 && a > 21) {
			result = 0;
		}
		return result;
	}
	
}
