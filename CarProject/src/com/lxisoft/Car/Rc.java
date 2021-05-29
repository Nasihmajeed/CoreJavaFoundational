package com.lxisoft.car;
import com.lxisoft.car.Car;
public class Rc
{
     String owner;
	String address;

	public void setRcOwner(String owner)
    {
        this.owner = owner;
    }
    public String getRcOwner()
    {
        return owner;
    }
    public void setOwnerAddress(String address)
    {
        this.address = address;
    }
    public String getOwnerAddress()
    {
        return address;
    }

	public void printRcDetails()
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
        System.out.print("Details of the Car Rc ");
        System.out.print("\n");
		System.out.print("Name of RC Owner : "+getRcOwner());
        System.out.print("\n");
		System.out.print("Adress of RC owner: "+getOwnerAddress());
        System.out.print("\n");
		System.out.print("-------------------------------------"); 
       }
 
}