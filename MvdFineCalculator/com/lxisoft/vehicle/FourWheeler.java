package com.lxisoft.vehicle;

public class FourWheeler extends Vehicle{

 public FourWheeler(String vehicleNo, String vehicleType, String crime) {
  super(vehicleNo, vehicleType, crime);

 }
 
 public void fineDetails()  {


   NoRC= 15000;
   NoInsurance = 5000;
   NoLicense = 2500;

  System.out.println("Four Wheeler Fine Details");
  
  System.out.println("/n");

System.out.println("No Valid RC = 15000");
System.out.println("No Insurance = 5000");
System.out.println("No License = 2500");

System.out.println("/n");
  
  
  
   }

 
}
