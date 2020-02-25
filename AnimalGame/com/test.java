package com.lxisoft.game;
import com.lxisoft.forest.*;
import java.util.*;
import java.io.*;
import java.util.Random;
import java.lang.Math;
public class Game
{
	EnergyLevel energyLevel = new EnergyLevel();
	static Random random = new Random();
	public void playGame(ArrayList<Animal> animalList)
	{		  
		System.out.println("\t\tGAME STARTS");
		int animalCount = animalList.size();
		gameLevel();
		nameOfAnimal();
		do
		{	
			int index = random.nextInt(animalList.size());
			int randomIndex = random.nextInt(animalList.size());
			randomCoordinates(animalList,index,randomIndex);
				
		}while(animalCount>1);
		printSurvivedAnimal(animalList,animalCount);
	}
	public void randomCoordinates(ArrayList<Animal> animalList,int index,int randomIndex)
	{
		int x = random.nextInt(50);
		int y = random.nextInt(50);
		animalList.get(index).setX(x);
		animalList.get(randomIndex).setY(y);
	}
	public void printSurvivedAnimal(ArrayList<Animal> animalList,int animalCount)
	{
		for (int i=0;i<animalList.size();i++) 
		{
			if(animalList.get(i).getIsAlive() == true)
			{
				System.out.println(animalList.get(i).getAnimalName()+" Survived");
			}	
		}
		if(animalCount==0)		
		try
		{
			throw new MyException("No Animal Survived");	
		}
		catch(MyException e)
		{
			System.out.println("Caught");
		}
	}
	public int calculateDistance(ArrayList<Animal> animalList,int index,int randomIndex,int animalCount)
	{
		int x1 = animalList.get(index).getX();
		int y1 = animalList.get(index).getY();
		int x2 = animalList.get(randomIndex).getX();
		int y2 = animalList.get(randomIndex).getY();
		int newX = x2-x1;
		int newY = y2-y1;
		int distance = (int)Math.sqrt((int)Math.pow(newX,2)+(int)Math.pow(newY,2));
		System.out.println("Distance Between "+animalList.get(index).getAnimalName()+" & "+animalList.get(randomIndex).getAnimalName()+" = "+distance);	
		return distance;
	}
	public boolean luckFactor()
	{
		Random random = new Random();
		boolean flag = random.nextBoolean();
		return flag;
	}
	public void gameLevel()
	{
		GameLevel level;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t1.LOW\n\t2.MEDIUM\n\t3.HARD\n\tEnter Ur Choice::\t");
		int ch = sc.nextInt();
		switch (ch) 
		{
			case 1:	low(GameLevel.LOW);break;
			case 2:	medium(GameLevel.MEDIUM);break;
			case 3:	hard(GameLevel.HARD);break;
			default:System.out.println("Invalid Choice");
		}	
	}
	public void low(GameLevel level)
	{
		System.out.println("Level = "+level);
		energyLevel.setEnergyParamOfOne(1);
		energyLevel.setEnergyParamOfTwo(1);
	}
	public void medium(GameLevel level)
	{
		System.out.println("Level = "+level);
		energyLevel.setEnergyParamOfOne(2);
		energyLevel.setEnergyParamOfTwo(2);
	}
	public void hard(GameLevel level)
	{
		System.out.println("Level = "+level);
		energyLevel.setEnergyParamOfOne(3);
		energyLevel.setEnergyParamOfTwo(3);
	}
	public void nameOfAnimal()
	{		
		int a;
		try
		{
			File file = new File("C://Users//rahul//Desktop//Java Projects//AnimalGame//v3.0.1//com//lxisoft//forest//Animal.txt");
			FileReader filereader = new FileReader(file);
			System.out.println("Animals In The Forest");
			while((a=filereader.read())!=-1)
			{
				System.out.print((char)a);
			}	
		}
		catch(IOException e)
		{
			System.out.println(e);
		}	
	}