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
		System.out.println(script.villanDialouge.size());
		script.setDialougeArrayList();
		exists=script.villanFileExist();
		exists1=script.comedianFileExist();
		//script.writeToComedianFile(script.createComedianFile(exists));
		script.writeToVillanFile(script.createVillanFile(exists));
		script.readFromFile(script.createVillanFile(exists));

		/*for(int i=0;i<script.villanDialouge.size();i++)
		{
			System.out.println("test : "+script.villanDialouge.get(i).getDialouge());
		}*/
	}
}