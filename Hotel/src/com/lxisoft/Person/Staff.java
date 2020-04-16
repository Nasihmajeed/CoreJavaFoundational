package com.lxisoft.Person;
import com.lxisoft.Person.*;
public class Staff
{
	String staffName,job;
	int index=0;
	// 

	public void setStaff(String sName,String sJob)
	{
		this.staffName=sName;
		this.job=sJob;
	}

	public void printStaff()
	{
		if(this.staffName!=null)
			System.out.println("  " + staffName +" ----> "+ job);
	}
	public void staffSectionwise(int opt)
	{		
		if(opt==1)
		{
			
			if(job.equals("Kitchen"))
				System.out.println("  " + staffName);
		}
		else if(opt==2)
		{
			
			if(job.equals("counter"))
				System.out.println("  " + staffName);
		}
		else if(opt==3)
		{
			
			if(job.equals("cleaning"))
				System.out.println("  " + staffName);
		}
		else
			System.out.println("Invalid option");



	}
}