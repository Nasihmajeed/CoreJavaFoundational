package com.Lxisoft.School;
import java.util.Scanner;
public class ClassRoom
{
	Scanner s=new Scanner(System.in);
   int n,i,Std;
        Teacher ts=new Teacher();
        public void setTeacher()
        {
        	System.out.println("Enter  name: ");
        	String tname=s.nextLine();
        	Teacher.settname(tname);
        	String tname=h.gettname();
        }
	Student[] std=new Student[10];
	public Void setStudent()
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
        s.nextLine();

		System.out.println("Enter Class:");
		int clss=s.nextInt();
        h.setclss(clss);
        s.nextLine();

        System.out.println("Enter Division: ");
		String div=s.nextInt();
        h.setdiv(div);
        s.nextLine();

		System.out.println("enter roll no: ");
		int rNo=s.nextInt();
        h.setrNo(rNo);
        s.nextLine();

		System.out.println("Enter the mark for English: ");
	    int t1=s.nextInt();
        h.sett1(t1);
		s.nextLine();

		System.out.println("Enter the mark for malayalam: ");
		int t2=s.nextInt();
        h.sett2(t2);
		s.nextLine();

		System.out.println("Enter the mark for Maths: ");
		int t3=s.nextInt();
        h.sett3(t3);
		s.nextLine();

		System.out.println("Enter the mark for Science: ");
		int t4=s.nextInt();
        h.sett4(t4);
		s.nextLine();

		System.out.println("Enter the mark for Social Science: ");
		int t5=s.nextInt();
        h.sett5(t5);
		s.nextLine();

		std[i].total=t1+t2+t3+t4+t5;

		std[i].percentage=((float)std[i].total/500)*100;

		System.out.println("Enter parent's contact number: ");
		Int parentNo=s.nextInt();
        h.setparentNo(parentNo);
		s.nextLine();
		}
	}
	    public void printStudents()
	    { 
		for (int i=1; i<=n; i++)
		{
		System.out.println("\n student " +i+ " details are: ");
	    String name=h.getname();
		Int rNo=h.getrNo();
		System.out.println("total marks= "+std[i].total);
		System.out.println("Percentage= "+std[i].percentage);
		System.out.println("The student Grade is: ");
		Int parentNo=h.getparentNo();
		
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



