package com.lxisoft.classroom;
public class Teacher {

private String name ;
private String subject;    

  
    

   public Teacher(String name, String subject) {

        this.name = name;
        
        this.subject = subject;
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


public void printdetails() {

System.out.println("Teacher Name : "+this.name);

System.out.println("Teacher Subject : "+this.subject);

System.out.println("\n");
 

}

}