package com.lxisoft.movie;
import java.util.ArrayList;
public class Script 
{
	String scriptWriter = "christopher nolan";
	public ArrayList<Dialogue>comedian= new ArrayList<Dialogue>();
	public ArrayList<Dialogue>villan= new ArrayList<Dialogue>();
	public void comedianDialogue()
	{
		comedian.get(0).dialogue="hello";
		comedian.get(1).dialogue="whats your role in this movie ?";
		comedian.get(2).dialogue="i am the comedian ";
	}
	public void villanDialogue()
	{
		villan.get(0).dialogue="hai..";
		villan.get(1).dialogue="i am the villan ";
		villan.get(2).dialogue="whats your role in the movie ?";
	}
}