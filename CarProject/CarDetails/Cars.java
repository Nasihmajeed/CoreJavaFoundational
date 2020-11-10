package CarDetails;
import java.util.*;
public class Cars{
 	String brand_name;
	String model_name;
	String owner_name;
	String color;
	int boo;
	Scanner s = new Scanner(System.in);
	
	
	Doors d = new Doors();
	Tyre t = new Tyre();
	Steering steer = new Steering();
	Cars[] c;    
	public void cardetails(int n){
		c = new Cars[n];
		for(int i=0; i<n; i++){
			c[i] = new Cars();
			System.out.println("_____Entering "+(i+1)+" Car details_____");
		    
		    System.out.println("Enter the brand of the Car :");
		    c[i].brand_name = s.nextLine();
		    System.out.println("Enter the model of the Car :");
		    c[i].model_name = s.nextLine();
		    System.out.println("Enter the owner of the Car :");
		    c[i].owner_name = s.nextLine();
		    System.out.println("Enter the color of the Car :");
		    c[i].color = s.nextLine();
		    System.out.println("Is there any driver for the car : 1:Yes 0:NO");
		    c[i].boo = s.nextInt();
		    s.nextLine();		    
		} 
		t.tyredetails(n);
		d.doordetails(n);
		steer.steeringdetails(n);
	}
	public void find(int n){
		for(int i=0; i<n; i++){
			if(c[i].boo==0){
				System.out.println("\nThe car "+(i+1)+"s owner itself is the driver");
			}
			else{
				System.out.println("\nThe car "+(i+1)+" has a driver ");
			}
		}
	}
	public void printcardetails(int n){
		for(int i=0; i<n; i++){
			System.out.println("\n______Display the "+(i+1)+" Car details_____");
			System.out.println("The "+(i+1)+" Car details : ");
		    System.out.println("The brand of car : "+c[i].brand_name);
		    System.out.println("The model of car : "+c[i].model_name);
		    System.out.println("The owner of the car : "+c[i].owner_name);
		    System.out.println("The color of the car : "+c[i].color);
		    
		}
		t.printtyredetails(n);
		d.printdoordetail(n);
		steer.printsteer(n); 	
	}
}
















