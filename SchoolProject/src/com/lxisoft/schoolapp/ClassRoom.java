package com.lxisoft.schoolapp;
import java.util.Scanner;
public class ClassRoom
{
	Scanner s=new Scanner(System.in);
   int n,i,Std;
        Teacher ts=new Teacher();
        Student[] std=new Student[10];
        public void setTeacher()
        {
        	System.out.println("Enter faculty name: ");
        	String tname=s.nextLine();
        	ts.settname(tname);
        	System.out.println("Faculty is : "+ts.gettname());

        }
	
	public void setStudent()
	{
	System.out.println (" \n Enter number of students ");
	n=s.nextInt();
    s.nextLine();
    
    for (int i=1; i<=n; i++)
     {
     	std[i]=new Student();
        System.out.println("\n enter student " +i+  " details");

        System.out.println("\n enter name of the student: ");
		String name=s.nextLine();
        std[i].setName(name);
        
		System.out.println("Enter Class:");
		int clss=s.nextInt();
        std[i].setclss(clss);
        s.nextLine();

        System.out.println("Enter Division: ");
		String div=s.nextLine();
        std[i].setdiv(div);
        s.nextLine();

		System.out.println("Enter Roll no: ");
		int rNo=s.nextInt();
        std[i].setrNo(rNo);
        s.nextLine();

		System.out.println("Enter the mark for English: ");
	    int t1=s.nextInt();
      	std[i].sett1(t1);
		s.nextLine();

		System.out.println("Enter the mark for malayalam: ");
		int t2=s.nextInt();
        std[i].sett2(t2);
		s.nextLine();

		System.out.println("Enter the mark for Maths: ");
		int t3=s.nextInt();
        std[i].sett3(t3);
		s.nextLine();

		System.out.println("Enter the mark for Science: ");
		int t4=s.nextInt();
       std[i].sett4(t4);
		s.nextLine();

		System.out.println("Enter the mark for Social Science: ");
		int t5=s.nextInt();
        std[i].sett5(t5);
		s.nextLine();

		std[i].total=t1+t2+t3+t4+t5;

		std[i].percentage=((float)std[i].total/500)*100;

		System.out.println("enter parent's contact number: ");
		int parentNo=s.nextInt();
        std[i].setparentNo(parentNo);
		s.nextLine();
		}
	}
	    public void printStudents()
	    { 
		for (int i=1; i<=n; i++)
		{
		System.out.println("\n student " +i+ " details are: ");
	    System.out.println("Student name:- "+std[i].getName());
		System.out.println("Roll No."+std[i].getrNo());
		System.out.println("total marks= "+std[i].total);
		System.out.println("Percentage= "+std[i].percentage);
 	    System.out.println("Parent No. is: "+std[i].getparentNo());
		System.out.println("The student Grade is: ");
		
		
	}
}
	public void studentRank()
	{
	for (int i=1; i<=n; i++)
	{
		if(std[i].percentage>=80)
        {
            System.out.println("A");
        }
        else if(std[i].percentage>=60 && std[i].percentage<80)
        {
           System.out.print(" B");
        } 
        else if(std[i].percentage>=40 && std[i].percentage<60)
        {

            System.out.print("C");
        }
        else
        {
            System.out.print(" fail");
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



