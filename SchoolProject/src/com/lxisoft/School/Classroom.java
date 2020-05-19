package com.LxiSoft.School;
import java.util.Scanner;
public class ClassRoom
{
	Scanner s=new Scanner(System.in);
   int n,i,Std;
        Teacher ts=new Teacher();
        public void setTeacher()
        {
        	System.out.println("Enter faculty name: ");
        	String tname=s.nextLine();
        	h.settname(tname);
        	String tname=h.gettname();
        }
	Student[] std=new Student[10];
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
        h.setname(name);
		System.out.println("enter roll no: ");
		String rNo=s.nextLine();
        h.setrNo(rNo);
		System.out.println("enter  mark for subject 1: ");
		std[i].t1=s.nextInt();
		s.nextLine();
		System.out.println("enter  mark for subject 2: ");
		std[i].t2=s.nextInt();
		s.nextLine();
		System.out.println("enter  mark for subject 3: ");
		std[i].t3=s.nextInt();
		s.nextLine();
		System.out.println("enter  mark for subject 4: ");
		std[i].t4=s.nextInt();
		s.nextLine();
		System.out.println("enter mark for subject 5: ");
		std[i].t5=s.nextInt();
		s.nextLine();
		std[i].total=std[i].t1+std[i].t2+std[i].t3+std[i].t4+std[i].t5;
		std[i].percentage=((float)std[i].total/500)*100;
		System.out.println("enter parent's contact number: ");
		std[i].parentNo=s.nextInt();
		s.nextLine();
		}
	}
	    public void printStudents()
	    { 
		for (int i=1; i<=n; i++)
		{
		System.out.println("\n student " +i+ " details are: ");
	    String name=h.getname();
		String rNo=h.getrNo();
		System.out.println("total marks= "+std[i].total);
		System.out.println("Percentage= "+std[i].percentage);
		System.out.println("The student Grade is: ");
		System.out.println("\n Parent's contact number= "+std[i].parentNo);
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
	}
}
}



