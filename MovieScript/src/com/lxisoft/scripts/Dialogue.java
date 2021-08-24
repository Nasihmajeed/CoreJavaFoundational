package com.lxisoft.scripts;

import com.lxisoft.cast.*;

public class Dialogue 
{
	Actor deliveredBy;

	String dialogue;

	Dialogue(Actor deliveredBy,String dialogue)
	{
         this.deliveredBy=deliveredBy;
         this.dialogue=dialogue;
	}

  public Actor getActor()
  {
  	return deliveredBy;
  }

  public String getDialogue()
  {
  	return dialogue;
  }
  
}