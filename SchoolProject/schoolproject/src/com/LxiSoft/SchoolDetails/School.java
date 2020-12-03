package com.LxiSoft.SchoolDetails;
import java.util.*;

public class School
{
	String name;
    String place;
    String medium;
    int number;

    Classroom[] classroom; 

    public void addSchoolDetails()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("School Name : ");
         name = s.nextLine();
        System.out.println("Place : ");
         place = s.next();
        System.out.println("Medium : ");
         medium = s.next();

        System.out.println("Enter the number of Classrooms");
         number = s.nextInt();

        classroom = new Classroom[number];
        System.out.println(">----------------------------<");

        for(int i=0; i<number; i++)
        {
            System.out.println(">----Enter  Class  Details---<");

            classroom[i] = new Classroom();
            classroom[i].addClassDetails();
        }
    }

    public void printSchoolDetails()
    {
    	System.out.println("\n");
    
        System.out.println(">----------------------------<");
        System.out.println(">-------School Details-------<");
        System.out.println("School Name : " + name);
        System.out.println("Place       : " + place);
        System.out.println("Medium      : " + medium);
       

        
        for(int i=0; i<number; i++)
        {
            System.out.println(">----------------------------<");
            System.out.println(">-------Class  Details-------<");
            classroom[i].printClassDetails(i,number);
        }
        int total =0;
        for(int j=0; j<number; j++)
        {
            if(classroom[j].total[j] > classroom[total].total[total])
            {
                total = j;
            }
        }
    }
}