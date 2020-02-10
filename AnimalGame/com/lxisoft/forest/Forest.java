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
		animalList.get(0).setAnimalStrength(10);

		animalList.add(new Elephant());
		animalList.get(1).setAnimalName("Elephant");
		animalList.get(1).setAnimalStrength(8);

		animalList.add(new Bear());
		animalList.get(2).setAnimalName("Bear");
		animalList.get(2).setAnimalStrength(7);
		
		animalList.add(new Rabbit());
		animalList.get(3).setAnimalName("Rabbit");
		animalList.get(3).setAnimalStrength(3);

		animalList.add(new Fox());
		animalList.get(3).setAnimalName("Fox");
		animalList.get(3).setAnimalStrength(5);

		animalList.add(new Deer());
		animalList.get(3).setAnimalName("Deer");
		animalList.get(3).setAnimalStrength(4);
	}
}