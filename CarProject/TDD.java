import java.util.Scanner;
class Car
{
       String Brand;

       String Model;

       String RegNo;

       String Color;

       Scanner data = new Scanner(System.in);
       
       public  void PrintDetails(){
              System.out.println("Mention the Brand of your car" );

              Brand = data.nextLine();

              System.out.println("Which model is you want ?");

              Model = data.nextLine();

              System.out.println("please Enter your registration number: ");

              RegNo = data.nextLine();

              System.out.println("which color varient is preffering!");

              Color = data.nextLine();

             
       System.out.println("CAR BRAND IS :" +Brand);

       System.out.println("CAR MODEL IS :" +Model);

       System.out.println("CAR REGISTERED AS :" +RegNo);

       System.out.println("COLOR OF THE CAR IS :" +Color);

       }
}


  
class Tyre
{
	
String tyreType;

String Brand;

float Radius;

String t1,t2,t3,t4;

public void typeOfTyre()

{
	System.out.println("CAR TYRE IS : "+tyreType);

       System.out.println("BRAND OF TYRE IS : "+Brand);

       System.out.println("RADIUS OF TYRE IS : "+Radius);

       System.out.println("THE CAR HAVE FOUR TYRE'S : " + t1 + " ,"+t2+","+t3+", "+t4 );
}

}
	

public class TDD{
      
       public static void main(String[] ar){
              
              System.out.println("WELCOME TO THE WORLD OF CARS");

              Car car1 = new Car();

              car1.PrintDetails();

              Tyre t=new Tyre();

              t.tyreType="Flat";

              t.Brand="MRF";

              t.Radius=3.75f;

              t.t1="FRONT_LEFT_TYRE";

              t.t2="FRONT_RIGHT_TYRE";

              t.t3="BACK_RIGHT_TYRE";

              t.t4="BACK_LEFT_TYRE";

              t.typeOfTyre();
       }
    
       
}