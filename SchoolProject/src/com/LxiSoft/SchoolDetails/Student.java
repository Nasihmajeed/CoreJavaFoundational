package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Student{
	String name;
	String rollNum;
	int numOfStudents;
	Scanner s = new Scanner(System.in);
	Student[] student; 
	void studentDetails(){
		System.out.println("Enter the number of students in the class ");
		numOfStudents = s.nextInt();
		s.nextLine();
		student = new Student[numOfStudents];
		

	}
}