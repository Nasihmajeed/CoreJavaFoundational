package com.lxisoft.intern.files;
public abstract class Animal
{
       private String name;
	   private int power;
	   private int hunger;
	   private int locationx;
	   private int locationy;
	   //private Level stage ; 
	
/*public void setLevel(int a)
{
	this.stage = Level.HUNGER;
}
public enum.Level getLevel()
{
	return this.stage;
}*/
public void setLocx(int locx)
{
  this.locationx=locx;
}	
public int getLocx()
{
	return this.locationx;
}
public void setLocy(int locy)
{
  this.locationy=locy;
}	
public int getLocy()
{
	return this.locationy;
}
 public void setName(String n)
{
  this.name = n;
}
public String getName()
{
  return this.name;
}
  public int setPower(int pow)
{
   this.power = pow;
   return this.power;
}
public int getPower()
{
   return this.power;
}
public int setHunger(int hun)
{
	this.hunger = hun;
	return this.hunger;
}
public int getHunger()
{
	return this.hunger;
}
public abstract String fight(Animal a);
}