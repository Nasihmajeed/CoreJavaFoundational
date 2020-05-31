package com.lxisoft.market;
import com.lxisoft.market.*;
import com.lxisoft.repository.FileRepository;
import java.util.*;
import java.io.*;
import java.util.Comparator; 
public class Shop
{	
	private static Scanner sc;	
	private List<Item> items = new ArrayList<Item>();
	private List<Stock> stock=new ArrayList<Stock>();
	FileRepository fr=new FileRepository();
	private String name="EVERGREEN ENTERPRISES";
	private String address="Pookotukavu";
	private String place="Kadambur";
	private final int pinCode = 679514;
	public void printShopDetails()
	{
		System.out.println("Shop Name : "+name);
		System.out.println("Address: "+address);
		System.out.println("Place : "+place);
		System.out.println("Pin : "+pinCode);
		displayMainMenu();
	}
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
	public void displayMainMenu()
	{
		System.out.println("\nSelect one");
		System.out.println("\n1.Items 2.Employee 3.Exit");
		sc = this.getScanner();
		int s=sc.nextInt();
		switch(s)
		{
			case 1:selectOption();break;
			case 2: getEmployeeDetails();break;
			case 3: System.exit(0);break;
			default:System.out.println("Invalid option");			
		}
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
				System.out.println("\n1.Add Item \n2.Add Stock \n3.Display Item \n4.Display Stock \n5.Bill \n6.Back");
				int m=sc.nextInt();
				switch (m)
				{
					case 1:	setItem(); isTest=true;break;				
					case 2: setStock(); isTest=true;  break;
					case 3: getItem(); isTest=true; break;
					case 4: getCurrentStock(); isTest=true; break;
					case 5: printBill(); isTest=true; break;
					case 6:displayMainMenu();isTest=true; break;
					default:
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
		fr.writeToFile(items);
	}
	public void getItemGuaranty()
	{
		Item items=new Item();
		items.guarantiItem();
	}
	public List<Item> getItem()
	{
		System.out.println("\nDisplay the details of Item");
		getItemGuaranty();
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
		getCurrentStock();
		boolean sample=false;	
		do{
			sample=false;			
			System.out.println("\nSelect Your item");
			curentStock();
			System.out.println("Do you want More 1.No 2.Yes");
			int n=sc.nextInt();
			if (n==1)
			{
				sample = true;	
			}
			else if(n==2)
			{
				sample = false;	
			}	
		}
		while(sample);		
	}	
	public List<Stock> curentStock()
	{
		int numbers=0;
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
					System.out.println("Total Bill Amount="+((items.get(q).getPrice())*(numbers)));
				}			
				else if(stock.get(q).getQuantity()<numbers)
				{	
					System.out.println("- Stock");
					break;
				}					
			}		
		}			
		return stock;				
	}
	public void printSortedItems()
	{		
		Collections.sort(items);
        System.out.println(items);
	}	
    public void printFileDetails()
	{
		fr.readFromFile();
	}
	public void getEmployeeDetails()
    {
        sc = this.getScanner();
        try
        {
            boolean isTest=false;
            do
            {
                isTest=false;
                System.out.println("\n1.Display Employee \n2.Add Employee\n3.Shift Time \n4.Attendence \n5.Back");
                int m=sc.nextInt();
                switch (m)
                {
                    case 1: getEmployee(); isTest=true;break;               
                    case 2: setEmployee(); isTest=true;  break;
                    case 3: getShiftDetails(); isTest=true; break;
                    case 4: getAttendence(); isTest=true; break;
                    case 5:displayMainMenu();isTest=true; break;
                }
            }while(isTest);
        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);
            e.printStackTrace();
        }   
    }
    public void setEmployee()
    {
        sc = this.getScanner();
        System.out.println("Employee ID");
        int empNo = sc.nextInt(); 
        System.out.println("Employee Name");
        String name = sc.next(); 
        System.out.println("Post");
        String post = sc.next();                         
    }
    public void getEmployee() 
    { 
        ArrayList<Employee> employee = new ArrayList<Employee>(); 
        employee.add(new Employee(101, "Sheeja", "Cleaning")); 
        employee.add(new Employee(102, "Neethu", "Superwiser")); 
        employee.add(new Employee(103, "Sheeba", "Billing")); 
        employee.add(new Employee(104, "Remya", "Manager")); 
        employee.add(new Employee(105, "Priya", "Sees")); 
        employee.add(new Employee(106, "Suneera", "StockClearng"));
        employee.add(new Employee(107, "Raihanath", "Sees"));
        employee.add(new Employee(108, "Suhara", "Sees"));
        employee.add(new Employee(109, "Rajesh", "ManagingDirector")); 
        Collections.sort(employee, new SortbyNoComparator()); 
        System.out.println("\nSorted by empNo"); 
        for (int i=0; i<employee.size(); i++) 
            System.out.println(employee.get(i)); 
        Collections.sort(employee, new SortbyNameComparator()); 
        System.out.println("\nSorted by name"); 
        for (int i=0; i<employee.size(); i++) 
        System.out.println(employee.get(i));             
    }
    public void getAttendence()
    {
        sc = this.getScanner();
        System.out.println("Attendence"); 
        System.out.println("\nSuneera \nSheeba \nSheeja \nNeethu \nPriya \nRajesh \nRemya \nRaihanath \nSuhara");        
        String str = "Suneera Sheeba Sheeja Neethu Priya Rajesh Remya Raihanath Suhara "; 
        System.out.println("\nSearch a name");
        String s=sc.next();
        if(str.contains(s)) {  
            System.out.println("Present today");  
        }else System.out.println("Is leave today");       
    }       
    public void getShiftDetails()
    {
        System.out.println("Shift Details");
        HashMap<String, Integer> afternoonTime = new HashMap<>();
        afternoonTime.put("Morning", 9);
        afternoonTime.put("Evening", 5);
        System.out.println("Fisrt Shift " + afternoonTime);    
        HashMap<String, Integer> fornoonTime = new HashMap<>(afternoonTime);
        fornoonTime.put("Evening", 1);
        fornoonTime.put("Night",8);
        System.out.println("Second Shift: " + fornoonTime);
    }
}





	


















