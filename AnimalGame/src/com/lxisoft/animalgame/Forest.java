package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Tiger;
public class Forest 
{
	Animal animal;
	Animal tiger;
	Animal lion;
	

	public void print()
	{
	    System.out.println("pineforest");
     	animal=new Animal();
     	tiger=new Animal();
     	Tiger t=new Tiger();
     	lion=new Animal();
     	animal.eat();
		tiger.eat();
		lion.eat();
		t.eat();	
	}

}