package com.cognizant.Examples;

public class Cat extends Mammal {

	private String size;
	Cat(String size, String speak, boolean tail){
		super(speak, tail);
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
}
