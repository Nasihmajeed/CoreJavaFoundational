package com.lxisoft.game;

import java.util.ArrayList;

import java.util.Random;

import com.lxisoft.game.Forest;

import com.lxisoft.game.Animal;

import com.lxisoft.animals.*;

public class Forest {

    ArrayList<Animal> animalsList = new ArrayList<Animal>();

    int hungryLevelOfPlayer1;
    int hungryLevelOfPlayer2;
    int strengthLevelOfPlayer1;
    int strengthLevelOfPlayer2;

        int i = 0;

    String meeting;
    String fight;
    Animal animal = new Animal(" "," ",0,0);

    public void welcomeToForest () {

        System.out.println("..........WELCOME TO FOREST........... \n");
    
    
    // animal.wildAnimals();
    
    animalsList.add(new Lion("King-Lion","meat",50,50));
    animalsList.add(new Deer("Alcine-Deer","grass",20,25));
    animalsList.add(new Tiger("Dave-Tiger","meat",40,35));
    animalsList.add(new Rabbit("Peter-Rabbit","grass",15,12));
    animalsList.add(new Leopard("Dale-Leopard","meat",30,15));
    animalsList.add(new Giraffe("Custard-Giraffe","grass",14,12));
    animalsList.add(new Wolf("Roman-Wolf","meat",25,24));
    animalsList.add(new Rhinocer("Grit-Rhinocer","meat",16,17));
    animalsList.add(new Cheetah("Fastest-Cheetah","meat",45,45));
    animalsList.add(new Zebra("Zippy-Zebra","grass",22,33));
    
    for(i = 0 ; i < animalsList.size() ; i++) {
        System.out.println(animalsList.get(i).getName());
        System.out.println(animalsList.get(i).getEat());
        System.out.println(animalsList.get(i).getStrengthLevel());
        System.out.println(animalsList.get(i).getHungryLevel());
    
        } 
    
    meetPlayers(animalsList);
    }
    
   

    public void meetPlayers(ArrayList<Animal> animalsList) {

        Random random = new Random();

        int animal1 =random.nextInt(animalsList.size());
        int animal2 =random.nextInt(animalsList.size());
    
        Animal player1 = animalsList.get(animal1);
        Animal player2 = animalsList.get(animal2);
    

        if((player1 instanceof Herbivores) && (player2 instanceof Herbivores)) {

            System.out.println("The Both Players Are Herbivores");
            System.out.println("They are  Friends");
    
        }
        
        else if((player1 instanceof Herbivores) && (player2 instanceof Carnivores)) {
    
            System.out.println("The First Player Is Herbivores");
            System.out.println("Player1 is : "+player1.getName()+" "+"  with hungry level "+player1.getHungryLevel()+" having strength of "+player1.getStrengthLevel());
            System.out.println("The Second Player Is Carnivores");
            System.out.println("Player2 is : "+player2.getName()+" "+"  with hungry level "+player2.getHungryLevel()+" having strength of "+player2.getStrengthLevel());
            System.out.println("Player 2 is Winner : "+player2.getName()+" ");
            Carnivores carnivores = (Carnivores) player2;
           carnivores.startFight(player1);
           
    }
    
    else if((player1 instanceof Carnivores) && (player2 instanceof Carnivores)){
    
        System.out.println("The Both Players Are Carnivores");
        System.out.println("They Are Good Friends");
    
    }
    
    else if((player1 instanceof Carnivores) && (player2 instanceof Herbivores)){
    
        System.out.println("The First Player Is Carnivores");
        System.out.println("Player1 is : "+player1.getName()+" "+"  with hungry level "+player1.getHungryLevel()+" having strength of "+player1.getStrengthLevel());
        System.out.println("The Second Player Is Herbivores");
        System.out.println("Player2 is : "+player2.getName()+" "+"  with hungry level "+player2.getHungryLevel()+" having strength of "+player2.getStrengthLevel());
        System.out.println("player1 is Winner : "+player1.getName()+"");
        Carnivores carnivores = (Carnivores) player1;
        carnivores.startFight(player2);
       
    
    }
    }
    
   
    }

        
