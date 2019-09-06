package com.lxisoft.test;
import com.lxisoft.animalgame.Forest;
import com.lxisoft.animalgame.Animal;
public class TDD
{
	public static void main(String[] args)
	{
		Forest forest=new Forest();
		forest.theForest();
		forest.meetAnimals();
		forest.animalsRoam();
		forest.run();
		System.out.println("\n");
		forest.eat();
		System.out.println("\n");
		forest.fight();
	}
}   