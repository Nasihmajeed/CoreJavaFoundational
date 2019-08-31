package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	Animal animal;
	Tiger tiger=new Tiger("ttiger",9);
	Lion lion=new Lion("llion",8);
	Rabbit rabbit=new Rabbit("mittu rabbit",4);

	public void print()
	{
		System.out.println("\n\n\t\t  ------SHANTHI VANAM --------");
		animal=new Animal();
		animal.meet();
		Animal[] animalArray=new Animal[3];
		animalArray[0]=tiger;
	
		animalArray[1]=lion;

		animalArray[2]=rabbit;	

		animal.fight(animalArray);

	}
}




	
			
		