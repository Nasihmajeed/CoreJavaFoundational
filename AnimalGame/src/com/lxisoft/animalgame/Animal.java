package com.lxisoft.animalgame;
public class Animal
{
	public String animalName;
	public String aggressive;
	public int strength;

	public void animalDetails()
	{
		System.out.println("animal details");
	}
	public void eat()
	{
		System.out.println("animal eat meat normally");
	}
	public void run()
	{
		System.out.println("animal run in jungle");
	}
	public void fight(Animal animalArr[])
	{
		System.out.println("\n");
		System.out.println("animals meet and fight begins");
		System.out.println("------------------------------");
		for(int i=0;i<8;i++)
		{
			int x=(int) (Math.random()*4);
			int y=(int) (Math.random()*4);
			System.out.println("\n");
			System.out.println(animalArr[x].animalName+"  v  "+animalArr[y].animalName);
			if(animalArr[x].strength<animalArr[y].strength)
			{
				System.out.println(animalArr[y].animalName+ " :wins");
			}
			else
			{
				System.out.println(animalArr[x].animalName+" :wins");
			}

		}

	}
}