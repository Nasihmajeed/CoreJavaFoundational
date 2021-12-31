package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;
import java.*;
import com.lxisoft.*;

public class Elephant extends Animal implements Herbivores {

      

       public Elephant(String animalName,int starvage,int strength,int distance,boolean isAlive)
       {
              super(animalName,starvage,strength,distance,isAlive);
             
       }
   
       private int luckFactor;

//Random r=new Random();

                                                  //luckFactor
public int getLuckFactor()
{
       Random rand = new Random();
	luckFactor=rand.nextInt(10);
	return luckFactor;
}

//int x = rand.nextInt(20);
//int y = rand.nextInt(20);



}
