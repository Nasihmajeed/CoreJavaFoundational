import java.util.Scanner;

public class Tyres
{
    String brand;
    String model;
    int radius;
	int price;
	int num;

    Scanner s = new Scanner(System.in);

	Tyres[] t;

    public void tyredetails(int n)
    {
		t = new Tyres[n];

        for(int i=0; i<n; i++ )
        {
			t[i] = new Tyres();
            System.out.println("\nEnter the number of Tyres of car " + (i+1));
		    num = s.nextInt();

		 
			    System.out.println("Tyres");

				System.out.println("Brand	");
				t[i].brand = s.next();

				System.out.println("Model " );
				t[i].model = s.next();

				System.out.println("Radius 	");
				t[i].radius = s.nextInt();

				System.out.println("price 	");
		
        }
	}
	public void printTyreDetails(int n){

	
		
		for(int i=n; i<=n; i++)
		{
			System.out.println("**********************");
			System.out.println("Details of car" + (i+1) + " Tyres");
		    System.out.println("No.of Tyres  : " + num);
			
		    System.out.println("Brand  : " + t[i].brand);
			System.out.println("Model  : " + t[i].model);	
			System.out.println("Radius : " + t[i].radius);
			System.out.println("Price  : " + t[i].price);
		}



		
	}
}