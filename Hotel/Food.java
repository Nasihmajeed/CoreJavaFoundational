import java.util.Scanner;

public class Food
{
	String name;
	int rate;
    
	Bill bill = new Bill();
	Scanner scanner;

public void setBill()
{
 scanner = new Scanner(System.in);

 System.out.println("\n Hotel NMR ");
 System.out.println("\n Bill ");
 bill.items = scanner.next();
 bill.total = scanner.nextInt();
}	

public void getBill()
{
	System.out.println("Food items: "+bill.items);
	System.out.println("Total amount: "+bill.total);
}

}