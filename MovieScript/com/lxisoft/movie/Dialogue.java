package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  

public class Dialogue
{
private String dialogue;
private Boolean flag=true;
private int id;
public void setdialogue(String dialogue)  
    { 
        this.dialogue = dialogue; 
    } 

public String getdialogue()  
    { 
        return dialogue; 
    } 
public void setFlag(boolean flag)
    {
    	this.flag=flag;
	}
public boolean getFlag()
	{
		return flag;
	}	
public void setId(int id)
    {
        this.id=id;
    }
public int getId()
    {
        return id;
    }   

}
