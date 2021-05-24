package com.lxisoft.Rc;
import com.lxisoft.Car.Car;
public class Rc
{
     String owner;
	String address;

	public void setrcOwner(String owner)
    {
        this.owner = owner;
    }
    public String getrcOwner()
    {
        return owner;
    }
    public void setownerAddress(String address)
    {
        this.address = address;
    }
    public String getownerAddress()
    {
        return address;
    }

	public void printRcDetails()
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
        System.out.print("Details of the Car Rc ");
        System.out.print("\n");
		System.out.print("Name of RC Owner : "+getrcOwner());
        System.out.print("\n");
		System.out.print("Adress of RC owner: "+getownerAddress());
        System.out.print("\n");
		System.out.print("-------------------------------------"); 
       }
 
}