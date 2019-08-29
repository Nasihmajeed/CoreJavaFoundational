package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	public void print()
	{
		System.out.println("\n\n\t\t  --------SHANTHI VANAM---------");		
		Animal animal=new Animal();
		Animal tiger=new Tiger();
		Animal lion=new Lion();
		Animal rabbit=new Rabbit();
		animal.eat();
		tiger.eat();
		lion.eat();
		rabbit.eat();
		animal.run();
		tiger.run();
		lion.run();
		rabbit.run();
		tiger.fight();
		lion.fight();
		rabbit.fight();
	}
}
