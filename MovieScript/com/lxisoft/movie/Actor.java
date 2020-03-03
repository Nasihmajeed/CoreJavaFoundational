package com.lxisoft.movie;
import java.util.*;
public class Actor
{
	private String actorName;
	private String nameOfRole;
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
	public void createActor(Actor actor)
	{
		ArrayList<Actor> actorList = new ArrayList<Actor>();
		actorList.add(new Actor());
		actorList.get(0).setActorName("Robert Downey Jr");
		actorList.get(0).setNameOfRole("Iron man");
		actorList.add(new Actor());
		actorList.get(1).setActorName("Josh Brolin");
		actorList.get(1).setNameOfRole("Thanos");
		display(actorList);
	}
	public void display(ArrayList actorList)
	{
		for(int i=0;i<actorList.size();i++)
		{
			System.out.println(actorList.get(i).getActorName());
			System.out.println(actorList.get(i).getNameOfRole());
		}
		
	}
}