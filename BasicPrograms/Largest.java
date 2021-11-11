import java.util.Scanner
public class Largest
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int  a,b,c,d;
System.out.println("Enter the numbers:");
a=sc.newInt();
b=sc.newInt();
c=sc.newInt();
d=sc.newInt();

if(a>b)
{
	if(a>c)
	{
	if(a>d)
	System.out.println('$a is the largest number');
	}
}

else if(b>c)
{
	if(b>d)
	System.out.println(b+ "is the largest number");
}

else if(c>d)
	System.out.println(c+ "is the latrgest number");

else
	System.out.println(d+ "is the largest number");
}
}