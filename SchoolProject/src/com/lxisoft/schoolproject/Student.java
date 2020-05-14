package com.lxisoft.schoolproject;

import java.util.Scanner;
public class Student
{
	String name;
	String regNo;
	
	Integer total;
	double percentage;


	Subject[] subjects;
	

	public void studentDetails()
	{
		Scanner mystud=new Scanner(System.in);
		System.out.println("Enter Subjectcount");
		int subjectscount=Integer.parseInt(mystud.nextLine());

		subjects=new Subject[subjectscount];

		
		System.out.println("Enter student name");
		name=mystud.nextLine();
		
		
		System.out.println("Enter register number ");
		regNo=mystud.nextLine();

		for(int i=0;i<subjects.length;i++)
		{
			subjects[i]=new Subject();
		}


		for(int i=0;i<subjects.length;i++)
		{
			subjects[i].subjectDetails();
		}

	}

	
	public void printStudentDetails()
	{
		System.out.println("The student name is"+name);

		System.out.println("The register number is"+regNo);


		for(int i=0;i<subjects.length;i++)
		{
			subjects[i].printSubjectDetails();
		}

	}

	public void  printTotalMarks()
	{
		System.out.println("***************");

		total=0;
		percentage=0.0;
		for(int i=0;i<subjects.length;i++)
		{

		
		total=total+subjects[i].mark;
		percentage=((total/(subjects.length*100.0)*100.0));

		}

	}

	public void printPercentage()
		{
			System.out.println("The total marks "+total);
		System.out.println("The percentage is"+percentage);
		}
		

	public void printResultOfStudents()
	{
		System.out.println("RESULTS");
		
			for(int i=0;i<subjects.length;i++)
			{
				if(subjects[i].mark>45)
				{
					System.out.println("Passed in "+subjects[i].subjectName);
				}
				else
				{
					System.out.println("Failed in"+subjects[i].subjectName);	
				}
			}
		}


	}

	



