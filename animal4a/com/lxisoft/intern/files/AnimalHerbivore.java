package com.lxisoft.intern.files;
public class AnimalHerbivore extends Animal implements Herbivores
{
	public String fight(Animal a)
	 {    String f = null;
          int x = (this.getPower()-10);
          int y = (a.getPower()-10);
		   if(a instanceof Herbivores)
              {    System.out.println(" Both Herbivores ");
	                  if(a.getPower()>this.getPower())
                        { System.out.println(a.getName()+" attacks "+this.getName());
                            if((x>0)&(y>0))
                               { System.out.println(this.getName()+"power decreased by 10 ,Current power is "+this.setPower(x));
                                 System.out.println(a.getName()+" power decreased by 10 ,Current power is "+a.setPower(y));
                               }
                               else {
                                f=((x<0) ? this.getName() : a.getName()); System.out.println(f+"died because of hungry!!");
                                      return f;}
                        }
                       else
                        {  System.out.println(this.getName()+" attacks "+a.getName());
                           if((x>0)&(y>0))
                            {  System.out.println(this.getName()+"power decreased by 10 ,Current power is "+this.setPower(x));
                               System.out.println(a.getName()+" power decreased by 10 ,Current power is "+a.setPower(y));
                            }
                            else {
                              f=((x<0) ? this.getName() : a.getName()); System.out.println(f+"died because of hungry!!");
                                  return f;}
                        }
             }
            else
                { if(a.getPower()>this.getPower())
                    { System.out.println(a.getName()+" killed "+this.getName());
                      f=this.getName();
                    }
                   else System.out.println(this.getName()+" Only attacks");
                }
            return f; 
	 }
public void eat()
{}
}