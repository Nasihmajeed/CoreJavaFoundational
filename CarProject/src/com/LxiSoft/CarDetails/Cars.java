package com.LxiSoft.CarDetails;
import java.util.*;
public class Cars{
 	String brandName;
	String modelName;
	String ownerName;
	String color;
	int isDriver;
	Scanner s = new Scanner(System.in);	
	Doors d = new Doors();
	Tyre t = new Tyre();
	Steering steer = new Steering();
	Cars[] c;    
	public void carDetails(int n){
		c = new Cars[n];
		for(int i=0; i<n; i++){
			c[i] = new Cars();
			System.out.println("_____Entering "+(i+1)+" Car details_____");		    
		    System.out.println("Enter the brand of the Car :");
		    c[i].brandName = s.nextLine();
		    System.out.println("Enter the model of the Car :");
		    c[i].modelName = s.nextLine();
		    System.out.println("Enter the owner of the Car :");
		    c[i].ownerName = s.nextLine();
		    System.out.println("Enter the color of the Car :");
		    c[i].color = s.nextLine();
		    System.out.println("Is there any driver for the car : \n1:Yes \n0:NO");
		    c[i].isDriver = s.nextInt();
		    s.nextLine();		    
		} 
		t.tyreDetails(n);
		d.doorDetails(n);
		steer.steeringDetails(n);
	}
	public void findDriver(int n){
		for(int i=0; i<n; i++){
			if(c[i].isDriver==0){
				System.out.println("\nThe car "+(i+1)+"s owner itself is the driver");
			}
			else{
				System.out.println("\nThe car "+(i+1)+" has a driver ");
			}
		}
		steer.findSteering(n);
	}
	public void printCarDetails(int n){
		for(int i=0; i<n; i++){
			System.out.println("\n______Display the "+(i+1)+" Car details_____");
		    System.out.println("The brand of car : "+c[i].brandName);
		    System.out.println("The model of car : "+c[i].modelName);
		    System.out.println("The owner of the car : "+c[i].ownerName);
		    System.out.println("The color of the car : "+c[i].color);
		    t.printTyreDetails(i);
		    d.printDoorDetail(i);		    
		}
		 	
	}
}
