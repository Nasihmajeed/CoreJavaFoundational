package CarDetails;
import java.util.*;
public class Doors{
	String side;
	String type;
	int rate;
	Scanner s = new Scanner(System.in);
	public void doordetails(){
		Doors d1 = new Doors();
		Doors d2 = new Doors();
		Doors d3 = new Doors();
		Doors d4 = new Doors();
		System.out.println("Enter the side of the door :");
		d1.side = s.nextLine();
		System.out.println("Enter The Type of Door :");
		d1.type =  s.nextLine();
		System.out.println("Enter rate of Door :");
		d1.rate = s.nextInt();
		System.out.println("Enter the side of the door :");
		d2.side = s.nextLine();
		System.out.println("Enter The Type of Door :");
		d2.type =  s.nextLine();
		System.out.println("Enter rate of Door :");
		d2.rate = s.nextInt();
		System.out.println("Enter the side of the door :");
		d3.side = s.nextLine();
		System.out.println("Enter The Type of Door :");
		d3.type =  s.nextLine();
		System.out.println("Enter rate of Door :");
		d3.rate = s.nextInt();
		System.out.println("Enter the side of the door :");
		d4.side = s.nextLine();
		System.out.println("Enter The Type of Door :");
		d4.type =  s.nextLine();
		System.out.println("Enter rate of Door :");
		d4.rate = s.nextInt();
	}
}
    
   








    /*Steering steer = new Steering();
	Scanner s = new Scanner(System.in);
	public void enter(int n){
		String[] side = new String[20];
		String[] type = new String[20];
		int[] rate = new int[10];
		//System.out.println("Enter the Tyre details : ");
		for(int i=0; i<n; i++){
			System.out.println("Enter the "+(i+1)+" Cars Door details : ");
			for(int j=0; j<4; j++){
				System.out.println("Enter the side of the door : ");
				side[j] = s.nextLine();
				System.out.println("Enter the Type of the door : ");
				type[j] = s.nextLine();
				System.out.println("Enter the rate of door : ");
				rate[j] = s.nextInt();
                steer.enter(n);
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
}*/