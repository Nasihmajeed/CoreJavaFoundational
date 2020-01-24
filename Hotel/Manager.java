import java.util.Scanner;
public class Manager
{
String name;
Menu menu;

static Scanner input =new Scanner(System.in);
void createManager()
	{
		int choise;
		int f=0;
		menu=new Menu();
		if(f>0)
		{
		menu.editMenu();
		}	
		do
		{
		System.out.println("name Of Manager= ");
		name=input.next();
		menu.createMenu();
		f++;
		}
		while(f==0);

		
	}

void displayManager()
	{


	}

}