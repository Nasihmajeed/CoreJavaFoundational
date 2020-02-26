package com.lxisoft.forest;
import com.lxisoft.game.*;
import java.util.*;
import java.io.*;
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

		creatAnimal();

		
		int temp=0;
		do
		{
		setAnimalDetails();	
		System.out.println("\n\t"+name);
		
		try
		{
		area.setAnimalPosition(animals);
		temp=playGame();
		
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
	catch(Exception in)
	{
	System.out.println("**********"+in); 

	}
 }while(temp>0);
			
	}

public void creatAnimal()
{
	try
	{
	animals.add(new Lion()); 
	animals.add(new Tiger()); 
	animals.add(new Rabbit());
	animals.add(new Elephant());
	animals.add(new Wolf());
	animals.add(new Lion()); 
	animals.add(new Tiger()); 
	animals.add(new Rabbit());
	animals.add(new Elephant());
	animals.add(new Wolf());
	}
	catch(Exception ex)
	{
		System.out.println("**"+ex);
	}	

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

		animals.get(5).setAnimalName("Lion2"); 
		animals.get(5).setAnimalStrength(8); 
		animals.get(5).setAlive(true); 
	
		animals.get(6).setAnimalName("Tiger2"); 
		animals.get(6).setAnimalStrength(7); 
		animals.get(6).setAlive (true); 
		
		animals.get(7).setAnimalName("Rabbit2"); 
		animals.get(7).setAnimalStrength(4); 
		animals.get(7).setAlive (true); 
		
		animals.get(8).setAnimalName("Elephant2"); 
		animals.get(8).setAnimalStrength(9);
		animals.get(8).setAlive (true);  
		
		animals.get(9).setAnimalName("Wolf2"); 
		animals.get(9).setAnimalStrength(6);
		animals.get(9).setAlive (true);    
		
}


public int playGame()
{
	System.out.print("\n1.Start The Game\nPress 0 to Exit\n\n Enter Your Choise :");
	int choise=input.nextInt();
	return choise;
}


}