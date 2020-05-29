package com.lxisoft.website;
import  com.lxisoft.users.*;
import java.util.*;
public class ServiceBooking
{

 	int dist;
	public void inputCustomerDetails(ArrayList<Customer> customers, ArrayList<Item> items, ArrayList<Staff> staffs)
	{
		int sNum;
		initializeStaff(staffs);
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Your Service Number :) ");
		sNum=in.nextInt();in.nextLine();
		if(checkCoustomer(customers,sNum))
		{
			System.out.println("OK : Your Request is Processing");
			assignStaffLocation(staffs);
			inputCustomerLocation(customers,staffs);
			
		}



	}
	public boolean checkCoustomer(ArrayList<Customer> customers, int sNum)
	{
		//System.out.println("Please")
		for(Customer c : customers)
		{
			if(c.serviceNumber==sNum)
				return true;
		}
		System.out.println("Please Check the service Number");
		return false;


	}


	

	public void inputCustomerLocation(ArrayList<Customer> customers,ArrayList<Staff> staffs)
	{
			Scanner in = new Scanner(System.in);
		int row,col;
		System.out.println("Hello plese enter your Location=> ");
		System.out.print("Row Number => ");
		row=in.nextInt();
		System.out.print("Coloumn Number => ");
		col=in.nextInt();
		System.out.println("Please wait : Checking the staffs");
		int res= compareLocation(staffs,row, col);
		if(res==1)
		{
			System.out.println("The staff is nearby will reach in  "+ dist + " Minutes");
		}
		else
			System.out.println("Sorry currently no one available ");

	}

	public int compareLocation(ArrayList<Staff> staffs,int r,int c)
	{
		int x1,y1;
		int flag=0;
		for(Staff s: staffs)
		{
			x1= s.xArea;
			y1=s.yArea;
			dist = (int) (Math.sqrt(((x1 - r)*(x1 - r))+((y1 - c)*(y1 - c))));
			// System.out.println("Dist =" + dist);
			// System.out.println("Staff loc =" + x1 + " " + y1);
			if(dist<=20)
			{
				flag=1;
				return flag;
			}
		}
		return flag;		
	}



	public void initializeStaff(ArrayList<Staff> staffs)
	{
		staffs.add(new Staff("Midhun"));
		staffs.add(new Staff("Manu"));
		staffs.add(new Staff("Akshay"));
		staffs.add(new Staff("Hari"));
		staffs.add(new Staff("Vishnu"));
	}
	public void assignStaffLocation(ArrayList<Staff> staffs)
	{
		int x=0,y=0;
		for(Staff s: staffs)
		{
			x= (int) (Math.random()*80) ;
			y= (int) (Math.random()*80) ;
			s.setLocation(x,y);
		}

	}

}