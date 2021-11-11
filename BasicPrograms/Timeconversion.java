import java.util.Scanner
public class Timeconversion
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double time;
int x;
System.out.println("Enter the number of  minutes to be converted:");
double minute= sc.newInt();

System.out.println("Convert minute to\tvalue of x\n---------------\t-----------\n\nHours\t\t1\nMinutes\t\t2\nSeconds\t\t3");
System.out.println("Enter the value of x as per the requirement");
x=sc.newInt();
switch(x)
{
case 1:
time=minute/60;
System.out.println(minute+" MINUTES= "+time+ "HOURS");
break;

case 2:
time=minute/1;
System.out.println(minute+ "MINUTES = "+time+" MINUTES");
break;

case 3:
time=minute*60;
System.out.println(minute+" MINUTES = "+time+ "SECONDS");
break;

default:
break;
}
}
}