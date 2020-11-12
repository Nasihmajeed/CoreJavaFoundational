package com.LxiSoft.CarDetails;
import java.util.*;
public class Doors{
	String side;
	String type;
	int numofDoor;
	Scanner s = new Scanner(System.in);
	Doors[] d;
	public void doorDetails(int n){
		
		for(int i=0; i<n; i++){
			System.out.println("_____Enter "+(i+1)+" Cars Door Details_____");
			System.out.println("Enter the number of doors ");
		    numofDoor = s.nextInt();
		    s.nextLine();
		    d = new Doors[numofDoor];
			for(int j=0; j<numofDoor; j++){
				d[j] = new Doors();			
		        System.out.println("Enter the side of the door :");
		        d[j].side = s.nextLine();
		        System.out.println("Enter The Type of Door :");
		        d[j].type =  s.nextLine();
			}
			
		}
	}
	public void printDoorDetail(int n){
		
		for (int i=0;i<n;i++){
			System.out.println("\n______"+(i+1)+" Cars Door Details_____");
			for(int j=0; j<numofDoor; j++){
				System.out.println("Door Side : "+d[j].side);
			    System.out.println("Door Type : "+d[j].type);
			}
		}

	}
}
   