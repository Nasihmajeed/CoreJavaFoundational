package com.LxiSoft.SchoolDetails;
import java.util.*;
public class ClassRoom{
	String division;
	int standard;
	int numOfStudents;
	Rank[] r;
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
	public void printClassDetails(int i){
		//for(int i=0; i<n; i++){
		int index;
		System.out.println("\t---->"+(i+1)+" Class Details<----\t");
		System.out.println("Standard          \t: "+this.standard);
		System.out.println("Division          \t: "+this.division);
		System.out.println("Number of Students\t: "+this.numOfStudents);
	    t.printTeacherDetails();
	    r = new Rank[numOfStudents];
	    for(int j=0; j<numOfStudents; j++){
		    System.out.println("\t---->Student Details<----\t");
		    student[j].printStudentDetails();
		    //student[j].totalMark[j] = student[j].t;
		    System.out.println("---------------");
		    System.out.println("Total Mark  \t: "+student[j].totalMark);
		    System.out.println("---------------");
		    System.out.println("----------");
		    System.out.println(student[j].average);
		    System.out.println("----------");
		    if(student[j].average > 80){
		    	System.out.println("Rank 1");
		    	System.out.println("NAME : "+student[j].name);
		    	System.out.println("NAME : "+student[j].totalMark);

		    }
		    else if(student[j].average < 80 && student[j].average > 65){
		    	System.out.println("Rank 2");
		    	System.out.println("NAME : "+student[j].name);
		    	System.out.println("NAME : "+student[j].totalMark);
		    }
		    else if(student[j].average < 65 && student[j].average > 50){
		    	System.out.println("Rank 3");
		    	System.out.println("NAME : "+student[j].name);
		    	System.out.println("NAME : "+student[j].totalMark);
		    }
		    else if(student[j].average < 65 && student[j].average > 50){
		    	System.out.println("Rank 4");
		    	System.out.println("NAME : "+student[j].name);
		    	System.out.println("NAME : "+student[j].totalMark);
		    }
		    else {
		    	System.out.println("Failed");
		    	System.out.println("NAME : "+student[j].name);
		    	System.out.println("NAME : "+student[j].totalMark);
		    }		    
		}
	}
}

















	/*int max = 0;
		for(int k=0; k<numOfStudents; k++){
			if(student[k].totalMark > student[max].totalMark){
				max = k;
			}
		}
		System.out.println("The topper scorer of the class \t \nNAME \t: "+student[max].name);
		System.out.println("TOTAL\t: "+student[max].totalMark);
	}
}*/
