package com.lxisoft.hospital;
import com.lxisoft.user.*;
import java.util.*;
public class Hospital
{
	private String hospitalName = "MIMS HOSPITAL";
	private String hospitalAdress = "KERALA KOZHIKODE GOVINDAPURAM 673016";
	Registration registration;
	Admin admin;
	Doctor doctor;
	Patient patient;
	Medicine medicine;
	Service service;
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	ArrayList<Service> serviceList = new ArrayList<Service>();
	ArrayList<Medicine> medicineList = new ArrayList<Medicine>();
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
		registration = new Registration();
		admin = new Admin();
		doctor = new Doctor();
		patient = new Patient();
		medicine = new Medicine();
		service = new Service();
		doctor.addDoctor(doctor,doctorList);
		hospitalDetails();
		int choice;
		do
		{
			System.out.println("\n\t\t1.Admin\n\t\t2.Patient\n\t\tSelect a valid choice::");
			choice = sc.nextInt();
				switch (choice)
				{
				case 1:admin.adminLogin(admin,doctor,doctorList,registration,serviceList,service,medicine,medicineList);break;
				case 2:patient.patientConsole(registration,doctor,doctorList);break;
				default:System.out.println("\n\t\tEnter valid choice?");break;
				}
		}while(choice != 0);

	}
	public void hospitalDetails()
	{
		System.out.println("\t\t***** "+getHospitalName() +" *****");
		System.out.println("\t\t--------------------------------------");
		System.out.println("\t\tAdress==>> "+getHospitalAdress());
	}
}
