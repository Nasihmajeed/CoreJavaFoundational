package CarDetails;
import java.util.*;

public class Cars
{
    String brand;
    String model;
    String color;
    int driver;
    int steering;

    Scanner s = new Scanner(System.in);

    Doors door = new Doors();
    Tyres tyre = new Tyres();
    
    Cars[] c;

    public void cardetails(int n)
    {
        c = new Cars[n];

        for( int i=0; i<n; i++ )
        {
            c[i] = new Cars();

            System.out.println(" ");
            System.out.println(">--Car " + (i+1) + " Details--<");

            System.out.println(" ");
		    System.out.println("Enter the Brand : ");
		    c[i].brand = s.next();

		    System.out.println("Enter the Model : ");
		    c[i].model = s.next();

		    System.out.println("Enter the Color : ");
            c[i].color = s.next();
            
            System.out.println(" ");
		    System.out.println("Steering type 	: ");
		    System.out.println("1. Power Steering \n2. Normal Steering");
		    c[i].steering = s.nextInt();

		    System.out.println("\nIs there a driver?");
		    System.out.println("1. Yes \n2. No");
            c[i].driver = s.nextInt();
        }

        tyre.tyredetails(n);
        door.doordetails(n);

    }

    public void printcardetails(int n)
    {
        for( int i=0; i<n; i++ )
        {
            System.out.println("\n\n");

            System.out.println(">---------------------<");
            System.out.println(">--Details of car" + (i+1) + "--<");
            System.out.println("\nBrand : " + c[i].brand + "\nModel : " + c[i].model + "\nColor : " + c[i].color);
            // System.out.println("number of doors : " + number + "\nNumber of tyres : " + num);
            
            if (c[i].steering==1) 
		    {
			    System.out.println("Power Steering");
		    }
		    else if (c[i].steering==2) 
		    {
			    System.out.println("Normal Steering");			
		    }
		    else
			    System.out.println("invalid");

		    if (c[i].driver==1) 
		    {
		    	System.out.println("Driver is not the Owner");
		    }
		    else if (c[i].driver==2) 
		    {
		    	System.out.println("Driver is the Owner");			
		    }
		    else{
                System.out.println("invalid");
            }

            tyre.printTyreDetails(i);
            door.printDoorDetail(i);
        
        }
        System.out.println(">---------------------<");
       
    }

}
