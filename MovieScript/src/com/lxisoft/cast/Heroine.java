package com.lxisoft.cast;

public class Heroine extends Actor
{
  private int numOfHeroine;
   
  public Heroine()
  {
    
  }


   public Heroine(String heroineName,String heroineCharName)
   {
      super(heroineName,heroineCharName);
   }



  public void setNumOfHeroine(int numOfHeroine)
  {
          this.numOfHeroine=numOfHeroine;
  }

  public int getNumOfHeroine()
  {
    return numOfHeroine;
  }

}