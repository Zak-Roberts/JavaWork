// example of inheritance

package com.cognizant.Examples;

public class World {

	public static void main(String[] args) {
		
		Cat pippa = new Cat("small", "hello", true);
		
		System.out.println(pippa.getSpeak());
		System.out.println(pippa.getSize());
		System.out.println(pippa.getTail());
	}

}
