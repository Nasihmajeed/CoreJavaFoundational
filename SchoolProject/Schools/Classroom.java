package Schools;
import java.util.*;

public class Classroom 
{
    int standard;
    int num;
    String division;

    Scanner s = new Scanner(System.in);

    Teacher[] teacher;
    Student[] student;
    Classroom[] c;

    public void addDetails(int n)
    {
        c = new Classroom[n];
        teacher = new Teacher[n];
        student = new Student[n];

        for( int i=0; i<n; i++ )
        {
            c[i] = new Classroom();
            teacher[i] = new Teacher();
            student[i] = new Student();

            System.out.println(">----------------------------<");
            System.out.println(">---Enter Class " + (i+1) + " Details---<");
            System.out.println("Standard : ");
                c[i].standard = s.nextInt();
            System.out.println("Division : ");
                c[i].division = s.next();

            // System.out.println("\nEnter the number of Students");
            //     num = s.nextInt();
                
            student[i].addDetails();
            teacher[i].addDetails();
        }
    }

    public void printDetails(int n)
    {
        for( int i=0; i<n; i++ )
        {
            System.out.println("\n");
            System.out.println(">----------------------------<");
            System.out.println(">------Class "+ (i+1) +" Details------<");

            System.out.println("Standard : " + c[i].standard);
            System.out.println("Division : " + c[i].division);
            
            teacher[i].printDetails();
            student[i].printDetails();
        }
    }
}