package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Forest;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;



public class Forest
{
	Animal animal = new Animal();
	Lion lion = new Lion();
	
    Tiger tiger = new Tiger();
    //animal.eat();
	public void fight()
	{
		
		if(lion.strengthlevel>tiger.strengthlevel)
		{
			System.out.println("Lion Defeated Tiger");
		}
		else
		{
			System.out.println("Tiger Defeated Lion");
		}
		
	}
  
}
