package com.LxiSoft.SchoolDetails;
import java.util.*;
public class ClassRoom{
	String division;
	int standard;
	int numOfStudents;
	//Scanner s = new Scanner(System.in);
	Teacher t; // = new Teacher();
	Student[] student; //= new Student();
	Student[] temp;
	Student[] rank;
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
		student = new Student[50];
		temp = new Student[50];
		for(int i=0; i<numOfStudents; i++){    
			student[i] = new Student();
			temp[i] = new Student();
		    student[i].getStudentDetails(i);
		}
	}
	public void printClassDetails(int i){
		System.out.println("\t---->"+(i+1)+" Class Details<----\t");
		System.out.println("Standard          \t: "+this.standard);
		System.out.println("Division          \t: "+this.division);
		System.out.println("Number of Students\t: "+this.numOfStudents);
	    t.printTeacherDetails();
	    for(int j=0; j<numOfStudents; j++){
		    System.out.println("\t---->Student Details<----\t");
		    student[j].printStudentDetails();
		    
		}
	}
	public void printClassRankList(int n){
		for(int m=0; m<numOfStudents; m++){
			for(int x=m+1; x<numOfStudents; x++){
				if(student[m].totalMark<student[x].totalMark){
					temp[m] = student[m];
					student[m] = student[x];
					student[x] = temp[m];			
				}
			}
		}
		System.out.println(">-------------------------------<");
		for(int l=0; l<numOfStudents; l++){
			System.out.println("|\tRANK    \t: "+(l+1)+"\t|");
			System.out.println("|\tNAME    \t: "+student[l].name+"\t|");
			System.out.println("|\tRoll Num\t: "+student[l].rollNum+"\t|");
			System.out.println("|\tTOTAL   \t: "+student[l].totalMark+"\t|");
			System.out.println(" ------------------------------ ");
			//rank.add(student[l].name);
		}
		int count = 0;
		rank = new Student[n];
		for(int a=0; a<numOfStudents;a++){

			rank[count] = new Student();
			rank[count] = student[a];
			count++;
		}



		/*rank = new Student[n];     
		for(int x=0; x<n; x++){
			rank[x] = new Student();
			rank[x] = student[x];
			//count++;
		}
		//count = count+numOfStudents;

		for(int a=0;a<n;a++){
			System.out.println("---------> "+(a+1)+" <--------");
            System.out.println(rank[a].name);
            System.out.println(rank[a].rollNum);
        }*/
	}
	/*public void getStudentList(int n){
		
		//int count =0;

		//count = count+numOfStudents;
		rank = new Student[n];
		
		for(int i=0; i<n; i++){
			for(int x=0; x<n; x++){
			    rank[i] = new Student();
			    rank[i] = student[x];
			//count++;
		    }
		}
		
		//count = count+numOfStudents;

		for(int a=0;a<n;a++){
			System.out.println("--------> "+(a+1)+" <--------");
            System.out.println(rank[a].name);
            System.out.println(rank[a].rollNum);
        }	
	}*/
}
