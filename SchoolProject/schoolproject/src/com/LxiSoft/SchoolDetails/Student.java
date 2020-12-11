package com.LxiSoft.SchoolDetails;
import java.util.*;

public class Student
{
	String name;
	int roll;
	Subject[] subject;
	int totalMark=0;
	
	public void addStudentDetails(int i)
	{
		Scanner s = new Scanner(System.in);

	    System.out.println(">----------------------------<");
			System.out.println(">---Enter  Student Details---<");
			
			System.out.println("Name    : ");
				this.name = s.next();
			System.out.println("Roll No.: ");
				this.roll = s.nextInt();  

		subject = new Subject[3];

		System.out.println(">----------------------------<");
		System.out.println(">---Enter the Mark Details---<");
		
		for( i=0; i<3; i++)
		{
		    subject[i] = new Subject();
		    subject[i].addMarkDetails();
		}
	}
	public void printStudentDetails()
	{
		int i;
		
		System.out.println("Name       \t: "+/*student[i]*/this.name);
		System.out.println("Roll Number\t: "+/*student[i]*/this.roll);

		// System.out.println(">----------------------------<");
		   System.out.println(">-      -Mark Details-      -<");

		for(i=0; i<3; i++)
		{
			subject[i].printMarkDetails();
			
		}
		for (i=0; i<3; i++)
		{
		    totalMark = totalMark+subject[i].mark;		    	
		}
		
		
	}

	
}