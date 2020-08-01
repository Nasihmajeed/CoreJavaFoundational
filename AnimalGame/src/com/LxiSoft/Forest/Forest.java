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
          int choice=1;
          Designs d=new Designs();

	public void gameStart()
	{
		
				System.out.println("\t \t_________________________________");
		System.out.println("\n\t \t-----------Animal Game-----------");
		System.out.println("\t \t_________________________________");
	
		
			this.animalList();
			this.printRandom();
	
	}

	public void animalList()
	{
		animal.add(new Tiger());
		animal.add(new Deer());
		animal.add(new Elephant());
		animal.add(new Bears());
		animal.add(new Lion());

		animal.get(0).setName("Tiger");
        animal.get(0).setAnimalStrength(85);

		animal.get(1).setName("Deer");
        animal.get(1).setAnimalStrength(40);

		animal.get(2).setName("Elephant");
       animal.get(2).setAnimalStrength(75);

		animal.get(3).setName("Bear");
        animal.get(3).setAnimalStrength(65);

		animal.get(4).setName("Lion");
        animal.get(4).setAnimalStrength(95);

		System.out.println("\t Animals in the forest are ");
     	for (int i=0; i<animal.size(); i++)
     	{	
     		System.out.println("\n   "+(i+1)+"   "+animal.get(i).getName());
     	}
     
	}

	public void printRandom()
	{	
		
	
            System.out.println("\n PRESS 1 TO START THE GAME");
            d.pattern();
           
            int choice=s.nextInt();
            d.gameRun();
         
              if(choice==1)
              {
                 int randomNo = random.nextInt(5);   
             int randomFile= random.nextInt(5);
             
             
        
             for(int j=0;j<animal.size();j++)
             {

            for(int i=0;i<1;i++)
            {

                 System.out.println(" "+randomNo);
               System.out.println(" "+randomFile);

                
                if(randomNo==randomFile)
                {
                    randomFile=random.nextInt(5);
                }

           
                 System.out.println("               ");
                System.out.println(" Animal 1    "+animal.get(randomNo).getName()+"      ");
                 System.out.println("\nSTRENGTH        "+animal.get(randomNo).getAnimalStrength()+"      ");

               
               
               
               
                 System.out.println("             ");
                System.out.println("  Animal 2   "+animal.get(randomFile).getName()+"         ");
                  System.out.println("\n STRENGTH        "+animal.get(randomFile).getAnimalStrength()+"      ");
               

             
                
            }
               
                 if(animal.get(randomNo) instanceof Carnivorous|| animal.get(randomFile) instanceof Carnivorous )
                 {

                if(animal.get(randomNo).getAnimalStrength()>animal.get(randomFile).getAnimalStrength())
                {


                d.pyramidPattern1();
                 System.out.println("       Winner         ");
                System.out.println("       "+animal.get(randomNo).getAnimalName()+"     ");
                int newStrength=(animal.get(randomNo).getAnimalStrength()-10);
                   
                System.out.println("Decreased Strength     " +newStrength);
                d.pyramidPattern2();
                 System.out.println("    Looser         ");
                System.out .println("        "+animal.get(randomFile).getAnimalName()+"         ");
                int newStrength1=(animal.get(randomFile).getAnimalStrength()-35);
              System.out.println("Decreased Strength     " +newStrength1);


                   
                }

                else
                {
                   
                d.pyramidPattern1();
                 System.out.println("    Winner          ");
                     System.out.println("     "+animal.get(randomFile).getAnimalName()+"         ");
                      int newStrength=(animal.get(randomFile).getAnimalStrength()-10);
                         
                System.out.println("Decreased Strength of Winner "+newStrength);
                d.pyramidPattern2();
                 System.out.println("    Looser          ");
                 System.out .println("        "+animal.get(randomNo).getAnimalName()+"         ");
                int newStrength1=(animal.get(randomNo).getAnimalStrength()-35);
              System.out.println("Decreased Strength     " +newStrength1);


                
                }
             }



             if(animal.get(randomNo) instanceof Herbivorus && animal.get(randomFile) instanceof Herbivorus ){
                System.out.println("DONOT FIGHT");

               }
        d.pyramidPattern3();

}
            }

            else
            {
                System.out.println("EXITED FROM ANIMAL GAME");
            }
        }

  

       
   
}

	

