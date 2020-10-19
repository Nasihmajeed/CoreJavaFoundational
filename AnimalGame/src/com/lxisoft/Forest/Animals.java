package com.lxisoft.Forest;
public abstract class Animals
{
   public void habitat()
   {
   	System.out.print("-------------------------------------------------------------------------------------------------------");
    System.out.print("\n");
   	System.out.println("ALL ANIMALS ARE FOREST ANIMALS NOT ZOO ANIMALS");
   	 System.out.print("-------------------------------------------------------------------------------------------------------");
     System.out.print("\n");
   }
   private String name;
   private int strength;
   private boolean alive;
   private int distance;
   public void setName(String name)
   {
   	 this.name = name;
   }
   public String getName()
   {
   	return name;
   } 
   public void setStrength(int strength)
   {
   	 this.strength = strength;
   }
   public int getStrength()
   {
   	return strength;
   }
   public void setAlive(boolean alive)
   {
   	 this.alive = alive;
   }
   public boolean getAlive()
   {
   	return alive;
   }
   public void setDistance(int distance)
   {
   	this.distance = distance;
   }
   public int getDistance()
   {
   	return distance;
   }
}