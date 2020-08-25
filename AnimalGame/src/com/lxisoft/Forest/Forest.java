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
          int randomNo;
          int randomFile;
          Designs d=new Designs();

	public void gameStart()
	{
		
				System.out.println("\t \t_________________________________");
		System.out.println("\n\t \t-----------Animal Game-----------");
		System.out.println("\t \t_________________________________");
	
		
			this.animalList();
			this.selectRandom();
	
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


		System.out.println("\t Animals in the forest are ");
     	for (int i=0; i<animal.size(); i++)
     	{	
     		System.out.println("\n   "+(i+1)+"   "+animal.get(i).getName());
     	}
     
	}

       

    public void selectRandom()
    {   
        
    
          System.out.println("\n PRESS 1 TO START THE GAME");
            d.pattern();
           
            int choice=s.nextInt();
            d.gameRun();
         
              if(choice==1)
              {
                  randomNo = random.nextInt(10);   
              randomFile= random.nextInt(10);
              
              while(randomNo==randomFile)
                {   
              randomFile= random.nextInt(10);
                 }

                System.out.println(" "+randomNo);
               System.out.println(" "+randomFile);

             

              
                

           
                 System.out.println("               ");
                System.out.println(" Animal 1    "+animal.get(randomNo).getName()+"      ");
                 System.out.println("\nSTRENGTH        "+animal.get(randomNo).getAnimalStrength()+"      ");

               
               
               
               
                 System.out.println("             ");
                System.out.println("  Animal 2   "+animal.get(randomFile).getName()+"         ");
                  System.out.println("\n STRENGTH        "+animal.get(randomFile).getAnimalStrength()+"      ");
       try{        
this.printRandom();
        this.finalWinner();   
}
catch(IndexOutOfBoundsException m)
{
    System.out.println("Game ends due to some factors");
}}
                
     }
public void printRandom()
{
               
                 if(animal.get(randomNo) instanceof Carnivorous|| animal.get(randomFile) instanceof Carnivorous )
                 {

                if(animal.get(randomNo).getAnimalStrength()>animal.get(randomFile).getAnimalStrength())
                {


                d.pyramidPattern1();
                 System.out.println("       Winner         ");
                System.out.println("       "+animal.get(randomNo).getName()+"     ");
                int newStrength=(animal.get(randomNo).getAnimalStrength()-10);
                   
                System.out.println("Decreased Strength     " +newStrength);
                d.pyramidPattern2();
                 System.out.println("    Looser         ");
                System.out .println("        "+animal.get(randomFile).getName()+"         ");
                int newStrength1=(animal.get(randomFile).getAnimalStrength()-35);
              System.out.println("Decreased Strength     " +newStrength1);
              animal.get(randomFile).setAnimalLife(false);
                }
                else
                  {
                   
                d.pyramidPattern1();
                 System.out.println("    Winner          ");
                     System.out.println("     "+animal.get(randomFile).getName()+"         ");
                      int newStrength=(animal.get(randomFile).getAnimalStrength()-10);
                         
                System.out.println("Decreased Strength of Winner "+newStrength);
                d.pyramidPattern2();
                 System.out.println("    Looser          ");
                 System.out .println("        "+animal.get(randomNo).getName()+"         ");
                int newStrength1=(animal.get(randomNo).getAnimalStrength()-35);
              System.out.println("Decreased Strength     " +newStrength1);
                 animal.get(randomNo).setAnimalLife(false);
                  }
              }



             if(animal.get(randomNo) instanceof Herbivorus && animal.get(randomFile) instanceof Herbivorus )
             {
                System.out.println("DONOT FIGHT");

               }
           
        d.pyramidPattern3();
 
 


}

 public void finalWinner()
 {
        System.out.println("Final WINNER");
            for(int i=0;i<animal.size();i++)
            {
            randomFile=random.nextInt(animal.size());
            System.out.println("RANDOM ITEM INDEX   "+randomFile);
            while(randomNo==randomFile)
            {
                randomFile=random.nextInt(animal.size());
            }
            System.out.println("RANDOM ITEM IN After"+randomFile);
            if(animal.get(randomNo).getAnimalLife() == true && animal.get(randomFile).getAnimalLife() == true)
            {
                if(animal.get(randomNo) instanceof Carnivorous || animal.get(randomFile) instanceof Carnivorous)
                {
                    System.out.println("\n PLAYER1     "+animal.get(randomNo).getAnimalName());
                    System.out.println("\n  STRENGTH   "+animal.get(randomNo).getAnimalStrength());
                    System.out.println("    ");
                    System.out.println("\n PLAYER2  "+animal.get(randomFile).getAnimalName());
                    System.out.println("\n STRENGTH    "+animal.get(randomFile).getAnimalStrength());    
                    if(animal.get(randomNo).getAnimalStrength()>animal.get(randomFile).getAnimalStrength())
                    {
                        System.out.println("\n      WINNER IS"+animal.get(randomNo).getAnimalName());
                        randomNo=randomNo;
                        animal.get(randomFile).setAnimalLife(false);
                        animal.remove(randomFile);
                    }
                    else{
                        System.out.println("\n      WINNER IS"+animal.get(randomFile).getAnimalName());
                        randomNo=randomFile;
                        animal.get(randomFile).setAnimalLife(false);
                        animal.remove(randomNo);
                      

                    }   d.pyramidPattern3();
                }

                if(animal.get(randomNo) instanceof Herbivorus && animal.get(randomFile) instanceof Herbivorus)
                {
                    System.out.println("\n PLAYER1     "+animal.get(randomNo).getAnimalName());
                    System.out.println("\n  STRENGTH   "+animal.get(randomNo).getAnimalStrength());
                    System.out.println("    ");
                    System.out.println("\n PLAYER2  "+animal.get(randomFile).getAnimalName());
                    System.out.println("\n STRENGTH    "+animal.get(randomFile).getAnimalStrength());  
                    System.out.println("DONT FIGHT");
                }  


            }
            


        }
          
            
            

    
        

    

           
    }
}
