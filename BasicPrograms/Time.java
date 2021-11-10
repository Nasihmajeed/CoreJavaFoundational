import java.util.Scanner;
public class Time {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Convert Time");
System.out.println("Enter the time to be converted");
int time = sc.nextInt();
System.out.println("Select the mode of conversion");
System.out.println("1.Convert to Hours");
 System.out.println("2. Minutes");
  System.out.println("3. Convert to Seconds");
int mode = sc.nextInt();
switch (mode) {
    case 1:
      int hour = time / 60;
      System.out.println(hour);
      break;
    case 2:
      System.out.println(time);
      break;
    case 3:
      int seconds = time * 60;
 System.out.println(seconds);
      break;
    default:
      System.out.println("Invalid Choice");
}
}
}


