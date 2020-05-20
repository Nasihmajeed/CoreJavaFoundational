package com.lxisoft.market;
import com.lxisoft.market.*;
import com.lxisoft.repository.FileRepository;
import java.util.*;
import java.io.*;
import java.util.Comparator; 
public class Shop
{
	static Scanner sc=new Scanner(System.in);
	public List<Item> items=new ArrayList<Item>();
	FileRepository fr=new FileRepository();
	public static String shopName = ""; 
    public static void shop(String name){ 
          
        shopName = name; 
    } 

	public void shopDetails()
	{	
		ArrayList<String> details=new ArrayList<String>();  
		details.add("   Supermarket,Textiles,Fancy");  
		details.add("   Pookotukavu");  
		details.add("   Kadambur (PO),Pin: 679514,Palakkad"); 	 
		for(String d:details){  
		System.out.println(d); 
		}
		try
		{
			boolean isTest=false;
			do
			{
				isTest=false;
				System.out.println("\n1.Add Stock \n2.Display All \n3.Bill \n4.Employee \n5.Exit");
				int m=sc.nextInt();
				switch (m)
				{
					case 1:	addStock(); isTest=true;break;				
					case 2: displayDetails(); isTest=true;  break;
					case 3: break;
					case 4: employeeDetails(); isTest=true; break;
					case 5: System.exit(0); break;	
					
				}
			}while(isTest);
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
			e.printStackTrace();
		}	
	}
	public void addStock()
	{
		try
		{
			boolean check=false;
			do	
			{
				check=false;
				System.out.println("Choose Items");
				System.out.println("\n 1.Stationary \n 2.Toys \n 3.Fancy  \n");
				int i=sc.nextInt();
				switch (i)
				{
		 			case 1: addStationary(); break;
					case 2: addToy(); break;
					case 3: addFancy(); break;			
					default:
				}				
			}while(check);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error in input value");
			e.printStackTrace();
		}		
	}
	public void addStationary()
	{
		System.out.println("Name of Item");
		Item stationary=new Stationary();
		stationary.setName(sc.next());
		System.out.println("Item ID");
		stationary.setId(sc.nextInt());	
		System.out.println("Price of item");
		stationary.setPrice(sc.nextInt());
		System.out.println("Quantity of item");
		stationary.setQuantity(sc.nextInt());	
		items.add(stationary);
		fr.writeFile(items);
		//fr.readFile();
	} 
	public void addToy()
	{
		System.out.println("Name of Toy");
		Item toy=new Toy();
		toy.setName(sc.next());
		System.out.println("ID");
		toy.setId(sc.nextInt());	
		System.out.println("Price of Toy");
		toy.setPrice(sc.nextInt());
		System.out.println("Quantity of Toy");
		toy.setQuantity(sc.nextInt());	
		items.add(toy);
		fr.writeToFile(items);
		// fr.readToFile();

	}
	public void addFancy()
	{
		System.out.println("Name of Fancy");
		Item fancy=new Fancy();
		fancy.setName(sc.next());
		System.out.println("ID");
		fancy.setId(sc.nextInt());	
		System.out.println("Price of item");
		fancy.setPrice(sc.nextInt());
		System.out.println("Quantity of item");
		fancy.setQuantity(sc.nextInt());	
		items.add(fancy);
		fr.writeToFileFancy(items);
		// fr.readToFileFancy();

	}
	public void displayAll()
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
		
		map.put(1,"\nEveready Products 10 Month Warranty");
		map.put(3, "\nBajaj Products 4yr Warranty");
		map.put(2, "\nCello Products 2yr Warranty");
				
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
  
       /* System.out.println("Unsorted"); 
        for (int i=0; i<employee.size(); i++) 
            System.out.println(employee.get(i)); */
  
        Collections.sort(employee, new SortbyNo()); 
  
        System.out.println("\nSorted by empNo"); 
        for (int i=0; i<employee.size(); i++) 
            System.out.println(employee.get(i)); 
  
        Collections.sort(employee, new SortbyName()); 
  
        System.out.println("\nSorted by name"); 
        for (int i=0; i<employee.size(); i++) 
            System.out.println(employee.get(i)); 
    } 
} 

	
					
	
	








	