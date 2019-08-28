package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Bear;
public class Forest
{
	String name;
	Animal animal;
	public void print()
	{
		System.out.println("jungle");
		animal=new Animal();
		animal.eat();
		animal.run();
	}
	
}