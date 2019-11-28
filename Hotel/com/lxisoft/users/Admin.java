package com.lxisoft.users;
import com.lxisoft.hotel.Hotel;
import java.util.*;
public class Admin
{
	String password;
	Hotel hotel;
	


	public void adminCheck(Hotel hotel)
	{
		String def="qwerty";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the password");
		password=scan.next();
		if(password.equals(def))
		{
				System.out.println("\t***Welcome Admin***");
				adminChoice(hotel);

		}
		  else
		  {
		  	System.out.println("Invalid password");

		  }


		}	

		public void adminChoice(Hotel hotel)
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
						case 2:System.out.println("Display");
										display(hotel);
										break;
						case 3:System.out.println("Delete");
										delete(hotel);
										break;
						case 4:System.out.println("Edit");
										edit(hotel);
										break;

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
													addExist(hotel,i);
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
				void addExist(Hotel hotel,int i)
				{
												boolean test=true;
												Scanner scan=new Scanner(System.in);
											    System.out.println("Add");
												System.out.println("Enter the FoodName");
												String newfood=scan.next();
												System.out.println("Enter the price");
												int newprice=scan.nextInt();
												for(int j=0;j<hotel.food.length;j++)
												{
													if(newfood.equals(hotel.food[j].name))
													{
														System.out.println("Already exists");
														test=false;
													}
												}
												if(test)
												{
													hotel.food[i].name=newfood;
													hotel.food[i].price=newprice;
													
												}
				}			


				void display(Hotel hotel)

				{
						hotel.getMenu();
						adminChoice(hotel);
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
					adminChoice(hotel);


					
				}

				void edit(Hotel hotel)
				{
					Scanner scan=new Scanner(System.in);
					hotel.getMenu();
					System.out.println("Select the food you want to update ");
					int n=scan.nextInt();
					System.out.println("Enter the name you want to update ");
					String f=scan.next();
					System.out.println("Enter the price you want to update ");
					int p=scan.nextInt();
						hotel.food[n-1].name=f;
						hotel.food[n-1].price=p;
						hotel.getMenu();
						adminChoice(hotel);
				}
				
}

				



		


	
