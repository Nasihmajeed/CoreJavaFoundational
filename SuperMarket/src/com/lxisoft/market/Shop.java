package com.lxisoft.market;
import com.lxisoft.market.*;
import com.lxisoft.repository.FileRepository;
import java.util.*;
import java.io.*;
import java.util.Comparator; 
public class Shop
{
	int numbers;
	private String shopName="EVERGREEN ENTERPRISES";
	private String address="Pookotukavu";
	private String place="Kadambur";
	private final int pinCode = 679514;
	private static Scanner sc;	
	private List<Item> items = new ArrayList<Item>();
	private List<Stock> stock=new ArrayList<Stock>();
	public static Scanner getScanner()
	{
		if(sc == null)
		{
			sc = new Scanner(System.in);
			return sc;
		}
		else
		{
			return sc;
		}
	}
	
	public void printShopDetails()
	{
		System.out.println("Shop Name : "+shopName);
		System.out.println("Address: "+address);
		System.out.println("Place : "+place);
		System.out.println("Pin : "+pinCode);
		selectOption();
	}			
	public void selectOption()
	{
		sc = this.getScanner();
		try
		{
			boolean isTest=false;
			do
			{
				isTest=false;
				System.out.println("\n1.Add Item \n2.Add Stock \n3.Display Item \n4.Display Stock \n5.Bill \n5.Exit");
				int m=sc.nextInt();
				switch (m)
				{
					case 1:	setItem(); isTest=true;break;				
					case 2: setStock(); isTest=true;  break;
					case 3: getItem(); isTest=true; break;
					case 4: getCurrentStock(); isTest=true; break;
					case 5: printBill(); isTest=true; break;
					case 6: System.exit(0); break;	
					
				}
			}while(isTest);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
			e.printStackTrace();
		}	
	}
	public void setItem()
	{
		System.out.println("Name of Item");
		Item item=new Item();
		item.setName(sc.next());
		System.out.println("Item ID");
		item.setId(sc.nextInt());	
		System.out.println("Price of item");
		item.setPrice(sc.nextInt());
		items.add(item);		
	}
	public List<Item> getItem()
	{
		System.out.println("\nDisplay the details of Item");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","ID","Type","Price");
		for(int i=0;i<items.size();i++)
		{			
			System.out.printf("%-20.30s %-20.30s %-20.30s%n",items.get(i).getId(),items.get(i).getName(),items.get(i).getPrice());
		}
		return items;
	}	
	public List<Stock> setStock()
	{   
		getItem();
		System.out.println("\nIn which Item you want add quantity");
		String s=sc.next();
		for(int i=0;i<items.size();i++)
		{
			if((items.get(i).getName()).equals(s))
		 	{
		 		System.out.println("How much item you want to add");
		 		stock.add(new Stock());
		 		stock.get(i).setQuantity(sc.nextInt());		 	 	
		 	}
		 	
		 }
		 return stock;
	}
	public void getCurrentStock()
	{	
		System.out.println("\nDisplay stock details");
		System.out.printf("%-20.30s %-20.30s %-20.30s%n","Item ID","Name","Quantity");
		for(int k=0;k<stock.size();k++)
		{			

			System.out.printf("%-20.30s %-20.30s %-20.30s%n",items.get(k).getId(),items.get(k).getName(),stock.get(k).getQuantity());	
		}	 		      	                                          	
	}
	public void printBill()
	{	
		boolean sample=false;	
		do{
			sample=false;
			
			System.out.println("\nSelect Your item");
			curentStock();
			System.out.println("Do you want More 1.No 2.Yes");
			int n=sc.nextInt();
			if (n==1)
			{
				break;
			}
			else
			{
				continue;
			}	
		}
		while(sample);		
	}	
	public void curentStock()
	{
		for(int q=0;q<items.size();q++)
		{
			String d=sc.next();
			if((items.get(q).getName()).equals(d))				
			{
				System.out.println("How much items do you want");
				int qty=sc.nextInt();	
                int val=(stock.get(q).getQuantity()-numbers);
                stock.get(q).setQuantity(val);
                System.out.println("Current stock"+(stock.get(q).getQuantity()));				
				if(stock.get(q).getQuantity()>=numbers)
				{
					
					System.out.println("\nAvailable Stocks");
					System.out.printf("%-20.30s %-20.30s %-20.30s%n","items Type","items Price","Quantity");
					System.out.printf("%-20.30s %-20.30s %-20.30s%n",items.get(q).getName(),items.get(q).getPrice(),numbers);
					System.out.println("Total Bill Amount="+((items.get(q).getPrice())*(numbers)));
				}			
				else if(stock.get(q).getQuantity()<numbers)
				{	
					System.out.println("- Stock");
					break;
				}					
			}		
		}			
						
	}
/*	public void displayAll()
	{		
		Collections.sort(items);
        System.out.println(items);
	}
	public void displayDetails()
	{
		System.out.println("\n\n\t   Display the details");
		guarantiProduct();
		try
		{
			boolean test=false;
			do	
			{
				test=false;
				System.out.println("Select your option");
				System.out.println("\n 1.Display all \n 2.Curent added \n");
				int i=sc.nextInt();
				switch (i)
				{
		 			case 1: displayFile(); break;
					case 2: displayAll(); break;							
					default:
				}				
			}while(test);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error in input value");
			e.printStackTrace();
		}		
	}
	public void displayFile()
	{
		fr.readFile();
		fr.readToFile();
		fr.readToFileFancy();
	}
	final void guarantiProduct()
	{
		System.out.println("\n\n\n      Guarranty Products ");

		Map<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(1,"\nEveready Items 10 Month Warranty");
		map.put(3, "\nBajaj Items 4yr Warranty");
		map.put(2, "\nCello Items 2yr Warranty");
				
		Set<?> set = map.entrySet();
		Iterator<?> itr = set.iterator();
		
		while(itr.hasNext())
		{			
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+"."+entry.getValue());
		}
	}

    public void employeeDetails() 
    { 
        ArrayList<Employee> employee = new ArrayList<Employee>(); 
        employee.add(new Employee(101, "Sheeja", "Cleaning")); 
        employee.add(new Employee(102, "Neethu", "Superwiser")); 
        employee.add(new Employee(103, "Sheeba", "Billing")); 
        employee.add(new Employee(104, "Remya", "Manager")); 
        employee.add(new Employee(105, "Priya", "Sales")); 
        employee.add(new Employee(106, "Suneera", "StockClearng"));
        employee.add(new Employee(107, "Raihanath", "Sales"));
        employee.add(new Employee(108, "Suhara", "Sales"));
        employee.add(new Employee(109, "Rajesh", "ManagingDirector"));  
  
  
        Collections.sort(employee, new SortbyNo()); 
  
        System.out.println("\nSorted by empNo"); 
        for (int i=0; i<employee.size(); i++) 
            System.out.println(employee.get(i)); 
  
        Collections.sort(employee, new SortbyName()); 
  
        System.out.println("\nSorted by name"); 
        for (int i=0; i<employee.size(); i++) 
            System.out.println(employee.get(i));

            empOverload(); 
            shiftDetails();

       
    } 
    public void empOverload()
    {
    	    	
        Overloading o = new Overloading();
        o.displayShift('a');
        o.displayShift(9);
    }
    public void shiftDetails()
    {
   		HashMap<String, Integer> time = new HashMap<String, Integer>();
	    time.put("Sheeja", 9);
	    time.put("Neethu", 9);
	    time.put("Sheeba", 9);

    for (String i : time.keySet()) {
      System.out.println("key: " + i + " value: " + time.get(i));
    }
  }*/
}





	