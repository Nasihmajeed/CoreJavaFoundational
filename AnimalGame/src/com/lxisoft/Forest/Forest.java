package com.lxisoft.Forest;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Forest
{
	ArrayList<Animals> animal = new ArrayList<Animals>();
	Scanner scanner = new Scanner(System.in);
	int count;
	public void setAnimalDetails()
	{
		System.out.println("\n");
		System.out.println(" ANIMAL GAME ");
		System.out.println("-------------");
		System.out.println("\n");
		animal.add(new Lion());
        animal.get(0).setName("Lion1");
        animal.get(0).setStrength(100);
        animal.get(0).setDistance(50);
        animal.get(0).setAlive(true);

        animal.add(new Tiger());
        animal.get(1).setName("Tiger1");
        animal.get(1).setStrength(65);
        animal.get(1).setDistance(40);
        animal.get(1).setAlive(true);

        animal.add(new Leopard());
        animal.get(2).setName("Leopard1");
        animal.get(2).setStrength(60);
        animal.get(2).setDistance(20);
        animal.get(2).setAlive(true);

        animal.add(new Elephant());
        animal.get(3).setName("Elephant1");
        animal.get(3).setStrength(65);
        animal.get(3).setDistance(10);
        animal.get(3).setAlive(true);

        animal.add(new Deer());
        animal.get(4).setName("Deer1");
        animal.get(4).setStrength(25);
        animal.get(4).setDistance(5);
        animal.get(4).setAlive(true);
  
        animal.add(new Lion());
        animal.get(5).setName("Lion2");
        animal.get(5).setStrength(90);
        animal.get(5).setDistance(45);
        animal.get(5).setAlive(true);

        animal.add(new Tiger());
        animal.get(6).setName("Tiger2");
        animal.get(6).setStrength(64);
        animal.get(6).setDistance(35);
        animal.get(6).setAlive(true);

        animal.add(new Leopard());
        animal.get(7).setName("Leopard2");
        animal.get(7).setStrength(50);
        animal.get(7).setDistance(15);
        animal.get(7).setAlive(true);

        animal.add(new Elephant());
        animal.get(8).setName("Elephant2");
        animal.get(8).setStrength(55);
        animal.get(9).setDistance(5);
        animal.get(8).setAlive(true);
        
        animal.add(new Deer());
        animal.get(9).setName("Deer2");
        animal.get(9).setStrength(20);
        animal.get(9).setDistance(10);
        animal.get(9).setAlive(true);
        for(int i=0;i<animal.size();i++)
        {
           System.out.println((i+1)+" "+"ANIMAL NAME :"+" "+animal.get(i).getName()+"\n"+"  "+"STRENGTH    :"+" "+animal.get(i).getStrength());
           System.out.println("\n");
        }
	}
	public void fight(int random1,int random2)
	{
      int a=0,b=0;
      String c=null,d=null;
     
      if(animal.get(random1).getStrength() >= animal.get(random2).getStrength())
       {
       	        c=animal.get(random1).getName();
      	        a=animal.get(random1).getStrength();
      	        System.out.println(" THE WINNER IS :"+c);
      	        System.out.println("\n");
      	    if(animal.get(random2).getStrength() <= animal.get(random1).getStrength())
      	   {
      	   	    int distance = (animal.get(random1).getDistance() - animal.get(random2).getDistance());
       	        int dia = 30;
      	       if(distance<dia)
       	       {
       	  	       System.out.println(animal.get(random1).getName()+" "+"AND"+" "+animal.get(random2).getName()+" "+" ARE IN THE SAME TERRITORY"); 
       	  	       System.out.println("\n");
      	           animal.get(random1).setStrength(animal.get(random1).getStrength()-10);
      		       animal.get(random2).setStrength(animal.get(random2).getStrength()-20);
      		       System.out.print("After Fight The Animals Strength Is:"+animal.get(random1).getName()+"\n"+animal.get(random1).getStrength());
      		       System.out.println("\n");
      		       System.out.print("After Fight The Animals Strength Is:"+animal.get(random2).getName()+"\n"+animal.get(random2).getStrength());
      		       System.out.println("\n");
      		      if(animal.get(random2).getStrength()<=15)
      		        {
      			      animal.get(random2).setAlive(false);
      			      System.out.println("The Animal Is DEAD:"+animal.get(random2).getName());
      			      System.out.println("\n");
      		        } 
      		        else
      		       {
      			      animal.get(random2).setAlive(true);
      		        }
      		         count--;
      		          System.out.print("-------------------------------------------------------------------------------------------------------");
      		          System.out.println("\n");
	      		}
	      		else
      	    	{
                  System.out.println(animal.get(random1).getName()+" "+"AND"+" "+animal.get(random2).getName()+" "+" ARE NOT IN THE SAME TERRITORY");
                  System.out.println("\n");
                  System.out.print("-------------------------------------------------------------------------------------------------------");
      		      System.out.println("\n");
      	    	}
      	    }
      	}
      else
       {
               	 d=animal.get(random2).getName();
      	         b=animal.get(random2).getStrength();
      	         System.out.println(" THE WINNER IS :"+d);
      	         System.out.println("\n");
      	    if(animal.get(random1).getStrength() <= animal.get(random2).getStrength())
      	   {    
      	           int distance = (animal.get(random2).getDistance() - animal.get(random1).getDistance());
       	           int dia = 30;
       	           if(distance<dia)
       	       {
                  System.out.println(animal.get(random1).getName()+" "+"AND"+" "+animal.get(random2).getName()+" "+" ARE IN THE SAME TERRITORY"); 
                  System.out.println("\n"); 	         
      		      animal.get(random1).setStrength(animal.get(random1).getStrength()-20);
      		      animal.get(random2).setStrength(animal.get(random2).getStrength()-10);
      		      System.out.print("After Fight The Animals Strength Is:"+animal.get(random1).getName()+"\n"+animal.get(random1).getStrength());
      		      System.out.println("\n");
      		      System.out.print("After Fight The Animals Strength Is:"+animal.get(random2).getName()+"\n"+animal.get(random2).getStrength());
      		      System.out.println("\n");
      		         if(animal.get(random1).getStrength()<=15)
      		       {
      			       animal.get(random1).setAlive(false);
      			       System.out.println("The Animal Is DEAD:"+animal.get(random1).getName());
      			       System.out.println("\n");
      		        }
      		        else
      		        {
      			     animal.get(random1).setAlive(true);
      		        }
      		        count--;
      		        System.out.print("-------------------------------------------------------------------------------------------------------");
      		        System.out.println("\n");	
      	        } 
      	        else
      	       {
      	    	 System.out.println(animal.get(random1).getName()+" "+"AND"+" "+animal.get(random2).getName()+" "+" ARE NOT IN THE SAME TERRITORY");
      	    	 System.out.println("\n");
      	    	 System.out.print("-------------------------------------------------------------------------------------------------------");
      		     System.out.println("\n");
      	       }
      	    }        
      	}
    }
    public void setSpace()
    {
    	int i=0;
    	System.out.println("\n IF YOU WANT TO START THE GAME PREES 1 ");
        int e = scanner.nextInt();
        if(e==1)
        {
        	count=animal.size();
        	while(count>1)
        	{
        		count = this.random();
        		Random ran = new Random();
        		int random1 = ran.nextInt(10);
        		int random2 = ran.nextInt(10);
        		if(animal.get(random1).getName() == animal.get(random2).getName())
        		{
        			random2=ran.nextInt();
        		}
        		else
        		{
        			if(animal.get(random1).getAlive() && animal.get(random2).getAlive() == true)
        			{
        				if(animal.get(random1) instanceof Carnivorous && animal.get(random2) instanceof Herbivorous)
        				{
        					int luck = LuckFactor();
        					this.fight(random1,random2);
        					if(animal.get(random2) instanceof WeakAnimal)
        					{
        					 	System.out.print("\n Animal 1 : Carnivorous"+"\n"+" Animal 2 : Herbivorous");
        						System.out.println("\n");		
        					if(luck!=2)
        					{
    			    		    System.out.print("-------------------------------------------------------------------------------------------------------");
      		                    System.out.println("\n");
        		                System.out.print("Animal 1 ="+" "+animal.get(random1).getName()+"\n"+"Strength :"+animal.get(random1).getStrength());
        		                System.out.println("\n");
                                System.out.print("Animal 2 ="+" "+animal.get(random2).getName()+"\n"+"Strength :"+animal.get(random2).getStrength());
                                System.out.println("\n");
                                System.out.print("\n"+animal.get(random2).getName()+" "+"ESCAPED FROM"+" "+animal.get(random1).getName()+" "+"AND HIDE In THE FOREST");
                                System.out.println("\n");
                                animal.get(random1).setStrength(animal.get(random1).getStrength()-5);
                                animal.get(random2).setStrength(animal.get(random2).getStrength()-5);
                                System.out.println("\n LUCKY ANIMAL IS : "+animal.get(random2).getName());
                                System.out.println("\n");
                                System.out.print("After Fight The Animals Strength Is:"+animal.get(random1).getName()+"\n"+animal.get(random1).getStrength());
                                System.out.println("\n");
      		                    System.out.print("After Fight The Animals Strength Is:"+animal.get(random2).getName()+"\n"+animal.get(random2).getStrength());
      		                    System.out.println("\n");
      		                    System.out.print("-------------------------------------------------------------------------------------------------------");
      		                    System.out.println("\n");
    			    		}
    			    	  } 	
        				}
                       else if(animal.get(random1) instanceof Herbivorous && animal.get(random2) instanceof Carnivorous)
    			    		{
    			    			int luck = LuckFactor();
    			    			this.fight(random1,random2);
    			    			if( animal.get(random1) instanceof WeakAnimal)
    			    			{
    			    				System.out.print("\n Animal 1 : Herbivorous"+"\n"+" Animal 2 : Carnivorous");
                                   System.out.println("\n");
       			    		    if(luck!=2)
    			    			{
                                   System.out.print("-------------------------------------------------------------------------------------------------------");
      		                       System.out.println("\n");
        					       System.out.print("Animal 1 ="+" "+animal.get(random1).getName()+"\n"+"Strength :"+animal.get(random1).getStrength());
        					       System.out.println("\n");
                                   System.out.print("Animal 2 ="+" "+animal.get(random2).getName()+"\n"+"Strength :"+animal.get(random2).getStrength());
                                   System.out.println("\n");
                                   System.out.print("\n"+animal.get(random1).getName()+" "+"ESCAPED FROM"+" "+animal.get(random2).getName()+" "+"AND HIDE In THE FOREST");
                                   System.out.println("\n");
                                   animal.get(random1).setStrength(animal.get(random1).getStrength()-5);
                                   animal.get(random2).setStrength(animal.get(random2).getStrength()-5);
                                   System.out.println("\n LUCKY ANIMAL IS : "+animal.get(random1).getName());
                                   System.out.println("\n");
                                   System.out.print("After Fight The Animals Strength Is:"+animal.get(random1).getName()+"\n"+animal.get(random1).getStrength());
                                   System.out.println("\n");
      		                       System.out.print("After Fight The Animals Strength Is:"+animal.get(random2).getName()+"\n"+animal.get(random2).getStrength());
      		                       System.out.println("\n");
      		                       System.out.print("-------------------------------------------------------------------------------------------------------");
      		                       System.out.println("\n");
	                            }
	                            }
    			    		}
    			    	else if(animal.get(random1) instanceof Carnivorous && animal.get(random2) instanceof Carnivorous)
    			    	{
    			    		System.out.print(" \n Animal 1 is Carnivorous \n Animal 2 is Carnivorous");
        		            System.out.println("\n");
      		                this.fight(random1,random2);
    			    	}	
    			    	else if(animal.get(random1) instanceof Herbivorous && animal.get(random2) instanceof Herbivorous)
    			    	{
    			    		   System.out.print(" \n Animal 1 is Herbivorous \n Animal 2 is Herbivorous");
        		               System.out.println("\n");
        		               System.out.println("No Fight");
        		               System.out.print("-------------------------------------------------------------------------------------------------------");
      		                   System.out.println("\n");
    			        } 
    			    }      
        		}
        		i++;
            }
       
                      System.out.print("                                     GAME OVER                                                ");
                      System.out.println("\n");
                      System.out.println("\n");
                      this.finalWinner();
        }                                 
	}
     private int random()
    {
    	count=0;
    	for(int i=0;i<animal.size();i++)
    	{
    		if(animal.get(i).getAlive()==true)
    		{
    			count++;
    		}
    	}
    	return count;
    }
    private int LuckFactor()
    {
    	Random ran= new Random();
    	int random3 = ran.nextInt();
    	return random3;
    }
	public void finalWinner()
	{
      for(int i=0;i<animal.size();i++)
      {
      	if(animal.get(i).getAlive()==true)
      	{
      		System.out.print("-------------------------------------------------------------------------------------------------------");
      		System.out.print("\n");
      		System.out.print("                       FINAL WINNER IS :"+animal.get(i).getName());
      		System.out.print("\n");
      		System.out.print("-------------------------------------------------------------------------------------------------------");
      		System.out.print("\n");
      	}
      }
	}
	public void show()
	{
		
			Lion lion = new Lion();
		    Tiger tiger = new Tiger();
		    Leopard leopard = new Leopard();
		    Elephant elephant = new Elephant();
		    Deer deer = new Deer();
		    lion.habit();
		    tiger.habit();
		    leopard.habit();
		    elephant.habit();
		    deer.habit();
    }
    public void tryMethod()
    {
    	try
    	{
    		System.out.print("-------------------------------------------------------------------------------------------------------");
      		System.out.print("\n");
			System.err.print("IF YOU WANT TO PLAY AGAIN PRESS ANY NUMBER");
      		System.out.print("\n");
			this.setSpace();
		}
		catch(Exception e)
		{
			System.err.print("YOU CAN ONLY ENTER INTEGER NUMBER");
      		System.out.print("\n");
		}
		finally
		{
			System.out.println("BYE");
			System.out.print("-------------------------------------------------------------------------------------------------------");
      		System.out.print("\n");
    	}
    }
}
