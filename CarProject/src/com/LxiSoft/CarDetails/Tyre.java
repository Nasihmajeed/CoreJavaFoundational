package com.LxiSoft.CarDetails;
import java.util.*;
public class Tyre{
	String type;
	String model;
	int numofTyre;
	Scanner s = new Scanner(System.in);
	Tyre[] t1;
	Tyre[] t2;
	Tyre[] t3;
	Tyre[] t4;
	public void tyreDetails(int n){
		t1 = new Tyre[n];
		t2 = new Tyre[n];
		t3 = new Tyre[n];
		t4 = new Tyre[n];
		for(int i=0; i<n; i++){
		    System.out.println("______Enter the "+(i+1)+" Car Tyre Details______");
			//System.out.println("Enter the number of Tyres");
			//numofTyre = s.nextInt();
			//s.nextLine();
			t1[i] = new Tyre();
			t2[i] = new Tyre();
			t3[i] = new Tyre();
			t4[i] = new Tyre();
			
			System.out.println("Enter The Type of Tyres :");
		    t1[i].type =  s.nextLine();
		    System.out.println("Enter model of Tyre :");
		    t1[i].model = s.nextLine();
		    System.out.println("Enter The Type of Tyres :");
		    t2[i].type =  s.nextLine();
		    System.out.println("Enter model of Tyre :");
		    t2[i].model = s.nextLine();
		    System.out.println("Enter The Type of Tyres :");
		    t3[i].type =  s.nextLine();
		    System.out.println("Enter model of Tyre :");
		    t3[i].model = s.nextLine();
		    System.out.println("Enter The Type of Tyres :");
		    t4[i].type =  s.nextLine();
		    System.out.println("Enter model of Tyre :");
		    t4[i].model = s.nextLine();
			
		}
		
	}
	public void printTyreDetails(int n){
		
		for(int i=n; i<=n; i++){
		    System.out.println("\n_____The "+(i+1)+" Car tyre details_____");
		    //for(int j=0; j<numofTyre; j++){
		    System.out.println(t1[i].type);
		    System.out.println(t1[i].model);
		    System.out.println(t2[i].type);
		    System.out.println(t2[i].model);
		    System.out.println(t3[i].type);
		    System.out.println(t3[i].model);
		    System.out.println(t4[i].type);
		    System.out.println(t4[i].model);	
		    //}
		}
		
	}
}
