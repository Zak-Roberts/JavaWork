// exmaple of an ArrayList - printing each value

package com.cognizant.Examples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {	
		
		ArrayList<Integer> ArrayList = new ArrayList <Integer>();
		ArrayList.add(1);
		ArrayList.add(3);
		ArrayList.add(5);
		for (int i = 0; i < ArrayList.size(); i++) {
			System.out.println(ArrayList.get(i));
		}
	}
}
