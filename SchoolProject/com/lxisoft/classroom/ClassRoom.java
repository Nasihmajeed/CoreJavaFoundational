package com.lxisoft.classroom;

public class ClassRoom {
 
private String standard ;

private String division;    
 
private Teacher tchr;

public Student [] student2 = new Student[5];
    

   public ClassRoom(String standard, String division) {

        this.standard = standard;

        this.division = division;
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


System.out.println("ClassRoom Standard:"+ standard);

System.out.println("ClassRoom Division :"+ division);

System.out.println("\n");


tchr.printdetails();

for(int x = 1; x < 5;x++) {

student2[x].printStudentDetails();

} 

}

}