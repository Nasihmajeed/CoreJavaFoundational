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

	public void modifyDoctor(Admin admin,Doctor doctor,ArrayList<Doctor> doctorList)
	{
		int c;
		do
		{
			System.out.println("\t\t1.View Doctor\n\t\t2.Add Doctor\n\t\t3.Edit Doctor\n\t\t4.Delete Doctor\n\t\t5.Back\n\t\tEnter Ur Choice::");
			c = sc.nextInt();
				switch (c) 
				{
				case 1:viewDoctor(doctor,doctorList);break;	
				case 2:createDoctor(doctor,doctorList);break;
				case 3:editDoctor(doctor,doctorList);break;
				case 4:deleteDoctor(doctor,doctorList);break;
				case 5:admin.adminConsole(admin,doctor,doctorList);break;
				default:System.out.println("Enter valid Choice!!!");break;
				}

		}while(c!=0);	
	}
		

	public void viewDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		System.out.println("\t\t***Doctor List***");
		System.out.println("\t\t-------------------");
		if(doctorList.size() == 0)
		{
			System.out.println("No Doctors");
		}
		else
		{
			Iterator itr = doctorList.iterator();
			while(itr.hasNext())
			{
			System.out.println(itr.next());
			}	
		}
		
	}
	public void createDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		doctorList.add(new Doctor());
		System.out.print("\t\tName:");doctorList.get(doctorCount).setDoctorName(sc.next());
		System.out.print("\t\tSpecialisation:");doctorList.get(doctorCount).setDoctorSpecialisation(sc.next());
		System.out.print("\t\tYearOfExperience:");doctorList.get(doctorCount).setDoctorYearOfExperience(sc.nextInt());		
		doctorCount++;
	}
	public void editDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		viewDoctor(doctor,doctorList);

		System.out.println("Enter Id Of Doctor To be Edited");
		int editId = sc.nextInt();
		System.out.print("\t\tName:");doctorList.get(editId).setDoctorName(sc.next());
		System.out.print("\t\tSpecialisation:");doctorList.get(editId).setDoctorSpecialisation(sc.next());
		System.out.print("\t\tYearOfExperience:");doctorList.get(editId).setDoctorYearOfExperience(sc.nextInt());
	}
	public void deleteDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		viewDoctor(doctor,doctorList);

		System.out.println("Enter Id Of Doctor To be Deleted");
		int deleteId = sc.nextInt();
		doctorList.remove(deleteId);
		doctorList.remove(deleteId);
		doctorList.remove(deleteId);
	}
	public void deleteAllDoctor(Doctor doctor,ArrayList<Doctor> doctorList)
	{
		doctorList.clear();

		viewDoctor(doctor,doctorList);
	}

	


}