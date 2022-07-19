package com.lxisoft.test;
import com.lxisoft.game.Forest;
import com.lxisoft.game.Animal;
import com.lxisoft.animals.Tiger;
import com.lxisoft.animals.Lion;

public class Tdd {

public static void main(String[] args) {

Forest forest = new Forest("Silentvalley" , "Attapadi");

Tiger tiger = new Tiger();

forest.printDetails();

tiger.setEat("Meat");

tiger.setStrengthLevel("80");

tiger.setHungryLevel("60");

System.out.println("Tiger Eats : "+ tiger.getEat());

System.out.println("Tiger StrengthLevel : "+ tiger.getStrengthLevel());

System.out.println("Tiger HungryLevel : "+ tiger.getHungryLevel() + "\n");

Lion lion = new Lion();

lion.setEat("Meat");

lion.setStrengthLevel("90");

lion.setHungryLevel("70");

System.out.println("Lion Eats : "+ lion.getEat());

System.out.println("Lion StrengthLevel : "+ lion.getStrengthLevel());

System.out.println("Lion HungryLevel : "+ lion.getHungryLevel());

}

}