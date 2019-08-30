package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;


public class Forest
{
	String fName="Jungle Book";
	Animal animal;
	public void print()
	{
		System.out.println("\n");
		System.out.println("Welcome to the "+fName);
		animal=new Animal();
		animal.eat();
		animal.run();
		System.out.println("\n");

		Animal[] aArray=new Animal[4];


		Animal aTiger=new Tiger();
		aTiger.animalName="tiger";
		aTiger.strength=4;
		aTiger.details();
		aTiger.eat();
		aTiger.run();
		System.out.println("\n");
		aArray[0]=aTiger;

		Animal aLion=new Lion();
		aLion.animalName="lion";
		aLion.strength=5;
		aLion.details();
		aLion.eat();
		aLion.run();
		System.out.println("\n");
		aArray[1]=aLion;

		Animal aBear=new Bear();
		aBear.animalName="bear";
		aBear.strength=3;
		aBear.details();
		aBear.eat();
		aBear.run();
		System.out.println("\n");
		aArray[2]=aBear;

		Animal aRabbit=new Rabbit();
		aRabbit.animalName="rabbit";
		aRabbit.strength=2;
		aRabbit.details();
		aRabbit.eat();
		aRabbit.run();
		aArray[3]=aRabbit;


		animal.fight(aArray);

	}

	
}