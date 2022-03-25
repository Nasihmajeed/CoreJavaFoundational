package com.lxisoft.movie;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScriptWriter {

   
 private List< Dialogue>dialogues= new ArrayList<Dialogue>();



 public List <Dialogue> getDialogues() {

return dialogues;

 }


 public void setDialogues( List < Dialogue>dialogues)  {

this.dialogues = dialogues;

 }



public void createDialogues()   {
  

 try {

  Scanner scanner= new Scanner(new FileReader("../resources/dialogue.csv"));

while(scanner.hasNext())  {

     
 dialogues.add( new Dialogue(scanner.nextLine()));

}

} catch (FileNotFoundException e) {

  e.printStackTrace();
} 


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

