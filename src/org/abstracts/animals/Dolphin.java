package org.abstracts.animals;

public class Dolphin extends Animal implements IAquatic {

	public Dolphin(String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("The dolphin clicks.");
		
	}

	@Override
	public void eat() {
		System.out.println("the dolphin eats small fishes, squids and jellyfishes");
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public void swim() {
		System.out.println(getName() + " is swimming!");
		
	}
}
