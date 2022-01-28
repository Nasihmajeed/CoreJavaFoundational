package com.lxisoft.moviescript;

public abstract class  Actor  {

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

   public abstract void actorsDetails();

}
      
    
   

