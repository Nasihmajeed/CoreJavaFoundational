package com.lxisoft.test;
import com.lxisoft.game.Forest;
import com.lxisoft.game.Animal;
import com.lxisoft.animals.Tiger;
import com.lxisoft.animals.Lion;

public class Tdd {

public static void main(String[] args) {

Forest forest = new Forest("Silentvalley" , "Attapadi");

Tiger tiger = new Tiger();

Lion lion = new Lion();

forest.printDetails();


}

}