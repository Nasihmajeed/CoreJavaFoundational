package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Student{
	String name;
	int rollNum;
	int numOfStudents;
	Scanner s = new Scanner(System.in);
	Student[] student; 
	void studentDetails(){
		System.out.println("Enter the number of students in the class ");
		numOfStudents = s.nextInt();
		s.nextLine();
		student = new Student[numOfStudents];
		//name = new String[numOfStudents];
		//rollNum = new int[numOfStudents];
		for(int i=0; i<numOfStudents; i++){
			//student = new Student[numOfStudents];
			student[i] = new Student();

			//System.out.println("Enter the "+(i+1)+" student details ");
			System.out.println("Enter the name of "+(i+1)+" student ");
			student[i].name = s.nextLine();
			System.out.println("Enter the roll number "+(i+1)+" of student ");
			student[i].rollNum = s.nextInt();
			s.nextLine();
		}
	}
	void printStudent(){
		for(int i=0; i<numOfStudents; i++){
			//System.out.println("Total Students : "+numOfStudents);
			System.out.println("\t---->"+(i+1)+" Student Details<----\t");
			System.out.println("Name       \t: "+student[i].name);
			System.out.println("Roll Number\t: "+student[i].rollNum);
		}
	}
	
}
