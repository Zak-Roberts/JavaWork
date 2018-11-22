// basic example of using hashmaps to store people and addresses

package com.cognizant.Examples;

public class Hashmaps {

	public static void main(String[] args) {

		Person p1 = new Person("Zak", "Roberts", "Salford");
		Person p2 = new Person("Charles", "Darwin", "London");

		
		for (Integer name : Person.people.keySet()){
			String key = name.toString();
			String value = Person.people.get(name).toString();
            System.out.println(key + " " + value);  
		}
		
	}

}