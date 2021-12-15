public class Teacher  {

private String name;
private String subject;
private String phoneNo;

Students [] st = new Students[4];

Teacher(String name,String subject,String phoneNo)  {
	
	this.name = name;
	this.subject = subject;
	this.phoneNo = phoneNo;
}


public String getName()  {
  return name;
}
public void setName(String newName)  {
  this.name = newName;
}

public String getSubject()  {
  return subject;
}
public void setSubject(String newSubject)  {
  this.subject = newSubject;
}

public String getPhoneNo()  {
  return phoneNo;
}
public void setPhoneNo(String newPhoneNo)  {
  this.phoneNo = newPhoneNo;
}




public void printDetails()   {
    System.out.println(" TEACHER DETAILS");
    System.out.println("..................");	 
	System.out.println("Name :" + this.name);
	System.out.println("Subject :" + this.subject);
	System.out.println("Phone Number :" + this.phoneNo);
	System.out.println("____________________");
	
	for(int x = 1; x < 4; x++)  {
		
	st[x].printDetails();
}
}


}