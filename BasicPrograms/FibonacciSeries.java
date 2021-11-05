import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3;
		  System.out.println("Enter the limit of the series: ");
		  Scanner scanner = new Scanner(System.in);
		  int limit = scanner.nextInt();
		  System.out.println("Fibanocci Series up to " + limit + " is :");
		  System.out.println(n1);
		  if (limit > 1) {
			  System.out.println(n2);
		    for (int i = 2; i < limit; i++) {
		      n3 = n1 + n2;
		      System.out.println(n3);
		      n1 = n2;
		      n2 = n3;
		    }
		  }

	}

}