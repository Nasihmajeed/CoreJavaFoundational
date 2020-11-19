package Schools;
import java.util.*;

public class Teacher 
{

    String name;
    String subject;

    Scanner s = new Scanner(System.in);

    public void addDetails()
    {
            System.out.println(">-------------------------<");
            System.out.println(">--Enter Teacher Details--<");
            System.out.println("Name    : ");
            name = s.nextLine();
            System.out.println("Subject : ");
            subject = s.next();    
    }

    public void printDetails()
    {            
            System.out.println(">---Teacher  Details---<");
            System.out.println("Name    : " + name);
            System.out.println("Subject : " + subject);
    }
}