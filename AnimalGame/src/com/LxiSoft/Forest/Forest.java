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
  Scanner s=new Scanner(System.in);
  Random random = new Random();
         
          int count;
          int choice=1;
          int randomNo;
          int randomFile;
          Designs d=new Designs();


         
          GamePlay g=new GamePlay();

	public void gameStart()
	{
		
				System.out.println("\t \t_________________________________");

		System.out.println("\n\t \t-----------Animal Game-----------");

		System.out.println("\t \t_________________________________");
	
		
			this.animal();
      this.printanimal();
     this.selectRandom();
	 
	}

	public void animal()
	
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
        animal.get(0).setRange(15);

		    animal.get(1).setName("Deer1");
        animal.get(1).setAnimalStrength(40);
        animal.get(1).setAnimalLife(true);
        animal.get(1).setRange(10);

		    animal.get(2).setName("Rabbit1");
        animal.get(2).setAnimalStrength(35);
        animal.get(2).setAnimalLife(true);
        animal.get(2).setRange(8);

		    animal.get(3).setName("Bear1");
        animal.get(3).setAnimalStrength(65);
        animal.get(3).setAnimalLife(true);
        animal.get(3).setRange(13);

		    animal.get(4).setName("Lion1");
        animal.get(4).setAnimalStrength(95);
        animal.get(4).setAnimalLife(true);
        animal.get(4).setRange(18);

        animal.get(5).setName("Tiger2");
        animal.get(5).setAnimalStrength(85);
        animal.get(5).setAnimalLife(true);
        animal.get(5).setRange(15);


        animal.get(6).setName("Deer2");
        animal.get(6).setAnimalStrength(40);
        animal.get(6).setAnimalLife(true);
        animal.get(6).setRange(10);

        animal.get(7).setName("Rabbit2");
        animal.get(7).setAnimalStrength(35);
        animal.get(7).setAnimalLife(true);
        animal.get(7).setRange(8);

        animal.get(8).setName("Bear2");
        animal.get(8).setAnimalStrength(65);
        animal.get(8).setAnimalLife(true);
        animal.get(8).setRange(13);

        animal.get(9).setName("Lion2");
        animal.get(9).setAnimalStrength(95);
        animal.get(9).setAnimalLife(true);
        animal.get(9).setRange(18);
}

public void printanimal()
{
		System.out.println("\t \n Animals in the forest are ");
     	for (int i=0; i<animal.size(); i++)
     	{	
     		System.out.println("\n   "+(i+1)+"   "+animal.get(i).getName());
     	}
}

private int iterateRandom()
{
  count=0;
 for(int i=0;i<animal.size();i++)
  {
    
    if(animal.get(i).getAnimalLife()==true)
     {
      count++;
      }
   }
    return count;
}
public void selectRandom()
{ 
 count=this.iterateRandom();
   System.out.println("\n PRESS 1 TO START THE GAME");
   int choice=s.nextInt();
   d.gameRun();
   
    if(choice==1)

    { 
      
      while(count>1)
       {
        count=this.iterateRandom();
        randomNo = random.nextInt(10);   
        randomFile= random.nextInt(10);
          if(randomNo==randomFile)
          {   
           randomFile= random.nextInt(10);
          }
           else
           {
            if((animal.get(randomNo).getAnimalLife()==true)&&(animal.get(randomFile).getAnimalLife()==true))
            {   
             
              g.gameConditions(randomNo,randomFile,animal);
             }
           }  
         }
        
        this.finalWinner();
    }
}
public void finalWinner()
{
  for(int i=0;i<animal.size();i++)
  {
    if(animal.get(i).getAnimalLife()==true)
    {
       d.pattern();
    
       System.out.println("\n =>THE ULTIMATE WINNER IS " + animal.get(i).getName());
      
      d.pyramidPattern3(); 
      }

}
}
}
