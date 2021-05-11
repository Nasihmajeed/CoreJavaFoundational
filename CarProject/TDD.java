import java.util.Scanner;
public class TDD {

  public static void main(String ar[]) {
  //car1
  Scanner sc=new Scanner(System.in);
   Car c1= new Car();
  Car c2= new Car();
  Car c3= new Car();
  Carcolor clr1= new Carcolor();
  Carcolor clr2= new Carcolor();
  Carcolor clr3= new Carcolor();
  Fuel f1=new Fuel();
  Fuel f2=new Fuel();
  Fuel f3=new Fuel();
  Tyre T1=new Tyre();
  Tyre T2=new Tyre();
  Tyre T3=new Tyre();
  Engine e1= new Engine();
  Engine e2= new Engine();
  Engine e3= new Engine();
  Driver d1= new Driver();
  Driver d2= new Driver();
  Driver d3= new Driver();
  
  //car1
  System.out.println("Enter 1st car's name:");
  c1.carname=sc.nextLine();
  System.out.println("Enter 1st car's color:");
  clr1.color=sc.nextLine();
  System.out.println("Enter 1st car's fuel type:");
  f1.carFuel=sc.nextLine();
  System.out.println("Enter 1st car's Tyre Type");
  T1.CarTyre=sc.nextLine();
  System.out.println("Enter whether 1st car's passanger have licence");
  d1.PassangerLicense=sc.nextBoolean();
  System.out.println("Enter Engine type of 1st car:");
  e3.engineType=sc.nextLine();
  /*System.out.println("Enter whether 1st car's passanger have licence");
  d1.PassangerLicense=sc.nextBoolean();*/
  
  //car 2
  System.out.println("Enter 2nd car's name:");
  c2.carname=sc.nextLine();
  System.out.println("Enter 2nd car's color:");
  clr2.color=sc.nextLine();
  System.out.println("Enter 2nd car's fuel type:");
  f2.carFuel=sc.nextLine();
  System.out.println("Enter 2nd car's Tyre Type");
  T2.CarTyre=sc.nextLine();
  
  System.out.println("Enter Engine type of 2nd car");
  e3.engineType=sc.nextLine();
  System.out.println("Enter whether 2nd car's passanger have licence");
  d2.PassangerLicense=sc.nextBoolean();
  
  //car3
  System.out.println("Enter 3rd car's name:");
  c3.carname=sc.nextLine();
  System.out.println("Enter 3rd car's color:");
  clr3.color=sc.nextLine();
  System.out.println("Enter 3rd car's fuel type:");
  f3.carFuel=sc.nextLine();
  System.out.println("Enter 3rd car's Tyre Type");
  T3.CarTyre=sc.nextLine();
  
  System.out.println("Enter Engine type of 3rd car");
  e3.engineType=sc.nextLine();
  System.out.println("Enter whether 3rd car's passanger have licence");
  d3.PassangerLicense=sc.nextBoolean();
  
  
  //car1
  c1.drive();
  clr1.clr();
 f1.fuelType();
  T1.crtyr();
   d1.license();
   e1.engine();
  
  
  //car2
 c2.drive();
 clr2.clr();
  f2.fuelType();
   T2.crtyr();
   d2.license();
  e2.engine(); 
  
  //car3
 
   c3.drive();
   clr3.clr();
   f3.fuelType();
   T3.crtyr();
   d3.license();
  e3.engine();
  }
}

