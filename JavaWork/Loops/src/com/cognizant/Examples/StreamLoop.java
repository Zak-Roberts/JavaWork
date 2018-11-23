package com.cognizant.Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLoop {

	public static void main(String[] args) {

		ArrayList <Integer> numbers = new ArrayList <Integer> ();
		numbers.add(1);
		numbers.add(5);
		numbers.add(3);
		numbers.add(18);
		numbers.add(14);
		
		List <Integer> numlist = numbers.stream()
		.peek(number -> System.out.println(number))
		.collect(Collectors.toList());
	}
}
