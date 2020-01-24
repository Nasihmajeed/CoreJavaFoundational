import java.util.Scanner;
public class Food
{
String name;
int rate;
static Scanner input =new Scanner(System.in);
void createFood()
	{
		System.out.println("Food = ");
		name=input.next();
		System.out.println("Rate = ");
		rate=input.nextInt();
	}


void displayFood()
	{
		System.out.print("\n"+this.name+"\t:\t"+this.rate);
	}
}