package com.lxisoft.test;
import com.lxisoft.car.Car;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.car.Engine;
import com.lxisoft.car.Rc;
import com.lxisoft.car.Tyre;
import com.lxisoft.car.Door;
public class Tdd
{
 public static void main(String[] args) 
 {
	Car car = new Car();
 	Engine engine =new Engine(); 
    Rc rc =new Rc();
    Door door = new Door();
    Tyre tyre = new Tyre();
    ArrayList<Door> doors = new ArrayList<Door>();
    ArrayList<Tyre> tyres = new ArrayList<Tyre>();

        Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Enter The Details Of vehicle : ");	
		int choice = scanner.nextInt();
		if(choice==1)
		{
			car.setRc(rc);
            car.setEngine(engine);
            car.setDoor(doors);
            car.setTyre(tyres);

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
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
			System.out.println("Enter The Engine Details : ");
    		System.out.println("Enter The Engine CC : ");
    		String ccnumber= scanner.next();
    		engine.setEngineNumber(ccnumber);
    		System.out.println("Enter The Type Of Engine : ");
    		String cctype= scanner.next();
    		engine.setEngineType(cctype);
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
    		System.out.println("Enter the Details of Doors : ");
    		for(int i=0;i<4;i++)
			{	doors.add(door);
			    System.out.println("Enter The door Number : ");
			    String doornumber=scanner.next();
			    doors.get(i).setDoorNumber(doornumber);
			    System.out.println("Enter The Type Of Door : ");
			    String doortype=scanner.next();
			    doors.get(i).setDoorType(doortype);
		    }
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
			System.out.println("Enter the Details of Tyre : ");
			for(int j=0;j<4;j++)
			{
				tyres.add(tyre);
			   System.out.println("Enter the Tyre Number :");
			   String tyrenumber=scanner.next();
			   tyres.get(j).setTyreNumber(tyrenumber);
			   System.out.println("Enter The Size OF Tyre : ");
			   String size=scanner.next();
			   tyres.get(j).setTyreSize(size);
			   System.out.println("Enter The Name Of Manufacture Of the Tyre : ");
			   String tyrename=scanner.next();
			   tyres.get(j).setTyreName(tyrename);
			   
		    }
			System.out.println("-------------------------------------");
        }
        System.out.println("2 - Print The Details Of Vehicle : ");
        int number = scanner.nextInt();
	    if(number==2)
    {  
       car.printCarDetails();  
    }	
	  else
		{
			System.out.println("Invalid Choice");
		}
   }
}