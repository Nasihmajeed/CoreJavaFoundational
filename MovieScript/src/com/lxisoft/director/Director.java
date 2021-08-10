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
          System.out.println("\nHEROES");
          System.out.println(a.getActorName()+"IN AND AS "+a.getCharacterName());
        }
        if(a instanceof Heroine){
          System.out.println("\nHEROINES");
          System.out.println(a.getActorName()+"IN AND AS "+a.getCharacterName());
        }
        if(a instanceof Villain){
          System.out.println("\nVILLAINES");
          System.out.println(a.getActorName()+"IN AND AS "+a.getCharacterName());
        }
        if(a instanceof Comedian){
          System.out.println("\nCOMEDIANS");
          System.out.println(a.getActorName()+"IN AND AS "+a.getCharacterName());
        }





}
}
}
