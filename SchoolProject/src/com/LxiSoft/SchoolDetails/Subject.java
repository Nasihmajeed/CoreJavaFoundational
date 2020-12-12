package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Subject{
	String subject;
	int mark;
	
	public void getMarks(){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  Subject");
		this.subject = s.nextLine();
		System.out.println("Enter the Mark of  Subject");
		this.mark = s.nextInt();
		s.nextLine();
	}
	
	public void printMarks(){
		System.out.println("Subject \t: "+this.subject);
		System.out.println("Mark    \t: "+this.mark);
	}
}
	

