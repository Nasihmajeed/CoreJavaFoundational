package com.lxisoft.car;
import com.lxisoft.car.Car;
import java.util.ArrayList;
public class Tyre 
{
    String tyrenumber;
    String tyrename;
    String size;

    public void setTyreNumber(String tyrenumber)
    {
        this.tyrenumber = tyrenumber;
    }
    public String getTyreNumber()
    {
        return tyrenumber;
    }
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

public void printTyresDetails(ArrayList<Tyre> tyres)
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
    	System.out.print("Details Of The Tyre :  ");
        System.out.print("\n");
        System.out.print("Number of tyres in tyhe car:"+getTyreNumber());
        for(int j=0;j<=3;j++)
        {
		  System.out.print("Tyre Manufactures name is : "+tyres.get(j).getTyreName());
          System.out.print("\n");
		  System.out.print("Tyre Size is : "+tyres.get(j).getTyreSize());
          System.out.print("\n");
        }
		System.out.print("-------------------------------------");	
       }

}