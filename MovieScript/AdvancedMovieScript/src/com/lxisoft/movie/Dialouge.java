package com.lxisoft.movie;

import java.util.Collections;

public class Dialouge implements Comparable<Dialouge>{
	
	private String id;
	private String characterName;
	private String dialouge;
	private String dialougeCode;
	private String questionOrAnswer;
	public boolean isTrue = true;
	
	@Override
	public int compareTo(Dialouge dialouge) {
		
	  return this.id.compareTo(dialouge.getId());
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}
	
	public String getCharacterName()
	{
		return characterName;
	}
	public void setDialouge(String dialouge)
	{
		this.dialouge = dialouge;
	}
	
	public String getDialouge()
	{
		return dialouge;
	}
	
	public void setDialougeCode(String dialougeCode)
	{
		this.dialougeCode = dialougeCode;
	}
	
	public String getDialougeCode()
	{
		return dialougeCode;
	}
	
	public void setQuestionOrAnswer(String questionOrAnswer)
	{
		this.questionOrAnswer = questionOrAnswer;
	}
	
	public String getQuestionOrAnswer()
	{
		return questionOrAnswer;
	}
	
	@Override
	public String toString()
	{
		return "Dialouge";
	}
}
