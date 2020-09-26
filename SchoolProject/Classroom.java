import java.util.Scanner;
public class Classroom
{
String teacher,p;
Student[] stud1=new Student[4];
Student[] stud2=new Student[4];
Subject[] sub1=new Subject[4];
Subject[] sub2=new Subject[4];

int i,division1,division2,n;

public void setPrint1()
{
System.out.println("-------------Enter the first class details-------------"+"\n");
Scanner scanner = new Scanner(System.in);
System.out.println("\n"+"Enter the teacher name		:");
teacher= scanner.next();
System.out.println("\n"+"Enter the division		:");
division1=scanner.nextInt();
for(i=0;i<4;i++)
{
stud1[i] = new Student();
sub1[i] = new Subject();
System.out.println("\n"+"Enter the name of the student :");
String name=scanner.next();
stud1[i].setName(name);
System.out.println("Enter the reg no");
int regNo=scanner.nextInt();
stud1[i].setRegNo(regNo);
System.out.println("Enter the marks of 1st subject 	:");
sub1[i].sub1=scanner.nextInt();
System.out.println("Enter the marks of 2nd subject 	:");
sub1[i].sub2=scanner.nextInt();
System.out.println("Enter the marks of 3rd subject 	:");
sub1[i].sub3=scanner.nextInt();
}
}
public void setPrint2()
{
System.out.println("-------------Enter the Second class details-------------"+"\n");
Scanner scanner = new Scanner(System.in);
System.out.println("\n"+"Enter the teacher name		:");
teacher= scanner.next();
System.out.println("\n"+"Enter the division		:");
division2=scanner.nextInt();
for(i=0;i<4;i++)
{
stud2[i] = new Student();
sub2[i] = new Subject();
System.out.println("\n"+"Enter the name of the student :");
String nam=scanner.next();
stud2[i].setNam(nam);
System.out.println("Enter the reg no");
int regN=scanner.nextInt();
stud2[i].setRegN(regN);
System.out.println("Enter the marks of 1st subject 	:");
sub2[i].sub1=scanner.nextInt();
System.out.println("Enter the marks of 2nd subject 	:");
sub2[i].sub2=scanner.nextInt();
System.out.println("Enter the marks of 3rd subject 	:");
sub2[i].sub3=scanner.nextInt();
}
}
public void getPrint2()
{
System.out.println("---------------------ASSISI Public School---------------------"+"\n");
System.out.println("\n"+"Enter the first class details");
System.out.println("Student Details"+"\n");
for(i=0;i<4;i++)
{
System.out.println("Name of the student is      :"+stud1[i].getName());
System.out.println("Register number is          :"+stud1[i].getRegNo());
System.out.println("Mark scored for 1st subject :"+sub1[i].sub1);
System.out.println("Mark scored for 2nd subject :"+sub1[i].sub2);
System.out.println("Mark scored for 3rd subject :"+sub1[i].sub3+"\n");
sub1[i].total=sub1[i].sub1+sub1[i].sub2+sub1[i].sub3;
System.out.println("The total is                :"+sub1[i].total);
sub1[i].percentage=(sub1[i].total/300f)*100;
System.out.println("The percentage is           :"+sub1[i].percentage);
if(sub1[i].percentage<40)
{
System.out.println("The result is               :FAIL"+"\n");
}
else if(sub1[i].percentage>40)
{
System.out.println("The result is               :PASS"+"\n");
}
System.out.println("----------------------------------------------");
}
}
public void getPrint3()
{
System.out.println("---------------------ASSISI Public School---------------------"+"\n");
System.out.println("\n"+"Enter the Second class details");
System.out.println("Student Details"+"\n");
for(i=0;i<4;i++)
{
System.out.println("Name of the student is      :"+stud2[i].getNam());
System.out.println("Register number is          :"+stud2[i].getRegN());
System.out.println("Mark scored for 1st subject :"+sub2[i].sub1);
System.out.println("Mark scored for 2nd subject :"+sub2[i].sub2);
System.out.println("Mark scored for 3rd subject :"+sub2[i].sub2+"\n");
sub2[i].total=sub2[i].sub1+sub2[i].sub2+sub2[i].sub3;
System.out.println("The total is                :"+sub2[i].total);
sub2[i].percentage=(sub2[i].total/300f)*100;
System.out.println("The percentage is           :"+sub2[i].percentage);
if(sub2[i].percentage<40)
{
System.out.println("The result is               :FAIL"+"\n");
}
else if(sub2[i].percentage>40)
{
System.out.println("The result is               :PASS"+"\n");
}
System.out.println("----------------------------------------------");
}
}

public void topper1()
{
//float top = sub1[0].percentage;
float top = 0;
String name=null;

for(i=0;i<4;i++)
{
if(sub1[i].percentage >= top)
{
top = sub1[i].percentage;
name = stud1[i].getName();
}
}
System.out.println("Topper of the 1st class is :"+name);
System.out.println("The Percentage		:"+top);
}
public void topper2()
{
//float top = sub2[0].percentage;
float top = 0;
String nam=null;

for(i=0;i<4;i++)
{
if(sub2[i].percentage >= top)
{
top = sub2[i].percentage;
nam = stud2[i].getNam();
}
}
System.out.println("Topper of the 2nd class is :"+nam);
System.out.println("The Percentage		:"+top);
}
public void topper3()
{
//float top = sub2[0].percentage;
float top = 0;
String nam=null;

for(i=0;i<4;i++)
{
if(sub2[i].percentage >= top)
{
top = sub2[i].percentage;
nam = stud2[i].getNam();
}
}
System.out.println("----------------------------------------------");
System.out.println("\n"+"Topper of the School is :"+nam);
System.out.println("The Percentage		:"+top);
}
public void teacher(String name)
{

System.out.println("Class Teacher is:"+name);
}
}

