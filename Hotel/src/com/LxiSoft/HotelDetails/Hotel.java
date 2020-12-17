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
		System.out.println("\t\t "+hotelName+" \t\t");
		System.out.println("\t\t "+hotelType+" \t\t");
		System.out.println("\t\t "+place+" \t\t");
		System.out.println("\t ----------------------------- ");
		int back;
		do{
			System.out.println("Log In \n1.Admin \n2.User");
		    int option = s.nextInt();
		    if(option==1){
			    int opt;
			    do{
			    	System.out.println("\n1.View Menu \n2.Add \n3.Edit");
			        int choice = s.nextInt();
			        switch(choice){
				        case 1:
				        admin.viewMenu();
				        break;
				        case 2:
				        admin.addToMenu();
				        break;
				        case 3:
				        admin.editTheMenu();
				        break;
				        default:
				        System.out.println("Wrong option");
			        }
			        System.out.println("Go back \n1.Yes\n0.No");
			        opt = s.nextInt();
			    }while(opt!=0);
		    }
		    else if(option==2){
			    System.out.println("User part under construction");
		    }
		    System.out.println("Do you need to get back to main page ?\n1.Yes\n0.No");
		    back = s.nextInt();
		}while(back!=0);
	}
}