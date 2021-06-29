package com.practice;

// This class will represent a generic shape
public class A 
{
	private int numSides;
	
	A()
	{
		this(-1);
	}
	
	A(int numSides)
	{
		this.numSides = numSides;
	}
	
	public void setSides(int numSides)
	{
		this.numSides = numSides;
	}
	
	public int getSides()
	{
		return numSides;
	}
	
}
