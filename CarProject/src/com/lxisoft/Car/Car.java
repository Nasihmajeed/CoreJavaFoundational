package com.lxisoft.car;
import java.util.ArrayList;
import com.lxisoft.car.Engine;
import com.lxisoft.car.Rc;
import com.lxisoft.car.Tyres;
import com.lxisoft.car.Door;

public class Car 
{ 


    String name;
	String model;
    String manufacturer;

public void setCarName(String name)
    {
        this.name = name;
    }
    public String getCarName()
    {
        return name;
    }
    public void setCarModel(String model)
    {
        this.model = model;
    }
    public String getCarModel()
    {
        return model;
    }
    public void setCarManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    public String getCarManufacturer()
    {
        return manufacturer;
    }

    public void printCarDetails()
	{   
	    System.out.print("-------------------------------------");
        System.out.print("\n");
    	System.out.print("Details of the Car");
        System.out.print("\n");
		System.out.print("Name of the car : "+getCarName());
        System.out.print("\n");
		System.out.print("Model of the Car : "+getCarModel());
        System.out.print("\n");
        System.out.print("Manufacturer of the Car : "+getCarManufacturer());
        System.out.print("\n");
		System.out.print("-------------------------------------");	
    }
    public void setEngine(Engine engine)
   {   
        engine.printEngineDetails();      
   } 
  public void setRc(Rc rc)
   {
        rc.printRcDetails();      
   }
  public void setDoor(Door door)
   {
        door.printDoorDetails();     
   }
  public void setTyre(Tyres tyres)
   {
        tyres.printTyresDetails();
   }
}