package com.lxisoft.Car;
import com.lxisoft.Car.Car;
public class Tyre 
{
    String tyrename;
    String size;

    public void setTyreName(String tyrename)
    {
        this.tyrename = tyrename;
    }
    public String getTyreName()
    {
        return tyrename;
    }
    public void setTyreSize(String size)
    {
        this.size = size;
    }
    public String getTyreSize()
    {
        return size;
    }

public void printTyreDetails()
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
    	System.out.print("Details Of The Tyre :  ");
        System.out.print("\n");
		System.out.print("Tyre Manufactures name is : "+getTyreName());
        System.out.print("\n");
		System.out.print("Tyre Size is : "+getTyreSize());
        System.out.print("\n");
		System.out.print("-------------------------------------");	
       }

}