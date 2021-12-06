import java.util.Scanner;
public class Car
{
Scanner sc=new Scanner(System.in) ;
String brand;
String model;
String colour;
String regno;

Tyre t1, t2, t3, t4;
public void cardetails() 
{

System.out.println (" Enter the brand name, model, colour and register number of the car") ;
this.brand= sc.nextLine() ;
this.model= sc.nextLine() ;
this.colour= sc.nextLine() ;
this.regno= sc.nextLine() ;

System.out.println (" Enter the tyre brand, radius and position of first tyre.") ;
this.t1.brand=sc.next
this.t1.radius=sc.nextLine() ;
this. t1. position=sc.nextLine() ;

System.out.println (" Enter the tyre brand, radius and position of second tyre.") ;
this.t2.brand=sc.nextLine() ;
this.t2.radius=sc.nextLine() ;
this. t2. position=sc.nextLine() ;

System.out.println (" Enter the tyre brand, radius and position of third tyre.") ;
this.t3.brand=sc.nextLine() ;
this.t3.radius=sc.nextLine() ;
this. t3. position=sc.nextLine() ;

System.out.println (" Enter the tyre brand, radius and position of fourth tyre.") ;
this.t4.brand=sc.nextLine() ;
this.t4.radius=sc.nextLine() ;
this. t4. position=sc.nextLine() ;


}

public void printdetails() 
{
System.out.println ("CAR BRAND\t\tCAR MODEL\t\tCAR COLOUR\t\tREGISTER NUMBER") ;
System.out.println (brand+"\t\t\t\t"+model+"\t\t\t\t"+colour+"\t\t\t\t\t"+regno) ;

System.out.println ("TYRE BRAND\t\tTYRE RADIUS\t\tTYRE POSITION") ;
t1. printdetails() ;
t2. printdetails() ;
t3. printdetails() ;
t4. printdetails() ;
}
}
