package com.lxisoft.forest;
import com.lxisoft.forest.Animal;
import java.util.ArrayList;
import java.util.*;
public class Forest
{
	private String forestName = "Gir Forest";
	 
	static Scanner sc = new Scanner(System.in);
	ArrayList<Animal> animalList = new ArrayList<Animal>();

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
		System.out.println("***** WELCOME TO " + getforestName().toUpperCase()+" *****");
		System.out.println("-----------------------------------------");

		animalList.add(new Animal());
		animalList.get(0).setAnimalName("Lion");
		animalList.get(0).setAnimalStrength(10);

		animalList.add(new Animal());
		animalList.get(1).setAnimalName("Elephant");
		animalList.get(1).setAnimalStrength(8);

		animalList.add(new Animal());
		animalList.get(2).setAnimalName("Tiger");
		animalList.get(2).setAnimalStrength(9);
		
		animalList.add(new Animal());
		animalList.get(3).setAnimalName("Bear");
		animalList.get(3).setAnimalStrength(7);
		// System.out.println(animalList.get(0).getAnimalName());
		// System.out.println(animalList.get(0).getAnimalStrength());
		// System.out.println(animalList.get(1).getAnimalName());
		// System.out.println(animalList.get(1).getAnimalStrength());

	}

	public void startGame()
	{
		int choice;
		System.out.println("\n\t1.Start\n\t2.Stop\nEnter Ur Choice::\t");
		choice = sc.nextInt();
	}


}