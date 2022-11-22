package org.abstracts.animals;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("The dog barks.");
		
	}

	@Override
	public void eat() {
		System.out.println("The dog is an omnivorous animal, but he mostly eats meat, fish and vegetables.");
		
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
