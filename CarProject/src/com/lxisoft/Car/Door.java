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

    public void printDoorDetails(ArrayList<Door> doors)
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
		System.out.print("Details Of The Door and Seating of vehicle : ");
        System.out.print("\n");
		System.out.print("Number of Doors : "+getDoorNumber());
        System.out.print("\n");
        for(int i=0;i<=3;i++)
        {
		System.out.print("Type of Door : "+doors.get(i).getDoorType());
        System.out.print("\n");
        }
		System.out.print("-------------------------------------");
       }

}