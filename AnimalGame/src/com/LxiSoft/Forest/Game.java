public class Game
{
public void selectRandom()
    {
          System.out.println("\n PRESS 1 TO START THE GAME");
            d.pattern();
           
            int choice=s.nextInt();
            d.gameRun();
         
              if(choice==1)
              {
                 int randomNo = random.nextInt(10);   
             int randomFile= random.nextInt(10);
             
             
        

    }
}
	public void printRandom()
	{	
		
	
          
             
            for(int i=0;i<1;i++)
            {

                 System.out.println(" "+randomNo);
               System.out.println(" "+randomFile);

             

                if(randomNo==randomFile)
                {
                    randomFile=random.nextInt(10);
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
 
 }        }

        else
            {
                System.out.println("EXITED FROM ANIMAL GAME");
            }
        

	

