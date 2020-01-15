package com.lxisoft.animalgame;
import com.lxisoft.animals.*;
import java.util.ArrayList;
public class Forest
{
	public ArrayList<Animal> animal = new ArrayList<Animal>();
	int c = 10;
	int count=0;
	int range=20;
	public void meetAnimal()
	{

		setAnimal();
		System.out.println("!!!! Game Started !!!!");
		while(c>1)
		{
			int x =(int) (Math.random()*animal.size());
			int y =(int) (Math.random()*animal.size());

			/*public int testVariable = 50;*/
	        int animal1xAxis = (int) (Math.random()*50);
	        int animal1yAxis = (int) (Math.random()*50);

	         int animal2xAxis = (int) (Math.random()*50);
	         int animal2yAxis = (int) (Math.random()*50);
			if(animal.get(x).isTrue && animal.get(y).isTrue)
			{
				if(!animal.get(x).getName().equals(animal.get(y).getName()))
				{
					checkDistance(x,y,animal1xAxis,animal1yAxis,animal2xAxis,animal2yAxis);
				}
		    }
		}
		checkingWinner();
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
		animal.get(0).strength=20;
		animal.get(0).hungerLevel=10;

		animal.get(1).setName("Deer2");
		animal.get(1).strength=20;
		animal.get(1).hungerLevel=10;

		animal.get(2).setName("Fox1");
		animal.get(2).strength=25;
		animal.get(2).hungerLevel=15;

		animal.get(3).setName("Fox2");
		animal.get(3).strength=25;
		animal.get(3).hungerLevel=15;

		animal.get(4).setName("Lion1");
		animal.get(4).strength=50;
		animal.get(4).hungerLevel=25;

		animal.get(5).setName("Lion2");
		animal.get(5).strength=50;
		animal.get(5).hungerLevel=25;

		animal.get(6).setName("Rabbit1");
		animal.get(6).strength=10;
		animal.get(6).hungerLevel=5;

		animal.get(7).setName("Rabbit2");
		animal.get(7).strength=10;
		animal.get(7).hungerLevel=5;

		animal.get(8).setName("Tiger1");
		animal.get(8).strength=40;
		animal.get(8).hungerLevel=20;

		animal.get(9).setName("Tiger2");
		animal.get(9).strength=40;
		animal.get(9).hungerLevel=20;
		
	}
	public void checkingMammals(String sample1,String sample2,String test1,String test2,int x,int y)
	{	
		if(animal.get(x) instanceof Carnivorus)
		{
			System.out.print(animal.get(x).getName());
			sample1=((Carnivorus)animal.get(x)).kill();
		}
		else if(animal.get(x) instanceof Herbivorus)
		{
			System.out.print(animal.get(x).getName());
			sample2=((Herbivorus)animal.get(x)).meet();
		}

		if(animal.get(y) instanceof Carnivorus)
		{
			System.out.println(" - Meets - "+animal.get(y).getName());
			test1=((Carnivorus)animal.get(y)).kill();
		}
		else if(animal.get(y) instanceof Herbivorus)
		{
			System.out.println(" - Meets - "+animal.get(y).getName());
			test2 =((Herbivorus)animal.get(y)).meet();
		}
		fightAnimals(sample1,sample2,test1,test2,x,y);
	}

