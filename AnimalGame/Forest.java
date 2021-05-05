import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Forest
{
Animal animal=new Animal();

Tiger tgr=new Tiger();
Rabbit rab=new Rabbit();
Deer dr=new Deer();
Zebra zbra=new Zebra();
Lion ln=new Lion();
Crocodile cr=new Crocodile();
Antelope ant=new Antelope();
Fox fx=new Fox();

int asel,bsel;

ArrayList<Animal> animalsList=new ArrayList<Animal>();

	{
		animalsList.add(new Tiger());
		animalsList.add(new Rabbit());
		animalsList.add(new Deer());
		animalsList.add(new Zebra());
		animalsList.add(new Lion());
		animalsList.add(new Crocodile());
		animalsList.add(new Antelope());
		animalsList.add(new Fox());
	}

	{
		animalsList.get(0).setName("Red-Tiger");
		animalsList.get(0).setEnergy(10);
		animalsList.get(0).setDistance(6);
		animalsList.get(0).setStamina(8);
		
		animalsList.get(1).setName("Rabbit");
		animalsList.get(1).setEnergy(4);
		animalsList.get(1).setDistance(2);
		animalsList.get(1).setStamina(3);
	
        animalsList.get(2).setName("Deer");
		animalsList.get(2).setEnergy(5);
		animalsList.get(2).setDistance(3);
		animalsList.get(2).setStamina(5);
        
        animalsList.get(3).setName("Zebra");
		animalsList.get(3).setEnergy(5);
		animalsList.get(3).setDistance(4);
		animalsList.get(3).setStamina(6);

        animalsList.get(4).setName("Lion");
		animalsList.get(4).setEnergy(15);
		animalsList.get(4).setDistance(7);
		animalsList.get(4).setStamina(10);
				
		animalsList.get(5).setName("Crocodile");
		animalsList.get(5).setEnergy(14);
		animalsList.get(5).setDistance(5);
		animalsList.get(5).setStamina(12);
		
		animalsList.get(6).setName("Antelope");
		animalsList.get(6).setEnergy(6);
		animalsList.get(6).setDistance(4);
		animalsList.get(6).setStamina(6);
		
		animalsList.get(7).setName("Fox");
		animalsList.get(7).setEnergy(7);
		animalsList.get(7).setDistance(4);
		animalsList.get(7).setStamina(9);
	}


public void welcomeToForest()
{
System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");	
System.out.println("The Deadly Fight Begins Here......................");

animal.wildAnimals();
Animal a=selectFirstAnimalToFight();
Animal b=selectSecondAnimalToFight();
fight(a,b);
}

public Animal selectFirstAnimalToFight()
{
	System.out.println("Enter the number of the First Animal from the above List : ");
	asel=sc.nextInt();
	switch(asel)
	{
		case 1: System.out.println("Your first Participant is a Tiger !!!");
		            System.out.println("Tiger is one of the most powerful wild animal !");
					return new Tiger();
					break;
					
		case 2: System.out.println("Your first Participant is a Rabbit !!!");
		             System.out.println("Rabbit is a cute Animal....It is among the least powerful !");
					break;
					
		case 3: System.out.println("Your first Participant is a Deer !!!");
		             System.out.println("Deer runs faster.....It is always a prey for Lion and Tiger !!!!!");
                     break;
					 
		case 4: System.out.println("Your first Participant is a Zebra !!!");
		             System.out.println("Zebra has Black&White stripes on it's body !!!");
					 break;
					 
		case 5: System.out.println("Your first Participant is a Lion !!!");
		             System.out.println("Lion is the King of the JUNGLE !!!!!!!!!!!!!!!!!!!!");
					 break;
					 
		case 6: System.out.println("Your first Participant is a Crocodile !!!");
		             System.out.println("Crocodile lives in the water bodies!!!");
		             break;
					 
		case 7: System.out.println("Your first Participant is a Antelope !!!");
		             System.out.println("Antelope is a Deer-like Animal whic is always a prey for Carnivores!!!");
		             break;
					 
		case 8: System.out.println("Your first Participant is a Fox !!!");
		             System.out.println("Fox is the most cunning Animal");
	
	}
}	
	public void selectSecondAnimalToFight()
	{
      System.out.println("Enter the number of the Second Animal from the above List : ");
	bsel=sc.nextInt();
	switch(bsel)
	{
		case 1: System.out.println("Your second Participant is a Tiger !!!");
		            System.out.println("Tiger is one of the most powerful wild animal !");
					break;
					
		case 2: System.out.println("Your second Participant is a Rabbit !!!");
		             System.out.println("Rabbit is a cute Animal....It is among the least powerful !");
					 break;
					 
		case 3: System.out.println("Your second Participant is a Deer !!!");
		             System.out.println("Deer runs faster.....It is always a prey for Lion and Tiger !!!!!");
					 break;
					 
		case 4: System.out.println("Your second Participant is a Zebra !!!");
		             System.out.println("Zebra has Black&White stripes on it's body !!!");
					 break;
					 
		case 5: System.out.println("Your second Participant is a Lion !!!");
		             System.out.println("Lion is the King of the JUNGLE !!!!!!!!!!!!!!!!!!!!");
					 break;
					 
		case 6: System.out.println("Your second Participant is a Crocodile !!!");
		             System.out.println("Crocodile lives in the water bodies!!!");
		              break;
					  
		case 7: System.out.println("Your second Participant is a Antelope !!!");
		             System.out.println("Antelope is a Deer-like Animal whic is always a prey for Carnivores!!!");
		             break;
					 
		case 8: System.out.println("Your second Participant is a Fox !!!");
		             System.out.println("Fox is the most cunning Animal");
	}			
}
/*
public void fight(Animal a,Animal b)
{
	
}
*/
}