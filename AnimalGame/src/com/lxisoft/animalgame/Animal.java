package com.lxisoft.animalgame;


import com.lxisoft.animalgame.Tiger;
public class Animal
{

	public void print() 
	{
		Animal tiger=new Animal();
		Tiger tiger1=new Tiger();
		Animal tiger2= new Tiger();
		
		tiger.eat();
		System.out.println("1");
		
		tiger.run();
		
		System.out.println("2");
		tiger1.eat();

		System.out.println("3");
		tiger1.run();

		System.out.println("4");
		tiger2.eat();

		System.out.println("5");
		tiger2.run();
		
	}
	public void eat()
	{
		System.out.println("animal eat");

	}
	public void run()
	{
		System.out.println("animal runs");
	}
}