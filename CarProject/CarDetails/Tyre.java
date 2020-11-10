package CarDetails;
import java.util.*;
public class Tyre{
	String type;
	String model;
	int rate;
	Scanner s = new Scanner(System.in);
	Tyre[] t;
	public void tyredetails(int n){
		t = new Tyre[n];
		
		for(int i=0; i<n; i++){
		    System.out.println("______Enter the "+(i+1)+" Car Tyre Details______");
			t[i] = new Tyre();
			System.out.println("Enter The Type of Tyres :");
		    t[i].type =  s.nextLine();
		    System.out.println("Enter model of Tyre :");
		    t[i].model = s.nextLine();
		    System.out.println("Enter rate of Tyre :");
		    t[i].rate = s.nextInt();
		    s.nextLine();  
		}
		
		
	}
	public void printtyredetails(int n){
		
		for(int i=0; i<n; i++){
		    System.out.println("\n_____The "+(i+1)+" Car tyre details_____");
		    System.out.println(t[i].type);
		    System.out.println(t[i].model);
		    System.out.println(t[i].rate);	
		}
		
	}
}
