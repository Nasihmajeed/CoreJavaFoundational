package com.lxisoft.movie;
import com.lxisoft.movie.Script;
import java.util.*;
public class Script
{	
	
	ArrayList<String> scenes=new ArrayList<String>();
	public void setScenes(int randscenenum)
	{
		
		scenes.add("on the bridge");
		scenes.add("center of meetingroom");
		scenes.add("In the car");
		scenes.add("Ship basement");
		scenes.add("The company");
		
	}
	public ArrayList<String> getScenes()
	{
		return scenes;
	}
	

	
}
