package com.AnimalGame.Game;
import com.AnimalGame.Game.AnimalCharacteristics;
import java.util.*;
public class Animal {
ArrayList<AnimalCharacteristics> list=new ArrayList<AnimalCharacteristics>();
public void createAnimalList(){
  list.add(new AnimalCharacteristics("Tiger","carnivorous",9,7,7,7));
  list.add(new AnimalCharacteristics("Lion","carnivorous",10,9,8,6));
  list.add(new AnimalCharacteristics("Rabbit","herbivores",5,6,1,5));
  list.add(new AnimalCharacteristics("deer","herbivores",6,6,10,8));
  //System.out.println(list.get(3).getanimalName());
}
public ArrayList<AnimalCharacteristics> getanimalList(){
  return list;
}
}