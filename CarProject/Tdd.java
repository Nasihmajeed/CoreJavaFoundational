import java.util.Scanner;
public class TDD
{
       public static void main(String[] args)
       {
              String Brand;
              String Model;
              String RegNo;
              String Color;

              Scanner src= new Scanner(System.in);
              
              System.out.println("WELCOME TO OUR CAR FACTORY");      

              System.out.println("CAR-1"); 
              
              System.out.println("Enter the brand of a car : ");
              
              Brand = src.nextLine();
              
              System.out.println("Enter the model of a car : ");
              
              Model = src.nextLine();
              
              System.out.println("Enter registration number : ");
              
              RegNo = src.nextLine();
              
              System.out.println("Enter the color of the car : ");
              
              Color = src.nextLine();
              
              Car c1 = new Car();
              
              c1.Brand=Brand;
              
              c1.Model=Model;
              
              c1.RegNo=RegNo;
              
              c1.Color=Color;

              System.out.println("CAR-2");      
              
              System.out.println("Enter the brand of a car : ");
              
              Brand = src.nextLine();
              
              System.out.println("Enter the model of a car : ");
              
              Model = src.nextLine();
              
              System.out.println("Enter registration number : ");
              
              RegNo = src.nextLine();
              
              System.out.println("Enter the color of the car : ");
              
              Color = src.nextLine();
              
              Car c2 = new Car();
              
              c2.Brand=Brand;
              
              c2.Model=Model;
              
              c2.RegNo=RegNo;
              
              c2.Color=Color;

              System.out.println("CAR-3");      
              
              System.out.println("Enter the brand of a car : " );
              
              Brand = src.nextLine();
              
              System.out.println("Enter the model of a car : ");
              
              Model = src.nextLine();
              
              System.out.println("Enter registration number : ");
              
              RegNo = src.nextLine();
              
              System.out.println("Enter the color of the car : ");
              
              Color = src.nextLine();

              Car c3 = new Car();
              
              c3.Brand=Brand;
              
              c3.Model=Model;
              
              c3.RegNo=RegNo;
              
              c3.Color=Color;

              
              System.out.println("-------------------------------");

              System.out.println("DETAILS OF FIRST CAR ");

              c1.PrintDetails();  
              
              System.out.println("-------------------------------");

              System.out.println("DETAILS OF SECOND CAR ");
              
              c2.PrintDetails();
              
              System.out.println("-------------------------------");

              System.out.println("DETAILS OF THIRD CAR ");
              
              c3.PrintDetails();
              
       }
       
}