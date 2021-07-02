package com.lxisoft.cast;

public class Villain extends Actor
{
   private int numOfVillain;

   private String villainName,villainCharName;


   public Villain()
   {
      
   }


   public Villain(String villainName,String villainCharName)
   {
       super(villainName,villainCharName);
   }



   public void setNumOfVillain(int numOfVillain)
   {
          this.numOfVillain=numOfVillain;
   }

   public int getNumOfVillain()
   {
      return numOfVillain;
   }

}