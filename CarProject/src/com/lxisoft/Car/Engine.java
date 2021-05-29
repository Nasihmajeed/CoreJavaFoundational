package com.lxisoft.car;
import com.lxisoft.car.Car;
public class Engine 
{
    String ccnumber;
    String cctype;

    public void setEngineNumber(String ccnumber)
    {
        this.ccnumber = ccnumber;
    }
    public String getEngineNumber()
    {
        return ccnumber;
    }
    public void setEngineType(String cctype)
    {
        this.cctype = cctype;
    }
    public String getEngineType()
    {
        return cctype;
    }

    public void printEngineDetails()
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
        System.out.print("Engine Details . ");
        System.out.print("\n");
    	System.out.print("Engine CC is : "+getEngineNumber());
        System.out.print("\n");
    	System.out.print("Engine Type is : "+getEngineType());
        System.out.print("\n");
		System.out.print("-------------------------------------");
       }
}