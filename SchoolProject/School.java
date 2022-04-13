public class School {

private String name;
private String address;
private String phoneNo;
ClassRoom [] cr = new ClassRoom[4];


School (String name,String address,String phoneNo)  {
	
	this.name = name;
	this.address = address;
	this.phoneNo = phoneNo;
}

public String getName()  {
  return name;
}
public void setName(String newName)  {
  this.name = newName;
}


public String getAddress()  {
  return address;
}
public void setAddress(String newAddress)  {
  this.address = newAddress;
}


public String getPhoneNo()  {
  return phoneNo;
}
public void setPhoneNo(String newPhoneNo)  {
  this.phoneNo = newPhoneNo;
}


public void printDetails()  {

System.out.println("School Name :" + this.name);
System.out.println("School Address :" + this.address);
System.out.println("School  Number :" + this.phoneNo);
System.out.println("\n");


for(int x = 1;x < 4; x++)  {
	
cr[x].printDetails();

}
}
}