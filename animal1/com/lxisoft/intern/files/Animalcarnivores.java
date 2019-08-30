package com.lxisoft.intern.files;
public class Animalcarnivores extends Animal implements Carnivores
{
	public String fight(Animal a)
	{
          String died=null;
          if(a instanceof Carnivores){
                System.out.print("Both Carnivores :");
                if(a.power>this.power)
                    System.out.println(a.name+" attacks "+this.name);
                else
                    System.out.println(this.name+" attacks "+a.name);
           }
           else{
              System.out.println(this.name+" killed "+a.name);
              died=a.name;
            }
         return died;
      	}
public void eat()
{}
}
