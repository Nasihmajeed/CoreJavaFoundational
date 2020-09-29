import java.util.Scanner;
public class Hotel
{
int choice,itemPrice,i,n;
Menu menu=new Menu();
public void print1()
{
System.out.println("---------------Welcome---------------");
System.out.println("------------The Sky Hotel------------");
System.out.println("----------------Menu-----------------");
System.out.println("\n1. Burger -Rs.250/- \n2. Pizza  -Rs.450/- \n3. Fries  -Rs.50/- \n4. Soda   -Rs.20/- \n5. Done");
System.out.println("How many food items do you want");
Scanner scanner = new Scanner(System.in);
n=scanner.nextInt();
for(i=0;i<n;i++)
{
System.out.println("--Enter your preferred food's number--");
//Scanner scanner = new Scanner(System.in);
choice=scanner.nextInt();
switch (choice) {

case 1:

System.out.println("\nYou ordered Burger");
itemPrice=250;
//menu.quantity(itemPrice);
break;

case 2:
System.out.println("\nYou ordered Pizza");
itemPrice=450;
//menu.quantity(itemPrice);
break;

case 3:
System.out.println("\nYou ordered Fries");
itemPrice=50;
//menu.quantity(itemPrice);
break;

case 4:

System.out.println("You ordered Soda");
itemPrice=20;
//menu.quantity(itemPrice);
break;

case 5:
System.out.println("Order again");
}
}
menu.quantity(itemPrice);
}
}











