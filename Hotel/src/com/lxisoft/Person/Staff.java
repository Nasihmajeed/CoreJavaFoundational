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
						// public void printStaff(int i)
						// {
						// 	while(index<5)
						// 	{
						// 		index++;
						// 		switch(i)
						// 		{
						// 			case 1 : if(job.equals("Kitchen"))
						// 					 {
						// 					 	System.out.println("  " + staffName +"\t ----> "+ job);
						// 					 }
						// 					 break;
						// 			case 2 : if(job.equals("Cleaning"))
						// 					 {
						// 					 	System.out.println("  " + staffName +"\t ----> "+ job);
						// 					 }
						// 					 break;
						// 			case 3 : if(job.equals("counter"))
						// 			 		 {
						// 					 	System.out.println("  " + staffName +"\t ----> "+ job);
						// 					 }
						// 					 break;

						// 		} 

						// 	}
							
						// }
}