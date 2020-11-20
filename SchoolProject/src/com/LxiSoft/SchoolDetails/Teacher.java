package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Teacher{
	String teacherName;
	String subject;
	String isIncharge;
	//Scanner s = new Scanner(System.in);
	public void getTeacherDetails(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of teacher ");
		teacherName = s.nextLine();
		System.out.println("Enter the subject taken by the teacher ");
		subject = s.nextLine();
		System.out.println("Is the this teacher the class incharge ");
		isIncharge = s.nextLine();
	}
	public void printTeacherDetails(){
		System.out.println("\t---->Teacher Details<----\t");
		System.out.println("Name    \t: "+teacherName);
		System.out.println("Subject \t: "+subject);
	    System.out.println("Incharge\t: "+isIncharge);
	}
	
}
