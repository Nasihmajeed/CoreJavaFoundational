package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Deer extends Animal implements Herbivore
{	
	public void run()
  {
  	System.out.println("Deer run fastly");
  }

  public void eat()
  {
  	System.out.println("Deer eat leaves\n");
  }

  public void escape(Animal animal)
  {
    System.out.println("\n"+this.animalName+"  VS  "+animal.animalName);
    int x=(int)(Math.random()*10);
    if(x>=4)
    {
      System.out.println(this.animalName+"------Escape------");
    }   
    else
    {
      System.out.println("WINNER   "+animal.animalName);
      System.out.println(animal.animalName+"  kill "+this.animalName);
      this.isDead=true;
    }
  }

  public void escape(Animal animal1,Animal animal2)
  {
    System.out.println("\n"+animal1.animalName+"  and  "+animal2.animalName+" vs "+this.animalName);
    int x=(int)(Math.random()*10);
    if(x>=4)
    {
      System.out.println(this.animalName+"------Escape------");
    }   
    else
    {
    System.out.println("\n"+animal1.animalName+"  and  "+animal2.animalName+"  kill "+this.animalName);
    this.isDead=true;
    }
  }

  public void escape(Animal animal1,Animal animal2,Animal animal3)
  {
    System.out.println("\n"+animal1.animalName+" , "+animal2.animalName+" And "+animal3.animalName+" vs "+this.animalName);
    int x=(int)(Math.random()*10);
    if(x>=4)
    {
      System.out.println(this.animalName+"------Escape------");
    }   
    else
    {
      System.out.println("\n"+animal1.animalName+" , "+animal2.animalName+"  And "+animal3.animalName+" kill "+this.animalName);
      this.isDead=true;
    }
  }

  public void escape(Animal[] animalArr,int[] nearbyAnimal)
  {
    for(int i=0;i<nearbyAnimal.length;i++)
    {
        System.out.println("\n"+animalArr[nearbyAnimal[i]].animalName+" vs "+this.animalName);
        int x=(int)(Math.random()*10);
        if(x>=4)
        {
          System.out.println(this.animalName+"------Escape------");
        }   
        else
        {
          System.out.println("\n"+animalArr[nearbyAnimal[i]].animalName+" Kill"+this.animalName);
          this.isDead=true;
        }
    }
  }

	 public int[] graze()
	 {
	   int[] arr=new int[2];
     arr[0]=(int)(Math.random()*50);
     arr[1]=(int)(Math.random()*50);

     return arr;
   }
}