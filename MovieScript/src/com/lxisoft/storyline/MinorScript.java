package com.lxisoft.storyline;

import java.io.*;
import java.util.*;
public class MinorScript extends Script
{
	String character,dialogues;



	public void setCharacter(String character)
	{
		this.character=character;

	}

	public void setDialogue(String dialogues)
	{
		this.dialogues=dialogues;
	}

	public String getCharacter()
	{
		return character;

	}
	public String getDialogue()
	{
		return dialogues;
	}


}