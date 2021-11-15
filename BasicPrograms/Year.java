import java.util.Scanner;
public class Year{

 public static void main (String []  args)   {

Scanner sc = new Scanner(System.in);

  System.out.print("enter year:");
  int year = sc.nextInt();
  System.out.println("1.month");
  System.out.println("2.days");
  System.out.println("3.hours");
  System.out.println("4.minutes");
  System.out.println("5.seconds");
  System.out.println("select the mode of conversion");
  int mode = sc.nextInt();
  switch (mode) {
    case 1:
      int month = year * 12;
      System.out.println(month);
      break;
    case 2:
      int days = year * 365;
      System.out.println(days);
      break;
    case 3:
      int hour = year * 365 * 24;
     System.out.println(hour);
      break;
    case 4:
      int minutes = year * 365 * 24 * 60;
      System.out.println(minutes);
      break;
    case 5:
      int seconds = year * 365 * 34 * 60 * 60;
      System.out.println(seconds);
      break;
  }
 }
}