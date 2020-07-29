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
        gameList.get(0).setAnimalStrength(90);

        gameList.add(new Animal());
        gameList.get(1).setAnimalName("Lion");
        gameList.get(1).setAnimalStrength(95);


        gameList.add(new Animal());
        gameList.get(2).setAnimalName("Rabbit");
        gameList.get(2).setAnimalStrength(30);


        gameList.add(new Animal());
        gameList.get(3).setAnimalName("Deer");
        gameList.get(3).setAnimalStrength(32);


        gameList.add(new Animal());
        gameList.get(4).setAnimalName("Bear");    
        gameList.get(4).setAnimalStrength(70);

        for(int i=0;i<gameList.size();i++)
        {
        System.out.println(gameList.get(i).getAnimalName());
    	}
	}
	
	public void randomSelection()
	{


            System.out.println("Press 1 to Start the Game");
            int choice=select.nextInt();
            if(choice==1)
            {

           		int randomNumber = random.nextInt(5);   
             	int randomItem= random.nextInt(5);
               
             
        
            for(int i=0;i<1;i++)
            {

               System.out.println(" "+randomNumber);
               System.out.println(" "+randomItem);

                
                if(randomNumber==randomItem)
                {
                    randomItem=random.nextInt(5);
                }
               		System.out.println("           ----------------------------------------------------------- ");
                	System.out.println("           -------------------Player 1-------------------------------- ");
                	System.out.println("           ----------------------------------------------------------- ");
                	System.out.println("           -------"+gameList.get(randomNumber).getAnimalName()+"------ ");
					System.out.println("           ------- POWER"+gameList.get(randomNumber).getAnimalStrength()+"---- ");                	
             		System.out.println("           -----------------------------------------------------------");
             		System.out.println("           ----------------------------------------------------------- ");
               
					

					System.out.println("           ----------------------------------------------------------- ");
                	System.out.println("           -------------------Player 2-------------------------------- ");
                	System.out.println("           ----------------------------------------------------------- ");
                	System.out.println("           -------"+gameList.get(randomItem).getAnimalName()+"-------- ");
					System.out.println("           ------- POWER "+gameList.get(randomItem).getAnimalStrength()+"---- ");                             	
             		System.out.println("           -----------------------------------------------------------");
             		System.out.println("           ----------------------------------------------------------- ");                           


              
                
                 if(gameList.get(randomNumber).getAnimalStrength()>gameList.get(randomItem).getAnimalStrength())

				{
                	int newStrength=(gameList.get(randomItem).getAnimalStrength()-10);
                	System.out.println("           ----------------------------------------------------------- ");
                	System.out.println("           ---------------------- Winner ----------------------------- ");
                	System.out.println("           ----------------------------------------------------------- ");
                	System.out.println("           -------"+gameList.get(randomItem).getAnimalName()+"---------------------------------------------- ");
					System.out.println("           ------- POWER "+newStrength+"--------------------------------------------- ");                             	
             		System.out.println("           -----------------------------------------------------------");
             		System.out.println("           ----------------------------------------------------------- ");                           

                  
                }

                else{
                   
                    int newStrength=(gameList.get(randomItem).getAnimalStrength()-10);
                	System.out.println("           ----------------------------------------------------------- ");
                	System.out.println("           ---------------------- Winner ----------------------------- ");
                	System.out.println("           ----------------------------------------------------------- ");
                	System.out.println("           -------"+gameList.get(randomItem).getAnimalName()+"--------------------------------------------------- ");
					System.out.println("           -------POWER"+newStrength+"------------------------------------------------- ");                             	
             		System.out.println("           -----------------------------------------------------------");
             		System.out.println("           ----------------------------------------------------------- ");                           


                }


                  
 
            }
    	}  
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
