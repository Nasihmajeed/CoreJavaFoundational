package com.lxisoft.company;
import java.util.*;
public class Ball
{
private String name;
private int rate;

public void setBallName(String nme)

	{
		this.name=nme;

	}
 public String getBallName()

	{
		return name;
	}

public void setBallRate(int rate)
	{
		this.rate=rate;
	}	

public int getBallRate()
	{
		return rate;
	}

public String toString() { 
        return " Ball " + "Name = " + name + " : Rate = " +rate+ ' '; 
    } 	
}