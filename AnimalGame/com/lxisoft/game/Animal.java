package com.lxisoft.game;

public class Animal {
	private String animalName;
	private int starvage,strength,distance;

public Animal(String animalName,int starvage,int strength,int distance){
	
	this.animalName = animalName;
	this.starvage = starvage;
	this.strength = strength;
	this.distance = distance;

}
public void listOfwildAnimals()
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

public int getStarvage()
{
return starvage; 	
}
                                    

public void setStarvage(int starvage)	               //starvage
{
	this.starvage=starvage;
}

public int getDistance()
{
return distance;
}

                                        
public void setDistance(int distance)		               //distance
{
	this.distance=distance;
}

public int getStrength()
{
	return strength;
}                                        

public void setStrength(int strength)			           //stamina
{
	this.strength = strength;
}


protected void printData() {
         
  
	System.out.println("Name : " + this.getName());
	System.out.println("Starvage : " + this.getStarvage());
	System.out.println("strength : " + this.getStrength());
	System.out.println("Distance: " + this.getDistance());
	System.out.println();
 
}

}
