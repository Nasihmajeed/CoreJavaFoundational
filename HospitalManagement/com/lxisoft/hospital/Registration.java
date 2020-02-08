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
	public ArrayList<Patient> startRegistration(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		doctor.viewDoctor(doctor,doctorList);
		System.out.println("\t\t***Registration UI***");
		int patientCount = 0;
		patientList.add(new Patient());
		System.out.print("\t\tName:");patientList.get(patientCount).setPatientName(sc.next());
		System.out.print("\t\tAdress:");patientList.get(patientCount).setPatientAdress(sc.next());
		System.out.print("\t\tDisease:");patientList.get(patientCount).setPatientDisease(sc.next());
		patientCount++;
		return patientList;
	}
	public void adminViewRegistration(Doctor doctor,ArrayList<Doctor> doctorList)
	{	
		if(patientList.size()==0)
		{
			System.out.println("\t\tNo Patients");
		}
		else
		{
			System.out.println("\tID  NAME ADDRESS  DISEASE  ");
			System.out.println("\t-------------------------------");
			for(int i=0;i<patientList.size();i++)
			{
				System.out.print("\t"+i);
				System.out.print("    "+patientList.get(i).getPatientName()+"\t");
				System.out.print(patientList.get(i).getPatientAdress()+"\t");
				System.out.print("   "+patientList.get(i).getPatientDisease()+"\t");
				System.out.println(" ");
			}
		}
	}
	public void ViewRegistration(Doctor doctor,ArrayList<Doctor> doctorList)
	{	
		startRegistration(doctor,doctorList);
		if(patientList.size()==0)
		{
			System.out.println("\t\tNo Patients");
		}
		else
		{
			System.out.println("\tID  NAME ADDRESS  DISEASE  ");
			System.out.println("\t-------------------------------");
			for(int i=0;i<patientList.size();i++)
			{
				System.out.print("\t"+i);
				System.out.print("    "+patientList.get(i).getPatientName()+"\t");
				System.out.print(patientList.get(i).getPatientAdress()+"\t");
				System.out.print("   "+patientList.get(i).getPatientDisease()+"\t");
				System.out.print("   "+patientList.get(i).getPatientDisease()+"\t");
				System.out.println(" ");
			}
		}
	}
}


