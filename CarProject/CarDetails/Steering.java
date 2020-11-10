package CarDetails;
import java.util.*;
public class Steering{
	String type;
	int rate;
	Scanner s = new Scanner(System.in);
	Steering[] steer;
	public void steeringdetails(int n){
		steer = new Steering[n];
		for(int i=0;i<n; i++){
			steer[i] = new Steering();
			System.out.println("\n____Enter the "+(i+1)+" Car Steering details____ ");
			System.out.println("Enter type of Steering : ");
		    steer[i].type =  s.nextLine();
		    System.out.println("Enter rate of Steering :");
		    steer[i].rate = s.nextInt();
		    s.nextLine();
		}
		
	}
	/*public void check(int n){
		for(int i=0;i<n;i++){
		    if(steer[i].type==1){
		    	System.out.println("The car "+(i+1)+" have power steering");
		    }
		    else{
		    	System.out.println("The car "+(i+1)+" does not have a power steering");
		    }			
		}
	}*/
	public void printsteer(int n){
		for(int i=0; i<n; i++){
			System.out.println("\n___The "+(i+1)+" Car Steering details___ ");
			System.out.println("Rate : "+steer[i].rate);
		}
	}
	
}