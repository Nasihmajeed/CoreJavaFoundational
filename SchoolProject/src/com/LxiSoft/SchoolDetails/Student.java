package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Student{
	String name;
	int rollNum;
	int totalMark=0;
	//int t = 0;
	//int[] ra
	Subject[] sub;
	//Rank r2;
	//Rank r3;
	//Scanner s = new Scanner(System.in);
	//Student[] student; //=  new Student; 
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
		int i;
		//int t = 0;
		//totalMark = new int[5];
		System.out.println("Name       \t: "+/*student[i]*/this.name);
		System.out.println("Roll Number\t: "+/*student[i]*/this.rollNum);
		System.out.println("\t---->Mark Details<----\t");
		for(i=0; i<3; i++){
		    sub[i].printMarks();
		}
		for (int j=0;j<3;j++){
		    totalMark = totalMark+sub[j].mark;		    	
		}
		/*System.out.println("----------");
		System.out.println(t);
		System.out.println("----------");*/
		
	}

	
}
