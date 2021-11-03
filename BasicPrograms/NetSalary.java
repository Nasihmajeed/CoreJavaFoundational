import java.util.Scanner;

public class NetSalary {

	public static void main(String[] args) {
		double pf, da, netSalary, hra = 500;
		  System.out.println("Enter employee name ");
		  Scanner scanner = new Scanner(System.in);
		  String name = scanner.nextLine();
		  System.out.println("Enter your designation ");
		  String designation = scanner.nextLine();
		  System.out.println("Enter your basic pay ");
		  int basicPay = scanner.nextInt();
		  if (basicPay < 10000) {
		    da = basicPay * 60 / 100;
		    pf = basicPay * 15 / 100;
		  } else {
		    da = basicPay * 75 / 100;
		    pf = basicPay * 20 / 100;
		  }
		  netSalary = basicPay + da + hra - pf;
		  System.out.println("Net Salary of " + name + " " +  designation + " is " + netSalary);
		}

	}
