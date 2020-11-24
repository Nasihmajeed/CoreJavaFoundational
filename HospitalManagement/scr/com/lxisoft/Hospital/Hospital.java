package com.lxisoft.Hospital;
import java.util.ArrayList;
import java.util.Scanner;
public class Hospital
{
	ArrayList<Doctors> doc = new ArrayList<Doctors>();
     public void hospitalDetails()
   {
      System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("\n"); 
      System.out.println("                                                  WELCOME TO WELCARE HOSPITAL                                                        ");
      System.out.println("\n");
      System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                         WELCARE HOSPITAL                                                       -");
      System.out.print("\n");
      System.out.print("-                                                     --------------------------                                                 -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-       NAME OF THE HOSPITAL  : WELLCARE                                                                                         -");
      System.out.print("\n");
      System.out.print("-       OWNER  : ADARSH                                                                                                          -");
      System.out.print("\n");
      System.out.print("-       PLACE : PALAKKAD                                                                                                         -");
      System.out.print("\n");
      System.out.print("-       ADDRESS : WELCARE                                                                                                        -");
      System.out.print("\n");
      System.out.print("-                 (po) WELCARE JUNTION , SHORNOR RD                                                                              -");
      System.out.print("\n");
      System.out.print("-                 PALAKKAD , KERALA                                                                                              -");
      System.out.print("\n");
      System.out.print("-                 PINCODE : 6786006                                                                                              -");
      System.out.print("\n");
      System.out.print("-       CONTACT NUM : 1009080706                                                                                                 -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n"); 
      System.out.print(" ");
    }
    public void indexofHospital()
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("                                       ");
    	System.out.print("\n"); 
    	System.out.print("-------------------------------------------------------------------------");
    	System.out.print("\n"); 
    	System.out.print("\n"); 
    	System.out.print("\n"); 
    	System.out.print(" 1. MANAGER  \n 2. DOCTORS  \n 3. PATIENTS \n");
    	System.out.print("\n"); 
    	int choice = scanner.nextInt();
    	if(choice==1)
    	{
    		System.out.print("\n"); 
    		this.managerDetails();
    		System.out.print("\n"); 
    		this.indexofHospital();
    	}
    	else if(choice==2)
    	{
    		System.out.print("\n"); 
    		this.doctorsDetails();
    		System.out.print("\n"); 
    		this.indexofHospital();
    	}
    	else if(choice==3)
    	{
    		System.out.print("\n"); 
    		this.patientsDetails();
    		System.out.print("\n"); 
    	}
     else
    	{
    		System.out.print(" invalid choice ");
    	}
    }
    public void managerDetails()
    {
      Scanner scanner = new Scanner(System.in);
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                         WELCARE HOSPITAL                                                       -");
      System.out.print("\n");
      System.out.print("-                                                     --------------------------                                                 -");
      System.out.print("\n");
      System.out.print("-       NAME OF THE MANAGER  : ROHN                                                                                              -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n"); 
      System.out.print("\n"); 
      System.out.print("\n"); 
      System.out.print("\n"); 
      System.out.print(" 1. ADD DOCTORS  \n 2. DELETE DOCTORS \n 3. BACK TO MAIN ");
      System.out.print("\n"); 
      int choice = scanner.nextInt();
    	if(choice==1)
    	{
    		System.out.print("\n"); 
    		this.managerAddDoctors();
    		System.out.print("\n"); 
    		this.managerDetails();
    	}
    	else if(choice==2)
    	{
    		System.out.print("\n");
    		this.managerDeleteDoctors();
    		System.out.print("\n"); 
    		this.managerDetails();
    	}
    	else if(choice==3)
    	{
    		System.out.print("\n"); 
    		this.indexofHospital();
    		System.out.print("\n"); 
    	}
    	else
    	{
    		System.out.print("\n"); 
    		System.out.print(" invalid choice ");
            System.out.print("\n"); 
    		this.managerDetails();
    	}
    }
     public void managerAddDoctors()
	{  
		Scanner sca = new Scanner(System.in);
		this.doctorsDetails();
	    System.out.println(" IF YOU WANT TO ADD DOCTORS PRESS 0 ");
	    int c = sca.nextInt();
	    System.out.print("\n"); 
    	System.out.println(" ----------------------------------------------------------------------------- ");
    	System.out.print("\n"); 
    	if(c==0)
       {
    		System.out.print(" HOW MANY DOCTORS YOU WANT ADD: ");
		    int index = sca.nextInt();
		    index = index + doc.size();
		 for(int i=doc.size();i<index;i++)
		 {
			doc.add(new Doctors());
			System.out.print("\n Enter the Name of the Doctor : Name :");
			doc.get(i).setDoctorName(sca.next());
			System.out.print("\n Enter the Specification of the Doctor :  ");
			doc.get(i).setSpecification(sca.next());
            System.out.print("\n Enter the Id Number of the Doctor :  ");
			doc.get(i).setId(sca.nextInt());
			System.out.print("\n Enter the Time when Doctor Arrive :  ");
			doc.get(i).setTime(sca.nextInt());


			System.out.print("\n"); 
		 }
		    System.out.print("\n");
		    this.getAddedDoctors();
		}
	}
    public void getAddedDoctors()
	{
		System.out.print("\n            EDITED DOCTORS DETAILS           ");
		System.out.print("\n");
		for(int i=0;i<doc.size();i++)
		{
			if(doc.get(i) instanceof Doctors)
			{
				System.out.print((i+1)+" DOCTOR NAME : "+doc.get(i).getDoctorName()+"\n"+" "+" DOCTORS SPECIFICATIONS : "+doc.get(i).getSpecification()+"\n"+" "+" DOCTOR ID NUMBER : "+doc.get(i).getId()+"\n"+" "+" ARRIVING TIME OF DOCTOR  : "+doc.get(i).getTime()+" "+"am"+"\n");
			    System.out.print("\n");
			}
		}
	}
	public void managerDeleteDoctors()
	{
      Scanner sca = new Scanner(System.in);
      System.out.print(" ENTER THE NUMBER OF THE DOCTOR YOU WANT TO DELETE ");
      int i = sca.nextInt();
      doc.remove(i);
      this.getDeletedDoctors();
	}
	 public void getDeletedDoctors()
	{
		System.out.print("\n            EDITED DOCTORS DETAILS           ");
		System.out.print("\n");
		for(int i=0;i<doc.size();i++)
		{
			if(doc.get(i) instanceof Doctors)
			{
				System.out.print((i+1)+" DOCTOR NAME : "+doc.get(i).getDoctorName()+"\n"+" "+" DOCTORS SPECIFICATIONS : "+doc.get(i).getSpecification()+"\n"+" "+" DOCTOR ID NUMBER : "+doc.get(i).getId()+"\n"+" "+" ARRIVING TIME OF DOCTOR  : "+doc.get(i).getTime()+" "+"am"+"\n");
			    System.out.print("\n");
			}
		}
	}
    public void doctorsDetails()
    {
    	
    	doc.add(new Jis());
		doc.get(0).setDoctorName("Jiz");
		doc.get(0).setSpecification("Surgeon");
		doc.get(0).setTime(10);
		doc.get(0).setId(1);


		doc.add(new Razik());
		doc.get(1).setDoctorName("Razik");
		doc.get(1).setSpecification("Pediatrician"); 
		doc.get(1).setTime(9);
		doc.get(1).setId(2);


		for(int i=0;i<doc.size();i++)
		{
			System.out.print("\n");
			System.out.print((i+1)+" DOCTOR NAME : "+doc.get(i).getDoctorName()+"\n"+" "+" DOCTORS SPECIFICATIONS : "+doc.get(i).getSpecification()+"\n"+" "+" DOCTOR ID NUMBER : "+doc.get(i).getId()+"\n"+" "+" ARRIVING TIME OF DOCTOR  : "+doc.get(i).getTime()+" "+"am"+"\n");
			System.out.print("\n");
		}
    }

     public void patientsDetails()
     {
     	Scanner scanner = new Scanner(System.in);
        System.out.print("\n"); 
    	System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n");
      System.out.print("-                                                         WELCARE HOSPITAL                                                       -");
      System.out.print("\n");
      System.out.print("-                                                     --------------------------                                                 -");
      System.out.print("\n");
      System.out.print("-                                                                                                                                -");
      System.out.print("\n");
      System.out.print("----------------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n"); 
      System.out.print("\n"); 
      System.out.print("\n"); 
      System.out.print("\n");  
    	System.out.print(" 1. SEARCH DOCTORS ");
    	System.out.print("\n"); 
    	int choice = scanner.nextInt();
    	if(choice==1)
    	{
    		System.out.print("\n"); 
    		this.searchDoctorsandAppointment();
    		System.out.print("\n"); 
    	}
    	else
    	{
    		System.out.print(" invalid choice ");
    	}
    	this.indexofHospital
    	();
     }

     public void searchDoctorsandAppointment()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("           SEARCH DOCTORS           ");
		System.out.println(" --------------------------------- ");
   		System.out.println("ENTER THE NAME OF THE DOCTOR YOU WANT TO SEARCH :");
        String doctorName = scanner.next();
        for(int i=0;i<doc.size();i++)
        {
        	if(doctorName.equals(doc.get(i).getDoctorName()))
        	{
        		System.out.print("\n");
        		System.out.println("           BOOK APPOINMENT          ");
        		System.out.println(" --------------------------------- ");
        		System.out.println(" IF YOU WANT TO APPOINTMENT PRESS 1 ");
                int k = scanner.nextInt();
        		if(k==1)
        		{
        			System.out.print("ENTER THE TIME WHEN YOU WANT APPOINTMENT : ");
        			int t = scanner.nextInt();

        			if(t>=9)
      		       {
      			       System.out.println(" YOU WILL GET AN APPOINTMENT");
      			       System.out.println("\n");
      		        }
      		        else 
      		        {
      		        	System.out.print(" DOCTOR IS BUSY YOU CANT GET AN APPOINMENT ");
      		        }
        		}
        		else
        		{
        			System.out.print(" invalid choice ");
        			this.patientsDetails();
        		}
        	}
        }
        System.out.print("\n");
	}

}