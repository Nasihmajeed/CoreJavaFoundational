package com.LxiSoft.HotelDetails;
import com.LxiSoft.HotelDetails.Menu;
import com.LxiSoft.HotelDetails.Actions;

import java.util.*;
public class Hotel{
	String hotelName;
	String place;
	String hotelType;
	Actions act = new Actions();
	//User user = new User();
	Menu menu = new Menu();
	public void getHotelData(){
		this.hotelName = "Thattukada";
		this.place = "Palakkad";
		this.hotelType = "Veg and Non-Veg";	
	}
	public void setHotelData(){
		Scanner s = new Scanner(System.in);
		System.out.println("\t ----------------------------- ");
		System.out.println("\t\t "+hotelName+" \t\t");
		System.out.println("\t\t "+hotelType+" \t\t");
		System.out.println("\t\t "+place+" \t\t");
		System.out.println("\t ----------------------------- ");
		int back;
		do{
			System.out.println(" Log In Page");
			System.out.println("-------------");
			System.out.println("Log In \n1.Admin \n2.User");
		    int option = s.nextInt();
		    if(option==1){
			    int opt;
			    //do{
			    	System.out.println(" Admin Page");
			        System.out.println("------------");
			    	System.out.println("\n1.View Menu \n2.Add \n3.Edit \n4.Delete");
			        int choice = s.nextInt();
			        if(choice==1){
			        	menu.setMenu();
			        	act.viewMenu();
			        }
			        else if(choice==2){
			        	menu.setMenu();
			        	act.addToMenu();
			        }
			        else if(choice==3){
			        	menu.setMenu();
			        	act.editTheMenu();
			        }
			        else if(choice==4){
			        	menu.setMenu();
			        	act.deleteTheMenu();
			        }
			        else {
			        	System.out.println("Wrong option");
			        }
			        /*switch(choice){
				        case 1:				        
				        menu.setMenu();
				        admin.viewMenu();
				        break;
				        case 2:				       
				        admin.addToMenu();
				        break;
				        case 3:				       
				        admin.editTheMenu();
				        break;
				        case 4:
				        admin.deleteTheMenu();
				        break;
				        default:
				        System.out.println("Wrong option");
			        }*/
			        //System.out.println("Go to Admin Page \n1.Yes\n0.No");
			      //  opt = s.nextInt();
			    //}while(opt!=0);
		    }
		    else if(option==2){
		    	int optt;
		    	//menu.setMenu();
		    	//System.out.println("Under Construction");
		    	do{
		    		System.out.println("\n User Page");
		    		System.out.println("-----------");
		    		System.out.println("1.Order \n2.Pay Bill");
		    		int choose = s.nextInt();
		    		if(choose==1){
		    			//menu.setMenu();
		    			act.orderFood();
		    		}
		    		else if(choose==2){
		    			act.payBill();
		    		}
		    		else {
		    			System.out.println("Wrong Option");
		    		}
		    		/*switch(choose){
		    			case 1:
		    			menu.setMenu();
		    			user.orderFood();
		    			break;
		    			case 2:
		    			user.payBill();
		    			break;
		    			default:
		    			System.out.println("Wrong Option");
		    		}*/
		    		System.out.println("Go to User Page \n1.Yes \n0.No");
		    		optt = s.nextInt();
		    	}while(optt!=0);
			    //System.out.println("User part under construction");
		    }
		    System.out.println("Do you need to get back to main page ?\n1.Yes\n0.No");
		    back = s.nextInt();
		}while(back!=0);
	}
	
}