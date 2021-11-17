import java.util.Scanner;

public class Intrest  {

public static void main( String [] args) {



  double p, n, t, i, si, ci, totsi, totci;
  p = 1000000;
  i = 12.5;
  i = i / 100;
  t = 10;
  n = 4;
  si = p * i * t;
  totsi = p + si;
  ci = p*(Math.pow((1 + i / n), n * t));
  totci = ci - p;
System.out.println("Single Intrest");
System.out.println("Principal is:" + p);
System.out.println("Intrest is:" + si);
System.out.println("Total amount is:" + totsi);

System.out.println("Compount Intrest");
System.out.println("Principal Is:" +p);
System.out.println("Intrest Is:" + ci);
System.out.println("Total amount Is:" + totci);
  }
}