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





/*

public boolean equals(Object o) {
if((o instanceof Dog) &&
(((Dog)o).name == name)) {
return true;
} else {
return false;
}
}
public int hashCode() {return name.length(); }
*/



}