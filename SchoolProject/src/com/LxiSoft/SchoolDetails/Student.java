package com.LxiSoft.SchoolDetails;
import java.util.*;
public class Student{
	String name;
	int rollNum;
	Marks m;
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
		//m = new Marks[3];
		System.out.println("\t---->Enter Mark Details<----\t");
		//for(int j=0; j<3; j++){
		m = new Marks();
		m.getMarks();
		//}
	}
	public void printStudentDetails(){
		int i;
		//int t = 0;
		//int[] tot = new int[5];
		System.out.println("Name       \t: "+/*student[i]*/this.name);
		System.out.println("Roll Number\t: "+/*student[i]*/this.rollNum);
		System.out.println("\t---->Mark Details<----\t");
		//for(i=0; i<3; i++){
		m.printMarks();
		//t = t+m[i].mark;
			//tot[i] = t;
		//}
		//for(i=2;i<3;i++){
			//tot[i] = t;
		//System.out.println("Total Marks\t: "+t);
		//}
		
	}

	
}
