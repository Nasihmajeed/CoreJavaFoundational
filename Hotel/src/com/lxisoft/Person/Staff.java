package com.lxisoft.Person;
class Staff
{
	String staffName,job;
	int index=0;
	public Staff(String n, String j)
	{
		this.staffName= n;
		this.job = j;
	}
	public void printStaff()
	{
		System.out.println("  " + staffName +" ----> "+ job);
	}
}