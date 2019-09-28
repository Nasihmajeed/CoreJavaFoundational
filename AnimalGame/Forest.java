<<<<<<< HEAD
import java.lang.Math;
=======
import java.util.Random;
>>>>>>> fd2f2d4fbe784c1129a961cdc8f3d813472dda6f
import java.util.Scanner;
public class Forest
{
	Animal[]animals=new Animal[5];
	Scanner an=new Scanner(System.in);
<<<<<<< HEAD
public void animalDetails()	
=======
	public void animalDetails()	
>>>>>>> fd2f2d4fbe784c1129a961cdc8f3d813472dda6f
	{
		System.out.println("                    CHOOSE TWO NUMBERS TO FIGHT ");


		Animal blackpanther=new Blackpanther();
		blackpanther.name="Blackpanther";
		blackpanther.str=86;
		blackpanther.num=0;
<<<<<<< HEAD
		blackpanther.alive=true;
=======
>>>>>>> fd2f2d4fbe784c1129a961cdc8f3d813472dda6f
		animals[0]=blackpanther;
		System.out.println("number : "+animals[0].num);
		System.out.println(animals[0].name);
		blackpanther.run();
		System.out.println("strength : "+animals[0].str);
		System.out.println("\n");



		Animal leopard=new Leopard(); 
		leopard.name="Leopard";		
		leopard.str=79;
<<<<<<< HEAD
		leopard.num=1;	
		leopard.alive=true;
=======
		leopard.num=1;		
>>>>>>> fd2f2d4fbe784c1129a961cdc8f3d813472dda6f
		animals[1]=leopard;
		System.out.println("number : "+animals[1].num);		
		System.out.println(animals[1].name);		
		leopard.run();		
		System.out.println("strength : "+animals[1].str);
<<<<<<< HEAD

		

		System.out.println("\n");



		
=======
		System.out.println("\n");


>>>>>>> fd2f2d4fbe784c1129a961cdc8f3d813472dda6f
		Animal rabbit=new Rabbit();
		rabbit.name="Rabbit";
		rabbit.str=42;
		rabbit.num=2;
<<<<<<< HEAD
		rabbit.alive=true;
=======
>>>>>>> fd2f2d4fbe784c1129a961cdc8f3d813472dda6f
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
<<<<<<< HEAD
		crocodail.alive=true;
=======
>>>>>>> fd2f2d4fbe784c1129a961cdc8f3d813472dda6f
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
<<<<<<< HEAD
		lion.alive=true;
=======
>>>>>>> fd2f2d4fbe784c1129a961cdc8f3d813472dda6f
		animals[4]=lion;
		System.out.println("number : "+animals[4].num);
		System.out.println(animals[4].name);
		lion.run();
		System.out.println("strength : "+animals[4].str);
		System.out.println("\n");
<<<<<<< HEAD
		Animal[] rand=new Animal[2];
		rand=get(animals);
		Animal win=fight(rand);
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
	do{		
		r0=random();
		r1=random();				
	}while(r0==r1||animals[r0].alive==false||animals[r1].alive==false);
			System.out.println("  name: "+animals[r0].name+"   strength  "+animals[r0].str);
			System.out.println("\n");		
			System.out.println("  name: "+animals[r1].name+"   strength  "+animals[r1].str);

			cage[0]=animals[r0];
			cage[1]=animals[r1];
	return cage;
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
=======
	}


public void fight()

