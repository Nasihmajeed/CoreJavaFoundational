package com.lxisoft.AnimalGame;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Math; 
import com.lxisoft.AnimalGame.Animal;
public class Game
{
	public ArrayList<Animal> gameList = new ArrayList<Animal>();
	 Animal animal =new Animal();
    Scanner select  = new Scanner(System.in);
    Random random=new Random();

	public void forestInGame()
    {

		gameList.add(new Animal());
        gameList.get(0).setAnimalName("Tiger");

        gameList.add(new Animal());
        gameList.get(1).setAnimalName("Lion");

        gameList.add(new Animal());
        gameList.get(2).setAnimalName("Rabbit");

        gameList.add(new Animal());
        gameList.get(3).setAnimalName("Deer");

        gameList.add(new Animal());
        gameList.get(4).setAnimalName("Bear");    


        for(int i=0;i<gameList.size();i++)
        {
        System.out.println(gameList.get(i).getAnimalName());
    	}
	}
	
	public void randomSelection()
	{
		int select = random.nextInt(5); 
        System.out.println(" "+select);
        System.out.println(gameList.get(select).getAnimalName());
         
    }
    
    public void resumeGame()
    {
    	System.out.println("Currently you have no paused Game . Please Start a New Game. ");
    }

    public void credits()
    {
    	System.out.println("		_______________________________");
    	System.out.println("		________LXI TECHNOLOGIES_______");
    	System.out.println("		_______________________________");
    	System.out.println("		________Developed By___________");
    	System.out.println("		_______________________________");
    	System.out.println("		________Faris Backer __________");
		System.out.println("		_______________________________");
	}
}
