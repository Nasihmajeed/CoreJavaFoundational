public class Theater  {

private String name;
private String location;
private String phoneNo;

private Movie mv;

Theater (String name,String location,String phoneNo)  {
	
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


public Movie getMv()  {
	return mv;
}
public void setMv(Movie newMv)  {
	this.mv = newMv;
}



public void printDetails()   {
	
System.out.println(" THEATER");	
System.out.println("----------");	
System.out.println("Name :" + this.name);	
System.out.println("Location :" + this.location);
System.out.println("Phone No :" + this.phoneNo);
System.out.println("\n");

mv.details();
mv.printDetails();
	
}


}