	{
		int number1,number2,number3,number4,number5;
		Animal[] choices=new Animal[5];
		
		System.out.println("Choose your 1st animal number");		
		number1=an.nextInt();			
		animals[number1].animalDetails();		
		choices[0]=animals[number1];		
		
		System.out.println("Choose your 2nd animal number");		
		number2=an.nextInt();		
		animals[number2].animalDetails();		
		choices[1]=animals[number2];
		
		System.out.println("\n");

		for (int i=0;i<4 ;i++ ) 
		{
			if (choices[0]==animals[i])
			{
				System.out.println("  name: "+animals[i].name+"   strength  "+animals[i].str);		
			}	
			else if(choices[1]==animals[i])
			{
				System.out.println("  name: "+animals[i].name+"   strength  "+animals[i].str);		
			}
		}
		System.out.println("\n");
		int s;
		String win ;

		if (choices[0].str>choices[1].str) 
		{
				System.out.println(choices[0].name+ "  Defeat the  " +choices[1].name);				
				System.out.println("The Wiiner is :    "+choices[0].name+"    strength is reduce to  "+choices[0].str/2+ "    winner winner chicken dinner");									
				choices[0].str=choices[0].str/2;
				s=choices[0].str;
				win=choices[0].name;
		}
		else
		{
				System.out.println(choices[1].name+ "  Defeat the  " +choices[0].name);				
				System.out.println("The Wiiner is :    "+choices[1].name+"    strength is reduce to  "+choices[1].str/2+ "    winner winner chicken dinner");					
				choices[1].str=choices[1].str/2;
				s=choices[1].str;
				win=choices[1].name;	
		}
		System.out.println("\n");


		System.out.println("Choose your 3rd animal number");		
		number3=an.nextInt();			
		animals[number3].animalDetails();		
		choices[2]=animals[number3];
		for (int i=0;i<4 ;i++ ) 
		{
			if (choices[2]==animals[i])
			{
				System.out.println("name: "+animals[i].name+"   strength  "+animals[i].str);	
				System.out.println(animals[i].name+"   going to fight with  "+win);	
	
			}	
			
		}
		int s1;
		String win1;

		if(choices[2].str>s) 
		{
			System.out.println(choices[2].name+ "  Defeat the  " +win);			
			System.out.println("The Wiiner is :    "+choices[2].name+"    strength is reduce to  "+choices[2].str/2+ "    winner winner chicken dinner");
			choices[2].str=choices[2].str/2;
			s1=choices[2].str;
			win1=choices[2].name;
		}
		else 
		{
			System.out.println(win+ "  Defeat the  " +choices[2].name);				
			System.out.println("The Wiiner is :    "+win+"    strength is reduce to  "+s/2+ "    winner winner chicken dinner");
			s=s/2;
			s1=s;
			win1=win;
		}

		System.out.println("\n");

		System.out.println("Choose your 4th animal number");		
		number4=an.nextInt();			
		animals[number4].animalDetails();		
		choices[3]=animals[number4];
		for (int i=0;i<4 ;i++ ) 
		{
			if (choices[3]==animals[i])
			{
				System.out.println("name: "+animals[i].name+"   strength  "+animals[i].str);	
				System.out.println(animals[i].name+"   going to fight with  "+win1);	
				
			}	
			
		}
		int s2;
		String win2;
		if(choices[3].str>s) 
		{
			System.out.println(choices[3].name+ "  Defeat the  " +win1);			
			System.out.println("The Wiiner is :    "+choices[3].name+"    strength is reduce to  "+choices[3].str/2+ "    winner winner chicken dinner");					
			choices[3].str=choices[3].str/2;
			s2=choices[3].str;
			win2=choices[3].name;
		}
		else 
		{
			System.out.println(win1+ "  Defeat the  " +choices[3].name);				
			System.out.println("The Wiiner is :    "+win1+"    strength is reduce to  "+s1/2+ "    winner winner chicken dinner");
			s1=s1/2;
			s2=s1;
			win2=win1;
		}


		System.out.println("Choose your 5th animal number");		
		number5=an.nextInt();			
		animals[number5].animalDetails();		
		choices[4]=animals[number5];
		for (int i=0;i<5 ;i++ ) 
		{
			if (choices[4]==animals[i])
			{
				System.out.println("name: "+animals[i].name+"   strength  "+animals[i].str);	
				System.out.println(animals[i].name+"   going to fight with  "+win2);	
	
			}	
			
		}
		

		if(choices[4].str>s) 
		{
				System.out.println(choices[4].name+ "  Defeat the  " +win2);			
				System.out.println("The Wiiner is :    "+choices[4].name+"    strength is reduce to  "+choices[4].str/2+ "    winner winner chicken dinner");					
		}
		else 
		{
			System.out.println(win2+ "  Defeat the  " +choices[4].name);				
			System.out.println("The Wiiner is :    "+win2+"    strength is reduce to  "+s2/2+ "    winner winner chicken dinner");
		}

	}	
}

>>>>>>> fd2f2d4fbe784c1129a961cdc8f3d813472dda6f
