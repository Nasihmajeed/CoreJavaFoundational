package com.lxisoft.cast;

public class Comedian extends Actor
{
	
	Comedian()
	{

	}

	
Comedian(String comedianName,String comedianCharacterName)
	{	super(comedianName,comedianCharacterName);
		
		
	}

	public Comedian(String comedianName,String comedianCharacterName,String dialogueSaidByComedian)
		{
			super(comedianName,comedianCharacterName,dialogueSaidByComedian);
		}

}