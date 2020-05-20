package com.LxiSoft.School;

public class School
{
    ClassRoom classroom=new ClassRoom();

     public void printSchool()
     {
      
    System.out.println("       ************************************************************************");
    System.out.println("       *                                                                      *");
    System.out.println("       *         VIMALAMBIKA PUBLIC SCHOOL & JUNIOR COLLEGE                   *");   
    System.out.println("       *                  Pampady Kottayam Kerala                             *");
    System.out.println("       *               (aff.to CBSE Delhi No.930655)                          *");
    System.out.println("       *                                                                      *");
    System.out.println("       *                      STUDENTS DATABASE                               *");
    System.out.println("       *                                                                      *");
    System.out.println("       *                                                                      *");
    System.out.println("       ************************************************************************");
      }
  

     
  
     public void printStudent()
    {
        classroom.setTeacher();
        classroom.setStudent();
       classroom.printStudents();
       classroom. studentRank();
      

     }
 
 }