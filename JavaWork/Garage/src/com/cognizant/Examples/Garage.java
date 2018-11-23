// a garage that stores 3 types of vehicles
// you can add or remove vehicles, and it calculates a garage bill depending on vehicle type
// each vehicle type has its own attributes as well as the ones it inherits from 'vehicle'

package com.cognizant.Examples;

import java.util.ArrayList;

public class Garage {

	static Garage garage = new Garage();

	public static void main(String[] args) {
		
		
		Vehicle ford = new Car("Ford","Red",400, false);
		Vehicle harley = new Motorcycle("Harley Davidson","Orange",250, "H3110 W0R1D");
		Vehicle titanic = new Boat("Titanic","White & Black",10000,5);
		Vehicle triumph = new Motorcycle("Triumph","Black",200,"L8R L053R5");
				
		for(Vehicle vehicle : Vehicle.getVehicles()) {

			int totalBill = 0;
				if(vehicle instanceof Car) {
					totalBill = 100;
					Car vehicle1 = (Car) vehicle;
					System.out.println(vehicle1.toString());
				}
				else if(vehicle instanceof Motorcycle) {
					totalBill = 75;
					Motorcycle vehicle1 = (Motorcycle) vehicle;
					System.out.println(vehicle1.toString());

				}
				else if(vehicle instanceof Boat) {
					totalBill = 5000;
					Boat vehicle1 = (Boat) vehicle;
					System.out.println(vehicle1.toString());
				}
			System.out.println("Your total bill is £" + totalBill + "\n");		
		}
		
		for (Vehicle vehicle : Vehicle.getVehicles()) {
			System.out.println(vehicle.toString());}
		
		System.out.println(removeByName("Triumph"));
		for (Vehicle vehicle : Vehicle.getVehicles()) {
			System.out.println(vehicle.toString());
		}
		

		garage.addVehicle("Peugeot", "Siler", 400, true);
		for (Vehicle vehicle : Vehicle.getVehicles()) {
			System.out.println(vehicle.toString());}
		
	}
	
	public void addVehicle(String name, String colour, int weight, boolean fourWheelDrive){
		Vehicle name1 = new Car(name, colour, weight, fourWheelDrive);
		System.out.println("You have added a " + name + " to the garage \n");
	}
	
	public void addVehicle(String name, String colour, int weight, String numberPlate) {
		Vehicle name2 = new Motorcycle(name, colour, weight, numberPlate);
		System.out.println("You have added a " + name + " to the garage \n");
	}
	
	public void addVehicle(String name, String colour, int weight, int numFunnels) {
		Vehicle name3 = new Boat(name, colour, weight, numFunnels);
		System.out.println("You have added a " + name + " to the garage \n");
		
	}
	
	public static String removeByName(String string1) {
		Vehicle.getVehicles().removeIf(s -> s.getName().equals(string1));
		return "You have removed the first instance of " + string1 + "\n";
	}	

	
	public String removeByType (String string2) {
		
		ArrayList <String> vehicleTypes = new ArrayList <String> ();
		vehicleTypes.add("Car");
		vehicleTypes.add("Motorcycle");
		vehicleTypes.add("Boat");
		
		if (string2.equals("Car")) {
			Vehicle.getVehicles().remove(0);
		}
		if (string2.equals("Motorcycle")) {
			Vehicle.getVehicles().remove(1);
		}
		if (string2.equals("Boat")) {
			Vehicle.getVehicles().remove(2);
		}
		
		return "You have removed the first instance of " + string2 + "\n";
		
	}
	
	public static String emptyGarage() {
		Vehicle.getVehicles().clear();
		return "Your garage has been emptied" + "\n";
	}
	
}