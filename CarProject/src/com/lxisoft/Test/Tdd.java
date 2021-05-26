package com.lxisoft.Test;
import com.lxisoft.Car.Car;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.Car.Engine;
import com.lxisoft.Car.Rc;
import com.lxisoft.Car.Tyre;
import com.lxisoft.Car.Door;
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
			car.setCarName(carname);
			System.out.println("Enter Model of the Car :");
			String model=scanner.next();
			car.setCarModel(model);
        	System.out.println("Enter Manufacture of the Car : ");
        	String manufacturer=scanner.next();
        	car.setCarManufacturer(manufacturer);
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
        	System.out.println("Enter The RC Details : ");
			System.out.println("Enter The Name Of RC Owner :");
			String owner=scanner.next();
			rc.setRcOwner(owner);
			System.out.println ("Enter Adress Of RC Owner");
			String address=scanner.next();
			rc.setOwnerAddress(address);
			car.setRc(rc);
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
			System.out.println("Enter The Engine Details : ");
    		System.out.println("Enter The Engine CC : ");
    		String ccnumber= scanner.next();
    		engine.setEngineNumber(ccnumber);
    		System.out.println("Enter The Type Of Engine : ");
    		String cctype= scanner.next();
    		engine.setEngineType(cctype);
    		car.setEngine(engine);
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
    		System.out.println("Enter the Details of Doors : ");
			System.out.println("Enter The Number OF Doors : ");
			String doornumber=scanner.next();
			door.setDoorNumber(doornumber);
			System.out.println("Enter The Type Of Door : ");
			String doortype=scanner.next();
			door.setDoorType(doortype);
			car.setDoor(door);
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
			System.out.println("Enter the Details of Tyre : ");
			System.out.println("Enter The Size OF Tyre : ");
			String size=scanner.next();
			tyre.setTyreSize(size);
			System.out.println("Enter The Name Of Manufacture Of the Tyre : ");
			String tyrename=scanner.next();
			tyre.setTyreName(tyrename);
			car.setTyre(tyre);
			System.out.println("-------------------------------------");
			
        }
        System.out.println("2 - Print The Details Of Vehicle : ");
        int number = scanner.nextInt();
	    if(number==2)
    {  
       car.printCarDetails(rc,engine,door,tyre); 
    }	
	  else
		{
			System.out.println("Invalid Choice");
		}
   }
}