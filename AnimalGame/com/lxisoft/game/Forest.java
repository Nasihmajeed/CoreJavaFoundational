package com.lxisoft.game;

import com.lxisoft.animals.*;
import com.lxisoft.animals.Tiger;
import com.lxisoft.game.Animal;
import java.util.ArrayList;

public class Forest {

       int i = 0;
       
         String meeting;
         
       public String setMeeting(Animal animal1,Animal animal2){
       
       if((animal1 instanceof Herbivores) && (animal2 instanceof Herbivores)){
              System.out.println("????????????????????????????????????????????");
              System.out.println("Chance of Occurrence of a Fight is Zero!!!!!");
             
              System.out.println("Both animals are herbivorous!!!!!!");
              System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
              System.out.println("Sorry!...... fight isn't possible !!!!We are Good -F-R-I-E-N-D-S-");
              return "Sorry!...... fight isn't possible !!!!We are Good -F-R-I-E-N-D-S-";
              //return animal1,animal2;
             }

       public void welcomeToForest()
       {

      System.out.println("!!!!!!!!!!!!!!!Welcome to the Jungle!!!!!!!!!!");

      System.out.println("The Deadly Fight Begins Here......................" +"\n");
      
                     Animal animal = new Animal(" ",0,0,0);
                     
              System.out.println("List of Animals in the Forest :  ");
              
                     animal.wildAnimals();
      
	
       ArrayList<Animal> animalsList = new ArrayList<Animal>();
              {
                     System.out.println("Details of !_F_I_G_H_T_E_R_S_!" +"\n");

              animalsList.add(new Tiger("Bengal-Tiger",14,10,5));
              animalsList.add(new Rabbit("Cutey-Rabbit",10,7,5));
              animalsList.add(new Deer("Little-Deer",2,4,2));
              animalsList.add(new Fox("Cunning-Fox",6,4,4));
              animalsList.add(new Lion("King-Lion",15,3,12));
              animalsList.add(new Elephant("Indian-Elephant",8,5,10));
              animalsList.add(new LeoPard("Angry-LeoPard",17,9,13));
              animalsList.add(new Gaur("Hungry-Guar",9,8,4));
              animalsList.add(new Crocodile("Lazy-Crocodile",10,6,4));
              animalsList.add(new Rhinoceros("Indian-Rhinoceros",7,6,7));

              //for (Animal i : animalsList) {
                while(i < animalsList.size()){
                     animalsList.get(i).printing();   
                     i++;
              }
		//animalsList.get(0).printing();
              //animalsList.get(1).printing();
	}
       
       }

}
