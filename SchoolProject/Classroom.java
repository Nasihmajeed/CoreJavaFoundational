import java.util.Scanner;
public class Classroom
{
String teacher,p;
Student[] stud=new Student[4];
Subject[] sub=new Subject[4];


int i,division,n;

public void setPrint1()
{
Scanner scanner = new Scanner(System.in);
for(i=0;i<4;i++)
{
stud[i] = new Student();
sub[i] = new Subject();
System.out.println("\n"+"Enter the name of the student :");
String name=scanner.next();
stud[i].setName(name);
System.out.println("Enter the reg no");
int regNo=scanner.nextInt();
stud[i].setRegNo(regNo);
System.out.println("Enter the marks of 1st subject 	:");
sub[i].sub1=scanner.nextInt();
System.out.println("Enter the marks of 2nd subject 	:");
sub[i].sub2=scanner.nextInt();
System.out.println("Enter the marks of 3rd subject 	:");
sub[i].sub3=scanner.nextInt();
}
}
public void getPrint2()
{
System.out.println("---------------------ASSISI Public School---------------------"+"\n");
System.out.println("Student Details"+"\n");
for(i=0;i<4;i++)
{
System.out.println("Name of the student is      :"+stud[i].getName());
System.out.println("Register number is          :"+stud[i].getRegNo());
System.out.println("Mark scored for 1st subject :"+sub[i].sub1);
System.out.println("Mark scored for 2nd subject :"+sub[i].sub2);
System.out.println("Mark scored for 3rd subject :"+sub[i].sub2+"\n");
sub[i].total=sub[i].sub1+sub[i].sub2+sub[i].sub3;
System.out.println("The total is                :"+sub[i].total);
sub[i].percentage=(sub[i].total/300f)*100;
System.out.println("The percentage is           :"+sub[i].percentage);
if(sub[i].percentage<40)
{
System.out.println("The result is               :FAIL"+"\n");
}
else if(sub[i].percentage>40)
{
System.out.println("The result is               :PASS"+"\n");
}
System.out.println("----------------------------------------------");
}
}

public void topper()
{
float top = sub[0].percentage;
String name=null;

for(i=0;i<4;i++)
{
if(sub[i].percentage > top)
{
top = sub[i].percentage;
name = stud[i].getName();
}
}
System.out.println("Topper of the class is	:"+name);
System.out.println("The Percentage		:"+top);
}
public void teacher(String name)
{

System.out.println("Class Teacher is:"+name);
}
}

