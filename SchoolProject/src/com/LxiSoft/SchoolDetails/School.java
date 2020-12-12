package com.LxiSoft.SchoolDetails;
import java.util.*;
public class School{
	String schoolName;
    String place;
    String board;
    int numOfClass;
    ClassRoom[] clas; 
    Student[] rank;
    public void getSchoolDetails(){
	    Scanner s = new Scanner(System.in);
        System.out.println("Enter the school name ");
	    this.schoolName = s.nextLine();
	    System.out.println("Enter the place ");
	    this.place = s.nextLine();
	    System.out.println("Enter the board ");
	    this.board = s.nextLine();
	    System.out.println("Enter the number of classes ");
	    this.numOfClass = s.nextInt();
	    s.nextLine();
        clas = new ClassRoom[numOfClass];
        System.out.println("\nEnter the Class details");
        for(int i=0; i<numOfClass; i++){
            clas[i] = new ClassRoom();
            clas[i].getClassDetails();
        }
    }
    public void printSchoolDetails(){
    	System.out.println("\t\t---->School Details<----\t\t");
    	System.out.println("School\t: "+this.schoolName);
    	System.out.println("Place \t: "+this.place);
    	System.out.println("Board \t: "+this.board);
    	
        for(int i=0; i<numOfClass; i++){
            System.out.println("\n\t---->Class Details<----\t");
            clas[i].printClassDetails(i);
            //totalStudents = totalStudents+clas[i].numOfStudents;
            clas[i].printClassRankList();
        }

    }
    public void printSchoolRankList(){
        int totalStudents=0;
        rank = new Student[50];
        
        for(int j=0; j<numOfClass; j++){
            for(int k=0; k<clas[j].student.length;k++){
                rank[totalStudents] = new Student();
                rank[totalStudents] = clas[j].student[k];
                totalStudents++;
            }
        }
        
        for(int a=0; a<totalStudents; a++){
            for(int b=a+1; b<totalStudents; b++){
                if(rank[a].totalMark < rank[b].totalMark){
                    Student temp = new Student();
                    temp = rank[a];
                    rank[a] = rank[b];
                    rank[b] = temp;
                }
            }
        }

        System.out.println("The School wise Rank List");
        System.out.println(">-------------------------------<");
        for(int x=0; x<totalStudents; x++){
            System.out.println("|\tRank       \t: "+(x+1)+"\t|");
            System.out.println("|\tName       \t: "+rank[x].name+"\t|");
            System.out.println("|\tRoll Number\t: "+rank[x].rollNum+"\t|");
            System.out.println("|\tTotal Mark \t: "+rank[x].totalMark+"\t|");
            System.out.println(" ------------------------------ ");
        }
    }
}

 