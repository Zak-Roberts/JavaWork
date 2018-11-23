package com.cognizant.libraryTestDrivenDevelopment;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {

	public static void main(String[] args) {
	
		
		Library l = new Library();
		Book book = new Book();
		Journal journal = new Journal();
		Map map = new Map();
		
		
		Book helloWorld = new Book("Hello World", "Zak", 500,5);
		Journal scienceStuff = new Journal("Science Stuff", "Zak", 20,6);
		Map manchester = new Map("Manchester", "Zak", 40.00, 4);
		Book hi = new Book("Hi Earth", "Zak", 500, 2);


		System.out.println(l.addPerson("Zak", "World", "Mancehster"));
		System.out.println(l.addPerson("Zak", "M", "Roberts", "Congleton"));
		System.out.println(l.addPerson("Nichola", "Ward", "Oldham"));
		System.out.println("\n");
		
		System.out.println(Item.items.toString());
		System.out.println(map.getNumOfItems());
		System.out.println(journal.removeItem("Science Stuff", "Zak", 3));
		System.out.println(Item.items.toString());
		System.out.println(map.getNumOfItems());
		
//		System.out.println(book.checkOutItem("Hello, World"));
//		System.out.println(book.checkInItem("Hello, World"));
//		System.out.println(book.checkOutItem("Hello, World"));
//		System.out.println(journal.checkOutItem("Science Stuff"));
		


//		System.out.println(People.people.toString());
		
//		System.out.println(l.removePerson("Zak","Roberts"));
//		System.out.println(l.updatePerson(1, "firstname", "Nic"));
		
//		System.out.println(Item.items.toString());
//		System.out.println(People.people.toString());
//		
		
//		System.out.println(book.checkOutItem("Zak", "Roberts", "Hello World"));
//		System.out.println(helloWorld.numOfCopies);
//		System.out.println(book.removeItem("Hello World", "Zak", 2));
//		System.out.println(helloWorld.numOfCopies);
//		System.out.println(Item.checkItemWithPerson("Hello World"));

//		System.out.println(book.checkOutItem("Zak", "Roberts", "Hello World"));
//		System.out.println(journal.checkOutItem("Zak", "Roberts", "Science stuff"));
//		System.out.println(map.checkOutItem("Zak", "Roberts", "Manchester"));
//		System.out.println(book.checkOutItem("Zak", "Roberts", "Hi earth"));
		
	}
		
	public String addPerson(String firstName, String midName, String lastName, String address) {
		
		People person = new People(firstName, midName, lastName, address);
		return "You have successfully added " + firstName + " " + lastName + " to the people database";
	}
	
	public String addPerson(String firstName, String lastName, String address) {
		
		People person = new People(firstName, lastName, address);
		return "You have successfully added " + firstName + " " + lastName + " to the people database";
	}
	
	public String removePerson(String firstName, String lastName) {
	
		People.people = (ArrayList<People>) People.people.stream().filter(person -> !((person.getFirstName().equals(firstName)) && (person.getLastName().equals(lastName)))).collect(Collectors.toList());
		return "You have successfully removed " + firstName + " " + lastName + " from the database";
	}
	
	public String removePerson(int id) {
	
		String firstName = "";
		String lastName = "";
		
		for(People person : People.people) {		
			if (id == person.getPersonId()) {
				firstName = person.getFirstName();
				lastName = person.getLastName();
			}
		}		
		
		People.people = (ArrayList<People>) People.people.stream().filter(person -> (person.getPersonId() != (id))).collect(Collectors.toList());
		return "You have successfully removed " + firstName + " " + lastName + " from the database \n";
	}
	
	public String updatePerson(int id, String updateParameter, String updatedInfo) {
		String firstName = "";
		String lastName = "";
		updateParameter = updateParameter.toUpperCase();
		
		for (People person : People.people) {
			if(id == person.getPersonId()) {
				if (updateParameter.equals("FIRSTNAME")) {
					firstName = updatedInfo;
					person.setFirstName(updatedInfo);
					lastName = person.getLastName();
				}
				else if (updateParameter.equals("LASTNAME")) {
					lastName = updatedInfo;
					person.setLastName(lastName);
					firstName = person.getFirstName();
	
				}
				else if (updateParameter.equals("ADDRESS")) {
					person.setAddress(updatedInfo);
					firstName = person.getFirstName();
					lastName = person.getLastName();
				}
			}
		}
		
		return "You have updated the record for " + firstName + " " + lastName;
	}
	
	People p = new People("Hello","World","Manchester");
	
	public String updatePerson(People p, String updateParameter, String updatedInfo) {
		String firstName = "";
		String lastName = "";
		updateParameter = updateParameter.toUpperCase();
		
		for (People person : People.people) {
			if(p.getFirstName() == person.getFirstName() && p.getLastName()==person.getLastName()) {
				if (updateParameter.equals("FIRSTNAME")) {
					firstName = updatedInfo;
					person.setFirstName(updatedInfo);
					lastName = person.getLastName();
				}
				else if (updateParameter.equals("LASTNAME")) {
					lastName = updatedInfo;
					person.setLastName(lastName);
					firstName = person.getFirstName();
	
				}
				else if (updateParameter.equals("ADDRESS")) {
					person.setAddress(updatedInfo);
					firstName = person.getFirstName();
					lastName = person.getLastName();
				}
			}
		}
		
		return "You have updated the record for " + firstName + " " + lastName;
	}
	
}