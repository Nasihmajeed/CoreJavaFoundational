package com.lxisoft.test;
import com.lxisoft.school.School;
import com.lxisoft.classroom.ClassRoom;
import com.lxisoft.classroom.Teacher;
import com.lxisoft.classroom.Student;

public class Tdd {

public static void main(String[] args) {


School school1= new School ("GHSS Pathiripala","Ottapalam");

ClassRoom [] classrooms = new ClassRoom[3];

Student [] students = new Student[5];

for(int j =1; j < 3; j++) {


ClassRoom classroom = new ClassRoom ("Standard" + j , "Division" + j );

classrooms[j] = classroom;

school1.setClassroom(classrooms);

Teacher teacher = new Teacher ("Teacher" + j , "Subject" + j);

classroom.setTeacher(teacher);


for(int k = 1; k < 5; k++) {


Student student3 = new Student("Name" + k, "Subject" + k, "Mark" + k, "RollNumber" + k);

students[k] = student3;

classroom.setStudent(students);

}

}

school1.printdetails();

}

}