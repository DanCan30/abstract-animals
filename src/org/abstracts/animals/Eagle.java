package org.abstracts.animals;

public class Eagle extends Animal implements IFlying {

	public Eagle(String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("The eagle screech.");
	}

	@Override
	public void eat() {
		System.out.println("The eagle eats small animals like rabbits, foxes or tiny birds.");
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
