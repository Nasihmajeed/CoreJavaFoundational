package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Subject{
	String subject;/* = "Maths";
	String subject2 = "Science";
	String subject3 = "English";*/
	int mark;
	//int total=0;
	//int rank;
	public void getMarks(){
		//for(int i=0; i<3; i++){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  Subject");
		this.subject = s.nextLine();
		System.out.println("Enter the Mark of  Subject");
		this.mark = s.nextInt();
		s.nextLine();
		//}
	}
	
	public void printMarks(){
		//int total = 0;
		//for(int i=0; i<3; i++){
		System.out.println("Subject \t: "+this.subject);
		System.out.println("Mark    \t: "+this.mark);
		//total = total+this.mark;
		//}
		//System.out.println("Total   \t: "+total);
	}
}
	










































/*
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mark in "+subject1);
		mark1 = s.nextInt();
		s.nextLine();
		System.out.println("Enter the mark in "+subject2);
		mark2 = s.nextInt();
		s.nextLine();
		System.out.println("Enter the mark in "+subject3);
		mark3 = s.nextInt();
		s.nextLine();
		total = mark1+mark2+mark3;
	}
	public void printMarks(){
		System.out.println(subject1+"   \t: "+mark1);
		System.out.println(subject2+"  \t: "+mark2);
		System.out.println(subject3+"  \t: "+mark3);
		System.out.println("Total Marks\t: "+total);
	}*/











	/*	for(int i=0; i<3; i++){
			Scanner s = new Scanner(System.in);
		    System.out.println("Enter the Mark of "+(i+1)+" Subject");
		    this.mark = s.nextInt();
		    s.nextLine();
		}
		
	}
	public void printMarks(){
		int total = 0;

		for(int i=0; i<3; i++){
		    System.out.println("Subject "+(i+1)+"\t: "+this.mark);
		    total = total+this.mark;
		}
		System.out.println("Total    \t: "+total);

	}
}*/