package com.lxisoft.test;
import com.lxisoft.school.School;
import com.lxisoft.classroom.ClassRoom;
import com.lxisoft.classroom.Teacher;
import com.lxisoft.classroom.Student;

public class Tdd {

public static void main(String[] args) {


School school1= new School ("GHSS Pathiripala","Ottapalam");

ClassRoom [] clsroom = new ClassRoom[3];
Student [] std = new Student[5];

for(int j =1; j < 3; j++) {


ClassRoom classroom = new ClassRoom ("Standard" + j , "Division" + j );
clsroom[j] = classroom;
school1.setClass1(clsroom);

Teacher teacher1 = new Teacher ("Teacher" + j , "Subject" + j);

classroom.setTchr(teacher1);


for(int k = 1; k < 5; k++) {


Student student3 = new Student("Name" + k, "Subject" + k, "Mark" + k, "RollNumber" + k);
std[k] = student3;
classroom.setStudent2(std);

}

}

school1.printdetails();


}

}