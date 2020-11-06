package CarDetails;
import java.util.*;
public class Cars{
 	String brand_name[10];
	String model_name[10];
	String owner_name[10];
	String color[10];
	Scanner s =new Scanner(System.in);
	Tyre t = new Tyre();
	Door d = new Door();
	Steering s = new Steering();
	public void enter(int n){
		System.out.println("Enter the car details : ");
		for(int i=0; i<n; i++){
			System.out.println("Enter The brand name : ");
			brand_name[i] = s.nextLine();
			System.out.println("Enter the model name : ");
			model_name[i] = s.nextLine();
			System.out.println("Enter the owner name : ");
			owner_name[i] = s.nextLine();
			System.out.println("Enter the Color : ");
			color[i] = s.nextLine();
			t.enter(n);
			d.enter(n);
			s.enter(n);
		}
	}
	public void display(int n){
		for(int i=0; i<n; i++){
			System.out.println("Brand name : "+brand_name[i]);
			System.out.println("Model name : "+model_name[i]);
			System.out.println("Owner name : "+owner_name[i]);
			System.out.println("Color : "+color[i]);
			t.display(n);
			d.display(n);
			s.display(n);
		}
	}

}