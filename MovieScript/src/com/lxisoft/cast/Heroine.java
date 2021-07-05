package com.lxisoft.cast;

public class Heroine extends Actor
{
  private int numOfHeroine;

  private String heroineName,heroineCharName;

   
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
