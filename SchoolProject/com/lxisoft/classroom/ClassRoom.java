package com.lxisoft.classroom;

public class ClassRoom {
 
private String standard ;

private String division;    
 
private Teacher teacher;

private Student [] student = new Student[5];
    

  public ClassRoom(String standard, String division) {

        this.standard = standard;

        this.division = division;
}

public Student[] getStudent() {
   return student;
}

public void setStudent(Student[] student) {
this.student = student;

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

public Teacher getTeacher() {
 return teacher;

}

public void setTeacher(Teacher teacher) {
 this.teacher = teacher;

}

public void printClassRoomDetails() {


System.out.println("ClassRoom Standard : "+ standard);

System.out.println("ClassRoom Division : "+ division);

System.out.println("\n .....CLASS TEACHER....\n");


teacher.printdetails();

System.out.println("\n.....STUDENTS.....\n");



for(int i = 1; i < 5;i++) {



student[i].printStudentDetails();
}




} 

}
