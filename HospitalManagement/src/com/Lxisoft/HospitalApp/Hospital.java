package com.Lxisoft.HospitalApp;
import com.Lxisoft.HospitalApp.*;
import java.util.*;

public class Hospital
{
	ArrayList<Patient> patients = new ArrayList<Patient>();
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	Doctor doctor= new Doctor();
	Patient patient = new Patient();
	Manager manager = new Manager();

	public void intro()
	{
		System.out.println("\n\t\t------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t-------------- LXI Hospital   -------------\t");
   		System.out.println("\t\t--------------- Pathripala ------------------\t");
   		System.out.println("\t\t--------------  Phone 0987654321-----------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		System.out.println("\t\t------- Scripted by -----------------------\t");
   		System.out.println("\t\t---------------- Faris --------------------\t");
   		System.out.println("\t\t-------------------------------------------\t");
   		
   		this.mainMenu();
	}
	    public void mainMenu()
{  
		Scanner scanner = new Scanner(System.in);
 		int choice=0;

    do
    {
      System.out.println("\n________________________");
        System.out.println("\n\n1. For Manager  \n\n2. For Doctors  \n\n3. For Patients \n\nPress 0 for Exit \n");
        choice=scanner.nextInt();
        if(choice==1)
        {
      	  manager.menu(doctors);   
        }
        if(choice==2)
        {
             
           doctor.menu(patients);         
        }
        if(choice==3)
        {
        	patient.menu(patients);
        }
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
    while(choice>0);
      
	}


 }	
