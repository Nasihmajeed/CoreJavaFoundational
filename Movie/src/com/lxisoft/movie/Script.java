package com.lxisoft.movie;
import com.lxisoft.movie.Script;
import java.util.*;
public class Script
{	
	

	public String scenes(int randscenenum)
	{
		ArrayList<String> scenes=new ArrayList<String>();
		scenes.add("on the bridge");
		scenes.add("center of meetingroom");
		scenes.add("In the car");
		scenes.add("Ship basement");
		scenes.add("The company");
		return scenes.get(randscenenum);
	}
	
	

	
}
