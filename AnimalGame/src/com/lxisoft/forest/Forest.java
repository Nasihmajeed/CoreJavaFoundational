package com.lxisoft.forest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Forest{

	//Animal animals=new Animal();
	public List<Animal> animalList = new ArrayList<Animal>();




	public void forestDetails(){

		animalList.add(new Animal());
        animalList.get(0).setAnimalName("Tiger");

        animalList.add(new Animal());
        animalList.get(1).setAnimalName("Lion");

        animalList.add(new Animal());
        animalList.get(2).setAnimalName("Rabbit");

        animalList.add(new Animal());
        animalList.get(3).setAnimalName("Deer");     

        
          
	}

    public Animal getRandomElement(List<Animal> animalList)
    {
        Random rand=new Random();
        return animalList.get(rand.nextInt(animalList.size()));
            }


   
	
}