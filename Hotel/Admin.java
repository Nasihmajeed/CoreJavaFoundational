import java.util.*;
public class Admin
{
	String password;
	
	


	void adminCheck()
	{
		String def="qwerty";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the password");
		password=scan.next();
		if(password.equals(def))
		{
				System.out.println("***Welcome Admin***");
		}
		  else
		  {
		  	System.out.println("Invalid password");
		  }

		}	

		void adminChoice()
		{
					int c;
					Scanner scan=new Scanner(System.in);
					System.out.println("Enter your choice ");
					System.out.println("1.Add \n2.Display \n3.Delete \n4.Edit");
					c=scan.nextInt();
					
				switch(c)
					{
						case 1:System.out.println("Add");
										add();
										break;
						/*case 2:System.out.println("Display");
									display();
									break;
						/*case 3:System.out.println("Delete");
										delete();
										break();
						case 4:System.out.println("Edit");
										edit();
										break();*/

						default:System.out.println("ERROR");

					}
					


		}

	
	
				void add()
				{
							Scanner scan=new Scanner(System.in);
						
								Hotel hotel=new Hotel();
								hotel.menu();
								for(int i=0;i<hotel.food.length;i++)
								{
									if(hotel.food[i].name==null)
									{
										System.out.println("Enter the FoodName");
										hotel.food[i].name=scan.next();
										System.out.println("Enter the price");
										hotel.food[i].price=scan.nextInt();
										break;
										
									}


																
								}
								adminChoice();
								  
				}


				/*void display()
				


}
		


	
