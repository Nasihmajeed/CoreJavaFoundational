package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Tiger extends Animal implements Carnivore
{
  public void fight(Animal animal)
	{
		if(this.strength>animal.strength)
		{
			System.out.println("WINNER   "+this.animalName+" \nwinner Strength=" +(this.strength-=1));
      System.out.println("Looser Strength=" +(animal.strength=0));
      if(animal.strength<=0)
      {
        animal.isDead=true;
        System.out.println(animal.animalName+"  DEAD  ");
      }  					
		}
		else
    {
      System.out.println("WINNER   "+animal.animalName+" \nwinner Strength=" +(animal.strength-=1));
      System.out.println("Looser Strength=" +(this.strength=0));
      if(this.strength<=0)
      {
        this.isDead=true;
        System.out.println(this.animalName+"  DEAD  ");
      }
    }
	}

  public void run()
  {
  	System.out.println("Tiger run very fast");
  }

  public void eat()
  {
  	System.out.println("Tiger eat meat\n");
  }

  public int[] roam()
  {
    int[] arr=new int[2];
    arr[0]=(int)(Math.random()*50);
    arr[1]=(int)(Math.random()*50); 
    return arr;
  }
}