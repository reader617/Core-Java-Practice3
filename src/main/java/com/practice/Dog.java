package com.practice;

// This class is used for exercises #2, #4 and #5
public class Dog extends Animal {
	public void eat() {
		System.out.println("I am eating");
	}

	public void bark() {
		System.out.println("I am barking");
	}

	@Override
	public Dog makeNoise(String message) {
		System.out.println("I am a Dog! I say " + message);
		return this;
	}
}
