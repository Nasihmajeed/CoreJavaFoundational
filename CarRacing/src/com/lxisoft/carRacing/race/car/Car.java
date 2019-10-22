package com.lxisoft.carRacing.race.car;
public class Car 
{
	public String name;
	public String engine;
	public int cc;
	private double time;

	public Tyre[] tyres=new Tyre[4];

	public Car(String name,String engine,int cc)
	{
		super();
		this.name=name;
		this.engine=engine;
		this.cc=cc;
	}

	public void setCarTyres(String[] tyreNames)
	{

		for(int i=0;i<4;i++)
		{
			tyres[i]=new Tyre();
			tyres[i].setCompany(tyreNames[i]);
			//System.out.print(tyres[i].getCompany());
		}
	}

	/*public String[] getCarTyres()
	{
		for(int i=0;i<4;i++)
		{
			//tyres[i]=new Tyre();
			//tyres[i].setCompany(tyreNames[i]);
			System.out.print(tyres[i].getCompany());
		}
		return tyres;
	}*/

	public void setTime(double time)
	{
		this.time=time;
	}
	public double getTime()
	{
		return time;
	}
	
}