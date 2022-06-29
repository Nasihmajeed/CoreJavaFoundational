package com.lxisoft.classroom;

public class ClassRoom {
 
private String standard ;

private String division;    
 
private Teacher tchr;

private Student [] student2 = new Student[5];
    

  public ClassRoom(String standard, String division) {

        this.standard = standard;

        this.division = division;
}

public Student[] getStudent2() {
   return student2;
}
public void setStudent2(Student[] student2) {
this.student2 = student2;
}
public String getStandard() {
 return standard;

}

public void setStandard(String standard) {
 this.standard = standard;

}

public String getDivision() {
 return division;

}

public void setDivision(String division) {
 this.division = division;

}

public Teacher getTchr() {
 return tchr;

}

public void setTchr(Teacher tchr) {
 this.tchr = tchr;

}

public void printClassRoomDetails() {


System.out.println("ClassRoom Standard : "+ standard);

System.out.println("ClassRoom Division : "+ division);

System.out.println("\n .....CLASS TEACHER....\n");


tchr.printdetails();

System.out.println("\n.....STUDENTS.....\n");

for(int i = 1; i < 5;i++) {



student2[i].printStudentDetails();
}




} 

}
