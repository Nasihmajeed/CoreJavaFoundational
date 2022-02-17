package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.FileReader;

public class Scene {
 

 Dialogue dialogue = new Dialogue();

 
 public void showDialogue()   { 
  
 
 
     try {
   
       BufferedReader bf = new BufferedReader(new FileReader("../resources/dialogue.csv") ) ;
 
       String dialogue;
 
     bf.skip(14);
 
 
       while((dialogue = bf.readLine())   != null ) {
       
 String[] list =dialogue.split(",");
 
 for(String dialogues : list)  {
 
   System.out.println(dialogues);
 
 }
   
 
       }
 
       
     } catch (Exception e) {
   
   System.out.println(";;;;;;;;;;;;;;fgdffdg;;;;");
      
      e.printStackTrace();
   
     } 
 
     
 
 }

}

