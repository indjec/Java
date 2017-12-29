package com.cs09;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Tommy", 1, 1, 8, 40);

	    Dog dog = new Dog("Tommy", 5, 10, 2, 4, 1, 32, "Black material");
//	    dog.eat();
	    dog.walk();
	    dog.run();

	    Fish fish = new Fish("Dolphin", 100, 4000, 3, 5,2);
	    fish.swim(90);
    }
}
