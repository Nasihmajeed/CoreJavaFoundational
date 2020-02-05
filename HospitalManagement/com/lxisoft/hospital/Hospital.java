package com.lxisoft.hospital;
import java.util.*;
public class Hospital
{
	private String hospitalName = "MIMS HOSPITAL";
	private String hospitalAdress = "KERALA KOZHIKODE GOVINDAPURAM 673016";
	Registration registration;
	static Scanner sc = new Scanner(System.in);
	public void setHospitalName(String hospitalName)
	{
		this.hospitalName = hospitalName;
	}
	public void setHospitalAdress(String hospitalAdress)
	{
		this.hospitalAdress = hospitalAdress;
	}	
	public String getHospitalName()
	{
		return hospitalName;
	}
	public String getHospitalAdress()
	{
		return hospitalAdress;
	}	

	public void createHospital()
	{
		hospitalDetails();
		registration = new Registration();
		int choice;
		do
		{
			System.out.println("\t\t1.Registration\n\t\t2.View Doctor\n\t\t3.Services\n\t\t4.Appoinments\n\t\tSelect a valid choice::");
		
			choice = sc.nextInt();
			switch (choice) 
			{
			case 1:registration.startRegistration();break;
			case 2://viewDoctor();break;
			case 3://viewServices();break;
			case 4://viewAppointment();break;
			default:System.out.println("\t\tEnter valid choice?");break;	
			}

		}while(choice!=0);
			
	}

	public void hospitalDetails()	
	{
		System.out.println("\t\t***** "+getHospitalName() +" *****");
		System.out.println("\t\t--------------------------------------");
		System.out.println("\t\tAdress==>> "+getHospitalAdress());
	}
	

}