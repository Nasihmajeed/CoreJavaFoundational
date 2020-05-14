package com.lxisoft.School;
import java.util.Scanner;
public class Classroom
{
	Scanner s=new Scanner(System.in);

        teacher tr=new teacher();
        public void setTeacher()
        {
        	System.out.println("Enter Teacher name: ");
        	String tname=s.nextLine();
        	System.out.println("Teacher is : "+tname);
        }
        
	int n,i,total=0,Std;
	student[] student=new student[10];
	public void setStudent()
	{
	System.out.println (" \n Enter number of students ");
	n=s.nextInt();
    s.nextLine();
    
    for (int i=1; i<=n; i++)
     {
     	student[i]=new student();
        System.out.println("\n enter student " +i+  " details");
        System.out.println("\n enter name of the student: ");
		student[i].name=s.nextLine();
		System.out.println("Enter Class: ");
		student[i].clss=s.nextInt();	
		s.nextLine();
		System.out.println("Enter Division: ");
		student[i].div=s.nextLine();	
		s.nextLine();
		System.out.println("Enter Roll Number: ");
		student[i].rNo=s.nextInt();	
		s.nextLine();
		System.out.println("Enter parent's contact number: ");
		student[i].parentNo=s.nextInt();
		s.nextLine();
		System.out.println("Enter Admission Number: ");
		student[i].admno=s.nextInt();
		s.nextLine();
		System.out.println("Enter the mark for English: ");
		student[i].t1=s.nextInt();
		s.nextLine();
		System.out.println("Enter the mark for Malayalam: ");
		student[i].t2=s.nextInt();
		s.nextLine();
		System.out.println("Enter the mark for Maths: ");
		student[i].t3=s.nextInt();
		s.nextLine();
		System.out.println("Enter the mark for Science: ");
		student[i].t4=s.nextInt();
		s.nextLine();
		System.out.println("Enter the mark for Social Science: ");
		student[i].t5=s.nextInt();
		s.nextLine();
		student[i].total=student[i].t1+student[i].t2+student[i].t3+student[i].t4+student[i].t5;
		s.nextLine();
		student[i].percentage=(student[i].total*100)/500;
		}
	}
	    public void printStudents()
	    { 
		for (int i=1; i<=n; i++)
		{
			System.out.println("\n student " +i+ " details are: ");
			System.out.println(" \n name : "+student[i].name);
			System.out.println("Class: "+student[i].clss);
			System.out.println("Division: "+student[i].div);
			System.out.println("Roll no: "+student[i].rNo);
			System.out.println("Admission Number= "+student[i].admno);
			System.out.println("Parent's contact number= "+student[i].parentNo);
			System.out.println("total marks= "+student[i].total);
			System.out.println("total Percentage= "+student[i].percentage);
	  		System.out.println("The student Grade is: ");
			if(student[i].percentage>=80)
        	{
            	System.out.print("A");
        	}
        	else if(student[i].percentage>=60 && student[i].percentage<80)
        	{
           		System.out.print("B");
        	} 
        	else if(student[i].percentage>=40 && student[i].percentage<60)
        	{
            	System.out.print("C");
        	}
        	else
        	{
            	System.out.print("Failed");
        	}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("N.B: A>=80% , B>=60-79%  , C>=40-59% , Failed<40%");
		}

	}
	

}