package com.LxiSoft.SchoolDetails;
import java.util.*;
public class ClassRoom{
	String division;
	int standard;
	int numOfStudents;
	int[] rank;
	//Scanner s = new Scanner(System.in);
	Teacher t; // = new Teacher();
	Student[] student; //= new Student();
	//ClassRoom[] c;

	public void getClassDetails(){
		Scanner s = new Scanner(System.in);
		t = new Teacher();
		//c = new ClassRoom[n];
		//t = new Teacher[n];
		//student = new Student[n];
		//for(int i=0; i<n; i++){
	   // System.out.println("Enter the "+(i+1)+" Class details");
		    //c[i] = new ClassRoom();
			//t[i] = new Teacher();
		//student[i] = new Student();
		System.out.println("Enter the standard ");
		this.standard = s.nextInt();
		s.nextLine();
		System.out.println("Enter the division ");
		this.division = s.nextLine();
		t.getTeacherDetails();
		System.out.println("Enter the number of students in the class ");
		numOfStudents = s.nextInt();
		s.nextLine();
		student = new Student[numOfStudents];
		for(int i=0; i<numOfStudents; i++){    
			student[i] = new Student();
		    student[i].getStudentDetails(i);
		}
	}
	public void printClassDetails(int i,int n){
		//for(int i=0; i<n; i++){
		int temp;
		System.out.println("\t---->"+(i+1)+" Class Details<----\t");
		System.out.println("Standard          \t: "+this.standard);
		System.out.println("Division          \t: "+this.division);
		System.out.println("Number of Students\t: "+this.numOfStudents);
	    t.printTeacherDetails();
	    //r = new Rank[numOfStudents];
	    rank = new int[20];
	    for(int j=0; j<numOfStudents; j++){
		    System.out.println("\t---->Student Details<----\t");
		    student[j].printStudentDetails();
		    //student[j].totalMark[j] = student[j].t;
		    /*System.out.println("---------------");
		    rank[j] = student[j].totalMark;
		    System.out.println("Total Mark  \t: "+rank[j]);
		    System.out.println("---------------");
		    System.out.println("----------");
		    //System.out.println(student[j].average);
		    System.out.println("----------");*/
		    		    
		}
		for(int k=0; k<numOfStudents; k++){
		    rank[k] = student[k].totalMark;
		}
		/*for(int m=0; m<rank.length; m++){
			for(int x=m+1; x<rank.length; x++){
				if(rank[m]<rank[x]){
					temp = rank[m];
					rank[m] = rank[x];
					rank[x] = temp;
				}
			}
		}*/   
		int max = 0;
		for(int l=0; l<numOfStudents; l++){
			if(student[l].totalMark > student[max].totalMark){
				max = l;
			}
		}
		System.out.println(">-------------------------------------------<");
		System.out.println("1st Rank holder of the class \t \nNAME \t: "+student[max].name);
		System.out.println("TOTAL\t: "+student[max].totalMark);
		System.out.println(">-------------------------------------------<");

	}
}
