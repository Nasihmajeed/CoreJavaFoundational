package com.LxiSoft.SchoolDetails;
import java.util.*;

public class School
{
	String name;
    String place;
    String medium;
    int number;

    Classroom[] classroom;
    Student[] s;
    Student[] temp; 

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
            classroom[i].printClassDetails(i);
            classroom[i].classRankList();
        }
    }

    public void SchoolRankList()
    {
        int total =0;
        s = new Student[100];
        
        for(int j=0; j<number; j++)
        {
            for(int k=0; k<classroom[j].student.length;k++)
            {
                s[total] = new Student();
                s[total] = classroom[j].student[k];
                total++;
            }
        }
        temp = new Student[total];
        for(int x=0; x<total; x++)
        {
            for(int y=x+1; y<total; y++)
            {
                if(s[x].totalMark<s[y].totalMark)
                {
                    temp[x] = new Student();
                    temp[x] = s[x];
                    s[x] = s[y];
                    s[y] = temp[x];
                }
            }
        }


        System.out.println(">----------------------------<");
        System.out.println(">------School Rank List------<");
        System.out.println(">----------------------------<");
        for(int x=0; x<total; x++)
        {
            System.out.println("Name        : "+s[x].name);
            System.out.println("Roll No.    : "+s[x].roll);
            System.out.println("Total Mark  : "+s[x].totalMark);
            System.out.println(">----------------------------<");
        }
    }

}
