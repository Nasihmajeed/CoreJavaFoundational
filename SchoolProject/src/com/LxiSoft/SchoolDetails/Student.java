package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Student{
	String name;
	int rollNum;
	int totalMark=0;
	Subject[] sub;
 
	public void getStudentDetails(int i){
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the  student details ");
		System.out.println("Enter the name of "+(i+1)+" student ");
		this.name = s.nextLine();
		System.out.println("Enter the roll number of "+(i+1)+" student ");
		this.rollNum = s.nextInt();
		s.nextLine();
		sub = new Subject[3];
		System.out.println("\t---->Enter Mark Details<----\t");
		for(int j=0; j<3; j++){
		    sub[j] = new Subject();
		    sub[j].getMarks();
		}
	}
	public void printStudentDetails(){
	
		System.out.println("Name       \t: "+this.name);
		System.out.println("Roll Number\t: "+this.rollNum);
		System.out.println("\t---->Mark Details<----\t");
		for(int i=0; i<3; i++){
		    sub[i].printMarks();
		}
		for (int j=0;j<3;j++){
		    totalMark = totalMark+sub[j].mark;		    	
		}
		System.out.println("Total Mark  \t: "+this.totalMark);
	}	
}
