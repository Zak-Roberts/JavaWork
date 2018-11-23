package com.cognizant.Examples;

public class CaseExample {

	public static void main(String[] args) {
		String day = "Monday";
		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
			System.out.println("Nooo");
			break;
		case "Thursday":
			System.out.println("Nearly party time..");
			break;
		case "Friday":
			System.out.println("Party!");
		default:
			System.out.println("Didn't recognise day");
			break;
		}
	}
}
