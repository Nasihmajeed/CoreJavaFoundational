package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;


public class Forest
{    
     
	 Animal[] animal;
	 // method for inserting the animals
	 public Animal[] insertion()
	{
		int s;
		animal = new Animal[5];
			
	    animal[0] = new Lion(" Sambu the Lion king ",80,true);
		animal[1] = new Tiger( " Sherkhan the Tiger ",70,true);
		animal[2]  = new Rabit( " Mottu the Rabit ",10,true );
		animal[3]  = new Wildbull( " Sahal the Wildbull ",90,true);		
	    animal[4]  = new  Wolf(" Akela the wolf ",40,true);
	   
		for(s=0;s<animal.length;s++)
		{
			System.out.print(s+1);
			animal[s].display();
		}	
		return animal;
	}	
	// here creating the random numbers 
    public int random()
    {	
		int random= (int)(Math.random()*5);
		
		return random;

    }
	// meet the animals which are ready to fight
	public void meet(Animal[] animal)
    {    int i=0,x,y;
	     
	    while(i<4)
		{   
	        i++;
			do{
		    x=random();
		    y=random();
			}while(x==y || animal[x].isAlive==false || animal[y].isAlive==false);
		 
			   fight(animal[x],animal[y]);
		    		
		}
				
	}	
	 // this method helds the fighting of animals
	public void fight(Animal animal1,Animal animal2)
	{  
			if(animal1.isAlive!=false && animal2.isAlive!=false)
			{ 
		        System.out.println(animal1.name+ "and"+ animal2.name +"ready to fight...");
		        System.out.println("Fight Begins..........!!");
				if(animal1.strengthlevel>animal2.strengthlevel)
				{	
				  System.out.println(  animal1.name+"  Defeated " +animal2.name +"\n" );
				  System.out.println( animal2.name +" is now dead \n" );
				  animal1.strengthlevel=animal2.strengthlevel-2;
				  animal2.isAlive=false;
				  
				 }
				 else
					  {
							System.out.println( animal2.name+"  Defeated "+animal1.name +"\n");
							System.out.println( animal1.name +" is now dead \n" );
							animal2.strengthlevel=animal2.strengthlevel-2;
							animal1.isAlive=false;
				
			   
				       }
			}
			 else
			 {
			    	 
			 }
		
    }
	public void winner (Animal animal1)
	{
		if(animal1.isAlive==true)
		{
		  System.out.println(animal1.name+"is the king of the Jungle");	
		}
		else
		{
				
		}	
	}
}