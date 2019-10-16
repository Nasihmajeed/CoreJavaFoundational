package com.lxisoft.CarRace;
import java.util.Scanner;
import com.lxisoft.CarRace.*;
public class Lamborgini extends Car implements Sportcar
{
	  public Lamborgini(String name,float  basic_speed,String tyre,int power,String fuel)
	{
		this.name=name;
		this.basic_speed=basic_speed;
		this.tyre=tyre;
		this.power=power;
		this.fuel=fuel;
	}
	public Car highpower()
	{
		return this;
	}
}
