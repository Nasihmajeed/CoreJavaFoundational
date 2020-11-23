package com.LxiSoft.Schools;
import java.util.*;

public class Student 
{
    String name;
    int roll;

    public void addStudentDetails()
    {
        Scanner s = new Scanner(System.in); 

            System.out.println(">----------------------------<");
            System.out.println(">---Enter  Student Details---<");

            System.out.println("Name    : ");
                this.name = s.next();
            System.out.println("Roll No.: ");
                this.roll = s.nextInt();    
    }

    public void printStudentDetails()
    { 
            System.out.println("Name    : " + this.name);
            System.out.println("Roll No.: " + this.roll);
            System.out.println(">----------------------------<");
    }
}
