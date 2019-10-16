package com.lxisoft.intern.files;
public class AnimalCarnivore extends Animal implements Carnivores
{
    public String fight(Animal a)
     {    String f=null;
          int x = (this.getPower()-10);
          int y = (a.getPower()-10);
           if(a instanceof Carnivores)
              {    System.out.print("Both Carnivores :");   
                      if(a.getPower()>this.getPower())
                        { System.out.println(a.getName()+" attacks "+this.getName());
                            if((x>=0)&(y>=0))
                               { System.out.println(this.getName()+" power decreased by 10,Current Power is "+this.setPower(x));
                                 System.out.println(a.getName()+" power decresed by 10 ,Current power is "+a.setPower(y));
                               }
                        }
                       else
                        {  System.out.println(this.getName()+" attacks "+a.getName());
                           if((x>=0)&(y>=0))
                            {  System.out.println(this.getName()+" power decreased by 10,Current Power is "+this.setPower(x));
                               System.out.println(a.getName()+" power decresed by 10 ,Current power is "+a.setPower(y));
                            }
                        }            
              }
           else
              {  if(this.getPower()>a.getPower())
                  { System.out.println(this.getName()+" killed c"+a.getName());
                    f=a.getName();
                  }
                  else System.out.println(this.getName()+"  only attacks");
              }    
      return f;
     }
public void eat()
{}
}