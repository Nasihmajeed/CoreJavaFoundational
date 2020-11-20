package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Student{
	String name;
	int rollNum;
	//Scanner s = new Scanner(System.in);
	//Student[] student; //=  new Student; 
	void getStudentDetails(){
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the  student details ");
		System.out.println("Enter the name of the student ");
		this.name = s.nextLine();
		System.out.println("Enter the roll number of the student ");
		this.rollNum = s.nextInt();
		s.nextLine();
		
	}
	void printStudentDetails(){
		
		System.out.println("Name       \t: "+/*student[i]*/this.name);
		System.out.println("Roll Number\t: "+/*student[i]*/this.rollNum);
		
	}
	
}
