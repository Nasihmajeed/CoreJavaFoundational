package com.lxisoft.hotelapp; 
import java.util.Scanner;
public class Hotel

{
	Scanner s=new Scanner(System.in);
	int n,i;
	Food[] food=new Food[10];
	Bill[] bill=new Bill[10];
	public void printmenu()
	{
	
	System.out.println();
    System.out.println("           **************************************************************");
    System.out.println("           *                                                                                                                                    *");
    System.out.println("           *                    		Top Chicken                                                                                             *");   
    System.out.println("           *                       Multi Cusine Resurant                                                                                        *");
    System.out.println("           *                 Mele Pattambi, palakkad, Kerala                                                                                    *");
    System.out.println("           *                                                                                                                                    *");
    System.out.println("           *                                                                                                                                    *");
    System.out.println("           *                                                                                                                                    *");
    System.out.println("           *                                                                                                                                    *");
    System.out.println("           *                                                                                                                                    *");
    System.out.println("           *                                                                                                                                    *");
    System.out.println("           *                                                                                                                                    *");
    System.out.println("           **************************************************************");
	for (int i=1; i<=n; i++)
   {
    food[i]=new Food();
    System.out.println("Food ID");
	int foodid=s.nextInt();
    food[i].setFoodId(foodid);
	
	System.out.println("Food Name ");
	String foodname=s.nextLine();
    food[i].setFoodName(foodname);

    System.out.println("Price");
	int price=s.nextInt();
    food[i].setPrice(price);

	System.out.println("**** MENU ****");
         
        System.out.println(" 1- Chicken Biriyani –  " + "100" );

        System.out.println(" 2- Veg biriyani –   " + "80" );

        System.out.println(" 3- Regular meals - " + "70" );
}
	}

	public void printbill()	
	{
	for (int i=1; i<=n; i++)
     {
	bill[i]=new Bill();


	System.out.println("BILL RECIEPT");

	System.out.println("Bill Number");
	int billno=s.nextInt();
    bill[i].setBillNo(billno);

    System.out.println("Customer Name");
    String customername=s.nextLine();
    bill[i].setCustomerName(customername);

    System.out.println("Food Name");
    String foodname=s.nextLine();
    bill[i].setFoodName(foodname);

    System.out.println("Quantity");
    int quantity=s.nextInt();
    bill[i].setQuantity(quantity);

   	System.out.println("Total Amount");
    int amount=s.nextInt();
    bill[i].setAmount(amount);


}
	


}

}