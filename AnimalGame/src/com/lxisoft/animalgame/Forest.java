package com.lxisoft.animalgame;
import com.lxisoft.animals.*;
import java.util.ArrayList;
public class Forest
{
	public ArrayList<Animal> animal = new ArrayList<Animal>();

	public void meetAnimal()
	{
		String sample,test;
		setAnimal();
		System.out.println("!!!! Game Started !!!!");
		for(int i=0;i<5;i++)
		{
			int x =(int) (Math.random()*animal.size());
			int y =(int) (Math.random()*animal.size());
			if(!animal.get(x).getName().equals(animal.get(y).getName()))
			{
				if(animal.get(x) instanceof Carnivorus)
				{
					System.out.println(animal.get(x).getName());
					sample=((Carnivorus)animal.get(x)).kill();
				}
				else if(animal.get(x) instanceof Herbivorus)
				{
					System.out.println(animal.get(x).getName());
					sample=((Herbivorus)animal.get(x)).meet();
				}

				if(animal.get(y) instanceof Carnivorus)
				{
					System.out.println(animal.get(y).getName());
					test=((Carnivorus)animal.get(y)).kill();	
				}
				else if(animal.get(x) instanceof Herbivorus)
				{
					System.out.println(animal.get(y).getName());
					test =((Herbivorus)animal.get(y)).meet();
				}

				/*if(sample.equals(test))
				{
					System.out.println();
				}*/
				
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
