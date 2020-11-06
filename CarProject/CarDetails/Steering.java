package CarDetails;
import java.util.*;
public class Steering{
	String type[10];
	int rate[10];
	Scanner s = new Scanner(System.in);
	public void enter(int n){
		System.out.println("Enter the steering details : ");
		for(int i=0; i<n; i++){
			System.out.println("Enter the steering type : ");
			type[i] = s.nextLine();
			System.out.println("Enter the rate : ");
			rate[i] = s.nextInt();
		}
	}
	public void display(int n){
		for(int i=0; i<n; i++){
			System.out.println("Steering type : "+type[i]);
			System.out.println("Steering rate : "+rate[i]);
		}
	}
}