package com.lxisoft.hospital;
import com.lxisoft.user.Patient;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Registration
{
	
	Patient patient;
	Scanner sc = new Scanner(System.in);
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	public void startRegistration()
	{
		System.out.println("\t\t***Registration UI***");
		
		int patientCount = 0;
		patientList.add(new Patient());
		System.out.print("\t\tName:");patientList.get(patientCount).setPatientName(sc.next());
		System.out.print("\t\tAdress:");patientList.get(patientCount).setPatientAdress(sc.next());
		System.out.print("\t\tDisease:");patientList.get(patientCount).setPatientDisease(sc.next());
		patientCount++;
		
	}
	public void viewRegistration()
	{
		System.out.println("\t\t***Registration UI***");
		Iterator itr = patientList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
		

	}
	
}