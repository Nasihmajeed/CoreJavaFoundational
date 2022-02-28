package tst;

public class Student 
{
 private String name;
 private String subject;
 private int rollno;
 private int mark;
public Student(String name, String subject, int rollno, int mark) {
	super();
	this.name = name;
	this.subject = subject;
	this.rollno = rollno;
	this.mark = mark;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
public void printinfoStudent()
{
	System.out.println(getName()+  " subject is " +getSubject()+ " roll no is " +getRollno()+ " mark is " +getMark());
}

}
