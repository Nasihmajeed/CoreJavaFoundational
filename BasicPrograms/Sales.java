import java.util.Scanner;
public class Sales  {
public static void main(String [] args) { 
Scanner sc = new Scanner(System.in);

  String name;
  int sales;

  System.out.print("enter name:");
  name = sc.nextLine();

  System.out.println("enter the sales:");
  sales = sc.nextInt();

  if (sales < 10000) {
    System.out.println("the saleseman has no commission");
  }
  if (sales >= 10000 && sales < 30000) {
    double com = sales * 15 / 100;
    System.out.println("commission is" +com);
    System.out.println("the sales man won 15% coomission of sales");
  }
  if (sales >= 30000) {
    double com = sales * 25 / 100;
    int bonus = 1000;
    System.out.println("commission is" + com);
    System.out.println("sales man won commission 25% of sales");
    System.out.println(" he won extra banus" +bonus);
  }
}
}