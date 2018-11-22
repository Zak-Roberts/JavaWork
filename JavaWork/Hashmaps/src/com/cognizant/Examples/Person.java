// person class for inputting people to a hashmap

package com.cognizant.Examples;

import java.util.HashMap;

public class Person {

	private String firstName;
	private String midName;
	private String lastName;
	private String address;
	public int numOfPeopleMade;
	private int personId;
	
	static HashMap <Integer, Person> people = new HashMap <Integer, Person>();
		
	Person(String firstName, String lastName, String address){
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);

		Person oldValue = people.get(numOfPeopleMade);
		if (oldValue == null) {
			people.put(numOfPeopleMade, this);
		} else {
			people.put(numOfPeopleMade + 1, this);
		}
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String toString() {
		return firstName + " " + lastName + ", " + address + "\n";
 	}
	
}
