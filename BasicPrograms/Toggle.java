import java.util.Scanner;
public class Toggle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int i;
System.out.println("TOGGLE CASE");
System.out.println("Enter the sentence");
String A=sc.nextLine();
String A1="";


System.out.println("The toggle case of given sentence is :");
for(i=0;i<=A.length;i++)
{
if(Character.isUpperCase(A.charAt(i)))
{
A1=A1+Character.toLowerCase(A.charAr(i));
}
else
{
A1=A1+Character.toUpperCase(A.charAr(i));
}
}
System.out.println(A1);
}}	