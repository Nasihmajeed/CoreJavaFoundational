package com.lxisoft.user;
import com.lxisoft.hospital.*;
import java.util.*;
public class Patient
{
	private String patientName;
	private String patientAdress;
	private String patientDisease;
	private String consultingDoctor;

	static Scanner sc = new Scanner(System.in);

	public void setPatientName(String name)
	{
		this.patientName = name;
	}
	public void setPatientAdress(String adress)
	{
		this.patientAdress = adress;
	}
	public void setPatientDisease(String disease)
	{
		this.patientDisease = disease;
	}
	public String getPatientName()
	{
		return patientName;
	}
	public String getPatientAdress()
	{
		return patientAdress;
	}
	public String getPatientDisease()
	{
		return patientDisease;
	}
	// public void setConsultingDoctor(String doc)
	// {
	// 	this.consultingDoctor = doc;
	// }
	// public String getConsultingDoctor()
	// {
	// 	return consultingDoctor;
	// }
	public void patientConsole(Registration registration,Doctor doctor,ArrayList<Doctor> doctorList)
	{
	int choice;	
	System.out.println("\n\t\t1.Registration\n\t\t2.Consult Doctor\n\t\t3.Services\n\t\t4.Appoinments\n\t\tSelect a valid choice::");
	choice = sc.nextInt();
			switch (choice) 
			{
			case 1:registration.startRegistration(doctor,doctorList);break;
			case 2:doctor.consultDoctor(doctor,doctorList);break;
			case 3://View Services
			case 4://View Appointment
			default:System.out.println("\n\t\tEnter valid choice?");break;	
			}
	}
}