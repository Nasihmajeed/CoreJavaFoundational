package com.lxisoft.movie;
import com.lxisoft.repository.*;
import com.lxisoft.movie.*;
import java.util.*;
public class Dialogue
{
	private String movieDialogue;
	ArrayList<String[]> dialogueList = new ArrayList<String[]>();
	public void setMovieDialogue(String dialogue)
	{
		this.movieDialogue = dialogue;
	}
	public String getMovieDialogue()
	{
		return movieDialogue;
	} 

}