package com.lxisoft.movie;
import com.lxisoft.repository.*;
public class Script
{
	private String scriptWriter;
	public void setScriptWriter(String scriptwriter)
	{
		this.scriptWriter = scriptwriter;
	}
	public String getScriptWriter()
	{
		return scriptWriter;
	}
	public void scriptDetails()
	{
		setScriptWriter("rahul");
		System.out.println("ScriptWriter::"+getScriptWriter().toUpperCase());	
	}
}
