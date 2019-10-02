package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Rabbit extends Animal implements Herbivore
{
	public void run()
  {
  	System.out.println("Rabbit run very slow");
  }

  public void eat()
  {
  	System.out.println("Rabbit eat grass\n");
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

  public void escape(Animal animal1,Animal animal2,Animal animal3,Animal animal4)
  {
    System.out.println("\n"+animal1.animalName+" , "+animal2.animalName+" , "+animal3.animalName+" And "+animal4.animalName+" vs "+this.animalName);
    int x=(int)(Math.random()*10);
    if(x>=4)
    {
      System.out.println(this.animalName+"------Escape------");
    }   
    else
    {
      System.out.println("\n"+animal1.animalName+" , "+animal2.animalName+" , "+animal3.animalName+" And "+animal4.animalName+" Kill"+this.animalName);
      this.isDead=true;
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