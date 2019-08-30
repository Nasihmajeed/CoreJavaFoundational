package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	String name;
	Animal animals;
	public void print()
	{
		System.out.println("jungle");
		Animal[] animalArr=new Animal[4];
		animals=new Animal();
		animals.eat();
		animals.run();

		Animal aTiger=new Tiger();
		aTiger.animalName="sambu tiger";
		aTiger.aggressive="highest";
		aTiger.strength=7;
		aTiger.fight();
        aTiger.eat();
        aTiger.run();
        animalArr[0]=aTiger;
        		
		Animal aLion=new Lion();
		aLion.animalName="mad lion";
		aLion.aggressive="very high";
		aLion.strength=9;
		aLion.fight();
		aLion.eat();
		aLion.run();
		animalArr[1]=aLion;

		Animal aBear=new Bear();
		aBear.animalName="ballu bear";
		aBear.aggressive="high";
		aBear.strength=5;
		aBear.fight();
		aBear.eat();
		aBear.run();
		animalArr[2]=aBear;

		Animal aRabbit=new Rabbit();
		aRabbit.animalName="micky rabbit";
		aRabbit.aggressive="lowest";
		aRabbit.strength=4;
		aRabbit.fight();
		aRabbit.eat();
		aRabbit.run();
		animalArr[3]=aRabbit;
		
		animals.fight();
		animals.meetFight(animalArr);

	}
}