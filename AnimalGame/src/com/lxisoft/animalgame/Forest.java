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
	    System.out.println("PINE FOREST");
	    System.out.println("----------------");
     	animal=new Animal();
     	lion=new Animal();
     	rabbit=new Animal();
     	tiger=new Tiger();
     	t=new Tiger();
     	l=new Lion();
     	r=new Rabbit();
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