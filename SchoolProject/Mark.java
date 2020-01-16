import java.util.Scanner;
public class Mark
{
float m1,m2,m3,total;
float per;
Scanner input =new Scanner(System.in);
void MarkCreat()
{
		System.out.println("Enter m1");
		m1=input.nextInt();
		System.out.println("Enter m2");
		m2=input.nextInt();
		System.out.println("Enter m3");
		m3=input.nextInt();
		total=m1+m2+m3;
		per=(total/300)*100;


}
   void MarkDisplay()
	{ 
		System.out.println("mark1="+m1);
		System.out.println("mark2="+m2);
		System.out.println("mark3="+m3);
		System.out.println("Total="+total);
		System.out.println("Per ="+per);
		if(per>=45)
		{
			System.out.println("Passed ");
		
		}	
		else
		{
			System.out.println("Failed ");
		
		}
	}
}