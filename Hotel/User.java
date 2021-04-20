import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


class User
{
	String cname;
	static Scanner sc=new Scanner(System.in);
	Order o=new Order();
	
	
	public void customer()
	{
		System.out.println("Welcome to our Hotel");
		System.out.println("Enter Customer Name :");
	    cname=sc.nextLine();
        System.out.println("Welcome mr./mrs. "+cname);		
        o.customerOrder();
	}


}