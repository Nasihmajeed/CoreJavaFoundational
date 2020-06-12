package com.lxisoft.schoolproject;

import java.util.Scanner;
public class Subject{
	private String subjectName;
	public void setSubjectName(String a){
		this.subjectName=a;
	}
	public String getSubjectName(){
		return subjectName;	
	}
	private Integer mark;
	public void setSubjectMark(Integer a){
		this.mark=a;
	}
	public Integer getSubjectMark(){
		return mark;
	}

	public void subjectDetails(){

		
		

		
		//System.out.println("Enter subject mark ");
		//mark=scanner.nextInt();
	}

	public void printSubjectDetails(){
		System.out.println("The subject name is"+subjectName);

		System.out.println(" "+ mark);

	}
		
}