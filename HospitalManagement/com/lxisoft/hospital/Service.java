package com.lxisoft.hospital;
import java.util.*;
public class Service
{
	static Scanner sc = new Scanner(System.in);
	private String serviceName;
	private int serviceAmount;

	public void setServiceName(String str)
	{	
		this.serviceName = str;
	}
	public String getServiceName()
	{
		return serviceName;
	}
	public void setServiceAmount(int amount)
	{
		this.serviceAmount = amount;
	}
	public int getServiceAmount()
	{
		return serviceAmount;
	}

	public ArrayList<Service> createService(ArrayList<Service> serviceList,Service service)
	{
		serviceList.add(new Service());
		serviceList.get(0).setServiceName("x-Ray");
		serviceList.get(0).setServiceAmount(400);
		serviceList.add(new Service());
		serviceList.get(1).setServiceName("MRI");
		serviceList.get(1).setServiceAmount(5000);
		serviceList.add(new Service());
		serviceList.get(2).setServiceName("CT-Scan");
		serviceList.get(2).setServiceAmount(2000);System.out.println("\n");
		return serviceList;
	}
	public void viewServices(ArrayList<Service> serviceList,Service service)
	{	
		createService(serviceList,service);
		System.out.println("\t\t***SERVICES***");
		System.out.println("\t\t-------------------");
		if(serviceList.size() == 0)
		{
			System.out.println("\t\tNo Services");
		}
		else
		{
			System.out.println("\tID    SERVICES     FEE");
			System.out.println("\t-----------------------------------------------");
			for(int i=0;i<serviceList.size();i++)  
			{
				System.out.print("\t"+i);
				System.out.print("\t"+serviceList.get(i).getServiceName()+"\t");
				System.out.print(serviceList.get(i).getServiceAmount()+"\t");
				System.out.println(" ");
			}
		}	
	}
	

}