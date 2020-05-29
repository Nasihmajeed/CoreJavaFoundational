package com.lxisoft.waterpurifier.website ;

import java.util.* ;

public class Website
{
	Scanner in = new Scanner(System.in) ;

	ArrayList<Purifier> purifierList = new ArrayList<Purifier>() ;
	ArrayList<Customer> customerList = new ArrayList<Customer>() ;
	ArrayList<Technician> technicianList = new ArrayList<Technician>() ;

	public void showHomePage()
	{

		System.out.print("\n\n |------------------------- KENT WATER PURIFIERS -------------------------| \n") ;

			System.out.print("\n\n\n     [1] BUY NEW PURIFIER \n\n\n     [2] SERVICE PURIFIER \n\n\n     [3] QUIT\n\n      : ") ;
			char op = in.next().charAt(0) ;

			switch (op)
			{

				case '1' :
					setItems() ;
					addNewCustomer() ;
					goBackToMainPrompt() ;
					break ;

				case '2' :
					setTechnicians() ;
					showServiceMenu() ;
					goBackToMainPrompt() ;
					break ;

				case '3' :
					System.out.print("\n\n\t Thank You For Using Kent Water Purifying Solutions.\n") ;
					System.exit(0) ;
					break ;

				default :
					System.out.print("\n\n\t Invalid Choice.") ;
			}	
	}

	public void addNewCustomer()
	{
		customerList.add(new Customer()) ;

		int pH = checkPH() ;
		showPurifierList(pH) ;
		takeOrder(pH) ;
		customerList.get(customerList.size()-1).getBill().printBill() ;
	}

	public void goBackToMainPrompt()
	{
		System.out.print("\n\n\t Go Back To MainMenu? (Y/N) : ") ;
		char goBack = in.next().charAt(0) ;
		in.nextLine() ;

		if(goBack=='y' || goBack=='Y')
		{
			showHomePage() ;
		}
		else
		{
			System.out.print("\n\n\t Thank You For Using Kent Water Purifying Solutions.\n") ;
		}

	}

	public void showPurifierList(int pH)
	{

		System.out.print("\n\n |------------------------- KENT WATER PURIFIERS -------------------------| \n") ;
		
		System.out.print("\n       No. \t   NAME             pH    PRICE \n     |----||----------------------------||------||-----------|\n") ;

		int index = 1 ;
		
		for(Purifier p : purifierList)
		{	
			if(p.getPHTolerance()>pH)
			{
				System.out.format("\n %8d      %-20s %5d %10d",index,p.getName(),p.getPHTolerance(),p.getPrice()) ;
				index++ ;
			}
		}

		System.out.print("\n\n |-------------------------------------------------------------------------| \n") ;
	}
	

	public void setItems()
	{
		purifierList.add(new Purifier("Grand+",20500,9)) ;
		purifierList.add(new Purifier("Pearl",18700,4)) ;
		purifierList.add(new Purifier("GrandStar",16500,5)) ;
		purifierList.add(new Purifier("Prime",24300,4)) ;
		purifierList.add(new Purifier("Ace",12500,7)) ;
		purifierList.add(new Purifier("Sterling",43600,5)) ;
		purifierList.add(new Purifier("Superb",12200,10)) ;
		purifierList.add(new Purifier("Wonder",36700,12)) ;
		purifierList.add(new Purifier("Pristine",23600,3)) ;
		purifierList.add(new Purifier("Gem",23200,6)) ;
		purifierList.add(new Purifier("Elite",21400,4)) ;
		purifierList.add(new Purifier("Maxx",22500,8)) ;
		purifierList.add(new Purifier("Crystal",10500,8)) ;
	}

	public int checkPH()
	{
		System.out.print("\n\n\t Input pH value of your Water : ") ;

		int pH = in.nextInt() ;
		in.nextLine() ;

		return pH ;
	}

	public void takeOrder(int pH)
	{
		
		System.out.print("\n\n\t Item No : ") ;
		int itemNumber = in.nextInt() ;
		in.nextLine() ;

		int index=0 ;

		for(Purifier p : purifierList)
		{	
			if(p.getPHTolerance()>pH)
			{
				index++ ;
				if(index == itemNumber)
				{
					System.out.print("\n\n\t Input Quantity : ") ;
					int quantity = in.nextInt() ;
					in.nextLine() ;

					customerList.get(customerList.size()-1).getBill().addItem(p,quantity) ;

					break ;
				}
			}
		}

		System.out.print("\n |-------------------YOUR ORDER IS PLACED!---------------------| \n\n     CUSTOMER NAME : ") ;
		String cName = in.nextLine() ;

		customerList.get(customerList.size()-1).getBill().generateBill(cName) ;

		if(index==0)
		{
			System.out.print("\n\n\t Invalid Item.") ;
		}


	}

	public void showServiceMenu()
	{
		System.out.print("\n\n |------------------------- KENT PURIFIER SERVICES -------------------------| \n") ;

		int index = checkServiceNumber() ;

		if(index==-1)
		{
			System.out.print("\n\n\t Invalid Service Number!") ;
			goBackToMainPrompt() ;
		}
		else
		{
			System.out.print("\n\n\t Service Number Found! \n\n\t Product : "+ customerList.get(index).getBill().itemList.get(customerList.get(index).getBill().itemList.size()-1).getName()) ;
			System.out.print("\n\n\t Searching for technicians nearby...\n") ;
			searchForTechnicians(customerList.get(index)) ;
		}



	}

	public void setTechnicians()
	{
		technicianList.add(new Technician("Ashker")) ;
		technicianList.add(new Technician("Divakar")) ;
		technicianList.add(new Technician("Rajesh")) ;
		technicianList.add(new Technician("Suraj")) ;
		technicianList.add(new Technician("Dinesh")) ;
	}

	public int checkServiceNumber()
	{
		System.out.print("\n\n\t Input Service Number of your Purifier : ") ;

		int serviceNumber = in.nextInt() ;
		in.nextLine() ;

			int index=0 ;
		
			for(Customer c:customerList)
			{
				if(c.getBill().getServiceNo()==serviceNumber)
				{
					return index ;
				}

				index++ ;
			}

		return -1 ;
	}

	public void searchForTechnicians(Customer c)
	{
		int customerX = c.getLocationX() ;
		int customerY = c.getLocationY() ;

		int distance = 0 ;

		boolean technicianFound = false ;

			for(Technician technician : technicianList)
			{
				distance =  (int) (Math.sqrt( ( (customerX - technician.getLocationX()) * (customerX - technician.getLocationX()) )+( (customerY - technician.getLocationY()) * (customerY - technician.getLocationY()) ) ) ) ;

				if(distance<=technician.getRange() && technician.getIsFree())
				{
					technicianFound = true ;

					System.out.print("\n\n\t Technician Found! \n\n\t\t"+technician.getName() + "is nearby your location ("+ distance+" meters).") ;

					int time = distance*5 ;

					System.out.print("\n\n Estimated Time : "+ time + " minutes. Thank You!") ;

					technician.setIsFree(false) ;

					break ;
				}
			}

			if(!technicianFound)
			{
				System.out.print("\n\n\t Sorry. All technicians are busy or too far away. Please try again later.") ;
			}

	}


}