package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	String name;
	Animal animal;
	Lion lion;
	Tiger tiger;
	Bear bear;
	public void print()
	{
		System.out.println("jungle");
		animal=new Animal();
		animal.eat();
		animal.run();
		animal.animalDetails();
		System.out.println("--------");
		
		Animal aTiger=new Tiger();
		aTiger.animalDetails();
		aTiger.eat();
		aTiger.run();

		System.out.println("\n");
		Animal aLion=new Lion();
		aLion.animalDetails();
		aLion.eat();
		aLion.run();

		System.out.println("\n");
		Animal aBear=new Bear();
		aBear.animalDetails();
		aBear.eat();
		aBear.run();
	}
}