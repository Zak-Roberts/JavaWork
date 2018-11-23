package com.cognizant.Examples;

public class Boat extends Vehicle {
	
	private int numFunnels;
	
	Boat (String name, String colour, int weight, int numFunnels){
		super(name, colour, weight);
		this.setNumFunnels(numFunnels);
	}

	public String toString() {
		return getName() + ", " + getColour() + ", " + "weighs " + getWeight() + "kg" + ", " + "has  " + getNumFunnels() + " funnels"; 
	}

	public int getNumFunnels() {
		return numFunnels;
	}

	public void setNumFunnels(int numFunnels) {
		this.numFunnels = numFunnels;
	}
}