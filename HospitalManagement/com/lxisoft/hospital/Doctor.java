package com.lxisoft.hospital;
import java.util.*;
import com.lxisoft.user.*;
public class Doctor
{
	static Scanner sc = new Scanner(System.in);
	int doctorCount;
	private String doctorName;
	private String doctorSpecialisation;
	private int doctorYearOfExperience;
	private int doctorFee;
	public void setDoctorName(String name)
	{
		this.doctorName = name;
	}
	public String getDoctorName()
	{
		return doctorName;
	}
	public void setDoctorSpecialisation(String specialisation)
	{
		this.doctorSpecialisation = specialisation;
	}
	public String getDoctorSpecialisation()
	{
		return doctorSpecialisation;
	}
	public void setDoctorYearOfExperience(int experience)
	{
		this.doctorYearOfExperience = experience;
	}
	public int getDoctorYearOfExperience()
	{
		return doctorYearOfExperience;
	}
	public void setDoctorFee(int fee)
	{
		this.doctorFee = fee;
	}
	public int getDoctorFee()
	{
		return doctorFee;
	}
	public void modifyDoctor(Admin admin,Doctor doctor,ArrayList<Doctor> doctorList,Registration registration,ArrayList<Service> serviceList,Service service)
	{
		int c;
		do
		{
			System.out.println("\t\t1.View Doctor\n\t\t2.Add Doctor\n\t\t3.Edit Doctor\n\t\t4.Delete Doctor\n\t\t5.Delete All Doctor\n\t\t6.Back\n\t\tEnter Ur Choice::");
			c = sc.nextInt();
				switch (c)
				{
				case 1:viewDoctor(doctor,doctorList);break;
				case 2:createDoctor(doctor,doctorList);break;
				case 3:editDoctor(doctor,doctorList);break;
				case 4:deleteDoctor(doctor,doctorList);break;
				case 5:deleteAllDoctor(doctor,doctorList);break;
				case 6:admin.adminConsole(admin,doctor,doctorList,registration,serviceList,service);break;
				default:System.out.println("Enter valid Choice!!!");break;
				}
		}while(c!=0);
	}
	public void consultDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		if(doctorList.size()==0)
		{
			System.out.println("No doctors!!");
		}
		else
		{
		viewDoctor(doctor,doctorList);
		System.out.println("\t\tEnter Doctor Id to consult:");
		int doctorId = sc.nextInt();
		System.out.println("Patient Consulting Doctor......");
		System.out.println("Patient Consulted Doctor......");
		System.out.println("Fee = "+doctorList.get(doctorId).getDoctorFee());
		}
	}
	public void viewDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		System.out.println("\t\t***Doctor List***");
		System.out.println("\t\t-------------------");
		if(doctorList.size() == 0)
		{
			System.out.println("\t\tNo Doctors");
		}
		else
		{
			System.out.println("\tID    DOCTOR    FACULTY    EXPERIENCE     FEE");
			System.out.println("\t-----------------------------------------------");
			for(int i=0;i<doctorList.size();i++)  
			{
				System.out.print("\t"+i);
				System.out.print("\t"+doctorList.get(i).getDoctorName()+"\t");
				System.out.print(doctorList.get(i).getDoctorSpecialisation()+"\t");
				System.out.print("  "+doctorList.get(i).getDoctorYearOfExperience()+"\t");
				System.out.print("  "+doctorList.get(i).getDoctorFee()+"\t");
				System.out.println(" ");
			}
		}		
	}
	public ArrayList<Doctor> addDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		doctorList.add(new Doctor());
		doctorList.get(0).setDoctorName("Deepak");
		doctorList.get(0).setDoctorSpecialisation("Allergist");
		doctorList.get(0).setDoctorYearOfExperience(5);
		doctorList.get(0).setDoctorFee(150);System.out.println("\n");
		doctorList.add(new Doctor());
		doctorList.get(1).setDoctorName("Ram");
		doctorList.get(1).setDoctorSpecialisation("Cardiologist");
		doctorList.get(1).setDoctorYearOfExperience(3);
		doctorList.get(1).setDoctorFee(200);System.out.println("\n");
		doctorList.add(new Doctor());
		doctorList.get(2).setDoctorName("Rahul");
		doctorList.get(2).setDoctorSpecialisation("Pediatrician");
		doctorList.get(2).setDoctorYearOfExperience(6);
		doctorList.get(2).setDoctorFee(100);System.out.println("\n");
		doctorList.add(new Doctor());
		doctorList.get(3).setDoctorName("Deepak");
		doctorList.get(3).setDoctorSpecialisation("Allergist");
		doctorList.get(3).setDoctorYearOfExperience(5);
		doctorList.get(3).setDoctorFee(150);System.out.println("\n");
		return doctorList;
	}
	public void createDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
			System.out.println(doctorList.size());
			System.out.println("Enter How many doctors U want to add::");
			doctorCount = sc.nextInt();
			
			for (int i=4;i<(4+doctorCount);i++)
			{
			doctorList.add(new Doctor());
			System.out.print("\t\tName:");doctorList.get(i).setDoctorName(sc.next());
			System.out.print("\t\tSpecialisation:");doctorList.get(i).setDoctorSpecialisation(sc.next());
			System.out.print("\t\tYearOfExperience:");doctorList.get(i).setDoctorYearOfExperience(sc.nextInt());
			System.out.print("\t\tFee:");doctorList.get(i).setDoctorFee(sc.nextInt());System.out.println("\n");
			}

	}
	public void editDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		viewDoctor(doctor,doctorList);
		System.out.println("Enter Id Of Doctor To be Edited");
		int editId = sc.nextInt();
		System.out.print("\t\tName:");doctorList.get(editId).setDoctorName(sc.next());
		System.out.print("\t\tSpecialisation:");doctorList.get(editId).setDoctorSpecialisation(sc.next());
		System.out.print("\t\tYearOfExperience:");doctorList.get(editId).setDoctorYearOfExperience(sc.nextInt());
		System.out.print("\t\tFee:");doctorList.get(editId).setDoctorFee(sc.nextInt());
		System.out.print(" ");
		viewDoctor(doctor,doctorList);
	}
	public void deleteDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		viewDoctor(doctor,doctorList);
		System.out.println("Enter Id Of Doctor To be Deleted");
		int deleteId = sc.nextInt();
		doctorList.remove(deleteId);
		System.out.print(" ");
		viewDoctor(doctor,doctorList);
	}
	public void deleteAllDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		doctorList.clear();
		System.out.print(" ");
		viewDoctor(doctor,doctorList);
	}
}
