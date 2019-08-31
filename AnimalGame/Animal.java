import java.util.Scanner;

public class Animal
{
	int strength;
	Scanner sc=new Scanner(System.in);
	public void eat()
	{
		System.out.println("eating meet");
	}
	public void run()
	{
		System.out.println("run fast");
	}
public void setStrengthDetails()
{
System.out.println("Enter the Animal strength:");
strength=sc.nextInt();

}
public void getStrengthDetails()
{
System.out.println("Strength is  :"+strength);
}
}