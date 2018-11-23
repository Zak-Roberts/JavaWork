package com.cognizant.Examples;

public class Motorcycle extends Vehicle {
	
	private String numberPlate;
	
	Motorcycle (String name, String colour, int weight, String numberPlate){
		super(name, colour, weight);
		this.setNumberPlate(numberPlate);
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	
	public String toString() {
		return getName() + ", " + getColour() + ", " + "weighs " + getWeight() + "kg" + ", numberplate: " + numberPlate; 
	}
}