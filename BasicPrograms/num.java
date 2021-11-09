import java.util.Scanner;

public class num
{

public static void main(String[] args)
{

Scanner sc = new Scanner (System.in);

System.out.println("Please enter first number: ");

int n1= sc.nextInt();
 System.out.println("Please enter second number: ");

int n2 = sc.nextInt();

System.out.println("Please enter third number: ");

int n3= sc.nextInt();

System.out.println("Please enter fourth number: ");

int n4 = sc.nextInt(); 
if (n1 > n2 && n1 > n3 && n1> n4) {
			System.out.println(n1 + " is the largest number.");
				}
		else if (n2 > n3 && n2 > n4) {
			System.out.println(n2 + " is the largest number.");
		}
		else if (n3 > n4) {
			System.out.println(n3 + " is the largest number.");
		}
		else {
			System.out.println(n4 + " is the largest number");
		}
}
}