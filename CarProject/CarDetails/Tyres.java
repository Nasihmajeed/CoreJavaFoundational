package CarDetails;

import java.util.Scanner;

public class Tyres
{
    String brand;
    String model;
    int radius;
    int price;

    Scanner s = new Scanner(System.in);

    public void tyredetails(int n)
    {
        for(int i=0; i<n; i++ )
        {
            System.out.println("\nEnter the number of Tyres of car " + (i+1));
		    int num = s.nextInt();

		    System.out.println("\nAre the tyres same?");
		    System.out.println("1. Yes \n2. No");
		    int same = s.nextInt();

		    if (same == 2 ) 
		    {
			    for ( int j=0; j<num ; j++ ) 
			    {
				    System.out.println("------>Tyre" +(j+1));

			    	System.out.println("Brand	");
			    	brand = s.next();

			    	System.out.println("Model " );
			    	model = s.next();

			    	System.out.println("Radius 	");
			    	radius = s.nextInt();

			    	System.out.println("price 	");
			    	price = s.nextInt();
			    }
		    }
		    else if (same == 1) 
		    {
			    System.out.println("------>Tyres");

				System.out.println("Brand	");
				brand = s.next();

				System.out.println("Model " );
				model = s.next();

				System.out.println("Radius 	");
				radius = s.nextInt();

				System.out.println("price 	");
				price = s.nextInt();
		    }
		    else
			    System.out.println("invalid");
        }
    }

	// public void tyre(int n) {
	// }

	// public void printtyre(int n) {
	// }
}
