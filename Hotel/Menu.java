import java.util.Scanner;
public class Menu
{
ArrayList<item> itm=new ArrayList<item>();

public void addMenu()
{
itm.get(0).setName("Pizza");
itm.get(0).setRate("250");
itm.get(1).setName("Burger");
itm.get(1).setRate("450");
itm.get(2).setName("Pancake");
itm.get(2).setRate("150");
itm.get(3).setName("Cakes");
itm.get(3).setRate("250");
itm.get(4).setName("Soda");
itm.get(4).setRate("50");
itm.get(5).setName("Wine");
itm.get(5).setRate("500");
}

Public void print2()
{
for(i=0;i<itm.size();i++)
{
System.out.println(i+itm.get(i).getName()+"\t"+itm.get(i).getRate());
}
}
Public void order()
{
Scanner scn=new Scanner();
int n=nextln.Int();

