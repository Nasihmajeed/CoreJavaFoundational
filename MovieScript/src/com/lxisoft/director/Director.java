package com.lxisoft.director;
import com.lxisoft.actors.*;
import java.util.*;
public class Director{
  public String directorName,movieName,heroName,heroineName,villainName,comedianName;
  public String heroCharName,heroineCharName,villainCharName,comedianCharName;
  ArrayList<Actor>actor= new ArrayList<Actor>();
  Scanner sc= new Scanner(System.in);
  public void casting(){
    System.out.println("ENTER DIRECTOR NAME ");
    directorName=sc.next();
    System.out.println("Enter movie name :");
     movieName=sc.next();
    System.out.println("ENTER NUMBER OF HEROES");
    int numOfHeroes=sc.nextInt();
    for(int i=0;i<numOfHeroes;i++){
      System.out.println("ENTER THE NAME OF HERO ");
      heroName=sc.next();


      System.out.println("ENTER THE CHARACTER NAME OF "+heroName+" : ");
      heroCharName=sc.next();
      actor.add(new Hero(heroName,heroCharName));
    }
    System.out.println("ENTER NUMBER OF HEROINES");
    int numOfHeroines=sc.nextInt();
    for(int i=0;i<numOfHeroines;i++){
      System.out.println("ENTER THE NAME OF HEROINE ");
      heroineName=sc.next();


      System.out.println("ENTER THE CHARACTER NAME OF "+heroineName+" : ");
      heroineCharName=sc.next();
        actor.add(new Heroine(heroineName,heroineCharName));
    }
    System.out.println("ENTER NUMBER OF COMEDIANS");
    int numOfComedians=sc.nextInt();
    for(int i=0;i<numOfComedians;i++){
      System.out.println("ENTER THE NAME OF COMEDIAN ");
      comedianName=sc.next();

      actor.get(i).setActorName(comedianName);
      System.out.println("ENTER THE CHARACTER NAME OF "+comedianName+" : ");
      comedianCharName=sc.next();
      actor.add(new Comedian(comedianName,comedianCharName));
    }

    System.out.println("ENTER NUMBER OF VILLAINS");
    int numOfVillains=sc.nextInt();
    for(int i=0;i<numOfVillains;i++){
      System.out.println("ENTER THE NAME OF VILLAIN ");
      villainName=sc.next();


      System.out.println("ENTER THE CHARACTER NAME OF "+villainName+" : ");
      comedianCharName=sc.next();
      actor.add(new Villain(villainName,villainCharName));
    }


  }

}
