package com.lxisoft.schoolproject;

import java.util.Scanner;
public class Subject{
	String subjectName;
	Integer mark;
	

	public void subjectDetails(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter subject name");
		subjectName=scanner.nextLine();
		

		
		System.out.println("Enter subject mark ");
		mark=scanner.nextInt();
	}

	public void printSubjectDetails(){
		System.out.println("The subject name is"+subjectName);

		System.out.println(" "+ mark);

	}
		
}