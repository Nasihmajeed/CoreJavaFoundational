package com.LxiSoft.SchoolDetails;
import java.util.*;
public class ClassRoom{
	String division;
	int standard;
	int numOfStudents;
	String[] name;
	int[] rollno;
	int[] total;
	//Scanner s = new Scanner(System.in);
	Teacher t; // = new Teacher();
	Student[] student; //= new Student();
	//ClassRoom[] c;

	public void getClassDetails(){
		Scanner s = new Scanner(System.in);
		t = new Teacher();
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
		
		String temp1;
		int temp2;
		int temp3;
		System.out.println("\t---->"+(i+1)+" Class Details<----\t");
		System.out.println("Standard          \t: "+this.standard);
		System.out.println("Division          \t: "+this.division);
		System.out.println("Number of Students\t: "+this.numOfStudents);
	    t.printTeacherDetails();
	    //r = new Rank[numOfStudents];
	    name = new String[20];
	    rollno = new int[20];
	    total = new int[20];
	    for(int j=0; j<numOfStudents; j++){
		    System.out.println("\t---->Student Details<----\t");
		    student[j].printStudentDetails();
		    
		}
		/*for(int k=0; k<numOfStudents; k++){
		    //name[k] = new Student();
		    //rollno[k] = new Student();
		    //total[k] = new Student();
		    name[k] = student[k].name;
		    rollno[k] = student[k].rollNum;
		    total[k] = student[k].totalMark;
		}*/
		for(int m=0; m<numOfStudents; m++){
			for(int x=m+1; x<numOfStudents; x++){
				if(student[m].totalMark<student[x].totalMark){
					temp1 = student[m].name;
					temp2 = student[m].rollNum;
					temp3 = student[m].totalMark;
					student[m].name = student[x].name;
					student[m].rollNum = student[x].rollNum;
					student[m].totalMark = student[x].totalMark;
					student[x].name = temp1;
					student[x].rollNum = temp2;
					student[x].totalMark = temp3;
					
				}
			}
		}
		//for(int k=0; k<numOfStudents; k++){
		    //name[k] = new Student();
		    //rollno[k] = new Student();
		    //total[k] = new Student();
		    //name[k] = student[k].name;
		    //rollno[k] = student[k].rollNum;
		    //total[k] = student[k].totalMark;
		//}  
		int max = 0;
		System.out.println(">_______________________________<");
		for(int l=0; l<numOfStudents; l++){
			System.out.println("|\tRANK    \t: "+(l+1)+"\t|");
			System.out.println("|\tNAME    \t: "+student[l].name+"\t|");
			System.out.println("|\tRoll Num\t: "+student[l].rollNum+"\t|");
			System.out.println("|\tTOTAL   \t: "+student[l].totalMark+"\t|");
			System.out.println("---------------------------------");
			name[l] = student[l].name;
		    rollno[l] = student[l].rollNum;
		    total[l] = student[l].totalMark;
			//if(student[l].totalMark > student[max].totalMark){
			//	max = l;
			//}
		}
		System.out.println(">_______________________________<");
		System.out.println(">-------------------------------------------<");
		System.out.println(" 1st Rank holder of the class \t \n NAME \t: "+student[max].name);
		System.out.println(" TOTAL\t: "+student[max].totalMark);
		System.out.println(">-------------------------------------------<");

	}
}
