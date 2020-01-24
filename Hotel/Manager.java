import java.util.Scanner;
public class Manager
{
String name;

int f=0;
static Scanner input =new Scanner(System.in);
void createManager(Menu menu)
	{
		int choise;
		System.out.println("F "+this.f);
		
		if(f>0)
		{
		menu.editMenu();
		}	
		if(f==0)
		{
		System.out.println("name Of Manager= ");
		name=input.next();
		menu.createMenu();
		f++;
		}
		//while(f==0);

		
	}

void displayManager()
	{


	}

}