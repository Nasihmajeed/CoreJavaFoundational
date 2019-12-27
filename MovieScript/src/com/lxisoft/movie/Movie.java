package com.lxisoft.movie;
public class Movie 
{
	private String name;

	public Movie(String name)
	{
		this.name=name;
	}
	public void coversation()
	{
		boolean exists,exists1;
		Script script = new Script();
		script.setDialougeArrayList();
		exists=script.villanFileExist();
		exists1=script.comedianFileExist();
		//script.writeToComedianFile(script.createComedianFile(exists));
		//script.writeToVillanFile(script.createVillanFile(exists));
		script.readFromFile(script.createVillanFile(exists));
	}
}