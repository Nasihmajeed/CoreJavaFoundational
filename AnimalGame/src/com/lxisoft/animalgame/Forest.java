package com.lxisoft.animalgame;
public class Forest
{
	String name;
	Animal animal;
	public void print()
	{
		System.out.println("jungle");
		animal=new Animal();
		animal.eat();
		animal.run();
	}
	

}