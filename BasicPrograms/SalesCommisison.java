import java.util.Scanner;

public class SalesCommisison {

	public static void main(String[] args) {
		double commision;
		  System.out.println("Enter Sales :");
		  Scanner scanner = new Scanner(System.in);
		  int sales = scanner.nextInt();
		  if (sales < 10000) {
			  System.out.println("No Commision");
		  } else if (sales < 30000) {
		    commision = sales * 15 / 100;
		    System.out.println(commision);
		  } else {
		    commision = sales * 25 / 100 + 1000;
		    System.out.println(commision);
		  }
		}


	}