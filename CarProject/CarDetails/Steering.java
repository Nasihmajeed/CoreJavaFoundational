package CarDetails;
import java.util.*;
public class Steering{
	String type;
	int rate;
	Scanner s = new Scanner(System.in);
	public void steeringdetails(){
		Steering steer = new Steering();
		System.out.println("Enter The Type of Steering :");
		steer.type =  s.nextLine();
		System.out.println("Enter rate of Steering :");
		steer.rate = s.nextInt();
	}
}
	

















	/*Scanner s = new Scanner(System.in);
	public void enter(int n){
		String[] type = new String[20];
		int[] rate = new int[10];
		//System.out.println("Enter the steering details : ");
		for(int i=0; i<n; i++){
			System.out.println("Enter the "+(i+1)+" cars steering details : ");
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
}*/