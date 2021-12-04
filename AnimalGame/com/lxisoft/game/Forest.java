package com.lxisoft.game;

import com.lxisoft.animals.*;
import com.lxisoft.animals.Tiger;

import java.util.ArrayList;

public class Forest {
	//Animal animal = new Animal();
       ArrayList<Animal> animalsList=new ArrayList<Animal>();
              {
              animalsList.add(new Tiger("Bengal-Tiger",14,10,5));


             // animalsList.get(0).printData();
		
	}
       
       public void welcomeToForest()
 {
System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");	
System.out.println("The Deadly Fight Begins Here......................");

//animal.wildAnimals();
for (Animal i : animalsList) {
      i.printData();
       System.out.println(i);

       
}
}

}
