package com.LxiSoft.Game;
// import com.LxiSoft.Game.Animal;
import java.util.*;

public class Forest
{
    ArrayList<Animal> animals = new ArrayList<Animal>();
    Random random = new Random();
    Fight fight = new Fight();

    public void setGame()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Animals do fight for their existance");

        this.addAnimal();
        this.setAnimal();
        this.printAnimals();

        System.out.println("Start Game? \n\t 1.Yes \n\t 2.No");
        int start = s.nextInt();

        if(start == 1)
        {
            // this.printAnimals();
            this.startGame();
        }
    }

    // public void animal()
    // {
    //     Tiger tiger = new Tiger();
    //     Lion lion = new Lion();
    //     Deer deer = new Deer();
    //     Elephant elephant = new Elephant();

    //     tiger.animalDetails()
    //     lion.animalDetails();
    //     deer.animalDetails();
    //     elephant.animalDetails();
    // }

    public void startGame()
    {
        Scanner s = new Scanner(System.in);
        // this.addAnimal();
        // this.setAnimal();
        // this.printAnimals();

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
            System.out.println("\nThe Winner of the fight ");
        
		    System.out.println("     "+animals.get(size-1).getName());
		    System.out.println("+----------------------+");   	
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
		animals.get(0).setStrength(10);
		animals.get(0).setEnergyLevel(9);
		
		animals.get(1).setName("Lion");
		animals.get(1).setStrength(9);
		animals.get(1).setEnergyLevel(9);
		
		animals.get(2).setName("Deer");
		animals.get(2).setStrength(5);
		animals.get(2).setEnergyLevel(10);
		
		animals.get(3).setName("Elephant");
		animals.get(3).setStrength(10);
		animals.get(3).setEnergyLevel(5);
		

		animals.get(4).setName("Cheetah");
		animals.get(4).setStrength(8);
		animals.get(4).setEnergyLevel(10);
	
		animals.get(5).setName("Leopard");
		animals.get(5).setStrength(8);
		animals.get(5).setEnergyLevel(9);
	
		animals.get(6).setName("Rabbit");
		animals.get(6).setStrength(4);
		animals.get(6).setEnergyLevel(9);
		
		animals.get(7).setName("Giraffe");
		animals.get(7).setStrength(5);
		animals.get(7).setEnergyLevel(6);
		
    }

    public void printAnimals()
    {
        System.out.println("   Sl.No       Animal    \t ");
        System.out.println("+---------+-------------+");
        
        for(int i=0; i<animals.size(); i++)
        {
			System.out.println("  "+(i+1)+"\t    "+animals.get(i).getName()+"\t");
		}
		System.out.println("+---------+-------------+");
    }
}
