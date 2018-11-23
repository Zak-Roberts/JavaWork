package com.cognizant.Examples;

public class NewBox {
	
	public int area;
	public int width;
	public int length;
	
	NewBox(int length, int width){
		this.length = length;
		this.width = width;
		area = length * width;	// this. not needed 
	}
}