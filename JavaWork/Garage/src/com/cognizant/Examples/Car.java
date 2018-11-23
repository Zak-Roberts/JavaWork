package com.cognizant.Examples;

public class Car extends Vehicle {
	
	private boolean fourWheelDrive;
	
	Car (String name, String colour, int weight, boolean fourWheelDrive){
		super(name, colour, weight);
		this.fourWheelDrive = fourWheelDrive;
	}
	public boolean get4WheelDrive() {
		return fourWheelDrive;
	}
	public void set4WheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
	
	public String toString() {
		String result = null;
		if (get4WheelDrive() == true) {
			result = "has 4 wheel drive";
		}
		if (get4WheelDrive() == false) {
			result = "does not have 4 wheel drive";
		}
		return getName() + ", " + getColour() + ", " + "weighs " + getWeight() + "kg" + ", " + result; 
	}
}