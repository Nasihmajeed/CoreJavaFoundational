import java.lang.Math;
import java.util.Scanner;
public class Forest
{
	Animal[]animals=new Animal[5];
	Scanner an=new Scanner(System.in);
public void animalDetails()	
	{
		System.out.println("                    CHOOSE TWO NUMBERS TO FIGHT ");


		Animal blackpanther=new Blackpanther();
		blackpanther.name="Blackpanther";
		blackpanther.str=86;
		blackpanther.num=0;
		blackpanther.alive=true;
		animals[0]=blackpanther;
		System.out.println("number : "+animals[0].num);
		System.out.println(animals[0].name);
		blackpanther.run();
		System.out.println("strength : "+animals[0].str);
		System.out.println("\n");



		Animal leopard=new Leopard(); 
		leopard.name="Leopard";		
		leopard.str=79;
		leopard.num=1;	
		leopard.alive=true;
		animals[1]=leopard;
		System.out.println("number : "+animals[1].num);		
		System.out.println(animals[1].name);		
		leopard.run();		
		System.out.println("strength : "+animals[1].str);

		

		System.out.println("\n");



		
		Animal rabbit=new Rabbit();
		rabbit.name="Rabbit";
		rabbit.str=42;
		rabbit.num=2;
		rabbit.alive=true;
		animals[2]=rabbit;
		System.out.println("number : "+animals[2].num);
		System.out.println(animals[2].name);
		rabbit.rab();
		System.out.println("strength : "+animals[2].str);
		System.out.println("\n");


		Animal crocodail=new Crocodail();
		crocodail.name="Crocodail";
		crocodail.str=65;
		crocodail.num=3;
		crocodail.alive=true;
		animals[3]=crocodail;
		System.out.println("number : "+animals[3].num);
		System.out.println(animals[3].name);
		crocodail.rab();
		System.out.println("strength : "+animals[3].str);
		System.out.println("\n");


		Animal lion=new Lion();
		lion.name="Lion";
		lion.str=98;
		lion.num=4;
		lion.alive=true;
		animals[4]=lion;
		System.out.println("number : "+animals[4].num);
		System.out.println(animals[4].name);
		lion.run();
		System.out.println("strength : "+animals[4].str);
		System.out.println("\n");
		for (int i=0;i<5;i++) 
		{
		Animal[] rand=new Animal[2];
		rand=get(animals);
		Animal win=fight(rand);
		}
	}


public int random()
	{
		int r=(int)(Math.random()*5);
		return r;					
	}
public Animal[] get(Animal[] animals)
	{
		int r0=random();
		int r1=random();
		Animal[]cage=new Animal[2];
	if (r0!=r1&&animals[r0].alive==true||animals[r1].alive==true);
		{
		
		do{		
			r0=random();
			r1=random();				
		}while(r0==r1||animals[r0].alive==false||animals[r1].alive==false);
				System.out.println("  name: "+animals[r0].name+"   strength  "+animals[r0].str);
				System.out.println("\n");		
				System.out.println("  name: "+animals[r1].name+"   strength  "+animals[r1].str);

				cage[0]=animals[r0];
				cage[1]=animals[r1];
		}return cage;
	}

public Animal fight(Animal[] cage)
	{
		int s;
		Animal win=null;

			if (cage[0].str>cage[1].str) 
				{
					System.out.println(cage[0].name+ "  Defeat the  " +cage[1].name);				
					System.out.println("The Wiiner is :    "+cage[0].name+"    strength is reduce to  "+cage[0].str/2+ "    GOING TO SLEEP");									
					cage[1].str=0;
					cage[1].alive=false;
					cage[0].str=cage[0].str/2;
					s=cage[0].str;
					win=cage[0];
				}
			else
				{
					System.out.println(cage[1].name+ "  Defeat the  " +cage[0].name);				
					System.out.println("The Wiiner is :    "+cage[1].name+"    strength is reduce to  "+cage[1].str/2+ "    GOING TO SLEEP");					
					cage[0].str=0;
					cage[0].alive=false;
					cage[1].str=cage[1].str/2;
					s=cage[1].str;
					win=cage[1];	
				}
			return win;
	}
}