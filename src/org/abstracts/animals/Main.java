package org.abstracts.animals;

public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Bobby");
		Bird bird1 = new Bird("Titty");
		Eagle eagle1 = new Eagle("MURICA!");
		Dolphin dolphin1 = new Dolphin("Flipper");
		
		System.out.println("The dog is sleeping.");
		dog1.sleep();
		System.out.println("----------------");
		System.out.println("What does the dolphin say?");
		dolphin1.talk();
		System.out.println("----------------");
		System.out.println("What does the eagle eats?");
		eagle1.eat();
		System.out.println("----------------");
		System.out.println("The bird is sleeping.");
		bird1.sleep();
		System.out.println("----------------\n\n\n");

		makeItFly(eagle1);
		makeItSwim(dolphin1);
	}
	
	public static void makeItFly(IFlying animal) {
		animal.fly();
	};
	public static void makeItSwim(IAquatic animal) {
		animal.swim();
	}
}
