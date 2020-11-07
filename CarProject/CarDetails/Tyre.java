package CarDetails;
import java.util.*;
public class Tyre{
	String type;
	String model;
	int rate;
	Scanner s = new Scanner(System.in);
	Tyre t = new Tyre();
	public void tyredetails(){
		
		System.out.println("Enter The Type of Tyres :");
		t.type =  s.nextLine();
		System.out.println("Enter model of Tyre :");
		t.model = s.nextLine();
	}
	public void printtyredetails(){
		
	}
}
	


























	/*//Doors d = new Doors();
	Scanner s = new Scanner(System.in);
	public void enter(int n){
		Tyre[] type = new Tyre[20];
	    Tyre[] model = new Tyre[50];
	    Tyre[] rate = new Tyre[10];
		//System.out.println("Enter the Tyre details : ");
		//for(int i=0; i<n; i++){
			Tyre[] type = new Tyre[n];
	        Tyre[] model = new Tyre[n];
	        Tyre[] rate = new Tyre[n];
			System.out.println("Enter the "+(i+1)+" Cars Tyre details : ");
			System.out.println("Enter the tyre type : ");
			type[i] = s.nextLine();
			System.out.println("Enter the tyre model : ");
			model[i] = s.nextLine();
			System.out.println("Enter the rate of tyre : ");
			rate[i] = s.nextInt();
			//d.enter(n);
		}
	}
	public void display(int n){
		String[] type = new String[50];
	    String[] model = new String[50];
	    int[] rate = new int[10];
		for(int i=0; i<n; i++){
			System.out.println("Tyre type : "+type[i]);
			System.out.println("Tyre Model : "+model[i]);
			System.out.println("Tyre Rate : "+rate[i]);
		}
	}
}*/