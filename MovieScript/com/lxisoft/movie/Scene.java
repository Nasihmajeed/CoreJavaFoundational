package com.lxisoft.movie;

import java.util.ArrayList;
import java.util.List;

public class Scene {
 

 private List <Dialogue>dialogues =new ArrayList<Dialogue>();


public List <Dialogue>getDialogues() {

return dialogues;

}

public void setDialogues( List <Dialogue> dialogues)  {

this.dialogues = dialogues;

}


 public void showDialogue()   { 
   

for (int i =0 ; i <dialogues.size(); i ++) {

if(dialogues.get(i) != null)  {
 
 System.out.println(dialogues.get(i).getDeliveredBy().getCharacterName() +"(" + dialogues.get(i).getDeliveredBy().getName() +")" + dialogues.get(i). getDialogueText() );
 
}

} 
 } }

