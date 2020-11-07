package CarDetails;
import java.util.*;
public class Cars{
 	String brand_name;
	String model_name;
	String owner_name;
	String color;
	Scanner s = new Scanner(System.in);
	
	public void cardetails(){
		Cars c = new Cars();
		System.out.println("Enter the brand of the Car :");
		c.brand_name = s.nextLine();
		System.out.println("Enter the model of the Car :");
		c.model_name = s.nextLine();
		System.out.println("Enter the owner of the Car :");
		c.owner_name = s.nextLine();
		System.out.println("Enter the color of the Car :");
		c.color = s.nextLine();
		Tyre t = new Tyre();
		t.tyredetails();
	    Doors d = new Doors();
	    d.doordetails();
	    Steering steer = new Steering();
	    steer.steeringdetails();
	}
	public void printcardetails(){
		System.out.println("The Car details : ");
		System.out.println("\n"+brand_name);
		System.out.println(model_name);
		System.out.println(owner_name);
		System.out.println(color);
	}
}
















