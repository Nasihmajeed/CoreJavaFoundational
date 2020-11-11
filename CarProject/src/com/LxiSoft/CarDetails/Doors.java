package com.LxiSoft.CarDetails;
import java.util.*;
public class Doors{
	String side;
	String type;
	Scanner s = new Scanner(System.in);
	Doors[] d1;
	Doors[] d2;
	Doors[] d3;
	Doors[] d4;
	public void doorDetails(int n){
		d1 = new Doors[n];
		d2 = new Doors[n];
		d3 = new Doors[n];
		d4 = new Doors[n];
		for(int i=0; i<n; i++){
			d1[i] = new Doors();
			d2[i] = new Doors();
			d3[i] = new Doors();
			d4[i] = new Doors();
			System.out.println("_____Enter "+(i+1)+" Cars Door Details_____");
		    System.out.println("Enter the side of the door :");
		    d1[i].side = s.nextLine();
		    System.out.println("Enter The Type of Door :");
		    d1[i].type =  s.nextLine();
		    System.out.println("Enter the side of the door :");
		    d2[i].side = s.nextLine();
		    System.out.println("Enter The Type of Door :");
		    d2[i].type =  s.nextLine();
		    System.out.println("Enter the side of the door :");
		    d3[i].side = s.nextLine();
		    System.out.println("Enter The Type of Door :");
		    d3[i].type =  s.nextLine();
		    System.out.println("Enter the side of the door :");
		    d4[i].side = s.nextLine();
		    System.out.println("Enter The Type of Door :");
		    d4[i].type =  s.nextLine();
		}
	}
	public void printDoorDetail(int n){
		
		for (int i=0;i<n;i++){
			System.out.println("\n______"+(i+1)+" Cars Door Details_____");
			System.out.println("Door Side : "+d1[i].side);
			System.out.println("Door Type : "+d1[i].type);
			System.out.println("Door Side : "+d2[i].side);
			System.out.println("Door Type : "+d2[i].type);
			System.out.println("Door Side : "+d3[i].side);
			System.out.println("Door Type : "+d3[i].type);
			System.out.println("Door Side : "+d4[i].side);
			System.out.println("Door Type : "+d4[i].type);
		}
	}
}
   