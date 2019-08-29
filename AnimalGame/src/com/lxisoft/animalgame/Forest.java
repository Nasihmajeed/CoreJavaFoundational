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
		
		tiger=new Tiger();
		tiger.animalName="sambu tiger";
		tiger.aggressive="highest";
		System.out.println("animal: "+tiger.animalName);
		System.out.println("aggressive: "+tiger.aggressive);
		tiger.eat();
		tiger.run();

		System.out.println("\n");
		lion=new Lion();
		lion.animalName="mad lion";
		lion.aggressive="very high";
		System.out.println("animal: "+lion.animalName);
		System.out.println("aggressive: "+lion.aggressive);
		lion.eat();
		lion.run();

		System.out.println("\n");
		bear=new Bear();
		bear.animalName="ballu bear";
		bear.aggressive="high";
		System.out.println("animal: "+bear.animalName);
		System.out.println("aggressive: "+bear.aggressive);
		bear.eat();
		bear.run();
	}
}