import java.util.Scanner;
public class School
{
Scanner scanner;
Classroom classroom=new Classroom();

public void details()
{
Scanner scanner= new Scanner(System.in);

System.out.prinln("         welcome       ");
System.out.prinln("-----Public School-----");

System.out.println("Enter the division");
classroom.stud.division=scanner.nextInt();
System.out.println("Enter the teacher name");
classroom.teacher= scanner.next();
}
classroom.set();
classroom.get();

}
