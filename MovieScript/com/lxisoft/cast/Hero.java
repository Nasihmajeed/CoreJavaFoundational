package com.lxisoft.cast;

import java.util.Scanner;

import com.lxisoft.movie.Actor;

public class Hero extends Actor  {

  Scanner sc = new Scanner(System.in);
  private int setHeroNumber;

 public void actorDetails()  {

  System.out.println("Only 1 or 2 Hero");
  System.out.println("Enter the Number Of Hero");
setHeroNumber(sc.nextLine());

if(setHeroNumber > 2)  {

  System.out.println("You choose Wrong Number");
  System.out.println("Only 1 or 2 Hero");
}

if(setHeroNumber ==1)  {

  System.out.println("Enter Hero Name :");
  setName( sc.nextLine());
  System.out.println("Enter Hero CharacterName :");
  setCharacterName(sc.nextLine());

}

if(setHeroNumber ==2)  {

  System.out.println("Enter 1st Hero Name :");
  setName( sc.nextLine());
  System.out.println("Enter 1st Hero CharacterName :");
  setCharacterName(sc.nextLine());
  
  System.out.println("Enter 2nd Hero Name :");
  setName( sc.nextLine());
  System.out.println("Enter 2nd Hero CharacterName :");
  setCharacterName(sc.nextLine());
}

System.out.println("\t\t.................");
System.out.println("\n");

}	



}