package com.lxisoft.mvd;

import com.lxisoft.fine.Fine;
import com.lxisoft.vehicle.FourWheeler;
import com.lxisoft.vehicle.TwoWheeler;
import com.lxisoft.vehicle.Vehicle;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mvd {
 
 long noRc,noInsurance,noLicense;

 List <Vehicle> vehicleFine = new ArrayList<Vehicle>();

 public long getNoRC()  {
 
 return noRc;
 }
 public void setNoRc( long noRc)  {
 
  this.noRc = noRc;
 }
 
 public long getNoInsurance()  {
 
  return noInsurance;
  }
  public void setNoInsurance( long noInsurance)  {
  
   this.noInsurance = noInsurance;
  }
 
  public long getNoLisence()  {
 
   return noLicense;
   }
   public void setNoLicense( long noLicense)  {
   
    this.noLicense = noLicense;
   }
 
 public void vehicleDetails() throws Exception  {


  try {

   Scanner scr = new Scanner (new FileReader("resources/VehicleDetails.csv"));
   
   
   while(scr.hasNext()) {
   String line = scr.nextLine();
String [] values = line.split(",");


Constructor <?> cos = Class.forName("com/lxisoft/vehicle/" + values[0]).getConstructor(String.class,String.class,String.class);

Object obj = cos.newInstance(values[1],values[2]);


if(values[0]== "TwoWheeler"){

TwoWheeler tw = (TwoWheeler) obj;

vehicleFine.add(tw);
}

if(values[0]== "FourWheeler"){

  FourWheeler fw = (FourWheeler) obj;
  
  vehicleFine.add(fw);
  }

   //vehicleFine.add(new Vehicle(scr.next(),scr.next(),scr.next()));

     } 
   
   } catch (Exception e)  {
   
   System.out.println("Exception");
   
   e.printStackTrace();
   
   }
   


 }

public void calculateFine() {


for(int i = 0; i < vehicleFine.size(); i ++ )
{

System.out.println("Your vehicle is" +vehicleFine.get(i).getVehicleNo() + vehicleFine.get(i).getVehicleType() + vehicleFine.get(i).getCrime());

System.out.println("Your Crime Is " + vehicleFine.get(i).getCrime());


if(vehicleFine.get(i).getCrime() =="NoRC");


}

 
 }

}
