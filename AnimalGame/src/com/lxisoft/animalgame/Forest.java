package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;

public class Forest
{
	
Animal animal;
Animal tiger;
Animal lion;
Animal rabbit;
Tiger t;
Lion l;
Rabbit r;


	public void print()
	{
	System.out.println("Silent valley---");
	animal=new Animal();
	tiger=new Animal();
	lion=new Lion();
	rabbit=new Animal();
	r=new Rabbit();
	t=new Tiger();
	l= new Lion();
	animal.eat();
	tiger.eat();
	lion.eat();
	rabbit.eat();
	t.eat();
	l.eat();
	r.eat();
	animal.run();
	tiger.run();
	lion.run();
	rabbit.run();
	t.run();
	l.run();
	r.run();


	}

}


