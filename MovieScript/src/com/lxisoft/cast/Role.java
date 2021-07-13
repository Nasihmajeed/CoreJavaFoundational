package com.lxisoft.cast;
import java.util.*;
public enum Role
{
	Hero,Heroine,Comedian,Villan;

	 static Role []roles=Role.values();
	public static Role getRole(int i)
	{return roles[i];

	}
}