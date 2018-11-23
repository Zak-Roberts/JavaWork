package com.cognizant.libraryTestDrivenDevelopment;

import java.util.ArrayList;

public class People {

	private String firstName;
	private String midName;
	private String lastName;
	private String address;
	private static int numOfPeopleMade = 0;
	private int personId;
	
	static ArrayList <People> people = new ArrayList <People>();
	
	People(){
		
	}
	
	People(String firstName, String lastName, String address){
		
		setNumOfPeopleMade(getNumOfPeopleMade() + 1);
		this.setPersonId(numOfPeopleMade);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		
		people.add(this);

		
	}
	
	People(String firstName, String midName, String lastName, String address){
		
		setNumOfPeopleMade(getNumOfPeopleMade() + 1);
		this.setPersonId(numOfPeopleMade);
		this.setFirstName(firstName);
		this.setMidName(midName);
		this.setLastName(lastName);
		this.setAddress(address);
		
		people.add(this);
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}
	
	public static int getNumOfPeopleMade() {
		return numOfPeopleMade;
	}

	public void setNumOfPeopleMade(int numOfPeopleMade) {
		People.numOfPeopleMade = numOfPeopleMade;
	}
	
	public String toString() {
		if(midName == null) {
			return personId + " " + firstName + " " + lastName + ", " + address + "\n";
		}
		else if(midName != null) {
			return personId + " " + firstName + " " + midName + " " + lastName + ", " + address + "\n";
		}
		return "";
 	}
	
}
