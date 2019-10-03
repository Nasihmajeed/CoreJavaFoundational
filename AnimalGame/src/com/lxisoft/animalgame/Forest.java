package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;



public class Forest
{    
     
	 Animal[] animal;
	
	 // method for inserting the animals
	 public Animal[] insertion()
	{
		
		int s;
		animal = new Animal[8];
			
	    animal[0] = new Lion("  Lion ",80,random(40)+5,random(40)+5,50);
		animal[1] = new Tiger( "Tiger ",70,random(30),random(30),40);
		animal[2]  = new Rabit( " Rabit ",10,random(10),random(10),10);
		animal[3]  = new Wildbull( " Wildbull ",90,random(15),random(15),20);
	    animal[4]  = new  Wolf("  wolf ",40,random(20),random(20),30);
	    animal[5]  = new Leopard(" Leopard " ,60,random(30),random(30),35);
		animal[6]  = new Fox(" Fox " ,30,random(20),random(20),20);
		animal[7]  = new Hyena(" Hyena " ,35,random(30),random(30),20);
		for(s=0;s<animal.length;s++)
		{
			System.out.print(s+1);
			animal[s].display();
		}
      		
		return animal;
	}	
	// here creating the random numbers 
    public int random(int n)
    {	
		int random= (int)(Math.random()*n);
		
		return random;

    }
	// meet the animals which are ready to fight
	public void meet()
    {  
	   int w=0;
	do{
		w=0;
		for(int i=0;i<animal.length;i++)
		{
			
			if(animal[i].isAlive==true && animal[i] instanceof Carnivores)
			{
				    w++;
			
			}
			
		}
		
		if(w!=1)
		{	
	        int x,y,c=0;
			do
			{
				
		      x=random(animal.length);
		      y=random(animal.length);
			
			}
			  
			  while(animal[x] instanceof Herbivores ||x==y || animal[x].isAlive==false || animal[y].isAlive==false);
			  fight(animal[x],animal[y]);
				
				
			
		}
		
		   
	}while(w!=1);
   }	
	 // this method helds the fighting of animals
	
	public Animal fight(Animal animal1,Animal animal2)
	{
		        Animal temp;
		        System.out.println(animal1.name+ "and "+ animal2.name +"ready to fight...");
		        System.out.println("******Fight Begins******");
				if(animal1 instanceof Carnivores && animal2 instanceof Carnivores)
				{
					temp=((Carnivores)animal1).attack(animal2);
				
				   
				}
                else if(animal1 instanceof Carnivores && animal2 instanceof Herbivores)
				{
					 temp=((Herbivores)animal2).escape(animal1);
					 
					
				    
				}	
				else
				{
					System.out.println("****** OOOPS!!******");
				}
				
				
		    printfight(temp,animal1,animal2);
             return temp;
	}
	public void printfight(Animal temp,Animal animal1,Animal animal2)
	{
		 if( distance(animal1,animal2)<=animal1.range)
				   {
					
				     if(temp==animal1)
				    {	
				      System.out.println(  animal1.name+"  Defeated " +animal2.name +"\n" );
				      System.out.println( animal2.name +" is now dead \n" );
				      animal1.strengthlevel=animal1.strengthlevel-20;
				      animal2.isAlive=false;
				  
				    }
				 else
					   {
							System.out.println( animal2.name+"  Defeated "+animal1.name +"\n");
							System.out.println( animal1.name +" is now dead \n" );
							animal2.strengthlevel=animal2.strengthlevel-20;
							animal1.isAlive=false;
				       }
				    }
					
		 winner();
		
	}
    public int distance(Animal animal1,Animal animal2)
	{
		int distance= (animal1.x-animal2.x)^2+(animal1.y-animal2.y)^2;
		
		return distance;
	}
	public void location()
	{
		
	}
	
	public void winner ()
	{	
	       
		int x=0,win=0;
		for(int i=0;i<animal.length;i++)
		{
			
			if(animal[i].isAlive==true && animal[i] instanceof Carnivores)
			{
				x++;
				win=i;
				
			}
		} 
			if(x==1)
			{
				System.out.println("\n"+"....."+animal[win].name+"is the king of the Jungle"+"..... ");	
              			
			}
	
	}

}		
		
	
 
