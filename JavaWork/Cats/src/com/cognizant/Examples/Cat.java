package com.cognizant.Examples;

public class Cat {

	String name;
	String attitude;
	
	Cat(String name){
		this.name = name;
	}
	
	Cat(){
		
	}
	
	public String toString() {
		Cat cat = new Cat();
		return cat.name + ", " + cat.attitude;
	}

}
