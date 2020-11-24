package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Student{
	String name;
	int rollNum;
	Rank[] r;
	//Rank r2;
	//Rank r3;
	//Scanner s = new Scanner(System.in);
	//Student[] student; //=  new Student; 
	void getStudentDetails(int i){
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the  student details ");
		System.out.println("Enter the name of "+(i+1)+" student ");
		this.name = s.nextLine();
		System.out.println("Enter the roll number of "+(i+1)+" student ");
		this.rollNum = s.nextInt();
		s.nextLine();
		r = new Rank[3];
		for(int j=0; j<3; j++){
			r[j] = new Rank();
			r[j].getMarks();
		}
	}
	void printStudentDetails(){
		
		System.out.println("Name       \t: "+/*student[i]*/this.name);
		System.out.println("Roll Number\t: "+/*student[i]*/this.rollNum);
		for(int i=0; i<3; i++){
			r[i].printMarks();
		}
		
	}
	
}
