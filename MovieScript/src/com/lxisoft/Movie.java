import java.util.*;
public class Movie{
  ArrayList<Actors> actors=new ArrayList<Actors>();
  Actors a=new Actors();
  public void addDialogue(){
    actors.add(new Unnikrishnan());
    actors.get(0).setDialogue("Hi I am Unnikrishnan");
    actors.add(new Basanthi());
    actors.get(1).setDialogue("Hi I am Basanthi");
    actors.add(new Sundhareshan());
    actors.get(2).setDialogue("Hi I am Sundhareshan");
  }
  public void printDialogue(){
    System.out.println(actors.get(0).getDialogue());
    System.out.println(actors.get(1).getDialogue());
    System.out.println(actors.get(2).getDialogue());
  }
}
