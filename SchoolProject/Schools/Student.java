package Schools;
import java.util.*;

public class Student 
{
    String name;
    int roll;
    int num;

    Scanner s = new Scanner(System.in);
    
    Student[] student;

    public void addDetails()
    {
        System.out.println("\nEnter the number of Students");
        num = s.nextInt();

        student = new Student[num];

       
        for( int i=0; i<num; i++ )
        {

            student[i] = new Student();

            System.out.println(">----------------------------<");
            System.out.println(">--Enter Student "+ (i+1) +" Details--<");

            System.out.println("Name    : ");
                student[i].name = s.next();
            System.out.println("Roll No.: ");
                student[i].roll = s.nextInt();    
        }
    }

    public void printDetails()
    { 
        for( int i=0; i<num; i++ )
        {
            
            System.out.println(">---------------------<");
            System.out.println(">---Student "+ (i+1) +" Details---<");

            System.out.println("Name    : " + student[i].name);
            System.out.println("Roll No.: " + student[i].roll);
           
        }
    }
}
