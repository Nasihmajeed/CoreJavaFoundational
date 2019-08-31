package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	String name;
	Animal animals;
	Tiger tiger=new Tiger("sambu tiger","highest",7);
	Lion lion=new Lion("mad lion","very high",9);
	Bear bear=new Bear("ballu bear","high",5);
	Rabbit rabbit=new Rabbit("micky rabbit","lowest",4);
	public void print()
	{
		System.out.println("jungle");
		Animal[] animalArr=new Animal[4];
		animals=new Animal();
		animals.eat();
		animals.run();

        tiger.eat();
        tiger.run();
        animalArr[0]=tiger;
        		
		lion.eat();
		lion.run();
		animalArr[1]=lion;

		bear.eat();
		bear.run();
		animalArr[2]=bear;

		rabbit.eat();
		rabbit.run();
		animalArr[3]=rabbit;
		
		animals.meetFight(animalArr);

	}
}