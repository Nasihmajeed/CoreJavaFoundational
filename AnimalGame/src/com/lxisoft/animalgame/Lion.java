package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;

public class Lion extends Animal
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
	// 	System.out.println("lion eat flesh");
	// }
	// public void run()
	// {
	// 	System.out.println("lion runs fast");
	// }
}