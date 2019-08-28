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
		System.out.println("abc");
		animal=new Animal();
		tiger=new Animal();
		lion=new Animal();
		Tiger tiger=new Tiger();
		Lion lion=new Lion();
		animal.eat();
		tiger.eat();
		lion.eat();
	}
}