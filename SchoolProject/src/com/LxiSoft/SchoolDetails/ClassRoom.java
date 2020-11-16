package com.LxiSoft.SchoolDetails;
import java.util.*;
public class ClassRoom{
	String division;
	int standard;
	Scanner s = new Scanner(System.in);
	Teacher teacher = new Teacher();
	Student student = new Student();
	ClassRoom[] c;
	public void classDetails(int n){
		c = new ClassRoom[n];
		for(int i=0; i<n; i++){
			System.out.println("Enter the "+(i+1)+" Class details");
			c[i] = new ClassRoom();
			System.out.println("Enter the standard ");
		    c[i].standard = s.nextInt();
		    s.nextLine();
		    System.out.println("Enter the division ");
		    c[i].division = s.nextLine();
		    teacher.teacherDetails(i,n);
		    student.studentDetails();
		}
	}
	public void printClass(int n){
		for(int i=0; i<n; i++){
			System.out.println("Standard\t: "+c[i].standard);
			System.out.println("Division\t: "+c[i].division);
			teacher.printTeacher(n,i);
			student.printStudent();
		}
	}
}
