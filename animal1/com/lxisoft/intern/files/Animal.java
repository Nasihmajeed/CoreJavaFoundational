package com.lxisoft.intern.files;
public abstract class Animal
{
       private String name;
	   private int power;

  public void setName(String n)
{
  this.name = n;
}
public String getName()
{
  return this.name;
}
  public void setPower(int pow)
{
   this.power = pow;
}
public int getPower()
{
   return this.power;
}
public abstract String fight(Animal a);
}