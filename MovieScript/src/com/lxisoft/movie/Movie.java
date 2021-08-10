package com.lxisoft.movie;
import com.lxisoft.actors.*;
import com.lxisoft.director.*;
import java.io.IOException;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Movie{
  private String movieName;
  Director director=new Director();
  ScriptWriter writer=new ScriptWriter();
    ArrayList<Actor>actors= new ArrayList<Actor>();
  public void setMovieName(String movieName){
    this.movieName=movieName;
  }
  public String getMovieName(){
    return movieName;
  }

  Scanner sc= new Scanner(System.in);
  public  void startMovie() {
    System.out.println("ENTER MOVIE NAME ");
    setMovieName(sc.next());
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


    System.out.println("ENTER NUMBER OF COMEDIANS");
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


 /*  for(Map.Entry m : cast.entrySet()){
        if(cast.containsKey("hero")){

            System.out.println(m.getValue());

        }
      }*/
  
    director.castActors(actors);
try{
    writer.writeScript();
  }
  catch(IOException e){
  e.printStackTrace();
  }
  }






  }
