  package com.lxisoft.movie;


public class Dialogue  {


private Actor deliveredBy;

private String dialogueText;

public Dialogue  (  String dialogueText)  {


this.dialogueText = dialogueText;
}
  
public Actor getDeliveredBy()  {

return deliveredBy;

}

public void setDeliveredBy(Actor deliveredBy ) {

this.deliveredBy = deliveredBy;

}

public String getDialogueText()  {

  return dialogueText;
  
  }
  
  public void setDialogueText(String dialogueText ) {
  
  this.dialogueText = dialogueText ;
  
  }



}