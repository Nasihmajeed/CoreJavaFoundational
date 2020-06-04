package com.lxisoft.hotel;
import java.util.Scanner;
public class Order{
	

	Chickenbiriyani[] cb;
	Vegbiriyani[] vb;
	Regularmeals[] rm;
	Bill[] bill;

		public void setFoodItemDetails(){

			for(int i=0;i<10;i++){
				cb[i]=new Chickenbiriyani();
				vb[i]=new Vegbiriyani();
				rm[i]=new Regularmeals();
				bill[i]=new Bill();
			}
		}

	public void getOrderDetails(){
		
		
		Scanner scanner=new Scanner(System.in);

        menu.printMenuDetails();
        }
		
		  






	
	
