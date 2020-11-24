package com.Lxisoft.HospitalApp;
import com.Lxisoft.HospitalApp.*;
import java.util.*;

public class Doctor 
{
	private String name;
	private String department;
	private int code;
	Booking booking = new Booking();

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;

	}

	public void setDepartment(String department)
	{
		this.department = department;
	}
	public String getDepartment()
	{
		return department;
	}


	public void setCode(int code)
	{
		this.code = code;
	}
	public int getCode()
	{
		return code;
	}


	public void menu(ArrayList<Patient> patients)
	{
	 int choice=0;
    Scanner scanner = new Scanner(System.in);

	do
    {
      
      System.out.println("\n________________________");
      System.out.println("\n\n1. View Patients  \n\nPress 0 for Exit \n");
      choice=scanner.nextInt();

        if(choice==1)
        {
          booking.viewPatients(patients);
        }
        
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
      while(choice>0);

	}
}