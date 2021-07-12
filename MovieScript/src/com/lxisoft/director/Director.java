package com.lxisoft.director;
import com.lxisoft.actors.*;
import java.util.*;

public class Director{
  String directorName,movieName;
  Map<String,ArrayList<Actor>> cast=new HashMap<String,ArrayList<Actor>>();
  ArrayList<Actor>actor= new ArrayList<Actor>();

  Scanner sc= new Scanner(System.in);
  public void casting(){
    System.out.println("ENTER DIRECTOR NAME ");
    directorName=sc.next();
    System.out.println("Enter movie name :");
     movieName=sc.next();
    System.out.println("ENTER NUMBER OF HEROES");
  int numOfHeroes=sc.nextInt();//  a.setNumOfActors(sc.nextInt());
    for(int i=0;i<numOfHeroes;i++){
      System.out.println("ENTER THE NAME OF HERO ");
      String actorName=sc.next();


      System.out.println("ENTER THE CHARACTER NAME : ");
      String charName=sc.next();
      actor.add(new Hero(actorName,charName));
    }
      for(Actor a : actor){
        if(a instanceof Hero){
          cast.put("hero",actor);
        }
      }

    System.out.println("ENTER NUMBER OF HEROINES");
    int numOfHeroines=sc.nextInt();
    for(int i=0;i<numOfHeroines;i++){
      System.out.println("ENTER THE NAME OF HEROINE ");
      String actorName=sc.next();



      System.out.println("ENTER THE CHARACTER NAME OF : ");
      String charName=sc.next();
        actor.add(new Heroine(actorName,charName));
      }
        for(Actor a : actor){
          if(a instanceof Heroine){
            cast.put("heroine",actor);
          }
        }

    System.out.println("ENTER NUMBER OF COMEDIANS");
    int numOfComedians=sc.nextInt();
    for(int i=0;i<numOfComedians;i++){
      System.out.println("ENTER THE NAME OF COMEDIAN ");
      String actorName=sc.next();

      System.out.println("ENTER THE CHARACTER NAME OF : ");
      String charName=sc.next();
      actor.add(new Comedian(actorName,charName));
    }
      for(Actor a : actor){
        if(a instanceof Comedian){
          cast.put("comedian",actor);
        }
      }


    System.out.println("ENTER NUMBER OF VILLAINS");
    int numOfVillains=sc.nextInt();
    for(int i=0;i<numOfVillains;i++){
      System.out.println("ENTER THE NAME OF VILLAIN ");
      String actorName=sc.next();



      System.out.println("ENTER THE CHARACTER NAME : ");
      String charName=sc.next();
      actor.add(new Villain(actorName,charName));
    }
      for(Actor a : actor){
        if(a instanceof Hero){
          cast.put("villain",actor);
        }
      }

    /*  for(Map.Entry m : cast.entrySet()){
        if(cast.containsKey("hero")){

            System.out.println(m.getValue());

        }
      }*/
      System.out.println("ACTORS\n");
      for(int i=0;i<actor.size();i++){
        System.out.println("ACTOR NAME  "+actor.get(i).getActorName()+" : CHARACTER NAME  "+actor.get(i).getCharName());
      }


  }

}
