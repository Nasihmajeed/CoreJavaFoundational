package com.lxisoft.animalgame;
import com.lxisoft.animalgame.*;
public class Lion extends Animal implements Carnivore
{
  public Animal fight(Animal animal)
	{
		if(this.strength>animal.strength)
		{
			return this;					
		}
		else
    {  
    	return animal;
    }
	}

	public void run()
  {
  	System.out.println("Lion run fast");
  }

  public void eat()
  {
  	System.out.println("Lion eat meat\n");
  }

  public int[] roam()
  {
    int[] arr=new int[2];
    arr[0]=(int)(Math.random()*10);
    arr[1]=(int)(Math.random()*10);
   
    return arr;  
  } 
}