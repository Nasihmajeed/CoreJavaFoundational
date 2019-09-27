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
	public void meet(Animal[] a)
    {  
	   int w=0,win=0;
	do{
		
		for(int i=0;i<animal.length;i++)
		{
			if(a[i].isAlive==true)
			{
				w++;
				w=i;
				
			}
			
		}
		
		
		
		
		
		
		if(w!=1)
		{	int x,y,c=0;
	     
	       
	    
			c=c++;
			do
			{
				
		      x=random();
		      y=random();
			
			}
			  
			  while(a[x] instanceof Herbivores ||x==y || a[x].isAlive==false || a[y].isAlive==false);
		      
			    fight(a[x],a[y]);
				
				
			
		}
		else
		   {
			   System.out.println("\n"+"....."+w.name+"is the king of the Jungle"+"..... ");
		   }   
		   
	}while(w!=1);
   }	
	 // this method helds the fighting of animals
	

   
	
	public void fight(Animal animal1,Animal animal2)
	{
		        Animal temp;
		        System.out.println(animal1.name+ "and"+ animal2.name +"ready to fight...");
		        System.out.println("Fight Begins..........!!");
				temp=((Carnivores)animal1).attack(animal2);
				 if(temp==animal1)
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
					   
					   
		meet(animal);
		

	}
	
	}

		
		
	
 
