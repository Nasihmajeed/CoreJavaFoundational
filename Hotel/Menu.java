import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Menu
{
ArrayList<Item> itm=new ArrayList<Item>();

public void addMenu()
{
itm.add(new Item());
itm.get(0).setName("Pizza");
itm.get(0).setRate(250);
itm.add(new Item());
itm.get(1).setName("Burger");
itm.get(1).setRate(450);
itm.add(new Item());
itm.get(2).setName("Pancake");
itm.get(2).setRate(150);
itm.add(new Item());
itm.get(3).setName("Cakes");
itm.get(3).setRate(250);
itm.add(new Item());
itm.get(4).setName("Soda");
itm.get(4).setRate(50);
itm.add(new Item());
itm.get(5).setName("Wine");
itm.get(5).setRate(500);
}

public void print2()
{
int i;
System.out.println("|----SlNo:---"+"----Item--------"+"---Rate----|");
for(i=0;i<itm.size();i++)
{
System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");
}
System.out.println("|---------------------------------------|");
}
public void order()
{
int sum=0,i;
Scanner scn=new Scanner(System.in);
System.out.println("How many items do u prefer to order");
int m=scn.nextInt();
for(i=0;i<m;i++)
{
System.out.println("Please place your order by the corresponding food's index value");
int n=scn.nextInt();
System.out.println("Item"+"\t"+"\t"+"Rate");
System.out.println(itm.get(n-1).getName()+"\t"+"\t"+itm.get(n-1).getRate());
sum=sum+itm.get(n-1).getRate();
}
System.out.println(sum);
}
}
//System.out.println(n);}
//System.out.println("The bill is");
//System.out.println("|"+"\t"+(i+1)+"|"+"\t"+itm.get(i).getName()+"\t"+"|"+"\t"+itm.get(i).getRate()+"\t"+"|");






















