package com.lxisoft.Game;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Forest
{
	
	ArrayList<Animal> animalList=new ArrayList<Animal>();

	public void animalList()
	{
		animalList.add(new Lion());
		animalList.add(new Tiger());
		animalList.add(new Deer());
		animalList.add(new Beer());
		animalList.add(new Rabbit());
		animalList.add(new Elephant());

		animalList.get(0).setName("Lion ");
		animalList.get(0).setStrength("95");
		

		animalList.get(0).setName("Tiger ");
		animalList.get(0).setStrength(90);
		

		animalList.get(0).setName("Deer ");
		animalList.get(0).setStrength(30);
		

		animalList.get(0).setName("Beer ");
		animalList.get(0).setStrength(76);
		

		animalList.get(0).setName("Rabbit ");
		animalList.get(0).setStrength(20);


		animalList.get(0).setName("Elephant ");
		animalList.get(0).setStrength(96);
		

	}

	public void startGame()
	{
		
		
	}

}