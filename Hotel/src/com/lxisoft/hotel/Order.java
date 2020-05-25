package com.lxisoft.hotel;
import java.util.Scanner;
public class Order{
	

	Chickenbiriyani[] cb;
	Vegbiriyani[] vb;
	Regularmeals[] rm;

		public void setFoodItemDetails(){

			for(int i=0;i<10;i++){
				cb[i]=new Chickenbiriyani();
				vb[i]=new Vegbiriyani();
				rm[i]=new Regularmeals();
			}
		}

	public void getOrderDetails(){
		
		
		System.out.println("HOW MANY ITEMS WOULD YOU LIKE TO HAVE");
		Scanner scanner=new Scanner(System.in);
		int itemNumber=scanner.nextInt();
		System.out.println("WHAT WOULD YOU LIKE TO HAVE");

		  

        for ( int i = 1; i <= itemNumber ; i ++ ) {

         
				int choice;          
           
				
				System.out.println("ENTER YOUR CHOICE");

				choice=scanner.nextInt();
		
           
			String food;
        	int amount=0;

        
        switch (choice) {
            case 1:
                food = "Chicken Biriyani";
                amount=100;
            	
                break;
            case 2:
                food = "Veg biriyani";
                amount=80;
                break;
            case 3:
                food = "Regular meals";
                amount=70;
                break;

            default:
                food = "NO SUCH MEAL";

 	               break;
        }
         System.out.println("The choice is " + food);
         System.out.println("The prize is"+amount);
}
}
}



	
	
