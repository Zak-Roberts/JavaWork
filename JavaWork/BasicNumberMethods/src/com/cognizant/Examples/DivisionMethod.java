// basic division method (can use floats and ints)

package com.cognizant.Examples;

public class DivisionMethod {
	
	public static void main(String[] args) {
		float a = 20;
		float b = 6;
		float c = DivisionMethod.division(a,b);
		System.out.println(c);
	}
	
	public static float division(float num1, float num2) {
		return num1/num2;
	}
	
}
