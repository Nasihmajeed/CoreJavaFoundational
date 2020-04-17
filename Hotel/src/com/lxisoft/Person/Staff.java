package com.lxisoft.Person;
import com.lxisoft.Person.*;
import java.util.*;
public class Staff
{
	String staffName,job;
	int index=0;
	int staffNum;
	// 

	public void setStaff(int sNum , String sName,String sJob)
	{
		this.staffNum=sNum;
		this.staffName=sName;
		this.job=sJob;
	}

	public void printStaff(int i)
	{
		if(this.staffName!=null)
		{
			//System.out.println("  "+(i+101)+"           " + staffName +"\t ---> "+ job);
			System.out.format("%5d %15s %20s \n" ,staffNum,staffName,job);
		}
	}



	public void staffSectionwise(int opt)
	{
		if(staffName!=null)		
		{

			if(opt==1)
			{
				
				if(job.equals("Kitchen"))
				{
					System.out.format("%10d %25s \n",staffNum,staffName);
				}
			}
			else if(opt==2)
			{
				if(job.equals("Counter"))
					System.out.format("%10d %25s \n",staffNum,staffName);
			}
			else if(opt==3)
			{
				if(job.equals("Cleaning"))
					System.out.format("%10d %25s \n",staffNum,staffName);
			}
			else
				System.out.println("Invalid option");
		}
	}

	public void staffAdd(int sNum)
	{
		Scanner in = new Scanner(System.in);
		String sName,sJob;
		System.out.println("\n\nStaff Name : \n \t");
		sName=in.nextLine();
		System.out.println("\n\nJob Section : \n \t");
		sJob=in.nextLine();
		this.setStaff(sNum,sName,sJob);

	}

}