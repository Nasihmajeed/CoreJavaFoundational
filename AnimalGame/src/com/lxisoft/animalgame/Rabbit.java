package com.lxisoft.animalgame;
import com.lxisoft.animalgame.Animal;
public class Rabbit extends Animal implements Herbivorous
{  
	
	public void escape(Animal animal)
  {
    
  	int	luck=(int) (Math.random()*100);    
  	if(this.luck>=50)
  	{
   		System.out.println("escape=="+ this.animalName);
      this.isDead=true;  
		}
		else
		{     
     		System.out.println("animal escape"+this.animalName);
        System.out.println(" winner---"+animal.animalName+"(strength=="+animal.strength+")");
		}

  }

    
  public void escape(Animal animal1,Animal animal2)
  {

    System.out.println(animal1.animalName+"and"+animal2.animalName+"fight and kills"+this.animalName);
    if(luck/2<50)
    {
      System.out.println("fight and kills"+this.animalName);
      this.isDead=true;          
    }
    else
    {
      System.out.println("animals escape"+this.animalName);
    }
  }
    

    public void escape(Animal animal1,Animal animal2,Animal animal3)
    {
      System.out.println(animal1.animalName+"and"+animal2.animalName+"and"+"fight and kills"+this.animalName);
      if(luck/3<50)
      {
          System.out.println("fight and kills"+this.animalName);
          this.isDead=true;          
      }
    else
    {
      System.out.println("animals escape"+this.animalName);
    }
  }
            
    	 public void graze()
    	{
    		System.out.println("Rabbits graze");
    	}
}

       