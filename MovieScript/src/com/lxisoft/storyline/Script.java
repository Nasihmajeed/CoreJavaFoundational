package com.lxisoft.storyline;
import com.lxisoft.script.*;
import java.io.*;
import java.util.*;
public class Script
{
	String character1,character2,dialogues;



	public void setCharacter1(String character)
	{
		this.character1=character;

	}
		public void setCharacter2(String character)
	{
		this.character2=character;

	}

	public void setDialogue(String dialogues)
	{
		this.dialogues=dialogues;
	}

	public String getCharacter1()
	{
		return character1;

	}
	public String getCharacter2()
	{
		return character2;

	}
	public String getDialogue()
	{
		return dialogues;
	}


}