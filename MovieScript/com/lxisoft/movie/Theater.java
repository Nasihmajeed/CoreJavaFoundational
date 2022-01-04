package com.lxisoft.movie;

public class Theater  {

private String name;
private String location;
private String phoneNo;
public Movie movie1;

public Theater (String name,String location,String phoneNo)  {
	
	this.name = name;
	this.location = location;
	this.phoneNo = phoneNo;
	
}


public String getName()  {
	return name;
}
public void setName(String newName)  {
	this.name = newName;
}


public String getLocation()  {
	return location;
}
public void setLocation(String newLocation)  {
	this.location = newLocation;
}


public String getPhoneNo()  {
	return phoneNo;
}
public void setPhoneNo(String newPhoneNo)  {
	this.phoneNo = newPhoneNo;
}



public void theaterDetails()   {
	
System.out.println("\n");
System.out.println("\t\t\t\t\t\t\tTHEATER");	
System.out.println("\t\t\t\t\t\t---------------------");	
System.out.println("\t\tName :" + this.name);	
System.out.println("\t\tLocation :" + this.location);
System.out.println("\t\tPhone No :" + this.phoneNo);
System.out.println("\n");

movie1.movieDetails();
movie1.printDetails();
	
}


}