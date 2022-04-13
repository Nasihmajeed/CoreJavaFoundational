package com.lxisoft.vehicle;


public class Vehicle  {
 
private String vehicleNo;
private String vehicleType;
private String crime;

 long NoRC;
long NoInsurance;
long NoLicense;

public Vehicle (String vehicleNo,String vehicleType,String crime ) {


this.vehicleType = vehicleType;
this.vehicleNo = vehicleNo;
this.crime = crime;

}

public String getVehicleNo()  {

return vehicleNo;
}
public void setVehicleNo(String vehicleNo)  {

 this.vehicleNo = vehicleNo;
}

public String getVehicleType()  {

 return vehicleType;
 }
 public void setVehicleType(String vehicleType)  {
 
  this.vehicleType = vehicleType;
 }
 
 public String getCrime()  {

  return crime;
  }
  public void setCrime(String crime)  {
  
   this.crime = crime;
  }
  
public void fineDetails()  {


  
}

}

