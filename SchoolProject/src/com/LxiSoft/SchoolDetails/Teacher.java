package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Teacher{
	String teacherName;
	String subject;
	String isIncharge;
	Scanner s = new Scanner(System.in);
	Teacher[] t;
	public void teacherDetails(int i,int n){
		t = new Teacher[n];
		for(int j=i; j<=i; j++){
			t[j] = new Teacher();
			System.out.println("Enter the name of teacher ");
		    t[j].teacherName = s.nextLine();
		    System.out.println("Enter the subject taken by the teacher ");
		    t[j].subject = s.nextLine();
		    System.out.println("Is the this teacher the class incharge ");
		    t[j].isIncharge = s.nextLine();
		}
		
	}
	public void printTeacher(int n,int i){
		for(int j=i; j<=n; j++){
			System.out.println("\t---->Teacher Details<----\t");
		    System.out.println("Name    \t: "+t[j].teacherName);
		    System.out.println("Subject \t: "+t[j].subject);
		    System.out.println("Incharge\t: "+t[j].isIncharge);
		}
	}
}
