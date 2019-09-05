package com.lxisoft.intern.files;
public class AnimalHerbivore extends Animal implements Herbivores
{
	public String fight(Animal a)
		{   String f = null;
		if(a instanceof Herbivores)
             { System.out.println("Both Herbivores");
	  
	           if(a.getPower()>this.getPower())
                   { System.out.println(a.getName()+" attacks "+this.getName());
                    System.out.println(this.getName()+"power decreased by 10 ,Current power is "+this.setPower(this.getPower()-10));
                     System.out.println(a.getName()+" power decresed by 10 ,Current power is "+a.setPower(a.getPower()-10));
                   }
                else
                    {
                       System.out.println(this.getName()+" attacks "+a.getName());
                       System.out.println(this.getName()+"power decreased by 10 ,Current power is "+this.setPower(this.getPower()-10));
                        System.out.println(a.getName()+" power decresed by 10 ,Current power is "+a.setPower(a.getPower()-10));
                    }
             }
        else{
                  if(a.getPower()>this.getPower())
                  {
            	    System.out.println(a.getName()+" killed "+this.getName());
                    f=this.getName();
                  }
                  else System.out.println(this.getName()+" Run aways"); 
            }
            return f; 
	}
public void eat()
{}
}



//a.getName()+" killed "+this.getName()