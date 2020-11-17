package com.LxiSoft.SchoolDetails;
import java.util.*;
public class ClassRoom{
	String division;
	int standard;
	Scanner s = new Scanner(System.in);
	Teacher[] t; // = new Teacher();
	Student student = new Student();
	ClassRoom[] c;
	public void classDetails(int n){
		c = new ClassRoom[n];
		t = new Teacher[n];
		for(int i=0; i<n; i++){
			System.out.println("Enter the "+(i+1)+" Class details");
			c[i] = new ClassRoom();
			t[i] = new Teacher();
			System.out.println("Enter the standard ");
		    c[i].standard = s.nextInt();
		    s.nextLine();
		    System.out.println("Enter the division ");
		    c[i].division = s.nextLine();
		    System.out.println("Enter the name of teacher ");
		    t[i].teacherName = s.nextLine();
		    System.out.println("Enter the subject taken by the teacher ");
		    t[i].subject = s.nextLine();
		    System.out.println("Is the this teacher the class incharge ");
		    t[i].isIncharge = s.nextLine();
		    //teacher.teacherDetails(i,n);
		    student.studentDetails();
		}
	}
	public void printClass(int n){
		for(int i=0; i<n; i++){
			System.out.println("\t---->Class "+(i+1)+" Details<----\t");
			System.out.println("Standard\t: "+c[i].standard);
			System.out.println("Division\t: "+c[i].division);
			System.out.println("\t---->Teacher Details<----\t");
		    System.out.println("Name    \t: "+t[i].teacherName);
		    System.out.println("Subject \t: "+t[i].subject);
		    System.out.println("Incharge\t: "+t[i].isIncharge);
			//teacher.printTeacher(i);
			student.printStudent();
		}
	}
}
