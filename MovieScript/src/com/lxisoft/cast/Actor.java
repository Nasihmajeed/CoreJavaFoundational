package com.lxisoft.cast;
public class Actor
{
String actorName;
String characterName;
String dialogueSaidByActor;
	Actor()
	{

	}
	Actor(String actorName,String characterName)
	{
		this.actorName=actorName;
		this.characterName=characterName;



	}

	Actor(String actorName, String characterName,String dialogueSaidByActor)
	{
		this.actorName=actorName;
		this.characterName=characterName;
		this.dialogueSaidByActor=dialogueSaidByActor;
		System.out.println(actorName+"("+characterName+")"+dialogueSaidByActor);
	
	}
	
	public String getActorName()
	{	

		return actorName;
	}
	public String getCharacterName()
	{
		return characterName;
	}
	
	/*public void getDialogueSaidByActor()
	{
		return dialogueSaidByActor;
	}*/


	


}