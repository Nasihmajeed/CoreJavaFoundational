import java.util.Scanner;

public class Timeconversion  {

public static void main(String [] args) {

Scanner sc = new Scanner(System.in);

  double totalminutes, minute, second;
 System.out.println("enter total minutes");
  totalminutes = sc.nextInt();
  int hour = (int)totalminutes/ 60;
  minute = totalminutes % 60;
  second = totalminutes * 60;
  System.out.println("hour:" +hour);
  System.out.println("minute:"+minute);
  System.out.println("second:"+second);
}
}