package com.lxisoft.hotel;
import java.util.Scanner;
import com.lxisoft.hotel.Veg;
import com.lxisoft.hotel.Nonveg;
import com.lxisoft.hotel.Myexception;
import java.util.*;
import java.io.*;
public class Hotel
{
	Food[] food=new Food[10];
	Bill bill;
	public void printdetails()
	{
		System.out.println("HOTEL PAN");
		System.out.println("\n");
	/*try{*/
			setdetails();
		/*}*/
		/*catch(Exception e)
		{
			System.out.println("Error");
		}
		finally
        { 
            System.out.println("finally block executed"); 
        }*/
	}
	public void setdetails()/*throws Myexception*/ 
	{
		
	System.out.println("     -----HOTEL PAN-----");
	Food biriyani=new Biriyani();
	biriyani.count=4;
	food[1]=biriyani;

	
	Food vegmeals=new Vegmeals();
	vegmeals.count=4;
	food[2]=vegmeals;
			
			
	Scanner scr=new Scanner(System.in);
	bill=new Bill();
			
		for (int i=0;i<8;i++) 
		{
			System.out.println("Do you want to order food  y/n ?");
			char word=scr.next(). charAt(0);
			System.out.println("\n")
			if("y".charAt(0) == word)
			{
				Menu menu=new Menu();
				menu.printdetails();
				System.out.println("Select your item :");
				int num=scr.nextInt();
		
				System.out.println("\n");
				Food[] f; 
				switch (num)
				{				
					case 1:			
							if(biriyani.count!=0)
							{
							f=new Food();		
								biriyani.type();
								System.out.println("which Biriyani you want Veg 'v' or Nonveg 'n':");
								char ltr=scr.next(). charAt(0);
								System.out.println("\n");
								if("v".charAt(0) == ltr)
								{
						    		if(biriyani instanceof Food)
						    		{
							   			Biriyani b=(Biriyani) biriyani;
						    			b.nonveg();
						   			}

						   		f[0]=biriyani;
						   		
							   	}
						   		else if ("n".charAt(0) == ltr) 
						   		{
							   		System.out.println("\n");
							   			if(biriyani instanceof Food)
							    		{
								   			Biriyani b=(Biriyani) biriyani;
							    			b.vegitarien();
							   			}
							   			System.out.println("\n");
							   	f[1]=biriyani;	
							   	}
							   	else
							   	{
							   		System.out.println("\n");
									System.out.println("wrong entry");
								}

								    		
									biriyani.count=biriyani.count-1;
						    		System.out.println("\n");
						    		System.out.println("number of biriyani "+biriyani.count);
							}
											if(biriyani.count==0)
											{
												System.out.println("\n");
												System.out.println("Sorry biriyani is out of stock");
												System.out.println("Select another item");

											}

								bill.billdetails1(f);

								break;
							case 2:	
								
									if(vegmeals.count!=0)
									{
										System.out.println("\n");
										vegmeals.type();
										if(vegmeals instanceof Food)
							    		{
							    			Vegmeals v=(Vegmeals) vegmeals;
							    			v.vegitarien();	
							    		}
							    		System.out.println("\n");
							    		f[2]=vegmeals;
							    		bill.billdetails2(f);
							    		vegmeals.count=vegmeals.count-1;
							    		System.out.println("\n");
							    		System.out.println("number of vegmeals "+vegmeals.count);
							    		f[2]=vegmeals;
									
									  }
									  if(vegmeals.count==0)
											{
												System.out.println("\n");
												System.out.println("Sorry vegmeals is out of stock");
/*												System.out.println("Select another item");
*/
											}

										break;				
											
									
								
									
						}
					}
						else if("n".charAt(0) == word)
						{
							System.out.println("Thank you");
							break;
						}
						else
						{
							System.out.println("wrong entry");
						}
					
/*		  throw new Myexception();
*/		}
	}	
}