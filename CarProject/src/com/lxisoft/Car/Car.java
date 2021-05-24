package com.lxisoft.Car;
import java.util.ArrayList;
import com.lxisoft.Engine.Engine;
import com.lxisoft.Rc.Rc;
import com.lxisoft.Tyre.Tyre;
import com.lxisoft.Door.Door;

public class Car 
{   
    String name;
	String model;
    String manufacturer;

public void setcarName(String name)
    {
        this.name = name;
    }
    public String getcarName()
    {
        return name;
    }
    public void setcarModel(String model)
    {
        this.model = model;
    }
    public String getcarModel()
    {
        return model;
    }
    public void setcarManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    public String getcarManufacturer()
    {
        return manufacturer;
    }

    public void printCarDetails()
	{
	    System.out.print("-------------------------------------");
        System.out.print("\n");
    	System.out.print("Details of the Car");
        System.out.print("\n");
		System.out.print("Name of the car : "+getcarName());
        System.out.print("\n");
		System.out.print("Model of the Car : "+getcarModel());
        System.out.print("\n");
        System.out.print("Manufacturer of the Car : "+getcarManufacturer());
        System.out.print("\n");
		System.out.print("-------------------------------------");			   
    }
}