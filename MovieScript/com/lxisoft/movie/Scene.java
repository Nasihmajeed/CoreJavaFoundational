package com.lxisoft.movie;
import java.io.BufferedReader;
import java.io.FileReader;

public class Scene {


 Dialogue dialogue = new Dialogue();

 public void showDialogue(int sceneNo)   { 
   
 
     try {
   
       BufferedReader bf = new BufferedReader(new FileReader("../resources/dialogue.csv") ) ;
 
       String dialo;
 
bf.skip(14);

        
     while((dialo = bf.readLine())   != null ) {
       
 String[] list =dialo.split(",");
 
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

