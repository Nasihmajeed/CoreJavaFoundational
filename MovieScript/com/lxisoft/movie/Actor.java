package com.lxisoft.movie;
import com.lxisoft.repository.*;
import java.util.*;
public class Actor
{
	private String actorName;
	private String nameOfRole;
	public  Dialogue dialogue;
	Scanner sc = new Scanner(System.in);
	public void setActorName(String actorname)
	{
		this.actorName = actorname;
	}
	public String getActorName()
	{
		return actorName;
	}
	public void setNameOfRole(String role)
	{
		this.nameOfRole = role;
	}
	public String getNameOfRole()
	{
		return nameOfRole;
	}
	// public void createActor(ArrayList<Actor> actorList,Actor actor)
	// {
	// 	actorList.add(new IronMan());
	// 	actorList.get(0).setActorName("Robert Downey Jr");
	// 	actorList.get(0).setNameOfRole("Iron man");
	// 	actorList.add(new Thanos());
	// 	actorList.get(1).setActorName("Josh Brolin");
	// 	actorList.get(1).setNameOfRole("Thanos");
	// }
}
	
		
		