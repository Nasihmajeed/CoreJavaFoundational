package com.lxisoft.animalgame;
public class Elephant extends Animal
{
	int strength;
	String name;
	public void printDetails()
	{
		name="elephant";
		strength=70;
		System.out.println(name+strength);
	}
	public void printName()
	{
		System.out.println(name);
	}

	public void eat()
	{
		System.out.println("Elephant eats");
	}
	public void run()
	{
		System.out.println("Elephant runs");
	}
	public void fight (Animal name)
	{

}}