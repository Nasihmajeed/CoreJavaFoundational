import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Forest
{
	
Scanner sc=new Scanner(System.in);
	
Animal animal=new Animal();
/*
Tiger tgr=new Tiger();
Rabbit rab=new Rabbit();
Deer dr=new Deer();
Zebra zbra=new Zebra();
Lion ln=new Lion();
Crocodile cr=new Crocodile();
Antelope ant=new Antelope();
Fox fx=new Fox();
*/


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

String animal1,animal2;

public void welcomeToForest()
{
System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");	
System.out.println("The Deadly Fight Begins Here......................");

animal.wildAnimals();

System.out.println("Enter the first animal to fight : -----");
animal1=sc.next();
Class a=Class.forName((String)animal1);
System.out.println("The animal you have selected is a "+a.getName());

System.out.println("Enter the second animal to fight : -----");
animal2=sc.next();
Class b=Class.forName((String)animal2);
System.out.println("The animal you have selected is a "+b.getName());

fight(a,b);
}


}