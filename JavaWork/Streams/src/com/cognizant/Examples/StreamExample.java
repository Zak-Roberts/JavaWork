// stream example with a filter implemented

package com.cognizant.Examples;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		
		ArrayList <String> dogs = new ArrayList <String> ();
		dogs.add("Buster");
		dogs.add("Rex");
		dogs.add("Dave");
		
		System.out.println(dogs);
		
		List<String> doglist = dogs.stream()
		.map(dog -> dog.toUpperCase())
		.filter(dog -> !dog.equals("BUSTER"))
		.peek(byeBuster -> System.out.println(byeBuster))
		.collect(Collectors.toList());
	}
}