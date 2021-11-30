//package com.lxi_soft.forest;
import java.util.*;
public class Jungle{ 
ArrayList<String> animalList = new ArrayList<String>() ;
//int i = 0;
public void inputDetails(){
       animalList .add ("Rabbit");
       animalList .add ("Tiger");
       animalList .add ("Deer");
       animalList .add ("Lion");
       animalList .add ("Elephant");
       animalList .add ("Wolf");
}
public void printDetails(){
       System.out.println("The Animals in Wonder_Forest : ");

       for (String i : animalList) {
      
       System.out.println(i);
       
}
}
}
