package com.cognizant.Examples;

import java.util.ArrayList;

public class Vehicle {

	private String name;
	private String colour;
	private int weight;

	private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();


	Vehicle(String name, String colour, int weight) {
		// Vehicle vehicle = new Vehicle(name, colour, wheels);
		this.setName(name);
		this.setColour(colour);
		this.setWeight(weight);
		vehicles.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static ArrayList<Vehicle> getVehicles(){
		return Vehicle.vehicles;
	}
}