package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	Animal animal;
	Tiger tiger=new Tiger("ttiger",9,"high");
	Lion lion=new Lion("llion",8,"medium");
	Rabbit rabbit=new Rabbit("mittu rabbit",4,"low");

	public void print()
	{
		System.out.println("\n\n\t\t  ------SHANTHI VANAM --------");
		animal=new Animal();
		animal.meet();
		Animal[] animalArray=new Animal[3];
		animalArray[0]=tiger;
	
		animalArray[1]=lion;

		animalArray[2]=rabbit;	

		fight(animalArray);
		//animal.features();

	}
	public void fight(Animal animalArray[])
	{
		int x,y;
		System.out.println("-------fight begins---------");	
		for(int i=0;i<6;i++)
		{
			 x=(int) (Math.random()*3);
			 y=(int) (Math.random()*3);
			System.out.println(animalArray[x].animalName+" Vs "+animalArray[y].animalName);
			if(animalArray[x].strength<animalArray[y].strength)
			{
				System.out.println("winner====="+animalArray[y].animalName);
			}
			else
			{
				System.out.println("Dead========"+animalArray[x].animalName);
			}	
		}

	}
	
}




	
			
		