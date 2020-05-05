package com.lxisoft.movie;

public class Scene {
	
	public String createScenes(int randScene)
	{
		String[] scenes = new String[20];
		scenes[0] = "on the bridge";
		scenes[1] = "in the bus";
		scenes[2] = "in the Street";
		scenes[3] = "in Home";
		return scenes[randScene];
		
	}

}
