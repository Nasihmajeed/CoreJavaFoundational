package com.lxisoft.movie;
import java.io.*;  
import java.util.*;  

public class Dialogue
{
private String dialogue;
private Boolean flag=true;
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
}
