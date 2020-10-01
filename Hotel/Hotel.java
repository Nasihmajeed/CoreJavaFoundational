import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Hotel
{
Admin admin=new Admin();
public void print1()
{
Menu menu=new Menu();
Scanner scn=new Scanner(System.in);
System.out.println("Please enter your preferred choice"+"\n");
System.out.println("Press 1.Menu\t 2.Admin-Console\t "+"\n");
int n=scn.nextInt();
if(n==1)
{
menu.addMenu();
System.out.println("|-----------------MENU------------------|");
menu.print2();
menu.order();
}
if(n==2)
{
System.out.println("|-----------------MENU------------------|");
menu.print2();
admin.edit();
}
}
}

