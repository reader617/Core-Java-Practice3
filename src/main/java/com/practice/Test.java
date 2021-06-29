package com.practice;


// This class is used to test all exercises. They will have comments with numbers and
// and some may be commented out for ease of testing.
public class Test {

	public static void main(String[] args) 
	{
		// Exercise #1
		//Bike b = new Bike();

		// Exercise #2
		/*Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();*/
		
		// Exercise 3
		/*B rectangle = new B(5, 4);
		A shape = new A(10);
		System.out.println("The area of the rectangle is " + rectangle.getArea());
		System.out.println("The number of sides in the rectangle is " + rectangle.getSides());
		System.out.println("The number of sides in the shape is " + shape.getSides());
		// This line will generate an error
		//System.out.println("The area of shape is " + shape.getArea());*/
		
		// Exercise #4 (using the original dog and animal classes with added functionality)
		/*Dog d = new Dog();
		// When variables are made private, errors in the code occur. d can no longer
		// access them.
		//d.furColor = "black";
		//d.makeNoise();
		// Getters and setters have been added to parent class, sub class has access to them
		d.setFurColor("black");
		System.out.println("The color of my dog's fur is " + d.getFurColor());*/
		
		// Exercise #5
		/*Animal dog = new Dog();
		Animal t = dog.makeNoise("woof");*/
		
		// Exercise #6
		// This code will complete the exercises found in head first java and through comments
		// make notes of other practice questions
		// 1) Cat/Tiger inheritance structure
		// Most likely I would have cat and tiger both be subclassed to a class feline, but would not 
		// have cat inherit from tiger, as describing a cat as a domesticated tiger does not seem to fit
		// I would probably have some sort of hunt method to overwrite (maybe cat would have hunt as 
		// "meow at my owner's office door" while tiger would say something like "chase after prey"
		// 2) Doctor hierarchy tree
		// Surgeon 1 instance variable
		// FamilyDoctor 2 instance variables
		// Doctor 1 method
		// Surgeon 3 methods
		// FamilyDoctor 2 methods
		// FamilyDoctor cannot treatPatient() or makeIncision()
		
		// Writing and testing the boat code example (with some slight modifications to account for the
		// name of my main method)
		Boat b1 = new Boat();
		Sailboat b2 = new Sailboat();
		Rowboat b3 = new Rowboat();
		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();
		
	}

}
