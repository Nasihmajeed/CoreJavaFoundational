package com.lxisoft.director;
import com.lxisoft.actors.*;
import java.util.*;

public class Director{
  String directorName;
  Map<String,ArrayList<Actor>> castingActors==new HashMap<String,ArrayList<Actor>>();


  Scanner sc= new Scanner(System.in);
  public void castActors(ArrayList<Actor> actors){
    System.out.println("ENTER DIRECTOR NAME ");
    directorName=sc.next();
    for(Actor a : actors){
        if(a instanceof Hero){
          castingActors.put("hero",actors);
        }

            else if(a instanceof Heroine){
              castingActors.put("heroine",actors);
            }
            else if(a instanceof Comedian){
              castingActors.put("comedian",actors);
            }
            else if(a instanceof Villain){
                castingActors.put("villain",actors);
              }



}
System.out.println("HEROES\n");
System.out.println(castingActors.get("hero").get(0).getActorName()+" IN AND AS "+castingActors.get("hero").get(0).getCharacterName());

System.out.println("HEROINES\n");
System.out.println(castingActors.get("heroine").get(1).getActorName()+" IN AND AS "+castingActors.get("heroine").get(1).getCharacterName());

System.out.println("COMEDIAN\n");
System.out.println(castingActors.get("comedian").get(2).getActorName()+" IN AND AS "+castingActors.get("comedian").get(2).getCharacterName());

System.out.println("VILLAIN\n ");
System.out.println(castingActors.get("villain").get(3).getActorName()+" IN AND AS "+castingActors.get("villain").get(3).getCharacterName());

}
}
