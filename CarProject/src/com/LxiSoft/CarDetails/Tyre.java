package com.LxiSoft.CarDetails;
import java.util.*;
public class Tyre{
	String type;
	String model;
	int numofTyre;
	Scanner s = new Scanner(System.in);
	Tyre[] t;
	public void tyreDetails(int n){
		
		for(int i=0; i<n; i++){
		    System.out.println("______Enter the "+(i+1)+" Car Tyre Details______");
			System.out.println("Enter the number of Tyres");
			numofTyre = s.nextInt();
			s.nextLine();
			t = new Tyre[numofTyre];
			for(int j=0; j<numofTyre; j++){
				t[j] = new Tyre();
			    System.out.println("Enter The Type of Tyres :");
		        t[j].type =  s.nextLine();
		        System.out.println("Enter model of Tyre :");
		        t[j].model = s.nextLine();
			}
			
		}
		
		
	}
	public void printTyreDetails(int n){
		
		for(int i=0; i<n; i++){
		    System.out.println("\n_____The "+(i+1)+" Car tyre details_____");
		    for(int j=0; j<numofTyre; j++){
		    	System.out.println(t[j].type);
		        System.out.println(t[j].model);	
		    }
		}
		
	}
}
