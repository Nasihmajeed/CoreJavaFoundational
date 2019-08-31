package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Rabbit extends Animal
{
	

	public void animalsRoam()
	{
		System.out.println(" Animal--"+name);
		System.out.println(" strength--"+strength);
	}

	
	public Animal fight(Animal a)
	{
		Animal s;
		if(this.strength>a.strength)
		{
			s=this;
		}
		else
		{
			s=a;
		}
		return s;
	}


	// public void eat()
	// {
	// 	System.out.println("rabbit eat carrot");
	// }
	// public void run()
	// {
	// 	System.out.println("rabbit runs fast");
	// }
}