package com.LxiSoft.Forest;
import com.LxiSoft.Animal.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class GamePlay
{
	
	Designs d=new Designs();
	Scanner s=new Scanner(System.in);
	Random random = new Random();
  
          int choice=1;
          int randomNo;
          int randomFile;
          

 public void selectRandom(ArrayList<Animal> animal)
  
    {   
            System.out.println("\n PRESS 1 TO START THE GAME");
            d.pattern();
           
            int choice=s.nextInt();
            d.gameRun();
         
              if(choice==1)
            //{
              //  if(animal.getAnimalLife(true)) 
              
              {
                  randomNo = random.nextInt(10);   
              randomFile= random.nextInt(10);
              
              while(randomNo==randomFile)
                {   
              randomFile= random.nextInt(10);
                 }
                // randomList.add(randomNo);
      //           randomList.add(randomFile);

                System.out.println(" "+randomNo);
               System.out.println(" "+randomFile);

                 System.out.println("               ");
                System.out.println(" Animal 1    "+animal.get(randomNo).getName()+"      ");
                 System.out.println("\nSTRENGTH        "+animal.get(randomNo).getAnimalStrength()+"      ");
               
                 System.out.println("             ");
                System.out.println("  Animal 2   "+animal.get(randomFile).getName()+"         ");
                System.out.println("\n STRENGTH        "+animal.get(randomFile).getAnimalStrength()+"      ");
    
      /*       try{        

      //  this.printRandom(animal);
        //this.finalWinner(animal);   
}

catch(IndexOutOfBoundsException m)
{
    System.out.println("Game ends due to some factors");
}*/
}
}
//}

public void gameConditions(ArrayList<Animal> animal)
{
               
                 if(animal.get(randomNo) instanceof Carnivorous&& animal.get(randomFile) instanceof Carnivorous )
                 {
                 	System.out.println("DONOT FIGHT");

                 }
                
                else(animal.get(randomNo) instanceof Herbivorus && animal.get (randomFile) instanceof Herbivorus )
             {
                System.out.println("DONOT FIGHT");

               }
              
        else(animal.get(randomNo) instanceof Herbivorus && animal.get(randomFile) instanceof Carnivorous)
        {
        	//this.
        }
        else (animal.get(randomNo) instanceof Carnivorous && animal.get(randomFile) instance of Herbivorus)
        {
        	//this.
        }
 
 }

 
}
