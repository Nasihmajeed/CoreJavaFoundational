package com.lxisoft.users;
import java.util.*;
public class Staff
{
	public String name;
	public int xArea,yArea;
	public Staff(String n)
	{
		name =n;
	}
	public void setLocation(int x, int y)
	{
		xArea=x;
		yArea=y;
	}
	
}