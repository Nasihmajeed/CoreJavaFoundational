package com.lxisoft.intern.files;
public abstract class Vehicle
{
        private String name;
        private String fueltype;
        private int cc;
        private int power;
        private int engineno;
	    private String tyre;
	    private int velocity;
	   
		public void setName(String n)
		{
		  this.name = n;
		}
		public String getName()
		{
		  return this.name;
		}

		public void setFuel(String f)
		{
			this.fueltype = f;
		}
		public String getFuel()
		{
			return this.fueltype;
		}

		public int setCc(int cc)
		{
		   this.cc = cc;
		   return this.cc;
		}
		public int getCc()
		{
		   return this.cc;
		}

		public int setPower(int pow)
		{
		   this.power = pow;
		   return this.power;
		}
		public int getPower()
		{
		   return this.power;
		}

		public int setEngineno(int eng)
		{
		   this.engineno = eng;
		   return this.engineno;
		}
		public int getEngineno()
		{
		   return this.engineno;
		}
		public String setTyre(String tyre)
		{
			this.tyre = tyre;
			return this.tyre;
		}
		public String getTyre()
		{
			return this.tyre = tyre;
		}

		public int setVelocity(int vel)
		{
		   this.velocity = vel;
		   return this.power;
		}
		public int getVelocity()
		{
		   return this.velocity;
		}

}