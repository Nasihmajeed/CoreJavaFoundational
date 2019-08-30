package com.lxisoft.intern.files;
public class Animalherbivores extends Animal implements Herbivores
{
	public String fight(Animal a)
	{
         String died=null;
          if(a instanceof Herbivores){
                System.out.print("Both herviores  :");
                if(a.power>this.power)
                    System.out.println(a.name+" attacks "+this.name);
                else
                    System.out.println(this.name+" attacks "+a.name);
           }
           else{
              System.out.println(a.name+" killed "+this.name);
             died=this.name;
            }
          return died;
      	}
public void eat()
{}
}
