package com.LxiSoft.SchoolDetails;
import java.util.*;
public class School{
	String schoolName;
    String place;
    String board;
    int numOfClass;
    int totalStudents=0;
    //Scanner s = new Scanner(System.in);
    ClassRoom[] clas; //= new ClassRoom();
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
        String temp1;
        int temp2;
        int temp3;
        //int totalStudents=0;
        for(int i=0; i<numOfClass; i++){
            System.out.println("\n\t---->Class Details<----\t");
            clas[i].printClassDetails(i);
            totalStudents = totalStudents+clas[i].numOfStudents;
        }
        System.out.println(totalStudents+"----> \\total students");
        int max = 0;
        for(int j=0; j<numOfClass; j++){
            for(int x=j+1; x<numOfClass; x++){
                /*if(clas[j].student[j].totalMark < clas[x].student[x].totalMark){
                    temp1 = clas[j].student[j].name;
                    temp2 = clas[j].student[j].rollNum;
                    temp3 = clas[j].student[j].totalMark;
                    clas[j].student[j].name = clas[x].student[x].name;
                    clas[j].student[j].rollNum = clas[x].student[x].rollNum;
                    clas[j].student[j].totalMark = clas[x].student[x].totalMark;
                    clas[x].student[x].name = temp1;
                    clas[x].student[x].rollNum = temp2;
                    clas[x].student[x].totalMark = temp3;     
                }
            }*/
                if(clas[j].total[j] < clas[x].total[x]){
                    //max = j;
                    temp1 = clas[j].name[j];
                    temp2 = clas[j].rollno[j];
                    temp3 = clas[j].total[j];
                    clas[j].name[j] = clas[x].name[x];
                    clas[j].rollno[j] = clas[x].rollno[x];
                    clas[j].total[j] = clas[x].total[x];
                    clas[x].name[x] = temp1;
                    clas[x].rollno[x] = temp2;
                    clas[x].total[x] = temp3;
                }
            }

        }
        for(int l=0; l<numOfClass;l++){
            System.out.println(">____________________________<");
            System.out.println("\tNAME        : "+clas[l].name[l]);
            System.out.println("\tRoll Number : "+clas[l].rollno[l]);
            System.out.println("\tTotal Mark  : "+clas[l].total[l]);
            System.out.println(">____________________________<");
        }
        System.out.println(">-------------------------------------------<");
        System.out.println("The Rank holder of the School \t \nNAME \t: "+clas[max].student[max].name);
        System.out.println("TOTAL\t: "+clas[max].student[max].totalMark);
        System.out.println(">-------------------------------------------<");
    }
    /*public void schoolRankList(){
        String[] studName = new String[totalStudents];
        int[] rNo = new int[totalStudents];
        int[] totMark = new int[totalStudents];
        for(int i=0; i<totalStudents; i++){
            for(int j=0; j<numOfClass; j++){
                studName[i] = clas[j].student[j].name;
                rNo[i] = clas[j].student[j].rollNum;
                totMark[i] = clas[j].student[j].totalMark;
            }
        }
        for(int x=0; x<totalStudents; x++){
            System.out.println("----> "+studName[x]);
            System.out.println("----> "+rNo[x]);
            System.out.println("----> "+totMark[x]);
        }
    }*/
}

