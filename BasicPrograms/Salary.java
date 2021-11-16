import java.util.Scanner;
public class Salary
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);

double salary;

System.out.println("Enter the employee name:");
String name=sc.nextLine();

System.out.println("Enter the sale amount");
double samt=sc.nextDouble();

if(samt<0)
{
System.out.println("invalid input");
}

else if(samt<10000)
{
salary=samt;
System.out.println("Current month salary for "+ name+" is "+salary);
}

else if(10000==samt||samt<30000)
{
salary=samt+(samt*0.15);
System.out.println("Current month salary for "+name+" is "+salary);
}

else
{
salary=samt+(samt*0.25)+1000;
System.out.println("Current month salary for "+name+" is "+salary);
}

}
}