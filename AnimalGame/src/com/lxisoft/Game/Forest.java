package com.lxisoft.Game;
import java.util.*;
import com.lxisoft.Animal.*;
public class Forest
{
	public ArrayList<Animal> animals = new ArrayList<Animal>();
	

	public void gameStart()
	{
		Scanner in = new Scanner(System.in);
		String yn;
		System.out.println("\t\tAnimal Game");
		System.out.println("\t\tStart Game(yes/no)");
		yn=in.nextLine();
		if(yn.equals("yes"))
		{
			Clear.cls();
			System.out.println("\nGame Begin");
			setAnimals();
			printAnimalList();
		}
	}


	public void printAnimalList()
	{
		System.out.println("-----------Animal List-------------");
		for(int i=0;i<6;i++)
			{
				System.out.println((animals.get(i)).getAnimalName()+" \t "+(animals.get(i)).animalEnergy + "\n" );
			}
		System.out.println("-----------------------------------");
	}


	public void setAnimals()
	{
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Fox());
		animals.add(new Wolf());
		animals.add(new Rabbit());
		animals.add(new Deer());

		animals.get(0).setAnimalDetail("Tiger",8);
		animals.get(1).setAnimalDetail("Lion",10);
		animals.get(2).setAnimalDetail("Fox",6);
		animals.get(3).setAnimalDetail("Wolf",5);
		animals.get(4).setAnimalDetail("Rabbit",2);
		animals.get(5).setAnimalDetail("Deer",3);
	}
}