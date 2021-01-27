package com.LxiSoft.Game;
import java.util.*;

public class Forest
{
    ArrayList<Animal> animals = new ArrayList<Animal>();
    Random random = new Random();
    Fight fight = new Fight();

    public void setGame()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\n\n    All animals do fight for their existance");
        System.out.println("\n");

        this.addAnimal();
        this.setAnimal();
        this.printAnimals();

        System.out.println("\nStart Game? \n\t 1.Yes \n\t 2.No");
        int start = s.nextInt();
        System.out.println("\n");

        if(start == 1)
        {
            this.startGame();
        }
        else
        {
            System.out.println("Game End");
        }
    }

    public void animalDetail()
    {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Deer deer = new Deer();
        Elephant elephant = new Elephant();

        tiger.animalDetails();
        lion.animalDetails();
        deer.animalDetails();
        elephant.animalDetails();
    }
   

    public void startGame()
    {
        Scanner s = new Scanner(System.in);
       
        int size;
        do
        {
            size = animals.size();
            int x = random.nextInt(size);
            int y = random.nextInt(size);

            if(x!=y)
            {
                fight.startFight(x,y,animals);
            }
        }
        while(size>1);

        if(size==1)
        {
            System.out.println("+------------------------------------------------------------------+"); 
            System.out.println("+------------------------------------------------------------------+"); 
            System.out.println("                      Winner of the fight ");
                
		    System.out.println("                            "+animals.get(size-1).getName());
            System.out.println("+------------------------------------------------------------------+");
            System.out.println("+------------------------------------------------------------------+"); 
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
        }

        else
        {
            System.out.println("\nNo Winner...!!!");
        }
    }

    public void addAnimal()
    {
        animals.add(new Tiger());
        animals.add(new Lion());
        animals.add(new Deer());
        animals.add(new Elephant());

        animals.add(new Tiger());
        animals.add(new Lion());
        animals.add(new Deer());
        animals.add(new Elephant());
    }

    public void setAnimal()
    {   
        animals.get(0).setName("Tiger");
        animals.get(0).setEnergyLevel(9);
		animals.get(0).setStrength(10);
        animals.get(0).setHungerLevel(8);
        animals.get(0).setDomain(45);
        animals.get(0).setView(12);

		
        animals.get(1).setName("Lion");
        animals.get(1).setEnergyLevel(7);
        animals.get(1).setStrength(9);
        animals.get(1).setHungerLevel(6);
        animals.get(1).setDomain(35);
        animals.get(1).setView(15);
		
		
        animals.get(2).setName("Deer");
        animals.get(2).setEnergyLevel(10);
        animals.get(2).setStrength(5);
        animals.get(2).setHungerLevel(5);
        animals.get(2).setDomain(40);
        animals.get(2).setView(10);
		
		
        animals.get(3).setName("Elephant");
        animals.get(3).setEnergyLevel(6);
        animals.get(3).setStrength(5);
        animals.get(3).setHungerLevel(4);
        animals.get(3).setDomain(15);
        animals.get(3).setView(5);
		
		

        animals.get(4).setName("Cheetah");
        animals.get(4).setEnergyLevel(9);
        animals.get(4).setStrength(8);
        animals.get(4).setHungerLevel(6);
        animals.get(4).setDomain(30);
        animals.get(4).setView(15);
		
	
        animals.get(5).setName("Leopard");
        animals.get(5).setEnergyLevel(9);
        animals.get(5).setStrength(7);
        animals.get(5).setHungerLevel(6);
        animals.get(5).setDomain(30);
        animals.get(5).setView(13);
		
	
        animals.get(6).setName("Rabbit");
        animals.get(6).setEnergyLevel(7);
        animals.get(6).setStrength(4);
        animals.get(6).setHungerLevel(5);
        animals.get(6).setDomain(20);
        animals.get(6).setView(7);
		
		
        animals.get(7).setName("Giraffe");
        animals.get(7).setEnergyLevel(4);
        animals.get(7).setStrength(3);
        animals.get(7).setHungerLevel(6);
        animals.get(7).setDomain(40);
        animals.get(7).setView(7);	
    }

    public void printAnimals()
    {
        System.out.println("            +---------+-------------+");
        System.out.println("            |  Sl.No  |    Animal   |");
        System.out.println("            +---------+-------------+");
        
        for(int i=0; i<animals.size(); i++)
        {
			System.out.println("                 "+(i+1)+"       "+animals.get(i).getName()+" ");
		}
		System.out.println("            +---------+-------------+");
    }
}