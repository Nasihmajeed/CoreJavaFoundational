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
		int winnerr=0;
	
		for (int i=0;true;i++)
		{
			int count=0;
			for (int j=0;j<animals.length;j++)
			{
				if(animals[j].alive=true)
				{
					count++;
					winnerr=j;
				}

			}	
			if(count==1)
			{ 
				System.out.println("Winner is" + animals[winnerr].name);
				break;
			}
			fight();

		}
	}
public int random()
	{
		int r=(int)(Math.random()*5);
		return r;					
	}
public void fight()
	{
	
		int r0=0;
		int r1=0;
			{
		 		do{		
				r0=random();
				r1=random();	
				}while(r0==r1| animals[r0].alive==false|animals[r1].alive==false);
				System.out.println(animals[r0].name  +" "  +animals[r1].name);			
			}
		Animal[] winner=new Animal[2];
				winner=animals[r0].fight(r1,animals);
				if(winner[0].name.equals(animals[r0].name))
					{
						System.out.println("\n");								
						System.out.println(animals[r0].name+ "  Defeat the  " +animals[r1].name);				
						System.out.println("The Wiiner is :    "+ animals[r0].name +"    strength is reduce to  "+ animals[r0].str/2 + "    GOING TO SLEEP");	
						System.out.println("\n");								
						animals[r0].str=animals[r0].str/2;
						animals[r1].str=0;
						
						animals[r1].alive=false;
						if(animals[r0].str==0)
						{
						animals[r0].alive=false;
						}

						System.out.println("The lose is :    "+ animals[r1].name +"    strength is reduce to  "+ animals[r1].str );									
						if(animals[r0].alive=true)
						{
							System.out.println("the winner is"+animals[r0].name);
						}
/*						animals[r1].str=animals[r1].str/3;
*/			
					}
				else
					{
						System.out.println(animals[r1].name+ "  Defeat the  " +animals[r0].name);				
						System.out.println("The Wiiner is :    "+animals[r1].name+"    strength is reduce to  "+animals[r1].str/2 + "    GOING TO SLEEP");								
						System.out.println("\n");
						animals[r1].str=animals[r1].str/2;
						animals[r0].str=0;	
						
						animals[r0].alive=false;
					
						System.out.println("The lose is :    "+animals[r0].name+"    strength is reduce to  "+animals[r0].str );									
						System.out.println(animals[r0].name+ "is"+animals[r0].alive);
						if(animals[r1].alive=true)
						{
							System.out.println("the winner is"+animals[r1].name);
						}
					}
		}
}
