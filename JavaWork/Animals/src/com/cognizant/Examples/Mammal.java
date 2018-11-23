package com.cognizant.Examples;

public class Mammal extends Animal {

	private String speak;
	Mammal(String speak, boolean tail){
		super(tail);
		this.speak = speak;
	}
	
	public String getSpeak() {
		return "meow";
	}
}
