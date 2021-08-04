package com.lxisoft.director;
import com.lxisoft.actors.*;
import java.util.*;

public class Director{
  String directorName;
  Map<String,ArrayList<Actor>> cast=new HashMap<String,ArrayList<Actor>>();


  Scanner sc= new Scanner(System.in);
  public void castActors(ArrayList<Actor> actors){
    System.out.println("ENTER DIRECTOR NAME ");
    directorName=sc.next();
    for(Actor a : actors){
        if(a instanceof Hero){
          cast.put("hero",actors);
        }

            else if(a instanceof Heroine){
              cast.put("heroine",actors);
            }
            else if(a instanceof Comedian){
              cast.put("comedian",actors);
            }
            else if(a instanceof Villain){
                cast.put("villain",actors);
              }



}
System.out.println("HEROES\n");
System.out.println(cast.get("hero").get(0).getActorName()+" IN AND AS "+cast.get("hero").get(0).getCharacterName());

System.out.println("HEROINES\n");
System.out.println(cast.get("heroine").get(1).getActorName()+" IN AND AS "+cast.get("heroine").get(1).getCharacterName());

System.out.println("COMEDIAN\n");
System.out.println(cast.get("comedian").get(2).getActorName()+" IN AND AS "+cast.get("comedian").get(2).getCharacterName());

System.out.println("VILLAIN\n ");
System.out.println(cast.get("villain").get(3).getActorName()+" IN AND AS "+cast.get("villain").get(3).getCharacterName());

}
}
