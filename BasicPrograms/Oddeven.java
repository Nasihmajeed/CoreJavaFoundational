import java.util.Scanner;
public class Oddeven
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] a=new int[20];
int i;

System.out.println("Enter the numbers in the list:");

for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}

for(i=0;i<size;i++)
{
if(a[i]%2==0)
{
System.out.println(a[i]+" is an even number");
}
else
{
System.out.println(a[i]+" is an odd number");
}
}}}