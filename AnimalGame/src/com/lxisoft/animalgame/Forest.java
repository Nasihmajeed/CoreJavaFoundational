package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Forest
{
	Animal animal;
	Animal tiger;
	Animal lion;
	Animal rabbit;
	Tiger t;
	Rabbit r;
	Lion l;
	public void print()
	{
		System.out.println("   SHANTHI VAANAM");		
		animal=new Animal();
		tiger=new Animal();
		lion=new Animal();
		rabbit=new Animal();
		t=new Tiger();
		l=new Lion();
		r=new Rabbit();
		animal.eat();
		tiger.eat();
		lion.eat();
		t.eat();
		l.eat();
		r.eat();
		rabbit.eat();
		animal.run();
		tiger.run();
		lion.run();
		rabbit.run();
		t.run();
		l.run();
		r.run();
		
	}
}
