package com.practice;

// This class is used for exercise #2, #4 and #5
public class Animal {
	private String furColor;

	public void walk() {
		System.out.println("I am walking");
	}

	public Animal makeNoise(String message) {
		System.out.println("I am an animal. I say " + message);
		return this;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

}
