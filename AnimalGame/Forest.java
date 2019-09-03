import java.util.Random;
import java.util.Scanner;
public class Forest
{
	Animal[]animals=new Animal[3];
	Scanner an=new Scanner(System.in);
	public void animalDetails()	
	{
		System.out.println("                    CHOOSE TWO NUMBERS TO FIGHT ");


		Animal blackpanther=new Blackpanther();

		blackpanther.name="blackpanther";

		blackpanther.str=86;

		blackpanther.num=0;

		animals[0]=blackpanther;
		System.out.println("number : "+animals[0].num);

		System.out.println(animals[0].name);

		blackpanther.run();

		System.out.println("strength : "+animals[0].str);




		Animal leopard=new Leopard(); 

		leopard.name="Leopard";
		
		leopard.str=79;

		leopard.num=1;
		
		animals[1]=leopard;
		System.out.println("number : "+animals[1].num);
		
		System.out.println(animals[1].name);
		
		leopard.run();
		
		System.out.println("strength : "+animals[1].str);




		Animal rabbit=new Rabbit();

		rabbit.name="Rabbit";

		rabbit.str=42;

		rabbit.num=2;

		animals[2]=rabbit;
		System.out.println("number : "+animals[2].num);

		System.out.println(animals[2].name);

		rabbit.rab();

		System.out.println("strength : "+animals[2].str);

	}
public void fight()
	{
		int number1,number2;
		Animal[] choices=new Animal[3];

		System.out.println("Choose your 1st animal number");
		
		number1=an.nextInt();	
		
		animals[number1].animalDetails();
		
		choices[0]=animals[number1];
		
		System.out.println("Choose your 2nd animal number");
		
		number2=an.nextInt();
		
		animals[number2].animalDetails();
		
		choices[1]=animals[number2];

		for (int i=0;i<3 ;i++ ) 
		{
			if (choices[0]==animals[i])
			{
				System.out.println("name:"+animals[i].name+"strength"+animals[i].str);		
			}	
			else if(choices[1]==animals[i])
			{
				System.out.println("name:"+animals[i].name+"strength"+animals[i].str);		

			}
		}
		if (choices[0].str>choices[1].str) 
		{
				System.out.println("name:"+choices[0].name+"strength"+choices[0].str/2+ "    winner winner chicken dinner");					
		}
		else
		{
				System.out.println("name:"+choices[1].name+"strength"+choices[1].str/2+ "    winner winner chicken dinner");		
		}
	}	
}

	