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

		
		// System.out.println(animalList.get(0).getAnimalName());
		// System.out.println(animalList.get(0).getAnimalStrength());
		// System.out.println(animalList.get(1).getAnimalName());
		// System.out.println(animalList.get(1).getAnimalStrength());


		//System.out.println(animalList.size());

		int ch = startGame();
		if (ch == 1) 
		{
			game.playGame(animalList);
		}
		else if (ch == 2) 
		{
			System.exit(0);	
		}
	}

	public int  startGame()
	{
		int choice;
		System.out.println("\n\t1.Start\n\t2.Stop\nEnter Ur Choice::\t");
		choice = sc.nextInt();
		return choice;
	}


}