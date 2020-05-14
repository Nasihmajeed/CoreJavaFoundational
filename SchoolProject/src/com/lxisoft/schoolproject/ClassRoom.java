package com.lxisoft.schoolproject;

import java.util.Scanner;

public class ClassRoom
{
	Student[] students;
	Teacher teacher;
	String classNo;
	int studentslength;
	


	Scanner myObj=new Scanner(System.in);
	

	public void classRoomDetalis()
	{

		

		System.out.println("Enter count of students");
		int studentscount=Integer.parseInt(myObj.nextLine());

		students=new Student[studentscount];
		
		
		

		for(int i=0;i<students.length;i++)
		{
			students[i]=new Student();
		}


		teacher=new Teacher();
		
		System.out.println("Enter classno");
		classNo=myObj.nextLine();
		

		teacher.teacherDeatails();
		
		for(int i=0;i<students.length;i++)
		{
			students[i].studentDetails();
		}


		for(int i=0;i<students.length;i++)
		{
			students[i].printTotalMarks();
		}
		
		
	}

	public void printClassnumber()
	{
		System.out.println(".............................");
		System.out.println(".............................");
		System.out.println("The class number is"+classNo);



		for(int i=0;i<students.length;i++)
		{

			students[i].printStudentDetails();
			students[i].printPercentage();
			students[i].printResultOfStudents();
		}

		

			
		}


		public void printRankDetails()
	{
		System.out.println("THE RANKLIST");
		System.out.println("###############");
		System.out.println("student length"+students.length);
			for(int i=0;i<students.length;i++)
			{
				
				for(int j=i+1;j<students.length;j++)
				{

					System.out.println("i ="+i);
					System.out.println("j ="+j);
					

					if(students[i].total<students[j].total)
					{
							Student temp=students[i];
							students[i]=students[j];
							students[j]=temp;
					}
				}


			}

			for(int i=0;i<students.length;i++)
			{
				System.out.println(students[i].name + " :"+students[i].total);

			}
	}


		public void setNewStudentNo()
		{
			for(int i=0;i<students.length;i++)
			{
				int studentslength=students.length;
				System.out.println("NO OF STUDENTS ARE"+studentslength);
			}
		}




	

	
}