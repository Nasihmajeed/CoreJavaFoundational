package com.lxisoft.Car;
import java.util.ArrayList;
import com.lxisoft.Car.Engine;
import com.lxisoft.Car.Rc;
import com.lxisoft.Car.Tyre;
import com.lxisoft.Car.Door;

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

    public void printCarDetails(Rc rc,Engine engine,Door door,Tyre tyre)
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
        this.setRc(rc);
        this.setEngine(engine);
        this.setDoor(door);
        this.setTyre(tyre);
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
  public void setTyre(Tyre tyre)
   {
        tyre.printTyreDetails();
   }
}