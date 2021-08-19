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


 /*  for(Map.Entry m : cast.entrySet()){
        if(cast.containsKey("hero")){

            System.out.println(m.getValue());

        }
      }*/

    director.castActors();
try{
    writer.writeScript();
  }
  catch(IOException e){
  e.printStackTrace();
  }
  }






  }
