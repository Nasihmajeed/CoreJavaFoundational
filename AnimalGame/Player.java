package com.AnimalGame.User;
import com.AnimalGame.Game.Animal;
import com.AnimalGame.Game.AnimalCharacteristics;
import java.util.*;
import java.util.Scanner;
public class Player {
int indexNumber;
ArrayList<AnimalCharacteristics> list;
ArrayList<AnimalCharacteristics> selectedlist=new ArrayList<AnimalCharacteristics>();
public void printanimalList(Animal animal){
  ArrayList<AnimalCharacteristics> list=animal.getanimalList();
  this.list=list;
  int size=list.size();
  for(int indexNumber=0;indexNumber<size;indexNumber++){
  System.out.println(indexNumber+1+" "+list.get(indexNumber).getanimalName());
  }
}
public void selectanimalList(){
  Scanner input=new Scanner(System.in);
  System.out.println("Select Any 2 Animals");
for(int animalSelection=0;animalSelection<2;animalSelection++){
int indexNumber=input.nextInt();
  input.nextLine();
selectedlist.add(list.get(indexNumber-1));
System.out.println(selectedlist.get(animalSelection).getanimalName());
}
}
public ArrayList<AnimalCharacteristics>  getSelectedanimalList(){
  return selectedlist;
}
}