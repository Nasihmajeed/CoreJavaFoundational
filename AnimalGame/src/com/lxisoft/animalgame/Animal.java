package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Bear;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;

public class Animal
{
	String animalName;
	int strength;
	Tiger tiger;
	Lion lion;
	Bear bear;

	public void eat()
	{
		System.out.println("animal eat");
		tiger=new Tiger();
		lion=new Lion();
		bear=new Bear();
		tiger.eat();
		lion.eat();
		bear.eat();
	}
	public void run()
	{
		System.out.println("animal run");
		tiger.run();
		lion.run();
		bear.run();
	}

}