package com.LxiSoft.HotelDetails;
import java.util.*;
public class Hotel{
	String hotelName;
	String place;
	String hotelType;
	Admin admin = new Admin();
	Scanner s = new Scanner(System.in);
	public void getHotelData(){
		
		System.out.println("Enter The name of hotel");
		this.hotelName = s.next();
		System.out.println("Enter the place of hotel");
		this.place = s.next();
		System.out.println("Enter the type of hotel");
		this.hotelType = s.next();
	}
	public void setHotelData(){
		System.out.println("\t ----------------------------- ");
		System.out.println("\t"+hotelName+"\t");
		System.out.println("\t"+hotelType+"\t");
		System.out.println("\t"+place+"\t");
		System.out.println("\t ----------------------------- ");
		System.out.println("Log In \n1.Admin \n2.User");
		int option = s.nextInt();
		if(option==1){
			System.out.println("\n1.View Menu \n2.Edit");
			int choice = s.nextInt();
			switch(choice){
				case 1:
				admin.viewMenu();
				break;
				case 2:
				admin.editMenu();
				break;
				default:
				System.out.println("Wrong option");
			}
		}
		else if(option==2){
			System.out.println("User part under construction");
		}
	}
}