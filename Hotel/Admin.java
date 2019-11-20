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
					System.out.println("1.Add \n2.Edit \n3.Delete \n4.Display");
					c=scan.nextInt();
					switch(c)
					{
						case 1:System.out.println("Add");
										add();
										break;
						case 2:System.out.println("Edit");
										//edit();
										//break;
						case 3:System.out.println("Delete");
										//delete();
										//break();
						case 4:System.out.println("Display");
										//display();
										//break();

						default:System.out.println("ERROR");

					}
					


		}
	}
	
				/*void add()
				{
					FoodItems food=new FoodItems();
					{
			
					}


				}
			}*/


	
