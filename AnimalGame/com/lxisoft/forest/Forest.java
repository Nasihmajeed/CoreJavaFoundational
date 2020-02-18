package com.lxisoft.forest;
import com.lxisoft.game.*;
import java.util.*;
import com.lxisoft.forest.*;
public class Forest
{
private String name ="Black Forest";
ArrayList<Animal> animals = new ArrayList<Animal>();
Area area=new Area();
static Scanner input =new Scanner(System.in);
Game game;

public void createForest()
	{
		System.out.println("\n\t"+name);
		
		creatAnimal();

		setAnimalDetails();
		area.setAnimalPosition(animals);
		int temp=playGame();
		if(temp==0)
		{
			System.out.println("Exited");
		}
		if(temp==1)
		{
			game=new Game();
			game.startGame(animals);
		}

			
	}
public void creatAnimal()
{
animals.add(new Lion()); 
animals.add(new Tiger()); 
animals.add(new Rabbit());
animals.add(new Elephant());
animals.add(new Wolf());
}

public void setAnimalDetails()
{
		animals.get(0).setAnimalName("Lion"); 
		animals.get(0).setAnimalStrength(8); 
		animals.get(0).setAlive(true); 
	
		animals.get(1).setAnimalName("Tiger"); 
		animals.get(1).setAnimalStrength(7); 
		animals.get(1).setAlive (true); 
		
		animals.get(2).setAnimalName("Rabbit"); 
		animals.get(2).setAnimalStrength(4); 
		animals.get(2).setAlive (true); 
		
		animals.get(3).setAnimalName("Elephant"); 
		animals.get(3).setAnimalStrength(9);
		animals.get(3).setAlive (true);  
		
		animals.get(4).setAnimalName("Wolf"); 
		animals.get(4).setAnimalStrength(6);
		animals.get(4).setAlive (true);  
		
}


public int playGame()
{
	System.out.print("\n1.Start The Game\nPress 0 to Exit\n\n Enter Your Choise :");
	int choise=input.nextInt();
	return choise;
}


}