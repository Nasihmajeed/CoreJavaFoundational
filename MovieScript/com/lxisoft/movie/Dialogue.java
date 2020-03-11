package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*;
public class Dialogue
{
	private String movieDialogue;
	public boolean markdialogue; 
	public void setMovieDialogue(String dialogue)
	{
		this.movieDialogue = dialogue;
	}
	public String getMovieDialogue()
	{
		return movieDialogue;
	}
	public void setMarkDialogue(boolean flag)
	{
		this.markdialogue = flag;
	}
	public boolean getMarkDialogue()
	{
		return markdialogue;
	}  
	public String toString()
	{
		return this.movieDialogue;
	}

}