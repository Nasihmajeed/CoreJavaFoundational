package com.lxisoft.Movies;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Script
{
	private String name0;
	private String name1;
	private String name2;
	private String name3;
	private String name4;
	private String name5;
	private String name6;
	private String name7;

	public abstract void scriptDisplay();
	
	public void setDialogue0(String a)
	{
		this.name0=a;
	}
	public String getDialogue0()
	{
		return name0;
	}
	public void setDialogue1(String a)
	{
		this.name1=a;
	}
	public String getDialogue1()
	{
		return name1;
	}
	public void setDialogue2(String a)
	{
		this.name2=a;
	}
	public String getDialogue2()
	{
		return name2;
	}
	public void setDialogue3(String a)
	{
		this.name3=a;
	}
	public String getDialogue3()
	{
		return name3;
	}
	public void setDialogue4(String a)
	{
		this.name4=a;
	}
	public String getDialogue4()
	{
		return name4;
	}
	public void setDialogue5(String a)
	{
		this.name5=a;
	}
	public String getDialogue5()
	{
		return name5;
	}
	public void setDialogue6(String a)
	{
		this.name6=a;
	}
	public String getDialogue6()
	{
		return name6;
	}
	public void setDialogue7(String a)
	{
		this.name7=a;
	}
	public String getDialogue7()
	{
		return name7;
	}
}