package com.lxisoft.car;
import com.lxisoft.car.Car;
import java.util.ArrayList;
public class Door 
{
    String doornumber;
    String doortype;

    public void setDoorNumber(String doornumber)
    {
        this.doornumber = doornumber;
    }
    public String getDoorNumber()
    {
        return doornumber;
    }
    public void setDoorType(String doortype)
    {
        this.doortype = doortype;
    }
    public String getDoorType()
    {
        return doortype;
    }

    public void printDoorDetails()
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
		System.out.print("Details Of The Door and Seating of vehicle : ");
        System.out.print("\n");
        System.out.print("Number of Doors : "+getDoorNumber());
        System.out.print("\n");
        System.out.print("Type of Door : "+getDoorType());
        System.out.print("\n");
        System.out.print("-------------------------------------");	
       }

}