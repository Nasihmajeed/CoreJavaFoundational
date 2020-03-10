package com.lxisoft.movie;
import com.lxisoft.repository.*;
import java.util.*;
public class Actor
{
	private String actorName;
	private String nameOfRole;
	private int actorId;
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
	public void setActorId(int id)
	{
		this.actorId = id;
	}
	public int getActorId()
	{
		return actorId;
	}
}
	
		
		