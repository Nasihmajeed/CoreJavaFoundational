package com.lxisoft.movie;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Scene {


 Dialogue dialogue = new Dialogue();


 public void showDialogue(int sceneNo)   { 
   
 
     try {
   
      Scanner scr = new Scanner(new File("../resources/dialogue.csv"));
       
ArrayList<String> dialogue = new ArrayList<String> ();

while (scr.hasNext())  {

dialogue.add(scr.next());

}
for(String dialogues : dialogue)  {

  System.out.println(dialogues);
}


scr.close();

     } catch (Exception e) {
   
   System.out.println("Exception ");
      
      e.printStackTrace();
   
     } 
 
 }

}