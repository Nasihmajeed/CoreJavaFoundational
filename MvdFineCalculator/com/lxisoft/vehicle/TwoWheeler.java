package com.lxisoft.vehicle;

public class TwoWheeler extends Vehicle {

 public TwoWheeler(String vehicle, String vehicleType, String crime) {
  super(vehicle, vehicleType, crime);

 }

 public void fineDetails()  {

  NoRC = 10000;
NoInsurance = 2000;
NoLicense = 1500;


System.out.println("Two Wheeler Fine Details");

System.out.println("/n");

System.out.println("No Valid RC = 10000");
System.out.println("No Insurance = 2000");
System.out.println("No License = 1500");

System.out.println("/n");

 }


}
