package com.lxisoft.CarApp;
import java.util.Scanner;
public class Vehicle
{
	Scanner s=new Scanner(System.in);
	Car[] car=new Car[10];
	int n;
	public void getCarDetails()
	{
	
	System.out.println (" \n Enter Number of Cars ");
	n=s.nextInt();
    s.nextLine();		
	for (int i=1; i<=n; i++)
	{
		car[i]=new Car();
        System.out.println("\n Enter Car " +i+  " details");

        System.out.println("\n Enter Name of Car : ");
		String name=s.nextLine();
        car[i].setName(name);

        System.out.println("\n Enter Company Name : ");
		String companyname=s.nextLine();
        car[i].setCompanyName(companyname);

        System.out.println("Enter Model :");
		int model=s.nextInt();
        car[i].setModel(model);
        s.nextLine();
		
		System.out.println("\n Enter Type of Vehicle: ");
		String type=s.nextLine();
        car[i].setType(type);
		s.nextLine();
	}
	}
	Owner[] owner=new Owner[10];
	public void getOwnerDetails()
	{
	for (int i=1; i<=n; i++)
	{
		owner[i]=new Owner();
        

        System.out.println("\n Enter Name of RC Owner : ");
		String rcowner=s.nextLine();
        owner[i].setRCOwner(rcowner);

        System.out.println("\n Enter RC Owner Adress : ");
		String rcadress=s.nextLine();
        owner[i].setRCAdress(rcadress);

        System.out.println("Enter Registration number :");
		String regNo=s.nextLine();
        owner[i].setRegNo(regNo);
        s.nextLine();
		
		System.out.println("\n Enter Regional Transport Office: ");
		String rto=s.nextLine();
        owner[i].setRTO(rto);
		s.nextLine();
	}
}
	public void printCarDetails()
	{
	   
		for (int i=1; i<=n; i++)
		{
		System.out.println("\n Car " +i+ " details are: ");
	    System.out.println("Car name:- "+car[i].getName());
	    System.out.println("Car Company name:- "+car[i].getCompanyName());
		System.out.println("Model :-"+car[i].getModel());
 	    System.out.println("Vehicle Type: "+car[i].getType());
		
	    System.out.println("RC Owner name:- "+owner[i].getRCOwner());
	    System.out.println("RC Owner Adress:- "+owner[i].getRCAdress());
		System.out.println("Registrion Number :-"+owner[i].getRegNo());
 		System.out.println("Regional Transport Office :-"+owner[i].getRTO());	    
		}
	}
}