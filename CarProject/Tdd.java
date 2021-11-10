import java.util.Scanner;
public class TDD
{
       public static void main(String[] args)
       {
              String Brand,Model,RegNo,Color ;

              Scanner src  = new Scanner(System.in);
              
              System.out.println("WELCOME TO OUR CAR FACTORY");      
              
              System.out.println("Enter the brand of a car : ");
              
              Brand = src .nextLine();
              
              System.out.println("Enter the model of a car : ");
              
              Model = src .nextLine();
              
              System.out.println("Enter registration number : ");
              
              RegNo = src .nextLine();
              
              System.out.println("Enter the color of the car : ");
              
              Color = src .nextLine();
              
              Car c1 = new Car();
              
              c1.Brand=Brand;
              
              
              c1.Model=Model;
              
              c1.RegNo=RegNo;
              
              c1.Color=Color;
              
              Tyre t=new Tyre();

              String tyreType,Brand,Radius;

              System.out.println("Enter the Tyre type");
               
              tyreType=src.nextLine();
              
              System.out.println("Enter the Tyre brand");
               
              Brand=src.nextLine();
          
              System.out.println("Enter the Tyre radius");
               
              Radius=src.nextLine();

              t.tyreType=tyreType;
              
              t.Brand=Brand;
              
              t.Radius=Radius;
              
              t.t1="FRONT_LEFT_TYRE";
              
              t.t2="FRONT_RIGHT_TYRE";
              
              t.t3="BACK_RIGHT_TYRE";
              
              t.t4="BACK_LEFT_TYRE";
              
              c1.PrintDetails();
              
              t.PrintDetails();
       }
       
}