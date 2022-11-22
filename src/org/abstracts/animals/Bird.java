package org.abstracts.animals;

public class Bird extends Animal implements IFlying {

	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("The bird tweets.");
		
	}

	@Override
	public void eat() {
		System.out.println("The bird eats insects, and in some cases flowers and fruits.");
		
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is flying!");
		
	}
}
