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
		for(int i=0;i<6;i++)
		{
			int x =(int) (Math.random()*animal.size());
			int y =(int) (Math.random()*animal.size());
			if(!animal.get(x).getName().equals(animal.get(y).getName()))
			{
				String sample1="S1 Null",sample2 = "S2 Null",test1 = "T1 Null",test2 = "T2 Null";
				checkingMammals(sample1,sample2,test1,test2,x,y);
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
		((Deer)animal.get(0)).isTrue = true;
		animal.get(1).setName("Deer2");
		((Deer)animal.get(1)).isTrue = true;
		animal.get(2).setName("Fox1");
		((Fox)animal.get(2)).isTrue = true;
		animal.get(3).setName("Fox2");
		((Fox)animal.get(3)).isTrue = true;
		animal.get(4).setName("Lion1");
		((Lion)animal.get(4)).isTrue = true;
		animal.get(5).setName("Lion2");
		((Lion)animal.get(5)).isTrue = true;
		animal.get(6).setName("Rabbit1");
		animal.get(6).isTrue = true;
		animal.get(7).setName("Rabbit2");
		animal.get(7).isTrue = true;
		animal.get(8).setName("Tiger1");
		animal.get(8).isTrue = true;
		animal.get(9).setName("Tiger2");
		animal.get(9).isTrue = true;
	}
	public void checkingMammals(String sample1,String sample2,String test1,String test2,int x,int y)
	{
		if(animal.get(x) instanceof Carnivorus)
		{
			System.out.print(animal.get(x).getName());
			/*System.out.println("Strength : "+((Carnivorus)animal.get(x)).strength());*/
			sample1=((Carnivorus)animal.get(x)).kill();
		}
		else if(animal.get(x) instanceof Herbivorus)
		{
			System.out.print(animal.get(x).getName());
			/*System.out.println("Strength : "+((Herbivorus)animal.get(x)).strength());*/
			sample2=((Herbivorus)animal.get(x)).meet();
		}

		if(animal.get(y) instanceof Carnivorus)
		{
			System.out.println(" - Meets - "+animal.get(y).getName());
			/*System.out.println("Strength : "+((Carnivorus)animal.get(y)).strength());*/
			test1=((Carnivorus)animal.get(y)).kill();
		}
		else if(animal.get(y) instanceof Herbivorus)
		{
			System.out.println(" - Meets - "+animal.get(y).getName());
			/*System.out.println("Strength : "+((Herbivorus)animal.get(y)).strength());*/
			test2 =((Herbivorus)animal.get(y)).meet();
		}
		fightAnimals(sample1,sample2,test1,test2,x,y);
	}

	public void fightAnimals(String sample1,String sample2,String test1,String test2,int x,int y)
	{
		if(sample1.equals("Carnivorus") && test1.equals("Carnivorus"))
		{
			System.out.println(animal.get(x).getName()+" Figt with "+animal.get(y).getName());
		}
		else if(sample2.equals("Herbivorus") && test2.equals("Herbivorus"))
		{
			System.out.println(animal.get(x).getName()+" Meet's "+animal.get(y).getName());
		}
		else if(sample1.equals("Carnivorus") && test2.equals("Herbivorus"))
		{
			System.out.println(animal.get(x).getName()+" Kill's "+animal.get(y).getName());
		}
		else if(sample2.equals("Herbivorus") && test1.equals("Carnivorus"))
		{
			System.out.println(animal.get(y).getName()+" Kill's "+animal.get(x).getName());
		}
	}
}
