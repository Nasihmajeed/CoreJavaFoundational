package com.lxisoft.director;
import com.lxisoft.actors.*;
import java.util.*;

public class Director{
  String directorName;
    ArrayList<Actor>actors= new ArrayList<Actor>();



  Scanner sc= new Scanner(System.in);
  public void castActors(){
    System.out.println("ENTER DIRECTOR NAME ");
    directorName=sc.next();
    System.out.println("ENTER NUMBER OF HEROES");
  int numOfHeroes=sc.nextInt();//  a.setNumOfActors(sc.nextInt());
    for(int i=0;i<numOfHeroes;i++){
      System.out.println("ENTER THE NAME OF HERO ");
      String actorName=sc.next();


      System.out.println("ENTER THE CHARACTER NAME : ");
      String characterName=sc.next();
      actors.add(new Hero(actorName,characterName));
    }

    System.out.println("ENTER NUMBER OF HEROINES");
    int numOfHeroines=sc.nextInt();
    for(int i=0;i<numOfHeroines;i++){
      System.out.println("ENTER THE NAME OF HEROINE ");
      String actorName=sc.next();



      System.out.println("ENTER THE CHARACTER NAME OF : ");
      String characterName=sc.next();
        actors.add(new Heroine(actorName,characterName));
      }


    System.out.println(" ENTER NUMBER OF COMEDIANS");
    int numOfComedians=sc.nextInt();
    for(int i=0;i<numOfComedians;i++){
      System.out.println("ENTER THE NAME OF COMEDIAN ");
      String actorName=sc.next();

      System.out.println("ENTER THE CHARACTER NAME OF : ");
      String characterName=sc.next();
      actors.add(new Comedian(actorName,characterName));
    }

    System.out.println("ENTER NUMBER OF VILLAINS");
    int numOfVillains=sc.nextInt();
    for(int i=0;i<numOfVillains;i++){
      System.out.println("ENTER THE NAME OF VILLAIN ");
      String actorName=sc.next();



      System.out.println("ENTER THE CHARACTER NAME : ");
      String characterName=sc.next();
      actors.add(new Villain(actorName,characterName));
    }





}
}
