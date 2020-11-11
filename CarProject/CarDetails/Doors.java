package CarDetails;

import java.util.Scanner;

public class Doors 
{
    String side;
    String position;
    String type;
    int n;

    Scanner s = new Scanner(System.in);

    public void doordetails(int n)
    {
        for(int i=0; i<n; i++ )
        {
            System.out.println("\nEnter the number of doors of car " + (i+1));
		    n = s.nextInt();

            for (int j=0; j<n; j++ )
            {
                System.out.println("------>Door " +(j+1));

		    	System.out.println("Enter the Side " );
		    	side = s.next();

		    	System.out.println("Enter the position ");
		    	position = s.next();

		    	System.out.println("Handle type		");
		    	type = s.next();

            }
        }
    }

	// public void door(int n) {
	// }

	// public void printdoor(int n) {
	// }
}
