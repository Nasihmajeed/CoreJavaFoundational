import java.util.Scanner;  
public class esal   
{  
    public static void main(String args[])    
    {  
  
    //System.out.println("Enter total rows and columns: ");  
    Scanner s = new Scanner(System.in);  

  double sal = 0;
   System.out.println("Enter the Name of Employee:" );
  String name = s.nextLine();
  //Employee.add(name);
  System.out.println("Enter Sale Amount");
  int Sale_amount = s.nextInt();
  int i = Sale_amount;
  if (Sale_amount < 10000) {
       System.out.println("work hard to get mch more");
       System.out.println("status of salary is : " +Sale_amount);
  } else if (i < 30000) {
    sal = i * 15 / 100;
    System.out.println("work hard for more happiness");
    System.out.println("status of Commision is : " +sal);
  } else if (i >= 30000) {
    sal = 1 * 25 / 100;
    double amt = sal + 1000;
    System.out.println("work hard and keep it up");
    System.out.println("status of salary is : " +amt);
  } else {
       System.out.println("keep trying");
  }
}
    }  