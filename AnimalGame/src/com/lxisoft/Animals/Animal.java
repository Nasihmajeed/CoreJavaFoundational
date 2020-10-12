package com.lxisoft.Animal;
import com.lxisoft.Game.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Animal
{
public boolean life;
public String name;
public int strength;

public void setName(String name)
	{
		this.name=name;
	}
public String getName()
	{
		return name;
	}
public void setStrength(int a)
	{
		this.strength=a;
	}
public int getStrength()
	{
		return strength;
	}
public void setlife(boolean life)

	{
		this.life=life;
	}
public boolean getlife()
	{
		return life;
	}
}
