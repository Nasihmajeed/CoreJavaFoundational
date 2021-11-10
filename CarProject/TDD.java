import java.util.Scanner;
public class TDD
{
       public static void main(String[] ar)
       {
              String Brand,Model,RegNo,Color ;

              Scanner data = new Scanner(System.in);
              
              System.out.println("WELCOME TO THE WORLD OF CARS");      
              
              System.out.println("Mention the Brand of your car" );
              
              Brand = data.nextLine();
              
              System.out.println("Which model is you want ?");
              
              Model = data.nextLine();
              
              System.out.println("please Enter your registration number: ");
              
              RegNo = data.nextLine();
              
              System.out.println("which color varient is preffering!");
              
              Color = data.nextLine();
              
              Car c1 = new Car();
              
              c1.Brand=Brand;
              
              
              c1.Model=Model;
              
              c1.RegNo=RegNo;
              
              c1.Color=Color;
              
              Tyre t=new Tyre();
              
              t.tyreType="Flat";
              
              t.Brand="MRF";
              
              t.Radius=3.75f;
              
              t.t1="FRONT_LEFT_TYRE";
              
              t.t2="FRONT_RIGHT_TYRE";
              
              t.t3="BACK_RIGHT_TYRE";
              
              t.t4="BACK_LEFT_TYRE";
              
              c1.PrintDetails();
              
              t.PrintDetails();
       }
       
}

