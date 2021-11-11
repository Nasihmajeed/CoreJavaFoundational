import java.util.Scanner;

public class Year {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
  System.out.println("Enter Year:");
  int year =  sc.nextInt();
  System.out.println("select the mode of conversion");
 System.out.println("1. Minutes");
  System.out.println("2. Hours");
  System.out.println("3. Days");
System.out.println("4. Months");
  System.out.println("5. Seconds");
  int mode = sc.nextInt();
  switch (mode) {
    case 1:
      int minutes = year * 365 * 24;
      System.out.println(minutes+"minutes");
      break;
    case 2:
      int hours = year * 365 * 24;
      System.out.println(hours+"hours");
      break;
    case 3:
      int days = year * 365;
      System.out.println(days+"days");
      break;
    case 4:
      int months = year * 12;
      System.out.println(months+"months");
      break;
    case 5:
      int seconds = year * 365 * 24 * 60 * 60;
      System.out.println(seconds+"seconds");
      break;
    default:
      System.out.println("invalid choice");
  }
}
}