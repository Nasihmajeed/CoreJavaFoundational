package com.lxisoft.intern.files;
public class Dodge extends Car implements Luxury
{   
	public Dodge(String name,String fuel,int cc,int pow,int engineno,String tyre,int vel)
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