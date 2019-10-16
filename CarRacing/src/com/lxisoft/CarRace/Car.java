package com.lxisoft.CarRace;
import java.util.Scanner;
import com.lxisoft.CarRace.*;

public abstract class Car
{
	String name;
	float basic_speed;
	String tyre;
	int power;
	String fuel;
	
	public void display()
	{
		System.out.println(" Car name="+this.name);
	}

	
}