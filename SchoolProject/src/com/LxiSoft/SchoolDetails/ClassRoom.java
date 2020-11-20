package com.LxiSoft.SchoolDetails;
import java.util.*;
public class ClassRoom{
	String division;
	int standard;
	int numOfStudents;
	//Scanner s = new Scanner(System.in);
	Teacher t; // = new Teacher();
	Student[] student; //= new Student();
	//ClassRoom[] c;

	public void getClassDetails(){
		Scanner s = new Scanner(System.in);
		t = new Teacher();
		//c = new ClassRoom[n];
		//t = new Teacher[n];
		//student = new Student[n];
		//for(int i=0; i<n; i++){
	   // System.out.println("Enter the "+(i+1)+" Class details");
		    //c[i] = new ClassRoom();
			//t[i] = new Teacher();
		//student[i] = new Student();
		System.out.println("Enter the standard ");
		this.standard = s.nextInt();
		s.nextLine();
		System.out.println("Enter the division ");
		this.division = s.nextLine();
		t.getTeacherDetails();
		System.out.println("Enter the number of students in the class ");
		numOfStudents = s.nextInt();
		s.nextLine();
		student = new Student[numOfStudents];
		for(int i=0; i<numOfStudents; i++){    
			student[i] = new Student();
		    student[i].getStudentDetails();
		}
	}
	public void printClassDetails(){
		//for(int i=0; i<n; i++){
		
		System.out.println("Standard          \t: "+this.standard);
		System.out.println("Division          \t: "+this.division);
		System.out.println("Number of Students\t: "+this.numOfStudents);
	    t.printTeacherDetails();
	    System.out.println("\t---->Student Details<----\t");
	    for(int i=0; i<numOfStudents; i++){
		    student[i].printStudentDetails();
		}
	}
}
