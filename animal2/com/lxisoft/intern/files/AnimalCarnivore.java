package com.lxisoft.intern.files;
public class AnimalCarnivore extends Animal implements Carnivores
{
    public String fight(Animal a)
    {    String f=null;
         if(a instanceof Carnivores)
         {    System.out.print("Both Carnivores :");

                if(a.getPower()>this.getPower())
                   { System.out.println(a.getName()+" attacks 1 "+this.getName());
                     System.out.println(this.getName()+" power decreased by 10,Current Power is "+this.setPower(this.getPower()-10));
                     System.out.println(a.getName()+" power decresed by 10 ,Current power is "+a.setPower(a.getPower()-10));
                    }
                else
                   { System.out.println(this.getName()+" attacks 2 "+a.getName());
                     System.out.println(this.getName()+" power decreased by 10,Current Power is "+this.setPower(this.getPower()-10));
                      System.out.println(a.getName()+" power decresed by 10 ,Current power is "+a.setPower(a.getPower()));
                   }            
         }
         else{  if(this.getPower()>a.getPower())
                {
                  System.out.println(this.getName()+" killed "+a.getName());
                  f=a.getName();
                }
                else System.out.println(this.getName()+"  only attacks");
         }    
         return f;
    }
    public void eat()
    {}
    public void decrement()
    {

    }
}
