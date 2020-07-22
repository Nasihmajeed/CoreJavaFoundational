package com.lxisoft.forest;
import java.util.Scanner;
public class Forest{

	//Animal animals=new Animal();
	 ArrayList<Animal> animalList = new ArrayList<Animal>();

	public void forestDetails(){

		animalList.add(new Animal());
        animalList.get(0).setAnimalName("Tiger");

        animalList.add(new Animal());
        animalList.get(1).setAnimalName("Lion");

        animalList.add(new Animal());
        animalList.get(2).setAnimalName("Rabbit");

        animalList.add(new Animal());
        animalList.get(3).setAnimalName("Deer");


         for(int i=0;i<animalList.size();i++){
            System.out.println("\n"+animalList.get(i).getAnimalName());  
            }
        
	}
	
}