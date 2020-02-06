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
	public void adminConsole(Admin admin,Doctor doctor,ArrayList<Doctor> doctorList)
	{
		hospital= new Hospital();
		int ch;
		do
		{
		System.out.println("\t\t1.Modify Doctor\n\t\t2.View Registration\n\t\t2.View Appointments\n\t\t3.View Bill\n\t\t4.Back\n\t\tEnter Ur Choice::");
		ch = sc.nextInt();
			switch (ch) 
			{
			case 1:doctor.modifyDoctor(admin,doctor,doctorList);break;
			case 2:
			case 3:
			case 4:hospital.createHospital();break;
			default:System.out.println("Enter Valid Choice!!!!!");break;
			}
		}while(ch!=0);	

	}
		
	public void adminLogin(Admin admin,Doctor doctor,ArrayList<Doctor> doctorList)
	{
		System.out.println("Enter Admin Password"); 
		String pass = sc.next();
		if(pass.equals(adminPassword))
		{
			System.out.println("Welcome to Admin Cosole");
			flag = true;
			adminConsole(admin,doctor,doctorList);
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
					adminConsole(admin,doctor,doctorList);
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