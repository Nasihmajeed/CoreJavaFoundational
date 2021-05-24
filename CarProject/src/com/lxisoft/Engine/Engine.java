package com.lxisoft.Engine;
import com.lxisoft.Car.Car;
public class Engine 
{
    int ccnumber;
    String cctype;

    public void setengineNumber(int ccnumber)
    {
        this.ccnumber = ccnumber;
    }
    public int getengineNumber()
    {
        return ccnumber;
    }
    public void setengineType(String cctype)
    {
        this.cctype = cctype;
    }
    public String getengineType()
    {
        return cctype;
    }

    public void printEngineDetails()
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
        System.out.print("Engine Details . ");
        System.out.print("\n");
    	System.out.print("Engine CC is : "+getengineNumber());
        System.out.print("\n");
    	System.out.print("Engine Type is : "+getengineType());
        System.out.print("\n");
		System.out.print("-------------------------------------");
       }
}