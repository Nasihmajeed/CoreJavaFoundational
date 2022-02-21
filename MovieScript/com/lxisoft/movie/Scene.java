package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.FileReader;

public class Scene {


 Dialogue dialogue = new Dialogue();

 public void showDialogue()   { 
  
 
 
     try {
   
       BufferedReader bf = new BufferedReader(new FileReader("../resources/dialogue.csv") ) ;
 
       String dia;
 
bf.skip(14);

       
     while((dia = bf.readLine())   != null ) {
       
 String[] list =dia.split(",");
 
 for(String dialogues : list)  {
 
   System.out.println(dialogues);
 
 }
   
 



       }
 
       
     } catch (Exception e) {
   
   System.out.println("Exception ");
      
      e.printStackTrace();
   
     } 
 
     
 
 }

}

