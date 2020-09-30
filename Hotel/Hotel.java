import java.util.Scanner;
public class Hotel
{
public void print1()
{
Menu menu=new menu();
Scanner scn=new Scanner();
System.out.println("Please enter your preferred choice"+"\n");
System.out.println("Press 1.Menu\t 2.Admin-Console\t "+"\n");
int n=scn.nextInt();
if(n==1)
{
menu.addMenu();
System.out.println("---------MENU---------");
menu.print2();
System.out.println("Please place your order by the corresponding food's index value")
menu.order();
