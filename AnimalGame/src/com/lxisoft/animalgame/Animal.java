package com.lxisoft.animalgame;


import com.lxisoft.animalgame.Tiger;
public class Animal
{

	public void print() 
	{
		Animal tiger=new Animal();
		Tiger tiger1=new Tiger();
		Animal tiger2= new Tiger();
		
		tiger.print1();
		System.out.println("1");
		
		tiger.print1();
		
		System.out.println("2");
		tiger1.print1();

		System.out.println("3");
		tiger1.print1();

		System.out.println("4");
		tiger2.print1();

		System.out.println("5");
		tiger2.print1();
		
	}
	public void print1()
	{
		System.out.println("tiger eat");

	}
}