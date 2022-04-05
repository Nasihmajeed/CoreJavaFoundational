package com.lxisoft.movie;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ScriptWriter {

  Scanner sc = new Scanner(System.in); 

 private List< Dialogue>dialogues= new ArrayList<Dialogue>();
 

 public List <Dialogue> getDialogues() {

return dialogues;

 }

 
 public void setDialogues( List < Dialogue>dialogues)  {

this.dialogues = dialogues;

 }



public void createDialogues()   {

  Repository repository;



 repository = new DataBaseRepository();

dialogues = repository.findAll();



}  



public Script addDialoguesToScenes(List <Actor> actors) {


Script script = new Script();

script.createScenes ();


for (int x =1; x < script.getScenes().length; x ++ ) {

if(script.getScenes()[x] != null)  {
      
  for(int i = 0;  i< 10;   i ++)  {

    int number =(int) (Math.random() *dialogues.size());

int actorNumber = (int) (Math.random()*actors.size());

dialogues.get(number).setDeliveredBy(actors.get(actorNumber));

      script.getScenes()[x].getDialogues().add( dialogues.get(number));
  
  }
       
}
 
}

return script;     

} }

