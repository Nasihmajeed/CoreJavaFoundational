package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	Animal[] animalArray;

	
	public void print()
	{
		System.out.println("\n\n\t\t  ------SHANTHI VANAM --------");
		Animal[] animalArray=new Animal[2];
		Animal animal=new Animal();
		animal.details();



		Animal aTiger=new Tiger();
		aTiger.details();
		animalArray[0]=aTiger;

		Animal aLion=new Lion();
		aLion.details();
		animalArray[1]=aLion;

		Animal aRabbit=new Rabbit();
		aRabbit.details();
		animalArray[2]=aRabbit;

	}
}

	
			
		