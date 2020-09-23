import java.util.Scanner;
public class Classroom
{
String teacher;
Student stud=new Student[3];
Subject sub=new Subject[3];

int i,n;

public void set()
{
Scanner scanner = new Scanner(System.in);
for(i=0;i<4;i++)
{
System.out.println("Enter the name of the student");
String name=scanner.next();
stud[i].setName(name);
System.out.println("Enter the reg no");
int regNo=scanner.nextInt();
stud[i].setregNo(n);
System.out.println("Enter the marks of 1st subject");
sub[i].sub1=scanner.nextInt();
System.out.println("Enter the marks of 2nd subject");
sub[i].sub2=scanner.nextInt();
System.out.println("Enter the marks of 3rd subject");
sub[i].sub3=scanner.nextInt();
}
}
public void get()
{
for(i=0;i<4;i++)
{
System.out.println("Name of the student is"+stud[i].getName());
System.out.println("Register number is"+stud[i].getregNo());
System.out.println("Mark scored for 1st subject"+sub[i].sub1);
System.out.println("Mark scored for 2nd subject"+sub[i].sub2);
System.out.println("Mark scored for 3rd subject"+sub[i].sub2);
}
}
}





