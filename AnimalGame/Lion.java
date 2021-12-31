package com.lxisoft.animal;

public class Lion extends Animal implements Carnivorous  {
 int strengthLevel;
 int hungerLevel;
 int luckFactor;
 String foodType;
String animalName;
public Lion(int strengthLevel,int hungerLevel,int luckFactor, String foodType,String animalName){
 super(strengthLevel,hungerLevel, luckFactor,foodType,animalName);
   this.strengthLevel=strengthLevel;
 this.hungerLevel=hungerLevel;
 this.luckFactor=luckFactor;
 this.foodType=foodType;
this.animalName=animalName;
}
public void fight(Animal animal){
if(this.foodType==animal.foodType){ //here is the problem
  System.out.println("one"); // to test
   System.out.println(animal.strengthLevel); if((this.strengthLevel>animal.strengthLevel)&&(this.hungerLevel>animal.hungerLevel)){
    --this.strengthLevel;
   --animal.hungerLevel;
    --animal.strengthLevel;
    --this.hungerLevel;
      System.out.println(this.animalName+" 1 wins");
    }
    else if((this.strengthLevel<animal.strengthLevel)&&(this.hungerLevel<animal.hungerLevel)){
    --this.strengthLevel;
   --animal.hungerLevel;
    --animal.strengthLevel;
    --this.hungerLevel;
      System.out.println(animal.animalName+" 2 wins");
    }
      else if((this.strengthLevel<animal.strengthLevel)&&(this.hungerLevel>animal.hungerLevel)||(this.strengthLevel>animal.strengthLevel)&&(this.hungerLevel<animal.hungerLevel)){
      if (this.luckFactor<animal.luckFactor){
      --this.strengthLevel;
   --animal.hungerLevel;
    --animal.strengthLevel;
    --this.hungerLevel;
      System.out.println(animal.animalName+" 3wins");
      }
      else{
      System.out.println(2); //to test
      --this.strengthLevel;
   --animal.hungerLevel;
    --animal.strengthLevel;
    --this.hungerLevel;
        System.out.println(this.animalName+"4 wins");
      }
  }
  }
     else{
     System.out.println("two");
     if (this.luckFactor<animal.luckFactor){
     System.out.println("two");
      --this.strengthLevel;
   --animal.hungerLevel;
    --animal.strengthLevel;
    --this.hungerLevel;
      System.out.println(animal.animalName+" 3wins");
      }
      else{
      System.out.println(2); //to test
      --this.strengthLevel;
   --animal.hungerLevel;
    --animal.strengthLevel;
    --this.hungerLevel;
        System.out.println(this.animalName+"4 wins");
      }
      System.out.println("********");
      }
    

}


}