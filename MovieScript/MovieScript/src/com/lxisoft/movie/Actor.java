package com.lxisoft.movie;

public class Actor implements Comparable<Actor>{
	private String actorName;
	private String actorRoleName;
		public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	
	public String getActorRoleName() {
		return actorRoleName;
	}
	
	public void setActorRoleName(String actorRoleName) {
		this.actorRoleName = actorRoleName;
	}
	
	public int compareTo(Actor actor) {
		return this.actorName.compareTo(actor.actorName);
		
	}
	
	public String toString()
	{
		return actorName.toString()+" As "+actorRoleName.toString() ;
	}
	
}
