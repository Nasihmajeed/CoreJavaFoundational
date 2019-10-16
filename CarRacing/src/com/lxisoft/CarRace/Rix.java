package com.lxisoft.CarRace;
import java.util.Scanner;
import com.lxisoft.CarRace.*;
public class Rix extends Car implements Normalcar
{
	  public Rix(String name,float  basic_speed,String tyre,int power,String fuel)
	{
		this.name=name;
		this.basic_speed=basic_speed;
		this.tyre=tyre;
		this.power=power;
		this.fuel=fuel;
	}
	public Car lowpower()
	{
		return this;
	}
}