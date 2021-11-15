import java.util.Scanner;
public class Netsalary
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);

String Name, Designation;
double BP,HRA,PF,DA,NS;
HRA=500;
System.out.println("Name of the employee");
Name=sc.nextLine();

System.out.println("Designation of"+ Name+" is:");
Designation=sc.nextLine();

System.out.println("Basic salary of"+ Name+" is ");
BP=sc.nextDouble();

if(BP<10000)
{
DA=BP*0.6;
PF=BP*0.15;
}
else
{
DA=BP*0.75;
PF=BP*0.2;
}

NS=BP+DA+HRA+PF;
System.out.println("The Net Salary of"+ Name+" is:"+ NS);
}
}
