package com.lxisoft.hotelapp;
import java.util.Scanner;
public class Order{
	int prize;

	public void getOrderDetails(){
		
		
		System.out.println("Enter The Quantity You Need");
		Scanner scanner=new Scanner(System.in);
		int itemNumber=scanner.nextInt();
		System.out.println("");

		  

        for ( int i = 1; i <= itemNumber ; i ++ ) {

         
				int choice;          
           
				
				System.out.println("Enter Your Choice");

				choice=scanner.nextInt();
		
           

        	String food;

        
        switch (choice) {
            case 1:
                food = "  Chicken Mandi ";
                break;
            case 2:
                food = "Alfahm";
                break;
            case 3:
                food = "Shavay";
                break;
            case 4:
                food = "Chicken Biriyani";
                break;

            default:
                food = "NO SUCH MEAL";
                break;
        }
         System.out.println("The choice is " + food);

       
    }
    
}
}
}



	
	
