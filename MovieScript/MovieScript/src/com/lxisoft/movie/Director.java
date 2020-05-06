package com.lxisoft.movie;

import java.util.ArrayList;
import java.util.Random;

public class Director {
	
	private String dirName;
	private String directionalControl;
	private Scene scene = new Scene();
	private ArrayList<Actor> cast1  = new ArrayList<Actor>();
	private ArrayList<Actor> cast2  = new ArrayList<Actor>();
	Random r = new Random();
	public String getDirname() {
		return dirName;
	}

	
	
	public String getDirectionalControl() {
		return directionalControl;
	}


	
	public void setDirectionalControl() {
		int sceneNo = r.nextInt(3-1+1)+1;
		directionalControl = scene.createScenes(sceneNo);
	}


	public void setDirname(String dirname) {
		dirName = dirname;
	}


	public ArrayList<Actor> comicCast()
	{
		cast1.add(new ironman());
		cast1.get(0).setActorName("Robert");
		cast1.get(0).setActorRoleName("IronMan");
		cast1.add(new Thanos());
		cast1.get(1).setActorName("Josh");
		cast1.get(1).setActorRoleName("Thanos");
		return cast1;
	}
	public ArrayList<Actor> scifiCast()
	{
		cast2.add(new Terminator());
		cast2.get(0).setActorName("Arnold");
		cast2.get(0).setActorRoleName("Terminator");
		cast2.add(new T1000());
		cast2.get(1).setActorName("Patrick");
		cast2.get(1).setActorRoleName("T1000");
		return cast2;
	}
	
	

	

}
