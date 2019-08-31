//import java.util.Scanner();

public class Forest
{
	Animal lion=new Lion();
	Animal fox=new Fox();
//Scanner sc=new Scanner(System.in);
public void getLionDetails()
{
System.out.println("Lion details are:");
 lion.setStrengthDetails();
lion.getStrengthDetails();
lion.eat();
lion.run();
}
public void getFoxDetails()
{
System.out.println("Fox details are:");
fox.setStrengthDetails();
fox.getStrengthDetails();
fox.eat();
fox.run();
}
public void meet()
{
	System.out.println("lion meets with fox");
}
public void fight()
{
System.out.println("lion and fox fights together");
if(lion.strength>fox.strength)
{
	System.out.println("lion won the fight");
}
else
{
	System.out.println("fox won the fight");
}
}
}