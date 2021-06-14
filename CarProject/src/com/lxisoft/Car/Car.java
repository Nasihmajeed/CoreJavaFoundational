package com.lxisoft.car;
import java.util.ArrayList;
import com.lxisoft.car.Engine;
import com.lxisoft.car.Rc;
import com.lxisoft.car.Tyre;
import com.lxisoft.car.Door;

public class Car 
{ 
    Engine engine;
    Rc rc;
    ArrayList<Door> doors;
    ArrayList<Tyre> tyres;
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
     public void setEngine(Engine engine)
   {   
     this.engine= engine;     
   } 
  public void setRc(Rc rc)
   {
        this.rc=rc; 
   }
  public void setDoor(ArrayList<Door> doors)
   {
      this.doors=doors;
   }
  public void setTyre(ArrayList<Tyre> tyres)
   {
      this.tyres=tyres;
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
        engine.printEngineDetails();
        rc.printRcDetails(); 
        for (var i=0;i<doors.size();i++)
         {
            doors.get(i).printDoorDetails();
        }
         for (var j=0;j<tyres.size();j++)
          {
               tyres.get(j).printTyresDetails();
          } 
                  	
    }   
}