package com.lxisoft.Tyre;
import com.lxisoft.Car.Car;
public class Tyre 
{
    String tyrename;
    int size;

    public void settyreName(String tyrename)
    {
        this.tyrename = tyrename;
    }
    public String gettyreName()
    {
        return tyrename;
    }
    public void settyreSize(int size)
    {
        this.size = size;
    }
    public int gettyreSize()
    {
        return size;
    }

public void printTyreDetails()
       {
        System.out.print("-------------------------------------");
        System.out.print("\n");
    	System.out.print("Details Of The Tyre :  ");
        System.out.print("\n");
		System.out.print("Tyre Manufactures name is : "+gettyreName());
        System.out.print("\n");
		System.out.print("Tyre Size is : "+gettyreSize());
        System.out.print("\n");
		System.out.print("-------------------------------------");	
       }

}