package com.lxisoft.hospital;
public class Service
{
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
}