package com.lxisoft.Test;
import com.lxisoft.Car.Car;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.Engine.Engine;
import com.lxisoft.Rc.Rc;
import com.lxisoft.Tyre.Tyre;
import com.lxisoft.Door.Door;
public class Tdd
{
 public static void main(String[] args) 
 {
	Car car = new Car();
 	Engine engine =new Engine(); 
    Rc rc =new Rc();
    Door door = new Door();
    Tyre tyre =new Tyre();
        Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Enter The Details Of vehicle : ");	
		int choice = scanner.nextInt();
		if(choice==1)
		{
			System.out.println("-------------------------------------");
			System.out.println("Enter The Details of Car : ");
			System.out.println("Enter Name of the car : ");
			String carname=scanner.next();
			car.setcarName(carname);
			System.out.println("Enter Model of the Car :");
			String model=scanner.next();
			car.setcarModel(model);
        	System.out.println("Enter Manufacture of the Car : ");
        	String manufacturer=scanner.next();
        	car.setcarManufacturer(manufacturer);
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
        	System.out.println("Enter The RC Details : ");
			System.out.println("Enter The Name Of RC Owner :");
			String owner=scanner.next();
			rc.setrcOwner(owner);
			System.out.println ("Enter Adress Of RC Owner");
			String address=scanner.next();
			rc.setownerAddress(address);
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
			System.out.println("Enter The Engine Details : ");
    		System.out.println("Enter The Engine CC : ");
    		int ccnumber= scanner.nextInt();
    		engine.setengineNumber(ccnumber);
    		System.out.println("Enter The Type Of Engine : ");
    		String cctype= scanner.next();
    		engine.setengineType(cctype);
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
    		System.out.println("Enter the Details of Doors : ");
			System.out.println("Enter The Number OF Doors : ");
			int doornumber=scanner.nextInt();
			door.setdoorNumber(doornumber);
			System.out.println("Enter The Type Of Door : ");
			String doortype=scanner.next();
			door.setdoorType(doortype);
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
			System.out.println("Enter the Details of Tyre : ");
			System.out.println("Enter The Size OF Tyre : ");
			int size=scanner.nextInt();
			tyre.settyreSize(size);
			System.out.println("Enter The Name Of Manufacture Of the Tyre : ");
			String tyrename=scanner.next();
			tyre.settyreName(tyrename);
			System.out.println("-------------------------------------");
			
        }
        System.out.println("2 - Print The Details Of Vehicle : ");
        int number = scanner.nextInt();
	    if(number==2)
    {  
       car.printCarDetails();
       engine.printEngineDetails();
	    rc.printRcDetails();
        tyre.printTyreDetails();
        door.printDoorDetails();  
    }	
	  else
		{
			System.out.println("Invalid Choice");
		}
   }
}