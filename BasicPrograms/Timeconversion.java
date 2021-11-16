import java.util.Scanner;
public class Timeconversion
{
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
double time;

System.out.println("Enter the number of years to be converted:");
int year= sc.nextInt();

System.out.println("Convert year to\tvalue of x\n---------------\t-----------\nMinutes\t\t1\nHours\t\t2\nDays\t\t3\nMonths\t\t4\nSeconds\t\t5");
System.out.println("Enter the value of x as per the requirement");
int x=sc.nextInt();

switch(x)
{
case 1:
time=year*365*24*60;
System.out.println(year+ "YEARS = "+time+" MINUTES");
break;

case 2:
time=year*365*24;
System.out.println(year+"YEARS = "+time+" HOURS");
break;

case 3:
time=year*365;
System.out.println(year+" YEARS = "+time+" DAYS");
break;

case 4:
time=year*12;
System.out.println(year+" YEARS = "+time+" MONTHS");
break;

case 5:
time=year*365*24*60*60;
System.out.println(year+" YEARS = "+time+" SECONDS");
break;

default:
break;
}
}
}