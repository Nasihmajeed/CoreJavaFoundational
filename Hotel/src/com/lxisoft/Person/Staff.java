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

	public void printStaff()
	{
		if(this.staffName!=null)
		{
			System.out.format("%5d %15s %20s \n" ,staffNum,staffName,job);
		}
	}



	public static void staffSectionwise(Staff staff[])
	{
		String j;
		Scanner in = new Scanner(System.in);
		System.out.println(" 1. Kitchen Duty \n 2. Cleaning Duty \n 3. Counter Duty \n");
		int opt = in.nextInt();
		Clear.cls();
		System.out.println("\tPrinting Staff in each section");
		System.out.println("-----------------------------------------------");
		for(int i=0;staff[i].staffName!=null;i++)
		{
			j = staff[i].job;
			switch(opt)
			{
				case 1: if(j.equals("Kitchen"))
							staff[i].printStaff();
						break;
				case 2:
						if(j.equals("Cleaning"))
							staff[i].printStaff();
						break;
				case 3: 
						if(j.equals("Counter"))
							staff[i].printStaff();
						break;
					

			}
		}
		System.out.println("\n\n");
		
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