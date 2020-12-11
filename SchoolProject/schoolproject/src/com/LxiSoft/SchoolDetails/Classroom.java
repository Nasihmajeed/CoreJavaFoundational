package com.LxiSoft.SchoolDetails;
import java.util.*;

public class Classroom
{
	int standard;
	String division;
	int num;

	Teacher teacher;
	Student[] student;
	Student[] temp;
	Student[] rank;

	// int[] total;
	int count = 0;


	public void addClassDetails()
	{
		Scanner s = new Scanner(System.in);

		teacher = new Teacher();
		
		System.out.println("Standard : ");
		this.standard = s.nextInt();
		System.out.println("Division : ");
		this.division = s.next();
		
		System.out.println("\nEnter the number of Students");
		num = s.nextInt();

		student = new Student[num];
		temp = new Student[num];
		for( int i=0; i<num; i++)
		{    
			student[i] = new Student();
			temp[i] = new Student();
		    student[i].addStudentDetails(i);
		}

		
		teacher.addTeacherDetails();
		System.out.println(">----------------------------<");
	}

	public void printClassDetails(int i)
	{

		// String temp1;
		// int temp2;
		// int temp3;

		System.out.println("Standard : " + this.standard);
        System.out.println("Division : " + this.division);
	
	    teacher.printTeacherDetails();
	 
	    // total = new int[20];
		for(int j=0; j<num; j++)
		{
			System.out.println(">------Student  Details------<");
		    student[j].printStudentDetails();   
		}
	}

	public void classRankList()
	{
		for(int x=0; x<num; x++)
		{
			for(int y=x+1; y<num; y++)
			{
				if(student[x].totalMark<student[y].totalMark)
				{
					temp[x] = student[x];
					student[x] = student[y];
					student[y] = temp[x];
				}
			}
		}

		System.out.println(">----------------------------<");
		System.out.println(">------Class  Rank List------<");
		for(int z=0; z<num; z++)
		{	
			System.out.println("Name		:"+student[z].name);
			System.out.println("Roll No.	:"+student[z].roll);
			System.out.println("Total Mark	:"+student[z].totalMark);
			System.out.println(">----------------------------<");
			// System.out.println("\n\n");
			
		}
	}
}
