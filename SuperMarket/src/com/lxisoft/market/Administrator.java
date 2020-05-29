package com.lxisoft.market;
import com.lxisoft.market.*;
import com.lxisoft.repository.FileRepository;
import java.util.*;
import java.io.*;
import java.util.Comparator; 
public class Administrator
{
   // private List<Employee> employees = new ArrayList<Employee>(); 
    private static Scanner sc;  
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
    public void findEmployeeDetails()
    {
        sc = this.getScanner();
        try
        {
            boolean isTest=false;
            do
            {
                isTest=false;
                System.out.println("\n1.Display Employee \n2.Add Employee\n3.Shift Time \n4.Attendence \n5.Exit");
                int m=sc.nextInt();
                switch (m)
                {
                    case 1: getEmployee(); isTest=true;break;               
                    case 2: setEmployee(); isTest=true;  break;
                    case 3: getShiftDetails(); isTest=true; break;
                    case 4: getAttendence(); isTest=true; break;
                    case 5: System.exit(0);break;
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
        }else  
            System.out.println("Is leave today");       
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























