package com.lxisoft.animalgame;
public class Wolf extends Animal
{
	int strength;
	String name;
	public void printDetails()
	{
		name="Wolf";
		strength=60;
		System.out.println(name+strength);
	}
	public void printName()
	{
		System.out.println(name);
	}

	public void eat()
	{
		System.out.println("Wolf eats");
	}
	public void run()
	{
		System.out.println("Wolf  runs");
	}
	public void fight (Animal name)
	{

}}