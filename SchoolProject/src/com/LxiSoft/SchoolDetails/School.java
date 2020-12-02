package com.LxiSoft.SchoolDetails;
import java.util.*;
public class School{
	String schoolName;
    String place;
    String board;
    int numOfClass;
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
        
        for(int i=0; i<numOfClass; i++){
            System.out.println("\n\t---->Class Details<----\t");
            clas[i].printClassDetails(i,numOfClass);
        }
        int max = 0;
        for(int j=0; j<numOfClass; j++){
            if(clas[j].total[j] > clas[max].total[max]){
                max = j;
            }
        }
        System.out.println(">-------------------------------------------<");
        System.out.println("The Rank holder of the School \t \nNAME \t: "+clas[max].student[max].name);
        System.out.println("TOTAL\t: "+clas[max].student[max].totalMark);
        System.out.println(">-------------------------------------------<");
    }
}

