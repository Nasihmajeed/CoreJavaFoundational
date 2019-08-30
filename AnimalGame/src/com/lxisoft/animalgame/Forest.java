package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest 
{
	Animal animal;
	Tiger tiger=new Tiger("Tiger",8);
    Lion lion=new Lion("Lion",6);
    Rabbit rabbit=new Rabbit("Rabbit",4);
	public void print()
	{
		System.out.println("\n");
	    System.out.println("    PINE FOREST  ");
	    System.out.println("  ****************");

     	Animal[] animalArr=new Animal[3];
     	animal=new Animal();
     	animal.fight();
        
        tiger.fight();
     	animalArr[0]=tiger;

     	lion.fight();
     	animalArr[1]=lion;

        rabbit.fight();
     	animalArr[2]=rabbit;
     	
		animal.meetFight(animalArr);
		
	}

}