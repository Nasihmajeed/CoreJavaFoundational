import java.util.*;
import java.util.Scanner;


class Animal 
{
	Scanner sc=new Scanner(System.in);
	int asel;
	
private String animalName;

public void setAnimalName(String animalName)
{
	this.animalName=animalName;
}

public String getAnimalName()
{
	return animalName;
}
public void wildAnimals()
{
	System.out.println("There are many wild animals in the forest.............");
	System.out.println("Select the animals using which you want to fight from the below list : ");
	System.out.println("1.Tiger");
	System.out.println("2.Rabbit");
	asel=sc.nextInt();
}
}