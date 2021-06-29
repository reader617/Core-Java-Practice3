package com.practice;

// This represents a rectangle
public class B extends A 
{
	private int length;
	private int width;
	
	B(int length, int width)
	{
		super(4);
		this.length = length;
		this.width = width;
	}
	
	B()
	{
		this(0,0);
	}

	public int getLength() 
	{
		return length;
	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public int getWidth() 
	{
		return width;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}
	
	public int getArea()
	{
		return length * width;
	}
}
