package com.LxiSoft.Schools;
import java.util.*;

public class Teacher 
{
    String name;
    String subject;

    public void addTeacherDetails()
    {
        Scanner s = new Scanner(System.in);

            System.out.println(">----------------------------<");
            System.out.println(">---Enter  Teacher Details---<");
            System.out.println("Name    : ");
            name = s.nextLine();
            System.out.println("Subject : ");
            subject = s.next();    
    }

    public void printTeacherDetails()
    {            
            System.out.println(">------Teacher  Details------<");
            System.out.println("Name    : " + name);
            System.out.println("Subject : " + subject);
    }
}