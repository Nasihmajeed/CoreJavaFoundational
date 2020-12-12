package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Teacher{
	String teacherName;
	String subject;
	String isIncharge;

	public void getTeacherDetails(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of teacher ");
		this.teacherName = s.nextLine();
		System.out.println("Enter the subject taken by the teacher ");
		this.subject = s.nextLine();
		System.out.println("Is this the class incharge ");
		this.isIncharge = s.nextLine();
	}
	
	public void printTeacherDetails(){
		System.out.println("\t---->Teacher Details<----\t");
		System.out.println("Name    \t: "+this.teacherName);
		System.out.println("Subject \t: "+this.subject);
	    System.out.println("Incharge\t: "+this.isIncharge);
	}	
}
