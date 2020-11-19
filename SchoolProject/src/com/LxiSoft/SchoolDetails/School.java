package com.LxiSoft.SchoolDetails;
import java.util.*;
public class School{
	String schoolName;
    String place;
    String board;
    int numOfClass;
    Scanner s = new Scanner(System.in);
    ClassRoom clas = new ClassRoom();
    public void getDetails(){
	    System.out.println("Enter the school name ");
	    schoolName = s.nextLine();
	    System.out.println("Enter the place ");
	    place = s.nextLine();
	    System.out.println("Enter the board ");
	    board = s.nextLine();
	    System.out.println("Enter the number of classes ");
	    numOfClass = s.nextInt();
	    s.nextLine();
	    clas.classDetails(numOfClass);
    }
    public void printDetails(){
    	System.out.println("\t\t---->School Details<----\t\t");
    	System.out.println("School\t: "+schoolName);
    	System.out.println("Place \t: "+place);
    	System.out.println("Board \t:"+board);
    	clas.printClass(numOfClass);

    }
}

