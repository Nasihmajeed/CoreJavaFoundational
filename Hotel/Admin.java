import java.util.*;
public class Admin
{
	String password;
	Hotel hotel;
	


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

		void adminChoice(Hotel hotel)
		{			
					int c;
					Scanner scan=new Scanner(System.in);
					System.out.println("Enter your choice ");
					System.out.println("1.Add \n2.Display \n3.Delete \n4.Edit");
					c=scan.nextInt();
					
				switch(c)
					{
						case 1:System.out.println("Add");
										add(hotel);
										break;
						/*case 2:System.out.println("Display");
									display(hotel);
									break;
						case 3:System.out.println("Delete");
										delete(hotel);
										break;
						/*case 4:System.out.println("Edit");
										edit();
										break();*/

						default:System.out.println("ERROR");

					}
					


		}

	
	
				void add(Hotel hotel)
				{
							Scanner scan=new Scanner(System.in);
						
								boolean b=false;
							do
							{
								b = false;
								for(int i=0;i<hotel.food.length;i++)
								{
									if(hotel.food[i].name==null)
									{
										int c;
										System.out.println("1. Add \n2.Print");
										c=scan.nextInt();
										switch(c)
										{
											case 1:
											    System.out.println("Add");
												System.out.println("Enter the FoodName");
												hotel.food[i].name=scan.next();
												System.out.println("Enter the price");
												hotel.food[i].price=scan.nextInt();
												b = true;
												break; 
											case 2:
												hotel.getMenu();
												adminChoice(hotel);
												break;
											default:
												System.out.println("Invalid");
										}
										break;
									}
									
								}
							}while(b);

				}			


				/*void display(Hotel hotel)

				{
						hotel.getMenu();
				}

				void delete(Hotel hotel)
				{
					Scanner scan=new Scanner(System.in);
					hotel.getMenu();
					System.out.println("Enter the food you want to delete?");
					int f=scan.nextInt();
					hotel.food[f-1].name=null;
					hotel.food[f-1].price=0;
					hotel.getMenu();
					
				}
				


}
		


	
