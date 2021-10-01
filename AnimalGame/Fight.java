package com.AnimalGame.Game;
import com.AnimalGame.User.Player;
import java.util.*;
public class Fight {
private int animalOne;
private int animalTwo;
private String herbivores="herbivores";
private String carnivorous="carnivorous";
public void animalFight(Player player){
ArrayList<AnimalCharacteristics> selectedlist=player.getSelectedanimalList();
if(selectedlist.get(0).getanimalType().equals(herbivores)&& selectedlist.get(1).getanimalType().equals(herbivores)){
   System.out.println("There is No Fight");
 }
 else if(selectedlist.get(0).getanimalType().equals(carnivorous)&& selectedlist.get(1).getanimalType().equals(carnivorous)){
   if(selectedlist.get(0).getstrength() > selectedlist.get(1).getstrength()){
     System.out.println(selectedlist.get(0).getanimalName()+" is the winner in the Fight");
   }
   else{
  System.out.println(selectedlist.get(1).getanimalName()+" is the winner in the Fight");
   }
 }
 else{
   if(selectedlist.get(0).gethungerlevel() > selectedlist.get(1).gethungerlevel()){
     animalOne=1+animalOne;
   }
   else{
     animalTwo=1+animalTwo;
   }
   if(selectedlist.get(0).getrunningSpeed() > selectedlist.get(1).getrunningSpeed()){
     animalOne=1+animalOne;
   }
   else{
     animalTwo=1+animalTwo;
     }
     if(selectedlist.get(0).getvision() > selectedlist.get(1).getvision()){
     animalOne=1+animalOne;
   }
   else{
     animalTwo=1+animalTwo;
     }
     if(animalOne > animalTwo){
       System.out.println(selectedlist.get(0).getanimalName()+" is the winner in the Fight");
   }
   else{
  System.out.println(selectedlist.get(1).getanimalName()+" is the winner in the Fight");
   }
 }
}
}