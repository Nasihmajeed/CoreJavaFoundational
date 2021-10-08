package com.animalGame.game;
import com.animalGame.game.AnimalCharacteristics;
import com.animalGame.user.Player;
import java.util.*;
public class Animal {
ArrayList<AnimalCharacteristics> list=new ArrayList<AnimalCharacteristics>();
private int animalOne;
private int animalTwo;
private String herbivores="herbivores";
private String carnivorous="carnivorous";
public void createAnimalList(){
  list.add(new AnimalCharacteristics("Tiger","carnivorous",9,7,7,7));
  list.add(new AnimalCharacteristics("Lion","carnivorous",10,9,8,6));
  list.add(new AnimalCharacteristics("Rabbit","herbivores",5,6,1,5));
  list.add(new AnimalCharacteristics("deer","herbivores",6,6,10,8));
  //System.out.println(list.get(3).getanimalName());
}
public ArrayList<AnimalCharacteristics> getAnimalList(){
  return list;
}
public void animalFight(Player player){
ArrayList<AnimalCharacteristics> selectedList=player.getSelectedAnimalList();
if(selectedList.get(0).getAnimalType().equals(herbivores)&& selectedList.get(1).getAnimalType().equals(herbivores)){
   System.out.println("There is No Fight");
 }
 else if(selectedList.get(0).getAnimalType().equals(carnivorous)&& selectedList.get(1).getAnimalType().equals(carnivorous)){
   if(selectedList.get(0).getStrength() > selectedList.get(1).getStrength()){
     System.out.println(selectedList.get(0).getAnimalName()+" is the winner in the Fight");
   }
   else{
  System.out.println(selectedList.get(1).getAnimalName()+" is the winner in the Fight");
   }
 }
 else{
   if(selectedList.get(0).getHungerLevel() > selectedList.get(1).getHungerLevel()){
     animalOne=1+animalOne;
   }
   else{
     animalTwo=1+animalTwo;
   }
   if(selectedList.get(0).getRunningSpeed() > selectedList.get(1).getRunningSpeed()){
     animalOne=1+animalOne;
   }
   else{
     animalTwo=1+animalTwo;
     }
     if(selectedList.get(0).getVision() > selectedList.get(1).getVision()){
     animalOne=1+animalOne;
   }
   else{
     animalTwo=1+animalTwo;
     }
     if(animalOne > animalTwo){
       System.out.println(selectedList.get(0).getAnimalName()+" is the winner in the Fight");
   }
   else{
  System.out.println(selectedList.get(1).getAnimalName()+" is the winner in the Fight");
   }
 }
}
}