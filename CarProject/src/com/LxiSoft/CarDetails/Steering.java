package com.LxiSoft.CarDetails;
import java.util.*;
public class Steering{
	int type;
	Scanner s = new Scanner(System.in);
	Steering[] steer;
	public void steeringDetails(int n){
		steer = new Steering[n];
		for(int i=0;i<n; i++){
			steer[i] = new Steering();
			System.out.println("\n____Enter the "+(i+1)+" Car Steering details____ ");
			System.out.println("Type of steering \n1:Power \n2:Normal");
			steer[i].type = s.nextInt();
			/*System.out.println("Enter type of Steering : ");
		    steer[i].type =  s.nextLine();
		    System.out.println("Enter rate of Steering :");
		    steer[i].rate = s.nextInt();
		    s.nextLine();*/
		}
		
	}
	
	public void findSteering(int n){
		for(int i=0; i<n; i++){
			if(steer[i].type == 1){
				System.out.println("The car "+(i+1)+" have power steering");
			}
			else{
				System.out.println("The car "+(i+1)+" have normal steering");
			}
			/*System.out.println("\n___The "+(i+1)+" Car Steering details___ ");
			System.out.println("Rate : "+steer[i].rate);*/
		}
	}
	
	
}