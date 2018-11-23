// examples of ArrayLists, streams and ternaries

package com.cognizant.Examples;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class World {

	public static void main(String[] args) {

		ArrayList <Cat> cats = new ArrayList <Cat>();
		cats.add(new Cat("Pippa"));
		cats.add(new Cat("Jack"));
		
		for (Cat cat : cats) {
			System.out.println(cat.name);
		}
		
		cats.stream().map(cat -> cat.attitude = cat.name.equals("Pippa") ? "Sad":"Happy").peek(c -> System.out.println(c.toString())).collect(Collectors.toList());
		
	}
	
	public String toString() {
		Cat cat = new Cat();
		return cat.name + ", " + cat.attitude;
	}

}
