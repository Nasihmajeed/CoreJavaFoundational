package com.lxisoft.Game;
import com.lxisoft.Animal.*;
import java.Util.Scanner;
import java.Util.ArrayList;
import java.Util.List;
import java.Util.Random;
public class GameInterface
{
public void Game(int playerOne,int playerTwo,ArrayList<Animal> animal)
	{
	//int playerOne,playerTwo;
	
	if (animal.get(playerOne).getName() instanceof Carnivorus && animal.get(playerTwo).getName() instanceof Herbivorus)
	{
		this.carnHerb(playerOne,playerTwo,animal);
	}
	if (animal.get(playerOne).getName() instanceof Herbivorus && animal.get(playerTwo).getName() instanceof Herbivorus)
	{
		this.herbHerb(playerOne,playerTwo,animal);
	}
	if (animal.get(playerOne).getName() instanceof Herbivorus && animal.get(playerTwo).getName() instanceof Carnivorus)
	{
		this.herbCarn(playerOne,playerTwo,animal);
	}
	}

		public void carnHerb(int playerOne,int playerTwo,ArrayList<Animal> animal)
		{
		System.out.println("Carnivorus is much stronger than herbivorus");
		System.out.println("PlayerOne Name 	:"+animal.get(playerOne).getName());
		System.out.println("PlayerOne Strength	:"+animal.get(playerOne).getStrength());
		System.out.println("PlayerOne LIfe	:"+animal.get(playerOne).getLife());
		System.out.println("PlayerTwo Name 	:"+animal.get(PlayerTwo).getName());
		System.out.println("PlayerTwo Strength	:"+animal.get(PlayerTwo).getStrength());
		System.out.println("PlayerTwo LIfe	:"+animal.get(PlayerTwo).getLife());
		System.out.println("playerOne is fighting with playerTwo");
			if(animal.get(playerOne).getName().getStrength() > animal.get(playerTwo).getName().getStrength())
			{
				System.out.println("PlayerOne is the Winner");
				System.out.println("Winner name"	:animal.get(playerOne).getName());
				animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-10);
				System.out.println("Winner Strength"	:animal.get(playerOne).getStrength());
			}
			else if(animal.get(playerTwo).getName().getStrength() > animal.get(playerOne).getName().getStrength())
			{
				System.out.println("playerTwo is the Winner");
				System.out.println("Winner name"	:animal.get(playerTwo).getName());
				animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-10);
				System.out.println("Winner Strength"	:animal.get(playerTwo).getStrength());
			}
		}
		public void herbHerb(int playerOne,int playerTwo,ArrayList<Animal> animal)
		{
			System.out.println("Carnivorus is much stronger than herbivorus");
			System.out.println("PlayerOne Name 	:"+animal.get(playerOne).getName());
			System.out.println("PlayerOne Strength	:"+animal.get(playerOne).getStrength());
			System.out.println("PlayerOne LIfe	:"+animal.get(playerOne).getLife());
			System.out.println("PlayerTwo Name 	:"+animal.get(PlayerTwo).getName());
			System.out.println("PlayerTwo Strength	:"+animal.get(PlayerTwo).getStrength());
			System.out.println("PlayerTwo LIfe	:"+animal.get(PlayerTwo).getLife());
			System.out.println("playerOne and playerTwo,both are herbivorus and they dont fight each other");
		}
		public void herbCarn(int playerOne,int playerTwo,ArrayList<Animal> animal)
		{
		System.out.println("Carnivorus is much stronger than herbivorus");
		System.out.println("PlayerOne Name 	:"+animal.get(playerOne).getName());
		System.out.println("PlayerOne Strength	:"+animal.get(playerOne).getStrength());
		System.out.println("PlayerOne LIfe	:"+animal.get(playerOne).getLife());
		System.out.println("PlayerTwo Name 	:"+animal.get(PlayerTwo).getName());
		System.out.println("PlayerTwo Strength	:"+animal.get(PlayerTwo).getStrength());
		System.out.println("PlayerTwo LIfe	:"+animal.get(PlayerTwo).getLife());
		System.out.println("playerOne is fighting with playerTwo");
			if(animal.get(playerOne).getName().getStrength() > animal.get(playerTwo).getName().getStrength())
			{
				System.out.println("PlayerOne is the Winner");
				System.out.println("Winner name"	:animal.get(playerOne).getName());
				animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-10);
				animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-30);
				System.out.println("Winner Strength"	:animal.get(playerOne).getStrength());
			}
			else if(animal.get(playerTwo).getName().getStrength() > animal.get(playerOne).getName().getStrength())
			{
				System.out.println("playerTwo is the Winner");
				System.out.println("Winner name"	:animal.get(playerTwo).getName());
				animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-30);
				animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-10);
				System.out.println("Winner Strength"	:animal.get(playerTwo).getStrength());
			}
		}
	}
	
