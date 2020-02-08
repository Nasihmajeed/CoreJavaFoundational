package com.lxisoft.user;
import com.lxisoft.user.*;
import com.lxisoft.hospital.*;
import java.util.*;
public class Admin
{
	private String adminPassword = "admin";
	static Scanner sc = new Scanner(System.in);
	boolean flag;
	Hospital hospital;
	public void setAdminPassword(String adminPassword)
	{
		this.adminPassword = adminPassword;
	} 
	public String getAdminPassword()
	{
		return adminPassword;
	}
	public void adminConsole(Admin admin,Doctor doctor,ArrayList<Doctor> doctorList,Registration registration,ArrayList<Service> serviceList,Service service)
	{
		hospital= new Hospital();
		int ch;
		do
		{
		System.out.println("\t\t1.Modify Doctor\n\t\t2.View Registration\n\t\t3.View Bill\n\t\t4.Services\n\t\t5.Back\n\t\tEnter Ur Choice::");
		ch = sc.nextInt();
			switch (ch) 
			{
			case 1:	doctor.modifyDoctor(admin,doctor,doctorList,registration,serviceList,service);break;
			case 2: registration.adminViewRegistration(doctor,doctorList);break;
			case 3://bill.createBill();break;
			case 4: service.viewServices(serviceList,service);break;
			case 5:hospital.createHospital();
			default:System.out.println("Enter Valid Choice!!!!!");break;
			}
		}while(ch!=0);	

	}
		
	public void adminLogin(Admin admin,Doctor doctor,ArrayList<Doctor> doctorList,Registration registration,ArrayList<Service> serviceList,Service service)
	{
		System.out.println("Enter Admin Password"); 
		String pass = sc.next();
		if(pass.equals(adminPassword))
		{
			System.out.println("Welcome to Admin Cosole");
			flag = true;
			adminConsole(admin,doctor,doctorList,registration,serviceList,service);
		}
		else if(flag == false)
		{	
			int count = 0;
			for(int i=0;i<2;i++)
			{
				System.out.println("Enter Password again::");
				String passwordAgain = sc.next();
				if(passwordAgain.equals(adminPassword))
				{
					System.out.println("Welcome to Admin Cosole");
					flag = true;
					adminConsole(admin,doctor,doctorList,registration,serviceList,service);
				}
				else
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println("Ur Maximum Try Reached!!!!\nTry again Later");
				System.exit(0);
			}	
					
		}
	}	

	
}