
import java.util.Scanner;
public class User
{
	String name;
	Hotel hotel;



public void users()
	{	
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your name :");
		name=scan.next();
		System.out.println("\t Welcome " +name);
	}

	public void foodOrdering(Hotel hotel)
	{
		int[] billarr=new int[10];
		int i=0,c,sum=0;
		do{
			Scanner scan=new Scanner(System.in);
			hotel.getMenu();
			System.out.print("Select the fooditems :");
			billarr[i]=scan.nextInt();
			i++;
			System.out.println("Do you want to select more \n1.yes \n2.No");
			c=scan.nextInt();
			}while(c==1);
		     System.out.println("\t***BILL****");
    	    for(i=0;i<10;i++)
    	    {
    			if(billarr[i]!=0)
    			{
    				System.out.println("\t"+hotel.food[billarr[i]-1].name);
					System.out.println("\t\t"+hotel.food[billarr[i]-1].price);
					sum=sum+hotel.food[billarr[i]-1].price;
				}
			}
				System.out.println("Total price " +sum);

		}
}