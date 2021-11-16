import java.util.Scanner;
import java.lang.Math;
public class Intrest {

public static void main(String[]args) {

  double p = 1000000, r = 0.125, n = 4, t = 10;
  double simpleInterest = p * r * t;
 double power = Math.pow((1 + r / n), n * t);
  double cTotal = p * power;
  double compoundInterest = cTotal - p;
  double sTotal = p + simpleInterest;
  System.out.println("principal\tInterest\t\t\tTotal\t\t\tInterest Type");
  System.out.println(
      "-------------------------------------------------------------------------------------");
  System.out.println(p+"\t"+simpleInterest+"\t\t\t"+sTotal+"\t\tSimple Interest");
 System.out.println(p+"\t"+compoundInterest+"\t\t"+cTotal+"\tCompound Interest");
}
}