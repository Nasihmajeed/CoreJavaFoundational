package com.LxiSoft.SchoolDetails;
import java.util.*;
public class School{
	String schoolName;
    String place;
    String board;
    int numOfClass;
    int totalStudents=0;
    //int count=0;
    //Scanner s = new Scanner(System.in);
    ClassRoom[] clas; //= new ClassRoom();
    Student[] stud;
    Student[] temp;
    public void getSchoolDetails(){
	    Scanner s = new Scanner(System.in);
        System.out.println("Enter the school name ");
	    schoolName = s.nextLine();
	    System.out.println("Enter the place ");
	    place = s.nextLine();
	    System.out.println("Enter the board ");
	    board = s.nextLine();
	    System.out.println("Enter the number of classes ");
	    numOfClass = s.nextInt();
	    s.nextLine();
        clas = new ClassRoom[numOfClass];
	    //clas.classDetails(numOfClass);
        System.out.println("\nEnter the Class details");
        for(int i=0; i<numOfClass; i++){
            clas[i] = new ClassRoom();
            clas[i].getClassDetails();
        }
    }
    public void printSchoolDetails(){
    	System.out.println("\t\t---->School Details<----\t\t");
    	System.out.println("School\t: "+schoolName);
    	System.out.println("Place \t: "+place);
    	System.out.println("Board \t: "+board);
    	//clas.printClass(numOfClass);
        //String temp1;
        //int temp2;
        //int temp3;
        //int totalStudents=0;
        for(int i=0; i<numOfClass; i++){
            System.out.println("\n\t---->Class Details<----\t");
            clas[i].printClassDetails(i);
            //totalStudents = totalStudents+clas[i].numOfStudents;
            clas[i].printClassRankList();
        }
        int count=0;

    }
    public void printSchoolRankList(){

        stud = new Student[50];
        
        for(int j=0; j<numOfClass; j++){
            for(int k=0; k<clas[j].student.length;k++){
                stud[totalStudents] = new Student();
                stud[totalStudents] = clas[j].student[k];
                totalStudents++;
            }
        }
        temp = new Student[totalStudents];
        for(int a=0; a<totalStudents; a++){
            for(int b=a+1; b<totalStudents; b++){
                if(stud[a].totalMark<stud[b].totalMark){
                    temp[a] = new Student();
                    temp[a] = stud[a];
                    stud[a] = stud[b];
                    stud[b] = temp[a];
                }
            }
        }

        System.out.println("The School wise Rank List");
        System.out.println(">-------------------------------<");
        for(int x=0; x<totalStudents; x++){
            System.out.println("|\tName       \t: "+stud[x].name+"\t|");
            System.out.println("|\tRoll Number\t: "+stud[x].rollNum+"\t|");
            System.out.println("|\tTotal Mark \t: "+stud[x].totalMark+"\t|");
            System.out.println(" ------------------------------ ");
        }
    }
}