	public void fightAnimals(String sample1,String sample2,String test1,String test2,int x,int y)
	{
		if(sample1.equals("Carnivorus") && test1.equals("Carnivorus"))
		{
			carnivorusVsCarnivorus(x,y);
		}
		else if(sample2.equals("Herbivorus") && test2.equals("Herbivorus"))
		{
			herbivorusVsHerbivorus(x,y);
		}
		else if(sample1.equals("Carnivorus") && test2.equals("Herbivorus"))
		{
			carnivorusVsHerbivorus(x,y);
		}
		else if(sample2.equals("Herbivorus") && test1.equals("Carnivorus"))
		{
			herbivorusVsCarnivorus(x,y);
		}
	}
	public void checkDistance(int x,int y,int x1,int x2,int y1,int y2)
	{
		float distance = 0;
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(y1);
		System.out.println(y2);
		distance = (int) (Math.sqrt(((x1 - y1)*(x1 - y1))+((x2 - y2)*(x2 - y2))));
		try
		{
			System.out.println("Distance : "+distance);
			if(distance<=range)
			{
				String sample1="S1 Null",sample2 = "S2 Null",test1 = "T1 Null",test2 = "T2 Null";
				checkingMammals(sample1,sample2,test1,test2,x,y);
			}
			else if(distance>20)
			{
				System.out.println("Not in Distance");
				/*count++;
				System.out.println("Count : "+count);
				if(count>30)
				{
				    range++;
				}*/
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void checkingWinner()
	{
		int press1 =0;
		for(int i=0;i<animal.size();i++)
	    {
	    	if(animal.get(i).isTrue)
	    	{
	    		System.out.println(animal.get(i).getName()+" Wins ");
	    	}
	    	if(!animal.get(i).isTrue)
	    	{
	    		press1++;
	    		if(press1==10)
	    		{
	    			System.out.println("No One Survives");
	    		}
	    	}
	    }
	}
	public void carnivorusVsCarnivorus(int x,int y)
	{
	if(animal.get(x).strength >0)
		{
			System.out.println(animal.get(x).getName()+"<== Figt with ==>"+animal.get(y).getName());
	    	System.out.println("Strength : "+animal.get(x).strength+"      Strength : "+animal.get(y).strength);
			animal.get(x).strength = animal.get(x).strength - 7;
			animal.get(x).hungerLevel = animal.get(x).hungerLevel + 1;
			if(animal.get(x).strength<=0)
		     {
			  animal.get(x).isTrue = false;
			  System.out.println(animal.get(x).getName()+" Died");
			  c--;
		     }
		}
		
		if(animal.get(y).strength >0)
		{
			animal.get(y).strength = animal.get(y).strength - 7;
			if(animal.get(y).strength<=0)
		    {
			 animal.get(y).isTrue = false;
			 System.out.println(animal.get(y).getName()+" Died");
			 c--;
		    }
		}
	}
	public void herbivorusVsHerbivorus(int x,int y)
	{
		System.out.println(animal.get(x).getName()+"<== Meet's ==>"+animal.get(y).getName());
		System.out.println("Strength : "+animal.get(x).strength+"      Strength : "+animal.get(y).strength);
		animal.get(x).isTrue = false;
		/*animal.get(x).strength = animal.get(x).strength -3;
		animal.get(y).strength = animal.get(y).strength -3;*/
	}
	public void carnivorusVsHerbivorus(int x,int y)
	{
		int luck =(int) (Math.random()*2);
		if(luck==0)
		{
			System.out.println(animal.get(y).getName()+" Luckly Escaped");
		}
		else if(luck==1)
		{
			if(animal.get(x).strength >0)
		    {
			System.out.println(animal.get(x).getName()+"<== Kill's ==>"+animal.get(y).getName());
		    System.out.println("Strength : "+animal.get(x).strength+"      Strength : "+animal.get(y).strength);
			animal.get(x).strength = animal.get(x).strength + 5;
			animal.get(x).hungerLevel = animal.get(x).hungerLevel - 5;
			    if(animal.get(x).strength<=0)
				{
					animal.get(x).isTrue = false;
					System.out.println(animal.get(x).getName()+" Died");
					c--;
				}
		    }
		 animal.get(y).isTrue = false;
		 System.out.println(animal.get(y).getName()+" Died");
		 c--;
		}
	}
	public void herbivorusVsCarnivorus(int x,int y)
	{
		int luck2 = (int) (Math.random()*2);
		if(luck2==0)
		{
			System.out.println(animal.get(x).getName()+" Luckly Escaped");
		}
		else if(luck2==1)
		{
			if(animal.get(y).strength >0)
			{
			System.out.println(animal.get(y).getName()+"<== Kill's ==>"+animal.get(x).getName());
		    System.out.println("Strength : "+animal.get(y).strength+"      Strength : "+animal.get(x).strength);
			animal.get(y).strength = animal.get(y).strength + 5;
			animal.get(y).hungerLevel = animal.get(x).hungerLevel -5;
			    if(animal.get(y).strength<=0)
				{
					animal.get(y).isTrue = false;
					System.out.println(animal.get(y).getName()+" Died");
					c--;
				}
			}
			animal.get(x).isTrue = false;
			System.out.println(animal.get(x).getName()+" Died");
			c--;
		}
	}
}
