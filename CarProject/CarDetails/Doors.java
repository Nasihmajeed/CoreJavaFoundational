package CarDetails;
import java.util.*;
public class Doors{
	String side[20];
	String type[10];
	int rate[10];
	Scanner s = new Scanner(System.in);
	public void enter(int n){
		System.out.println("Enter the Tyre details : ");
		for(int i=0; i<n; i++){
			for(int j=0; j<4; j++){
				System.out.println("Enter the side of the door : ");
				side[j] = s.nextLine();
				System.out.println("Enter the Type of the door : ");
				type[j] = s.nextLine();
				System.out.println("Enter the rate of door : ");
				rate[j] = s.nextLine();
			}
		}
	}
	public void display(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<4; j++){
				System.out.println("Side : "+side[j]);
				System.out.println("Type : "+type[j]);
				System.out.println("Rate : "+rate[j]);
			}
		}
	}
}