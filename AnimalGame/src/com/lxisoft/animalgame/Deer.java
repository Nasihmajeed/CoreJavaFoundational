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


  	public Animal escape(Animal animal)
    {
    	int y=(int)(Math.random()*10);
    	if(y>=4)
    	{
     		return this;    
    	}
  		
  		else
  		{
  			return animal;
  		}
	}


	 public int[] graze()
	 {
	   int[] arr=new int[2];
     arr[0]=(int)(Math.random()*100);
     arr[1]=(int)(Math.random()*100);

     return arr;
   }
}