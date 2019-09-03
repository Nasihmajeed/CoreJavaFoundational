package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;



public class Forest
{    
     
	 Animal[] animal;
	
	public void fight()
	{	
	    // animal.Display();
		
		animal = new Animal[5];
		animal[0] = new Lion(" Sambu the Lion king",70);
		animal[1] = new Tiger( " Sherkhan the Tiger",80);
		animal[2]  = new Rabit( " Mottu the Rabit",10 );
		animal[3]  = new Wildbull( " Sahal the Wildbull",50);		
		animal[4]  = new  Wolf(" Akela the wolf",40);
		int i,j;
		Animal temp;
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if (i!=j)
				{
					if(animal[i].strengthlevel>animal[j].strengthlevel)
					{
						System.out.println(  animal[i].name+"  Defeated " +animal[j].name +"\n" );
						//animal[i]=0;
						temp= animal[i];
						animal[i]=animal[j];
						animal[j]=temp;
						
					}
					else
					{
						System.out.println( animal[j].name+"  Defeated "+animal[i].name +"\n");
					}	
				}
				
			}
		}
		
		
		
	}
  
}
