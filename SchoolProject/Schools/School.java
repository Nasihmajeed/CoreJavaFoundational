package Schools;
import java.util.*;

public class School 
{
    String name;
    String place;
    String medium;
    int number;
    
    Scanner s = new Scanner(System.in);

    Classroom classroom = new Classroom();

    public void addSchoolDetails()
    {

        System.out.println("School Name : ");
         name = s.nextLine();
        System.out.println("Place : ");
         place = s.next();
        System.out.println("Medium : ");
         medium = s.next();

        System.out.println("Enter the number of Classrooms");
         number = s.nextInt();

         classroom.addDetails(number);
    }

    public void printSchoolDetails()
    {
        System.out.println("\n");
    
        System.out.println(">----------------------------<");
        System.out.println(">-------School Details-------<");
        System.out.println("School Name : " + name);
        System.out.println("Place       : " + place);
        System.out.println("Medium      : " + medium);

        classroom.printDetails(number);
        
    }
        
}
