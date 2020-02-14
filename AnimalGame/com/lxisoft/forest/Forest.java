package com.lxisoft.forest;
import com.lxisoft.forest.*;
import java.util.ArrayList;
import java.util.*;
public class Forest
{
	private String forestName = "Gir Forest";
	 
	static Scanner sc = new Scanner(System.in);
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	Game game;
	Animal animal;
	public void setForestName(String forestName)
	{
		this.forestName = forestName;
	}
	public String getforestName()
	{
		return forestName;
	}


	public void createForest()
	{
		animal = new Animal();
		game  =  new Game();
		System.out.println("***** WELCOME TO " + getforestName().toUpperCase()+" *****");
		System.out.println("-----------------------------------------");
		
		createAnimal();

		startGame();
		
	}

	public void  startGame()
	{
		int choice;
		System.out.println("\n\t1.Start\n\t2.Stop\n\tEnter Ur Choice::\t");
		choice = sc.nextInt();
		if (choice == 1) 
		{
			game.playGame(animalList);
		}
		else if (choice == 2) 
		{
			System.exit(0);	
		}
	}
	public  void createAnimal()
	{
		animalList.add(new Lion());
		animalList.get(0).setAnimalName("Lion");
		animalList.get(0).setAnimalStrength(9);

		animalList.add(new Elephant());
		animalList.get(1).setAnimalName("Elephant");
		animalList.get(1).setAnimalStrength(10);

		animalList.add(new Bear());
		animalList.get(2).setAnimalName("Bear");
		animalList.get(2).setAnimalStrength(7);
		
		animalList.add(new Rabbit());
		animalList.get(3).setAnimalName("Rabbit");
		animalList.get(3).setAnimalStrength(3);

		animalList.add(new Fox());
		animalList.get(4).setAnimalName("Fox");
		animalList.get(4).setAnimalStrength(6);

		animalList.add(new Deer());
		animalList.get(5).setAnimalName("Deer");
		animalList.get(5).setAnimalStrength(4);

		animalList.add(new Horse());
		animalList.get(6).setAnimalName("Horse");
		animalList.get(6).setAnimalStrength(5);


		animalList.add(new Squirrel());
		animalList.get(7).setAnimalName("Squirrel");
		animalList.get(7).setAnimalStrength(2);

		animalList.add(new Wolf());
		animalList.get(8).setAnimalName("Wolf");
		animalList.get(8).setAnimalStrength(6);

		animalList.add(new Giraffe());
		animalList.get(9).setAnimalName("Giraffe");
		animalList.get(9).setAnimalStrength(5);

		animalList.add(new Tiger());
		animalList.get(10).setAnimalName("Tiger");
		animalList.get(10).setAnimalStrength(9);

		animalList.add(new Cheetah());
		animalList.get(11).setAnimalName("Cheetah");
		animalList.get(11).setAnimalStrength(8);

		animalList.add(new Hyena());
		animalList.get(12).setAnimalName("Hyena");
		animalList.get(12).setAnimalStrength(6);

		animalList.add(new Zebra());
		animalList.get(13).setAnimalName("Zebra");
		animalList.get(13).setAnimalStrength(4);
		for(int i = 0;i<animalList.size();i++)
		{
			animalList.get(i).setIsAlive(true);	
		}
	}
}