package com.lxisoft.intern.files;
public class Bmwm3 extends Car implements Luxury
{   
	public Bmwm3(String name,String fuel,int cc,int pow,int engineno,String tyre,int vel)
	{
		setName(name);
		setFuel(fuel);
		setCc(cc);
		setPower(pow);
		setEngineno(engineno);
		setTyre(tyre);
		setVelocity(vel);
	}
 public void turbo()
 {}

}