import java.util.*;
class User
{
Scanner sc=new Scanner(System.in);
int option,adminOption;
Customer c=new Customer();
Admin a=new Admin();
String uname,pwd,ans;
	public void home()
	{
		System.out.println("------------------Welcome to Blue Silver Hotel---------------");
		System.out.println("--------------------------------------------------------------");
		System.out.println("-------------Enter the option :-------------");
			System.out.println("  1.Customer");
			System.out.println("  2.Admin");
		option=sc.nextInt();
		switch(option)
		{
			case 1: System.out.println("-------Make Your Order----------");
						c.menu();
						c. makeOrder();
						break;
			
			case 2:	 System.out.println("-------Enter your admin credentials----------");		
						 System.out.println("Enter Username");
						uname=sc.next();
						 System.out.println("Enter Password");
						pwd=sc.next();
						if(uname.equals("admin") & pwd.equals("123"))
						{
						System.out.println("-------------Verification Successful-------------");
						
						do{
							System.out.println("-------------Enter the option :-------------");	
						System.out.println("  1.Add ");
						System.out.println("  2.Update");
						System.out.println("  3.Remove");
						System.out.println("  4.View");
						System.out.println("  5.Exit");
						adminOption=sc.nextInt();
						
						switch(adminOption)
							{
								case 1: 	a.addFood();
											break;
								case 2:		a.updateDishes();
											break;
											
								case 3: 	a.removeDishes();
											break;
													
								case 4:		a.viewDishes();
											break;
								
									case 5:		home();
											break;		
								
								default:System.out.println("Invalid option");
								
							}
							
												System.out.println(" want to enter more (yes/no):");
												ans=sc.next();
						
						}while(ans.equals("yes"));
						}
						
						else{
							System.out.println("Wrong username/password");
						}	
						
		}				
			
			
		
	
	}

}