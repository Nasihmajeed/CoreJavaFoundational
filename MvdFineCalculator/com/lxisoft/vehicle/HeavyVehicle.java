package com.lxisoft.vehicle;

public class HeavyVehicle extends Vehicle {

 public HeavyVehicle(String vehicleNo, String vehicleType, String crime) {
  super(vehicleNo, vehicleType, crime);

 }
 
 public void fineDetails()  {


   NoRC = 25000;
   NoInsurance = 15000;
   NoLicense= 5000;


  System.out.println("Heavy Wheeler Fine Details");
  
  System.out.println("/n");

System.out.println("No Valid RC = 25000");
System.out.println("No Insurance = 15000");
System.out.println("No License = 5000");

System.out.println("/n");

  
   }


}
