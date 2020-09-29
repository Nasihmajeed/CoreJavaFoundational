import java.util.Scanner;
public class Menu
{
public void quantity(int price)
{
int Total,qty;
System.out.println("\nEnter the quantity");
Scanner scanner = new Scanner(System.in);
qty=scanner.nextInt();
Total=price*qty;
System.out.println("\nThe total is"+Total);
}
}
