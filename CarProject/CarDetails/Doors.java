package CarDetails;
import java.util.*;
public class Doors{
	String side;
	String type;
	int rate;
	Scanner s = new Scanner(System.in);
	Doors[][] d;
	public void doordetails(int n){
		d = new Doors[n][4];
		for(int j=0; j<n; j++){
			System.out.println("_____Enter "+(j+1)+" Cars Door Details_____");
			for(int i=0; i<4; i++){
			    d[j][i] = new Doors();
			    System.out.println("Enter the side of the door :");
		        d[j][i].side = s.nextLine();
		        System.out.println("Enter The Type of Door :");
		        d[j][i].type =  s.nextLine();
		        System.out.println("Enter rate of Door :");
		        d[j][i].rate = s.nextInt();
		        s.nextLine();
		    }
		}
		
	}
	public void printdoordetail(int n){
		for(int j=0; j<n; j++){
			System.out.println("\n______"+(j+1)+" Cars Door Details_____");
			for (int i=0;i<4;i++){
			    System.out.println("Door Side : "+d[j][i].side);
			    System.out.println("Door Type : "+d[j][i].type);
			    System.out.println("Rate : "+d[j][i].rate);
		    }
		}
		
	}
}
   