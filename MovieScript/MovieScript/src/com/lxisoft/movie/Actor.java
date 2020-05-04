package com.lxisoft.movie;
public class Actor implements Comparable<Actor>
{
	private String name;
	private String rolename;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setRoleName(String rolename)
	{
		this.rolename = rolename;
	}
	public String getRoleName()
	{
		return rolename;
	}


	public String compareTo(Actor actor)
	{
		return this.name.equals(actor.getName());
	}
}