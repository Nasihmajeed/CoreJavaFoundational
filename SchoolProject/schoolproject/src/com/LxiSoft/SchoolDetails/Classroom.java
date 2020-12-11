package com.LxiSoft.Schools;
import java.util.*;

public class Classroom 
{
    int standard;
    String division;
    int num;

    Teacher teacher;
    Student[] student;

    public void addClassDetails()
    {
        Scanner s = new Scanner(System.in);

        teacher = new Teacher();

            System.out.println("Standard : ");
                this.standard = s.nextInt();
            System.out.println("Division : ");
                this.division = s.next();
                
            System.out.println("\nEnter the number of Students");
            num = s.nextInt();

            student = new Student[num];
            for( int i=0; i<num; i++ )
            {
                student[i] = new Student();
                student[i].addStudentDetails();
            }
            teacher.addTeacherDetails();
            System.out.println(">----------------------------<");
    }

    public void printClassDetails()
    {
            System.out.println("Standard : " + this.standard);
            System.out.println("Division : " + this.division);
            
            teacher.printTeacherDetails();
           
            System.out.println(">------Student  Details------<");
            for( int i=0; i<num; i++ )
            {             
                student[i].printStudentDetails();
            }
    }
}