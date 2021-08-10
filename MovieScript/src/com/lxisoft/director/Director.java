package com.lxisoft.director;
import com.lxisoft.actors.*;
import java.util.*;

public class Director{
  String directorName;



  Scanner sc= new Scanner(System.in);
  public void castActors(ArrayList<Actor> actors){
    System.out.println("ENTER DIRECTOR NAME ");
    directorName=sc.next();
    for(Actor a : actors){
        if(a instanceof Hero){
          System.out.println("HEROES\n");
          System.out.println(a.getActorName()+" "+a.getCharacterName());
        }
        if(a instanceof Heroine){
          System.out.println("HEROINES\n");
          System.out.println(a.getActorName()+" "+a.getCharacterName());
        }
        if(a instanceof Villain){
          System.out.println("VILLAINES\n");
          System.out.println(a.getActorName()+" "+a.getCharacterName());
        }
        if(a instanceof Comedian){
          System.out.println("COMEDIANS\n");
          System.out.println(a.getActorName()+" "+a.getCharacterName());
        }





}
}
}
