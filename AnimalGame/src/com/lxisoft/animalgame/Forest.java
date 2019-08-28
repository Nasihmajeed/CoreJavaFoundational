package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;
public class Forest
{
	
Animal animal;
Animal tiger;
Animal lion;


	public void print()
	{
	System.out.println("Silent valley---");
	animal=new Animal();
	tiger=new Animal();
	lion=new Animal();
	Tiger t=new Tiger();
	animal.eat();
	tiger.eat();
	lion.eat();
	t.eat();


	}

}


