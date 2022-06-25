package com.lxisoft.test;
import com.lxisoft.school.School;
import com.lxisoft.classroom.ClassRoom;
import com.lxisoft.classroom.Teacher;
import com.lxisoft.classroom.Student;

public class Tdd {

public static void main(String[] args) {


School school1= new School ("GHSS Pathiripala","Ottapalam");

for(int j =1; j < 3; j++) {


ClassRoom class2 = new ClassRoom ("Standard" + j , "Division" + j);
school1.class1[j] = class2; 

Teacher teacher1 = new Teacher ("Teacher" + j, "Subject" + j);

class2.setTchr (teacher1);


for(int k = 1; k < 5; k++) {

Student student3 = new Student("Name" +k, "Subject" + k, "Mark" + k, "RollNumber" + k);

class2.student2[k] = student3;
//class2.student1[k] =student2;

}

}
school1.printdetails();
}

}

