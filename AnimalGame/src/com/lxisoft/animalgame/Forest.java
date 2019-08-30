package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest 
{
	Animal animal;
	Tiger tiger;
    Lion lion;
    Rabbit rabbit;
	public void print()
	{
		System.out.println("\n");
	    System.out.println("    PINE FOREST  ");
	    System.out.println("  ****************");

     	Animal[] animalArr=new Animal[3];
     	animal=new Animal();
     	animal.details();

     	Animal aTiger=new Tiger();
     	aTiger.animalName="TIGER";
     	aTiger.strength=10;
     	aTiger.details();
     	animalArr[0]=aTiger;
     	
        
     	Animal aLion=new Lion();
     	aLion.animalName="LION";
     	aLion.strength=8;
     	aLion.details();
     	animalArr[1]=aLion;
     	

     	Animal aRabbit=new Rabbit();
     	aRabbit.animalName="RABBIT";
     	aRabbit.strength=6;
     	aRabbit.details();
     	animalArr[2]=aRabbit;
     	
		animal.fight(animalArr);
		
	}

}