package com.Lxisoft.HospitalApp;
import com.Lxisoft.HospitalApp.*;
import java.util.*;

public class Patient
{
	private String name;
	private int number;
	private String desease;
	Manager manager =new Manager();
	Booking booking = new Booking();	

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;

	}

	public void setPhoneNumber(int number)
	{
		this.number = number;
	}
	public int getPhoneNumber()
	{
		return number;
	}


	public void setDesease(String desease)
	{
		this.desease = desease;
	}
	public String getDesease()
	{
		return desease;
	}

	
	public void menu(ArrayList<Patient> patients)
	{

    int choice=0;
    Scanner scanner = new Scanner(System.in);
    do
    {
      System.out.println("\n________________________");
      System.out.println("\n\n1. Appoiment Booking \n\nPress 0 for Exit \n");
      choice=scanner.nextInt();

        if(choice==1)
        {
		    booking.bookAppoinment(patients);  
        }
    
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
      while(choice>0);
  }

 
}

