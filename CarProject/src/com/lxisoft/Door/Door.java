package com.lxisoft.Door;
import com.lxisoft.Car.Car;
public class Door 
{
    int doornumber;
    String doortype;

    public void setdoorNumber(int doornumber)
    {
        this.doornumber = doornumber;
    }
    public int getdoorNumber()
    {
        return doornumber;
    }
    public void setdoorType(String doortype)
    {
        this.doortype = doortype;
    }
    public String getdoorType()
    {
        return doortype;
    }

    public void printDoorDetails()
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
		System.out.print("Details Of The Door and Seating of vehicle : ");
        System.out.print("\n");
		System.out.print("Number of Doors : "+getdoorNumber());
        System.out.print("\n");
		System.out.print("Type of Door : "+getdoorType());
        System.out.print("\n");
		System.out.print("-------------------------------------");
       }

}