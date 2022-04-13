import java.util.Scanner;

public class Fibonacci  {
public static void main(String [] args)  {
Scanner sc = new Scanner(System.in);

  int n, i, n0 = 0, n1 = 1, n2;
  System.out.println("FIBONACCI SERIES");

  System.out.println("enter the elements of sequens");
  n = sc.nextInt();
  System.out.println("fibonacci series is");

  for (i = 1; i <= n; i++) {
    System.out.println(n0);

    n2 = n1 + n0;
    n0 = n1;
    n1 = n2;
  }
}
}