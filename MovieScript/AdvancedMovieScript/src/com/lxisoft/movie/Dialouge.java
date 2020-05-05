package com.lxisoft.movie;

public class Dialouge {
	
	private String characterName;
	private String dialouge;
	private int dialougeCode;
	private String questionOrAnswer;
	
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
	
	public void setDialougeCode(int dialougeCode)
	{
		this.dialougeCode = dialougeCode;
	}
	
	public int getDialougeCode()
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
