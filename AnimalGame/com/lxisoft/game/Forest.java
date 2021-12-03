package com.lxisoft.game;

import com.lxisoft.animals.*;
//import com.lxisoft.animals.Tiger;

import java.util.ArrayList;

public class Forest {
	Animal animal = new Animal();
       ArrayList<Animal> animalsList=new ArrayList<Animal>();
              {
              animalsList.add(new Tiger());
		animalsList.add(new Rabbit());
		animalsList.add(new Deer());
		animalsList.add(new Fox());
		animalsList.add(new Lion());
		animalsList.add(new Elephant());
		animalsList.add(new LeoPard());
		animalsList.add(new Gaur());
		animalsList.add(new Crocodile());
		animalsList.add(new Rhinoceros());

              animalsList.get(0).setName("Bengal-Tiger");
		animalsList.get(0).setEnergy(10);
		animalsList.get(0).setDistance(4);
		animalsList.get(0).setStamina(9);
		
		animalsList.get(1).setName("Cutey-Rabbit");
		animalsList.get(1).setEnergy(1);
		animalsList.get(1).setDistance(4);
		animalsList.get(1).setStamina(1);
	
        	animalsList.get(2).setName("Little-Deer");
		animalsList.get(2).setEnergy(2);
		animalsList.get(2).setDistance(4);
		animalsList.get(2).setStamina(2);
        
        	animalsList.get(3).setName("Cunning-Fox");
		animalsList.get(3).setEnergy(4);
		animalsList.get(3).setDistance(2);
		animalsList.get(3).setStamina(3);

        	animalsList.get(4).setName("King-Lion");
		animalsList.get(4).setEnergy(15);
		animalsList.get(4).setDistance(3);
		animalsList.get(4).setStamina(12);
				
		animalsList.get(5).setName("Indian-Elephant");
		animalsList.get(5).setEnergy(14);
		animalsList.get(5).setDistance(5);
		animalsList.get(5).setStamina(10);
		
		animalsList.get(6).setName("Leopard");
		animalsList.get(6).setEnergy(3);
		animalsList.get(6).setDistance(2);
		animalsList.get(6).setStamina(4);
		
		animalsList.get(7).setName("Strong-Guar");
		animalsList.get(7).setEnergy(3);
		animalsList.get(7).setDistance(2);
		animalsList.get(7).setStamina(4);

		animalsList.get(8).setName("Strong-Crocodile");
		animalsList.get(8).setEnergy(6);
		animalsList.get(8).setDistance(4);
		animalsList.get(8).setStamina(7);

		animalsList.get(9).setName("Rhinoceros");
		animalsList.get(9).setEnergy(3);
		animalsList.get(9).setDistance(2);
		animalsList.get(9).setStamina(4);
	}
       
       public void welcomeToForest()
 {
System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");	
System.out.println("The Deadly Fight Begins Here......................");

animal.wildAnimals();
for (Animal i : animalsList) {
      
       System.out.println(i);

       
}
}

}
