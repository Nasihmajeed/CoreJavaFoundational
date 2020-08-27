package com.lxisoft.Game;
import com.lxisoft.Animals.*;
import com.lxisoft.Design.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class Forest

{
	ArrayList<Animal> animal=new ArrayList<Animal>();
  Scanner s=new Scanner(System.in);
  Random random = new Random();
        
          int count;
          int choice=1;
          int rdmNo;
          int rdmFile;
          


         
          GamePlay g=new GamePlay();

	public void animal()
	
  {

		animal.add(new Tiger());
		animal.add(new Deer());
		animal.add(new Rabbit());
		animal.add(new Bears());
		animal.add(new Lion());
    animal.add(new Elephant());

        animal.add(new Tiger());
        animal.add(new Deer());
        animal.add(new Rabbit());
        animal.add(new Bears());
        animal.add(new Lion());
        animal.add(new Elephant());

		    animal.get(0).setName("Tiger 1");
        animal.get(0).setAnimalStrength(85);
        animal.get(0).setAnimalLife(true);

		    animal.get(1).setName("Deer 1");
        animal.get(1).setAnimalStrength(40);
        animal.get(1).setAnimalLife(true);

		    animal.get(2).setName("Rabbit 1");
        animal.get(2).setAnimalStrength(35);
        animal.get(2).setAnimalLife(true);

		    animal.get(3).setName("Bear 1");
        animal.get(3).setAnimalStrength(65);
        animal.get(3).setAnimalLife(true);

		    animal.get(4).setName("Lion 1");
        animal.get(4).setAnimalStrength(95);
        animal.get(4).setAnimalLife(true);

        animal.get(5).setName("Elephant 1");
        animal.get(5).setAnimalStrength(85);
        animal.get(5).setAnimalLife(true);

        animal.get(6).setName("Tiger 2");
        animal.get(6).setAnimalStrength(85);
        animal.get(6).setAnimalLife(true);


        animal.get(7).setName("Deer 2");
        animal.get(7).setAnimalStrength(40);
        animal.get(7).setAnimalLife(true);

        animal.get(8).setName("Rabbit 2");
        animal.get(8).setAnimalStrength(35);
        animal.get(8).setAnimalLife(true);

        animal.get(9).setName("Bear 2");
        animal.get(9).setAnimalStrength(65);
        animal.get(9).setAnimalLife(true);

        animal.get(10).setName("Lion 2");
        animal.get(10).setAnimalStrength(95);
        animal.get(10).setAnimalLife(true);

        animal.get(11).setName("Elephant 2");
        animal.get(11).setAnimalStrength(94);
        animal.get(11).setAnimalLife(true);
}

public void animalList()
{
		System.out.println("\t Animals in the forest are ");
     	for (int i=0; i<animal.size(); i++)
     	{	
     		System.out.println("\n   "+(i+1)+"   "+animal.get(i).getName());
     	}
}

private int random()
{
 for(int i=0;i<animal.size();i++)
  {
    count=0;
    if(animal.get(i).getAnimalLife()==true)
     {
      count++;
      }
   }
    return count;
}
public void startGame()
{   
   System.out.println("\n PRESS 1 TO START THE GAME");
   int choice=s.nextInt();
   
    if(choice==1)

    { 
      do
       {
         count=this.random();
        rdmNo = random.nextInt(12);   
        rdmFile= random.nextInt(12);

          if(rdmNo==rdmFile)
          {   
           rdmFile= random.nextInt(12);
          }
           else//(randomNo!=random)
           {
            if(animal.get(rdmNo).getAnimalLife()==true&&animal.get(rdmFile).getAnimalLife()==true)
            {   
                // System.out.println(animal.get(randomNo).getAnimalName());  
             //    System.out.println(animal.get(randomFile).getAnimalName());
             }
           }
             g.gameSpecs(rdmNo,rdmFile,animal);
         }while(count>=1);
        this.Winner();
    }
}
public void Winner()
{
  for(int i=0;i<animal.size();i++)
  {
    if(animal.get(i).getAnimalLife()==true)
    {
        System.out.println("__________________________________________________\n");
       System.out.println("=> WINNER IS " + animal.get(i).getName());
        System.out.println("____________________________________________________");
      }
}
}
}
