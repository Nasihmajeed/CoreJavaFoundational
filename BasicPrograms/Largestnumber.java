import java.util.Scanner;
public class Largestnumber
{
public static void main (String[] args)
{
Scanner sc= new Scanner(System.in);

  System.out.println("enter first number :");
  int num1 = sc.nextInt();
  System.out.println("enter second number :");
  int num2 = sc.nextInt();
  System.out.println("enter third number :");
  int num3 = sc.nextInt();
  System.out.println("enter fourth number :");
  int num4 = sc.nextInt();
  int largestnumber = (num1 > num2 && num2 > num3 && num3 > num4)
      ? num1
      : (num2 > num3 && num2 > num4)
          ? num2
          : (num3 > num4 ? num3 : num4);
  System.out.println("the Largest number is"+largestnumber);
}

}
