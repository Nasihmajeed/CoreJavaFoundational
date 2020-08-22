package com.LxiSoft.Forest;
import com.LxiSoft.Animal.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class Forest

{
	ArrayList<Animal> animal=new ArrayList<Animal>();



         
          GamePlay g=new GamePlay();

	public void gameStart()
	{
		
				System.out.println("\t \t_________________________________");

		System.out.println("\n\t \t-----------Animal Game-----------");

		System.out.println("\t \t_________________________________");
	
		
			this.animalList();
      this.printAnimalList();
		
	
	}

	public void animalList()
	
  {

		animal.add(new Tiger());
		animal.add(new Deer());
		animal.add(new Rabbit());
		animal.add(new Bears());
		animal.add(new Lion());

        animal.add(new Tiger());
        animal.add(new Deer());
        animal.add(new Rabbit());
        animal.add(new Bears());
        animal.add(new Lion());

		    animal.get(0).setName("Tiger1");
        animal.get(0).setAnimalStrength(85);
        animal.get(0).setAnimalLife(true);

		    animal.get(1).setName("Deer1");
        animal.get(1).setAnimalStrength(40);
        animal.get(1).setAnimalLife(true);

		       animal.get(2).setName("Rabbit1");
           animal.get(2).setAnimalStrength(35);
           animal.get(2).setAnimalLife(true);

		    animal.get(3).setName("Bear1");
        animal.get(3).setAnimalStrength(65);
        animal.get(3).setAnimalLife(true);

		    animal.get(4).setName("Lion1");
        animal.get(4).setAnimalStrength(95);
        animal.get(4).setAnimalLife(true);

        animal.get(5).setName("Tiger2");
        animal.get(5).setAnimalStrength(85);
        animal.get(5).setAnimalLife(true);


        animal.get(6).setName("Deer2");
        animal.get(6).setAnimalStrength(40);
        animal.get(6).setAnimalLife(true);

        animal.get(7).setName("Rabbit2");
        animal.get(7).setAnimalStrength(35);
        animal.get(7).setAnimalLife(true);

        animal.get(8).setName("Bear2");
        animal.get(8).setAnimalStrength(65);
        animal.get(8).setAnimalLife(true);

        animal.get(9).setName("Lion2");
        animal.get(9).setAnimalStrength(95);
    animal.get(9).setAnimalLife(true);
}
public void printAnimalList()
{
		System.out.println("\t Animals in the forest are ");
     	for (int i=0; i<animal.size(); i++)
     	{	
     		System.out.println("\n   "+(i+1)+"   "+animal.get(i).getName());
     	}
    g.selectRandom(animal);

	}

       

   
}
