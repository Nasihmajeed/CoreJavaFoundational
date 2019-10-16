package com.lxisoft.intern.files;
public class Audi extends Car implements Luxury
{   
	public Audi(String name,String fuel,int cc,int pow,int engineno,String tyre,int vel)
	{
		setName(name);
		setFuel(fuel);
		setCc(cc);
		setPower(pow);
		setEngineno(engineno);
	}

 public void turbo()
 {  
   int a = (vehiclelist.get(4).getPower());
   System.out.println("increased power:"+a);
 }
}