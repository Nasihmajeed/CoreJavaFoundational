import java.util.*;

class Admin
{
	String admName="Sai Krishna Prasad";
	String username,pwd;
	
	Scanner sc=new Scanner(System.in);
	
	//Admin authentication
	
	public void admAuthenticate()
	{
	System.out.println("You are the Admin with Name : "+admName);	
	System.out.println("Please Enter your UserName");
	username=sc.nextLine();
	
	if(username.equals("SaiSKP"))
	 {
		System.out.println("Username is Correct............Enter your Password");
		pwd=sc.nextLine();
		if(pwd.equals("skp@7"))
		       {
				   System.out.println("UserName and Password Verified......Welcome Sai krishna");
				/*   
				   admOperations();
			   */
			   }
			   else
			   {
				   System.out.println("Incorrect Password ! Please try again");
			   }
	 }
	else
	{
		System.out.println("Sorry..................Username Invalid ! Enter valid Username");
	}
	}
		
//Admin can do CRUD operations		
/*
  public void admOperations()
  {
	  
	  
do{
		System.out.println("SELECT THE OPERATION U WANT TO PERFORM");
	  System.out.println("1.Add");
	  System.out.println("2.Update/Edit");
	  System.out.println("3.Remove/Delete");
	  System.out.println("4.View");

		select=sc.nextInt();

		switch (select){

			case 1:

				do{
			
			
			System.out.println("DO YOU WISH TO EDIT MORE? 1.YES 2.NO");
			}while(x==1);
			
		 break;
			
			case 2:
				do{
			fd.printMenu(food);
			System.out.println("");
			
			System.out.println();
		
			}while(x==1);
			
		break;
		
		case 3:
			do{
				
			System.out.println("Enter items to be added");
		
					
			System.out.println("Enter the food");
			String foo=sc.next();
			
			food.add(new Food());
			food.get().setFoodItem();		
	}
*/
}