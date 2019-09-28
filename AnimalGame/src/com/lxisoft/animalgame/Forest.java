package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
//import com.lxisoft.animalgame.Lion;
//import com.lxisoft.animalgame.Tiger;


public class Forest
{    
     
	 Animal[] animal;
	 // method for inserting the animals
	 public Animal[] insertion()
	{
		int s;
		animal = new Animal[8];
			
	    animal[0] = new Lion("  Lion ",80,true);
		animal[1] = new Tiger( " Tiger ",70,true);
		animal[2]  = new Rabit( " Rabit ",10,true );
		animal[3]  = new Wildbull( " Wildbull ",90,true);
	    animal[4]  = new  Wolf("  wolf ",40,true);
	    animal[5]  = new Leopard(" Leopard " ,60,true);
		animal[6]  = new Fox(" Fox " ,30,true);
		animal[7]  = new Hyena(" Hyena " ,35,true);
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
		int random= (int)(Math.random()*8);
		
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
			
			if(animal[i].isAlive==true)
			{
				if (animal[i] instanceof Carnivores)
				{
					//System.out.println(animal[i].name+"jeevanulla janthu"+animal[i].strengthlevel);
				    w++;
			
				}
				
				
			}
			
		}
		//System.out.println(w+"value of w");
		if(w!=1)
		{	int x,y,c=0;
	     
	       //System.out.println(c+"value of c");
	    
			
			do
			{
				
		      x=random();
		      y=random();
			
			}
			  
			  while(animal[x] instanceof Herbivores ||x==y || animal[x].isAlive==false || animal[y].isAlive==false);
		       //System.out.println(animal[x].name+"value of X and Y"+animal[y].name);
			    fight(animal[x],animal[y]);
				
				
			
		}
		
		   
	}while(w!=1);
   }	
	 // this method helds the fighting of animals
	

   
	
	public void fight(Animal animal1,Animal animal2)
	{
		        Animal temp;
		        System.out.println(animal1.name+ "and "+ animal2.name +"ready to fight...");
		        System.out.println("Fight Begins..........!!");
				temp=((Carnivores)animal1).attack(animal2);
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
					   
					   
		winner();

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
		  //System.out.println(" value of x "+x);	
			if(x==1)
			{
				System.out.println("\n"+"....."+animal[win].name+"is the king of the Jungle"+"..... ");	
              			
			}
	
	}

}		
		
	
 
