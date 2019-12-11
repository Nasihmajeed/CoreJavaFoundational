package com.lxisoft.animalgame;
import com.lxisoft.animals.*;
import java.util.ArrayList;
public class Forest
{
	public ArrayList<Animal> animal = new ArrayList<Animal>();

	public void meetAnimal()
	{
		setAnimal();
		System.out.println("!!!! Game Started !!!!");
		for(int i=0;i<10;i++)
		{
			int x =(int) (Math.random()*animal.size());
			int y =(int) (Math.random()*animal.size());

			if(!animal.get(x).getName().equals(animal.get(y).getName()))
			{
				System.out.print(animal.get(x).getName());
				System.out.println(" Meets "+animal.get(y).getName());
				System.out.println("Meet !!!!!");
			}
		}
	}
	public void setAnimal()
	{
		animal.add(new Deer());
		animal.add(new Deer());
		animal.add(new Fox());
		animal.add(new Fox());
		animal.add(new Lion());
		animal.add(new Lion());
		animal.add(new Rabbit());
		animal.add(new Rabbit());
		animal.add(new Tiger());
		animal.add(new Tiger());

		animal.get(0).setName("Deer1");
		animal.get(1).setName("Deer2");
		animal.get(2).setName("Fox1");
		animal.get(3).setName("Fox2");
		animal.get(4).setName("Lion1");
		animal.get(5).setName("Lion2");
		animal.get(6).setName("Rabbit1");
		animal.get(7).setName("Rabbit2");
		animal.get(8).setName("Tiger1");
		animal.get(9).setName("Tiger2");
	}
}