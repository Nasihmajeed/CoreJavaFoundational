import java.util.Scanner;
public class Fibonocci {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
 System.out.println("FIBONACCI SERIES");
  System.out.println("Enter the number of elements:");
  int num = sc.nextInt();
  int t1, t2, t3, i;
  t1 = 0;
  t2 = 1;
System.out.println(" Fibonocci Series is:");
  System.out.println(t1+"\n"+t2);
  for (i = 3; i <= num; i++) {
    t3 = t1 + t2;
    System.out.println(t3);
    t1 = t2;
    t2 = t3;
  }
}
}