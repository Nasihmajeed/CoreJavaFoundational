package com.lxisoft.game;

import com.lxisoft.animal.Animal;
import com.lxisoft.animal.Deer;
import com.lxisoft.animal.Elephant;
import com.lxisoft.animal.Lion;
import com.lxisoft.animal.Tiger;


public class Game {
Animal animal=new Tiger(8,7,9,"carnivorous","tiger");
Tiger tiger = (Tiger)animal;
Animal animalTwo= new Deer(3,4,1,"herbivores","deer");
Deer deer=(Deer)animalTwo;
Animal animalThree= new Elephant(6,4,9,"herbivores","Elephant");
Elephant elephant =(Elephant)animalThree;
Animal animalFour=new Lion(6,7,6,"carnivorous","lion");
Lion lion=(Lion)animalFour;

public  void start(){
 tiger.fight(deer);
  tiger.fight(elephant);
 tiger.fight(lion);
   deer.fight(lion);
  deer.fight(elephant);
  lion.fight(elephant);
  
  
  
}
}