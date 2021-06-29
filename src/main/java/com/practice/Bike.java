package com.practice;

public class Bike extends Cycle
{
	Bike()
	{
		System.out.println("Hello I am a Bike I am "+ defineMe());
		String temp= super.defineMe();
		System.out.println("My ancestor is a cycle who is "+ temp ); 

	} 
	
	
	public String defineMe()
	{
		return "a cycle with an engine";
	}
}
