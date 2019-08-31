package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	Animal animal;	
	public void print()
	{
		System.out.println("\n\n\t\t  ------SHANTHI VANAM --------");
		Animal[] animalArray=new Animal[3];
		animal=new Animal();
		animal.details();

		Tiger tiger=new Tiger();
		tiger.details();
		animalArray[0]=tiger;

		Lion lion=new Lion();
		lion.details();
		animalArray[1]=lion;

		Rabbit rabbit=new Rabbit();
		rabbit.details();
		animalArray[2]=rabbit;

		animal.fight(animalArray);

	}
}

	
			
		