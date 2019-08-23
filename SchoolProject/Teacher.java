import java.util.Scanner;
public class Teacher
{
	String name;
	int empId;
	
	public void scan()
	{ 
	  
		Scanner input= new Scanner(System.in);
		System.out.println("\n enter the name of Teacher");
		name=input.nextLine();
		System.out.println("\n enter the empId of Teacher");
		empId=input.nextInt();
	  
	}
	
	public void print()
	{ 
	   
		System.out.println(" \n name of Teacher is " +name);
		System.out.println("\n the ID of Teacher :" +empId);
	   
	}
}
