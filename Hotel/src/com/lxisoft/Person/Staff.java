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

	public void printStaff(int i)
	{
		if(this.staffName!=null)
			System.out.println("  "+(i+101)+"           " + staffName +"\t ---> "+ job);
	}
	public void staffSectionwise(int opt)
	{
	if(staffName!=null)		
	{

		if(opt==1)
		{
			
			if(job.equals("Kitchen"))
			{

				System.out.println("  " + staffName);
			}
		}
		else if(opt==2)
		{
			
			if(job.equals("Counter"))
				System.out.println("  " + staffName);
		}
		else if(opt==3)
		{
			
			if(job.equals("Cleaning"))
				System.out.println("  " + staffName);
		}
		else
			System.out.println("Invalid option");
	}



	}

}