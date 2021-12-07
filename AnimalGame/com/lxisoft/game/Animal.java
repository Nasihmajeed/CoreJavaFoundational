package com.lxisoft.game;

public class Animal {
private String animalName;
private int energy,stamina,distance;

public Animal(String animalName,int energy,int stamina,int distance){
		this.animalName = animalName;
		this.energy = energy;
		this.stamina = stamina;
		this.distance = distance;

}
public void wildAnimals()
{
	
	System.out.println("1.Tiger");
	System.out.println("2.Rabbit");
	System.out.println("3.Deer");
	System.out.println("4.Fox");
	System.out.println("5.Lion");
	System.out.println("6.Elephant");
	System.out.println("7.Leopard");
	System.out.println("8.Guar");
	System.out.println("9.Crocodile");
	System.out.println("10.Rhinoceros" +"\n");
       System.out.println("The above Animals are ...... FIGHTERS" );
	System.out.println("!------------------------------!");
	
			
	
}

public String getName()
{
	return animalName;
}
								//name
public void setName(String animalName)
{
	
	this.animalName=animalName;
}

public int getEnergy()
{
return energy; 	
}
                                                   //energy

public void setEnergy(int energy)
{
	this.energy=energy;
}

public int getDistance()
{
return distance;
}

                                                       //distance
public void setDistance(int distance)
{
	this.distance=distance;
}

public int getStamina()
{
	return stamina;
}                                                   //stamina

public void setStamina(int stamina)
{
	this.stamina=stamina;
}
protected void printing() {
         
  
	System.out.println("Name : " + this.getName());
	System.out.println("Energy : " + this.getEnergy());
	System.out.println("Stamina : " + this.getStamina());
	System.out.println("Distance: " + this.getDistance());
	System.out.println();
 
}

}
