package com.lxisoft.Game;
import com.lxisoft.Animals.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class GameInterface
{
Forest forest=new Forest();
int count;
public void Game(int playerOne,int playerTwo,ArrayList<Animal> animal)
	{
	if(animal.get(playerOne).getLife()==true && animal.get(playerTwo).getLife()==true )
	  {
	if (animal.get(playerOne) instanceof Carnivorus && animal.get(playerTwo) instanceof Herbivorus)
	{
		this.carnHerb(playerOne,playerTwo,animal);
	}
	else if (animal.get(playerOne) instanceof Herbivorus && animal.get(playerTwo) instanceof Herbivorus)
	{
		this.herbHerb(playerOne,playerTwo,animal);
	}
	else if (animal.get(playerOne) instanceof Carnivorus && animal.get(playerTwo) instanceof Carnivorus)
	{
		this.carnCarn(playerOne,playerTwo,animal);
	}
	else if (animal.get(playerOne) instanceof Herbivorus && animal.get(playerTwo) instanceof Carnivorus)
	{
		this.herbCarn(playerOne,playerTwo,animal);
	}
	}
	}

		public void carnHerb(int playerOne,int playerTwo,ArrayList<Animal> animal)
		{
		System.out.println("Carnivorus is much stronger than herbivorus\n");
		System.out.println("|-----------Player One Details----------|");
		System.out.println("PlayerOne Name 		:"+animal.get(playerOne).getName());
		System.out.println("PlayerOne Strength	:"+animal.get(playerOne).getStrength());
		System.out.println("PlayerOne LIfe		:"+animal.get(playerOne).getLife());
		System.out.println("|---------------------------------------|"+"\n");
		System.out.println("|-----------Player Two Details----------|");
		System.out.println("PlayerTwo Name 		:"+animal.get(playerTwo).getName());
		System.out.println("PlayerTwo Strength	:"+animal.get(playerTwo).getStrength());
		System.out.println("PlayerTwo LIfe		:"+animal.get(playerTwo).getLife());
		System.out.println("|---------------------------------------|"+"\n");
		System.out.println(animal.get(playerOne).getName()+" is fearse and kills "+animal.get(playerTwo).getName());
						
				System.out.println("|-------Winner Details------|");
				System.out.println("PlayerOne is the Winner"+"\n");
				System.out.println("Winner name	:"+animal.get(playerOne).getName());
				animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()+10);
				System.out.println("Winner Strength	:"+animal.get(playerOne).getStrength());
				System.out.println("Loser Status	:"+animal.get(playerOne).getLife());
				System.out.println("|---------------------------|"+"\n");
			//}
			//else //if(animal.get(playerTwo).getStrength() > animal.get(playerOne).getStrength())
			//{
				System.out.println("|-------Loser Details-------|");
				System.out.println("playerTwo is the Loser"+"\n");
				System.out.println("Loser name	:"+animal.get(playerTwo).getName());
				animal.get(playerTwo).setLife(false);
				animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-30);
				System.out.println("loser Strength	:"+animal.get(playerTwo).getStrength());
				System.out.println("Loser Status	:"+animal.get(playerTwo).getLife());
				System.out.println("|---------------------------|"+"\n");
				count=forest.workingOfLoop();

			}
			
		public void herbCarn(int playerOne,int playerTwo,ArrayList<Animal> animal)
		{
		System.out.println("Carnivorus is much stronger than herbivorus\n");
		System.out.println("|-----------Player One Details----------|");
		System.out.println("PlayerOne Name 		:"+animal.get(playerOne).getName());
		System.out.println("PlayerOne Strength	:"+animal.get(playerOne).getStrength());
		System.out.println("PlayerOne LIfe		:"+animal.get(playerOne).getLife());
		System.out.println("|---------------------------------------|"+"\n");
		System.out.println("|-----------Player Two Details----------|");
		System.out.println("PlayerTwo Name 		:"+animal.get(playerTwo).getName());
		System.out.println("PlayerTwo Strength	:"+animal.get(playerTwo).getStrength());
		System.out.println("PlayerTwo LIfe		:"+animal.get(playerTwo).getLife());
		System.out.println("|---------------------------------------|"+"\n");
		System.out.println(animal.get(playerTwo).getName()+" is fearse and kills "+animal.get(playerOne).getName());
						
				System.out.println("|-------Winner Details------|");
				System.out.println("PlayerOne is the Winner"+"\n");
				System.out.println("Winner name	:"+animal.get(playerTwo).getName());
				animal.get(playerOne).setStrength(animal.get(playerTwo).getStrength()+10);
				System.out.println("Winner Strength	:"+animal.get(playerTwo).getStrength());
				System.out.println("Winner Status	:"+animal.get(playerTwo).getLife());
				System.out.println("|---------------------------|"+"\n");
				System.out.println("|-------Loser Details-------|");
				System.out.println("playerTwo is the Loser"+"\n");
				System.out.println("Loser name	:"+animal.get(playerOne).getName());
				animal.get(playerOne).setLife(false);
				animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-30);
				System.out.println("loser Strength	:"+animal.get(playerOne).getStrength());
				System.out.println("Loser Status	:"+animal.get(playerOne).getLife());
				System.out.println("|---------------------------|"+"\n");
								count=forest.workingOfLoop();
			}
			
		public void herbHerb(int playerOne,int playerTwo,ArrayList<Animal> animal)
		{
		System.out.println("|-----------Player One Details----------|");
		System.out.println("PlayerOne Name 		:"+animal.get(playerOne).getName());
		System.out.println("PlayerOne Strength	:"+animal.get(playerOne).getStrength());
		System.out.println("PlayerOne LIfe		:"+animal.get(playerOne).getLife());
		System.out.println("|---------------------------------------|"+"\n");
		System.out.println("|-----------Player Two Details----------|");
		System.out.println("PlayerTwo Name 		:"+animal.get(playerTwo).getName());
		System.out.println("PlayerTwo Strength	:"+animal.get(playerTwo).getStrength());
		System.out.println("PlayerTwo LIfe		:"+animal.get(playerTwo).getLife());
		System.out.println("|---------------------------------------|"+"\n");
		System.out.println(animal.get(playerOne).getName()+" and "+animal.get(playerTwo).getName()+",both are herbivorus and they dont fight each other");
						count=forest.workingOfLoop();
		}
		public void carnCarn(int playerOne,int playerTwo,ArrayList<Animal> animal)
		{
		System.out.println("Carnivorus are fearse and they attack each other\n");
		System.out.println("|-----------Player One Details----------|");
		System.out.println("PlayerOne Name 		:"+animal.get(playerOne).getName());
		System.out.println("PlayerOne Strength	:"+animal.get(playerOne).getStrength());
		System.out.println("PlayerOne LIfe		:"+animal.get(playerOne).getLife());
		System.out.println("|---------------------------------------|"+"\n");
		System.out.println("|-----------Player Two Details----------|");
		System.out.println("PlayerTwo Name 		:"+animal.get(playerTwo).getName());
		System.out.println("PlayerTwo Strength	:"+animal.get(playerTwo).getStrength());
		System.out.println("PlayerTwo LIfe		:"+animal.get(playerTwo).getLife());
		System.out.println("|---------------------------------------|"+"\n");
		System.out.println(animal.get(playerOne).getName()+" and "+animal.get(playerTwo).getName()+",both are Carnivorus and they fight each other");
			if(animal.get(playerOne).getStrength() > animal.get(playerTwo).getStrength())
			{
				System.out.println("|-------Winner Details------|");
				System.out.println("PlayerOne is the Winner"+"\n");
				System.out.println("Winner name	:"+animal.get(playerOne).getName());
				animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-10);
				System.out.println("Winner Strength	:"+animal.get(playerOne).getStrength());
				System.out.println("|---------------------------|"+"\n");
				System.out.println("|-------Loser Details------|");
				System.out.println("playerTwo is the Winner"+"\n");
				System.out.println("Winner name	:"+animal.get(playerTwo).getName());
				animal.get(playerTwo).setLife(false);
				animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-10);
				System.out.println("Winner Strength	:"+animal.get(playerTwo).getStrength());
				System.out.println("|---------------------------|"+"\n");
			}
			else //if(animal.get(playerTwo).getStrength() > animal.get(playerOne).getStrength())
			{
				System.out.println("|-------Winner Details------|");
				System.out.println("playerTwo is the Winner"+"\n");
				System.out.println("Winner name	:"+animal.get(playerTwo).getName());
				animal.get(playerTwo).setStrength(animal.get(playerTwo).getStrength()-10);
				System.out.println("Winner Strength	:"+animal.get(playerTwo).getStrength());
				System.out.println("|---------------------------|"+"\n");
				System.out.println("|-------Loser Details------|");
				System.out.println("PlayerOne is the Winner"+"\n");
				System.out.println("Winner name	:"+animal.get(playerOne).getName());
				animal.get(playerOne).setLife(false);
				animal.get(playerOne).setStrength(animal.get(playerOne).getStrength()-10);
				System.out.println("Winner Strength	:"+animal.get(playerOne).getStrength());
				System.out.println("|---------------------------|"+"\n");
			}
							count=forest.workingOfLoop();
		}
	}
	
