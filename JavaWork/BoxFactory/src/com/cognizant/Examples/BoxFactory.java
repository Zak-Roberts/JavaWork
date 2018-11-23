// example of classes working with other classes

package com.cognizant.Examples;

public class BoxFactory {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		b1.item = "Clothes";
		Box b2 = new Box();
		b2.item = "Shoes";
		Box.colour = "Silver";
		
		System.out.println(b1.item +"\n"+ b2.item +"\n"+ Box.colour);
		
		BoxFactory bf1 = new BoxFactory();
		System.out.println(bf1.num());
				
	}

	public int num() {		
	return 4;
	}
	
}

