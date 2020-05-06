package com.lxisoft.movie;

import java.util.*;

import com.lxisoft.movie.Script;
import com.lxisoft.repository.FileRepositoryImp;

public class ScriptWriter {
	
	private String name;
	private FileRepositoryImp fileReppo;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public List<Dialouge> getScript(int movieCode)
	{
		Script script = new Script();
		return script.getScript(movieCode);
	}
	
	public void editScript(int movieCode)
	{
		Script script = new Script();
		script.editScript(movieCode);
	}

}
