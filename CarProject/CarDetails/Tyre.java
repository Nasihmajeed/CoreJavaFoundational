package CarDetails;
import java.util.*;
public class Tyre{
	String type[10];
	String model[10];
	int rate[10];
	Scanner s = new Scanner(System.in);
	public void enter(int n){
		System.out.println("Enter the Tyre details : ");
		for(int i=0; i<n; i++){
			System.out.println("Enter the tyre type : ");
			type[i] = s.nextLine();
			System.out.println("Enter the tyre model : ");
			model[i] = s.nextLine();
			System.out.println("Enter the rate of tyre : ");
			rate[i] = s.nextInt();
		}
	}
	public void display(int n){
		for(int i=0; i<n; i++){
			System.out.println("Tyre type : "+type[i]);
			System.out.println("Tyre Model : "+model[i]);
			System.out.println("Tyre Rate : "+rate[i]);
		}
	}
}