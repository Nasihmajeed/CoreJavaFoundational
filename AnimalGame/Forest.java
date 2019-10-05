import java.lang.Math;
public class Forest
{
	Animal[]animals=new Animal[5];
public void animalDetails()	
	{
		System.out.println("\t\tCHOOSE TWO NUMBERS TO FIGHT ");


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
		crocodail.run();
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
		Animal win=null;
		for (int i=0;i<animals.length;i++)
		{
			fighter(get());
		}
			
		
		
	}
public int random()
	{
		int r=(int)(Math.random()*5);
		return r;					
	}
public void fighter()
	{
		int r0=0;
		int r1=0;
		int s;
 		r0=random();
 		r1=random();
 	}

public void get(Animal win)
		{
			Animal[] adi=new Animal[5];
			Animal b=new Blackpanther();
			Animal c=new Crocodail();
			Animal l=new Leopard();
			Animal li=new Lion();
			Animal r=new Rabbit();
			adi[0]=b;
			adi[1]=c;
			adi[2]=l;
			adi[3]=li;
			adi[4]=r;
			for (int i=0;i<adi.length;i++)
			{
				/*Animal.adi[i].fight(int r0,int r1,Animal[] animals);*/
				System.out.println(adi[i].fight);
			}
		}
	
public void attack(Animal[] adi Animal[] win)
		{
			if(win==)
				System.out.println(win[0].name+ "  Defeat the  " +win[1].name);				
				System.out.println("The Wiiner is :    "+win.name+"    strength is reduce to  "+win.str/2+ "    GOING TO SLEEP");									
				animals[r1].str=0;
				animals[r1].alive=false;
		}
	}
