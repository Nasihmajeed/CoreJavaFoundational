package com.lxisoft.animals;
import java.util.Random;
import com.lxisoft.game.Animal;

public class Elephant extends Animal implements Herbivores {

       Random rand = new Random();

       public Elephant(String animalName,int starvage,int strength,int distance)
       {
              super(animalName,starvage,strength,distance);
             
       }
   
       private int luckFactor;

//Random r=new Random();

                                                  //luckFactor
public int getLuckFactor()
{
	luckFactor=rand.nextInt(10);
	return luckFactor;
}

//int x = rand.nextInt(20);
//int y = rand.nextInt(20);

}
