package com.lxisoft.classroom;
public class Student {

 private String name ;

 private String subject; 

 private String mark;

 private String rollnumber;   

  
    
     public Student(String name, String subject, String mark, String rollnumber) {
        this.name= name;
        this.subject = subject;
        this.mark = mark;
        this.rollnumber = rollnumber;
}

public String getName() {
 return name;

}

public void setName(String newName) {
 this.name = newName;

}

public String getSubject() {
 return subject;

}

public void setSubject(String newSubject) {
 this.subject = newSubject;

}

public String getMark() {
 return mark;

}

public void setMark(String newMark) {
 this.mark = newMark;

}

public String getRollNumber() {
 return rollnumber;

}

public void setRollNumber(String newRollNumber) {
 this.rollnumber = newRollNumber;

}


public void printStudentDetails() {

System.out.println("Student Name : "+this.name);
System.out.println("Student Subject : "+this.subject);
System.out.println("Student Mark : "+this.mark);
System.out.println("Student RollNumber : "+this.rollnumber);
System.out.println("\n");

}

}