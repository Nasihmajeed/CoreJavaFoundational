package tst;

public class Teacher 
{
 private String name;
 private String mainsubject;
public Teacher(String name, String mainsubject) {
	super();
	this.name = name;
	this.mainsubject = mainsubject;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMainsubject() {
	return mainsubject;
}
public void setMainsubject(String mainsubject) {
	this.mainsubject = mainsubject;
}
public void printinfoTeacher()
{
	System.out.println(" your teacher name is " +getName()+  " subject is " +getMainsubject());
}
}
