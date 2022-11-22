package org.abstracts.animals;

public abstract class Animal {
	
	private String name;

	public abstract void talk();
	public abstract void eat();
	
	public Animal(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void sleep() {
		System.out.println("zzzzzzzz");
	}
}
