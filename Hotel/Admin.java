import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Admin
{
public void edit()
{
System.out.println("Press \n1.Add a food Item\n2.Remove a food Item\n3.Delete a food Item");
Scanner scn=new Scanner(System.in);
int k=scn.nextInt();
if(k==1)
{
add();
}
}
public void add(ArrayList<Item> itm)
{
int l=itm.size();
System.out.println("Enter name of the food:");
Scanner scnr=new Scanner(System.in);
String name=scnr.nextLine();
itm.get(l+1).setName(name);
System.out.println("Enter rate of the food:");
int price=scnr.nextInt();
itm.get(l+1).setRate(price);
}
}

