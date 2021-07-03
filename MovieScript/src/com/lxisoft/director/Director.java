package com.lxisoft.director;
import com.lxisoft.actors.*;
import java.util.*;
public class Director{
  String directorName,movieName;
  ArrayList<Actor>actor= new ArrayList<Actor>();
  Actor a=new Actor();
  Scanner sc= new Scanner(System.in);
  public void casting(){
    System.out.println("ENTER DIRECTOR NAME ");
    directorName=sc.next();
    System.out.println("Enter movie name :");
     movieName=sc.next();
    System.out.println("ENTER NUMBER OF HEROES");
    a.setNumOfActors(sc.nextInt());
    for(int i=0;i<a.getNumOfActors();i++){
      System.out.println("ENTER THE NAME OF HERO ");
      a.setActorName(sc.next());


      System.out.println("ENTER THE CHARACTER NAME : ");
      a.setCharName(sc.next());
      actor.add(new Hero(a.getActorName(),a.getCharName(),a.getNumOfActors()));
    }
    System.out.println("ENTER NUMBER OF HEROINES");
    int numOfHeroines=sc.nextInt();
    for(int i=0;i<numOfHeroines;i++){
      System.out.println("ENTER THE NAME OF HEROINE ");
      a.setActorName(sc.next());


      System.out.println("ENTER THE CHARACTER NAME OF : ");
      a.setCharName(sc.next());
        actor.add(new Heroine(a.getActorName(),a.getCharName()));
    }
    System.out.println("ENTER NUMBER OF COMEDIANS");
    int numOfComedians=sc.nextInt();
    for(int i=0;i<numOfComedians;i++){
      System.out.println("ENTER THE NAME OF COMEDIAN ");
      a.setActorName(sc.next());
      System.out.println("ENTER THE CHARACTER NAME OF : ");
      a.setCharName(sc.next());
      actor.add(new Comedian(a.getActorName(),a.getCharName()));
    }

    System.out.println("ENTER NUMBER OF VILLAINS");
    int numOfVillains=sc.nextInt();
    for(int i=0;i<numOfVillains;i++){
      System.out.println("ENTER THE NAME OF VILLAIN ");
      a.setActorName(sc.next());


      System.out.println("ENTER THE CHARACTER NAME : ");
      a.setCharName(sc.next());
      actor.add(new Villain(a.getActorName(),a.getCharName()));
    }




  }

}
