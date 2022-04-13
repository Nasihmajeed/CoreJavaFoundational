import java.util.Scanner;

public class Salary  {
 
public static void main(String [] args)  {

Scanner sc = new Scanner(System.in);

String name,designation;
int basicpay,HRA,PF,DA,NETSALARY;

System.out.println("Enter Name:");
name = sc.nextLine();

System.out.println("Enter designation:");
designation = sc.nextLine();

System.out.println("Enter Basic Pay:");
basicpay = sc.nextInt();

if(basicpay<10000)  {

DA = basicpay*60/100;
System.out.println("His DA is:" + DA);

PF = basicpay*15/100;
System.out.println("His PF is:" + PF);

HRA = 500;
System.out.println("HRA is" + HRA);

NETSALARY = basicpay+DA+HRA-PF;
System.out.println("His Net Salary Is:" + NETSALARY);

}
if (basicpay>=10000)  {
DA = basicpay*75/100;
System.out.println("His DA is:" + DA);

PF = basicpay*20/100;
System.out.println("His PF Is:" + PF);

HRA = 500;
System.out.println("HRA Is:" + HRA);

NETSALARY = basicpay+DA+HRA-PF;
System.out.println("His Net Salary Is:" + NETSALARY);
}
}
}









