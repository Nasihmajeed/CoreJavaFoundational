package com.lxisoft.Game;
import com.lxisoft.Game.Animal;
import com.lxisoft.Animals.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class Forest
{
	
	AnimalFight fight = new AnimalFight();
	ArrayList<Animal> animals=new ArrayList<Animal>();
	Scanner scnr =new Scanner(System.in);
	public void animalList()
	{
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Beer());
		animals.add(new Elephant());
		animals.add(new Rabbit());
		animals.add(new Tiger());
		animals.add(new Lion());
		animals.add(new Beer());
		animals.add(new Elephant());
		animals.add(new Rabbit());


		animals.get(0).setAnimalDetail("Tiger-1",80);
		animals.get(1).setAnimalDetail("Lion-1",100);
		animals.get(2).setAnimalDetail("Fox-1",60);
		animals.get(3).setAnimalDetail("Elephant-1",50);
		animals.get(4).setAnimalDetail("Rabbit-1",18);
		
		animals.get(5).setAnimalDetail("Tiger-2",80);
		animals.get(6).setAnimalDetail("Lion-2",100);
		animals.get(7).setAnimalDetail("Fox-2",60);
		animals.get(8).setAnimalDetail("Elephant-2",50);
		animals.get(9).setAnimalDetail("Rabbit-2",18);

		animals.get(0).setStrength(70);
		animals.get(1).setStrength(80);
		animals.get(2).setStrength(40);
		animals.get(3).setStrength(90);
		animals.get(4).setStrength(20);
		
		animals.get(5).setStrength(70);
		animals.get(6).setStrength(80);
		animals.get(7).setStrength(40);
		animals.get(8).setStrength(90);
		animals.get(9).setStrength(20);
		
		animals.get(0).setRange(16);
		animals.get(1).setRange(20);
		animals.get(2).setRange(8);
		animals.get(3).setRange(12);
		animals.get(4).setRange(5);
		
		animals.get(5).setRange(16);
		animals.get(6).setRange(20);
		animals.get(7).setRange(8);
		animals.get(8).setRange(12);
		animals.get(9).setRange(5);
	}

	public void startGame()
	{
		String yn;
		Blank.clear();
		System.out.println("Press Y to Start Game");
		yn=scnr.nextLine();
		if(yn.equals("yes"))
		{
			Blank.clear();
			System.out.println("\t\t ANIMAL GAME ");
			System.out.println("\t --------------------------------------");
			
			animalList();
			();
			Blank.clear();
			
		}
		else
			{
				Blank.clear();
				System.out.println("Thank You..!");
			}
	}
		
	}

