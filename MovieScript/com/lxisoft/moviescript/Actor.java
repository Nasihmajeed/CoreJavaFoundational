package com.lxisoft.moviescript;

import com.lxisoft.cast.*;

public class Actor {

   private String name,characterName;

   public String getName() {
       return name;
    
   }
  
   public void setName(String name){  
    this.name=name; 
   }

   public String getCharacterName(){
       return characterName;
   }

   public void setCharacterName(String characterName){  
    this.characterName=characterName; 
   }

 public void showDetails() {

System.out.println("\t\t Actor Name:" + name);
System.out.println("\t\t Character Name:" +characterName);

}
      
    }
   

