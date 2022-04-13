public class Students  {

private String name;
private String age;
private String rollNo;
private String mark;
 
Students (String name,String age,String rollNo,String mark)  {
	
	this.name = name;
	this.age = age;
	this.rollNo = rollNo;
	this.mark = mark;
	
}


public String getName()  {
  return name;
}
public void setName(String newName)  {
  this.name = newName;
}


public String getAge()  {
  return age;
}
public void setAge(String newAge)  {
  this.age = newAge;
}


public String getRollNo()  {
  return rollNo;
}
public void setRollNo(String newRollNo)  {
  this.rollNo = newRollNo;
}


public String getMark()  {
  return mark;
}
public void setMark(String newMark)  {
  this.mark = newMark;
}


public void printDetails ()  {
	
System.out.println("Name :" + this.name);	
System.out.println("Age :" + this.age);
System.out.println("RollNo :" + this.rollNo);
System.out.println("Mark :" + this.mark);
System.out.println("\n");
System.out.println("_________________________");	
	
	
}


}