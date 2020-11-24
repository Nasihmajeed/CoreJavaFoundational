package com.lxisoft.Hospital;
public abstract class Doctors
{
	private String doctorname;
	private String specification;
	private int time;
	private int id;
	private boolean available;
	public abstract void doctorsSpecification();
	
	public void setDoctorName(String doctorname)
	{
		this.doctorname = doctorname;
	}
	public String getDoctorName()
	{
		return doctorname;
	}
	public void setSpecification(String specification)
	{
		this.specification = specification;
	}
	public String getSpecification()
	{
		return specification;
	}
	public void setTime(int time)
	{
		this.time = time;
	}
	public int getTime()
	{
		return time;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
}