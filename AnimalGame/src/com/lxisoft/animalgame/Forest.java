package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Forest
{
	String fName="jungle";
	Animal animal;
	public void print()
	{
		System.out.println("Welcome to the "+fName);
		animal=new Animal();
		animal.eat();
		animal.run();

		Animal aTiger=new Tiger();
		aTiger.details();
		aTiger.eat();
		aTiger.run();

		Animal aLion=new Lion();
		aLion.details();
		aLion.eat();
		aLion.run();

		Animal aBear=new Bear();
		aBear.details();
		aBear.eat();
		aBear.run();

	}
	
}