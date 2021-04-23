
 package com.lxisoft.jungle;
  import com.lxisoft.animals.*;
 
import java.util.*;

;

public class Forest
{
public ArrayList<Animal> animals=new ArrayList<Animal>();

/*Animal []a =new Animal[11];
		a[0]=new Deer();
		a[1]=new Rabbit();
		a[2]=new Sheep();
		a[3]=new Tiger();
		a[4]=new Tiger();
		a[5]=new Lion();
		a[6]=new Giraffee();
		a[7]=new Zebra();
		a[8]=new Crocodile();
		a[9]=new Wolf();
		a[10]=new Leopard();
		*/

	{
animals.add(new Deer());
animals.add(new Sheep());
animals.add(new Rabbit());
animals.add(new Giraffee());
animals.add(new Lion());
animals.add(new Tiger());
animals.add(new Zebra());
animals.add(new Crocodile());
animals.add(new Wolf());
animals.add(new Leopard());
		
	}	


 Random rand = new Random();
	
	int preyStamina,hunterStamina;
public void fight(Animal a,Animal b)
		{
	

				
		if(( a instanceof Herbivores)&&( b instanceof Herbivores))
			{
		System.out.println("--------------------------------------------------------------");
				System.out.println("There is no fight");
				System.out.println("--------------------------------------------------------------");
				
				System.out.println("The "+a.getClass().getSimpleName()+" Energy level is:"+a.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				
				System.out.println("The "+b.getClass().getSimpleName()+" Energy level is:"+b.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				//break;
			}
			
			else if(( a instanceof  Herbivores)|| ( b instanceof Carnivores))
			{System.out.println("--------------------------------------------------------------");
				System.out.println("The "+a.getClass().getSimpleName()+" Energy level is:"+a.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("The "+b.getClass().getSimpleName()+" Energy level is :"+b.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("---------------------------Fighting -----------------------------------");
				preyStamina=a.getEnergyLevel();
			while(preyStamina>0)
			{
			System.out.println("The "+a.getClass().getSimpleName()+" energy level is decreasing "+preyStamina);
			preyStamina--;
			}
			System.out.println("--------------------------------------------------------------");
			if(a.getDistance()<=5)
			{
				if(a.getLuckFactor()==0)
				{
						System.out.println("The "+a.getClass().getSimpleName()+" is caught by "+b.getClass().getSimpleName());
							try{
								Thread.sleep(1000);
							}
							catch(InterruptedException ex)
							{
								Thread.currentThread().interrupt();
							}
			System.out.println("--------------------------------------------------------------");
			System.out.println("The "+a.getClass().getSimpleName()+" is Dead");
						System.out.println("--------------------------------------------------------------");
			System.out.println("The winner is "+b.getClass().getSimpleName());
				animals.remove(a);
				}
				else{
					System.out.println("The "+a.getClass().getSimpleName()+" is lucky and escaped");
				}
			//remove dead animal

				
				System.out.println("--------------------------------------------------------------");
			}
				else
				{
			System.out.println("--------------------------------------------------------------");
			System.out.println("The "+a.getClass().getSimpleName()+" is Escaped");
				}
			}
			else if(( a instanceof  Carnivores)||( b instanceof Herbivores))
			{System.out.println("--------------------------------------------------------------");
				System.out.println("The "+b.getClass().getSimpleName()+" Energy level is:"+b.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("The "+a.getClass().getSimpleName()+" Energy level is :"+a.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("---------------------------Fighting -----------------------------------");
				preyStamina=b.getEnergyLevel();
			while(preyStamina>0)
			{
			System.out.println("The "+b.getClass().getSimpleName()+" energy level is decreasing "+preyStamina);
			preyStamina--;
			}
			System.out.println("--------------------------------------------------------------");
			if(b.getDistance()<=5)
				{
					if(a.getLuckFactor()==0)
						{
					System.out.println("The "+b.getClass().getSimpleName()+" is caught by "+a.getClass().getSimpleName() );
						try	{
								Thread.sleep(1000);
							}
							catch(InterruptedException ex)
							{
								Thread.currentThread().interrupt();
							}
			
					System.out.println("--------------------------------------------------------------");
					System.out.println("The "+b.getClass().getSimpleName()+" is Dead");
					animals.remove(b);
						}
						else
						{
							System.out.println("The "+b.getClass().getSimpleName()+" is lucky and escaped");
						}

				System.out.println("--------------------------------------------------------------");
				}
			else
			{
				System.out.println("The "+b.getClass().getSimpleName()+" is Escaped");
				System.out.println("The winner is "+a.getClass().getSimpleName());
			
			}	//remove dead animal
			
			System.out.println("--------------------------------------------------------------");
			}
			else if(( a instanceof  Carnivores)||( b instanceof Carnivores))
			{System.out.println("--------------------------------------------------------------");
				System.out.println("The "+a.getClass().getSimpleName()+" Energy level is:"+a.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("The "+b.getClass().getSimpleName()+" Energy level is :"+b.getEnergyLevel());
				System.out.println("--------------------------------------------------------------");
				System.out.println("---------------------------Fighting -----------------------------------");
				
				preyStamina=a.getEnergyLevel();
				hunterStamina=b.getEnergyLevel();
				if(preyStamina<hunterStamina)
				{
			while(preyStamina>0)
			{
			System.out.println("The "+b.getClass().getSimpleName()+" energy level is decreasing "+preyStamina);
			preyStamina--;
			}
			System.out.println("--------------------------------------------------------------");
			if(b.getDistance()<=5){
			System.out.println("The "+b.getClass().getSimpleName()+" is caught ");
			try{
								Thread.sleep(1000);
							}
							catch(InterruptedException ex)
							{
								Thread.currentThread().interrupt();
							}
			System.out.println("--------------------------------------------------------------");
			System.out.println("The "+b.getClass().getSimpleName()+" is Dead ");
						System.out.println("--------------------------------------------------------------");
			System.out.println("The winner is "+a.getClass().getSimpleName());
			animals.remove(b);
			}
			else
			{
			System.out.println("The "+b.getClass().getSimpleName()+" is escaped ");	
			}
	System.out.println("--------------------------------------------------------------");
			}
				}
			
				else
				{
							while(hunterStamina>0)
						{
						System.out.println("The "+b.getClass().getSimpleName()+"energy level is decreasing "+preyStamina);
						preyStamina--;
						}
							System.out.println("--------------------------------------------------------------");
							if(b.getDistance()<=5)
							{
							System.out.println("The "+b.getClass().getSimpleName()+" is caught by "+a.getClass().getSimpleName());
										try{
											Thread.sleep(1000);
											}
											catch(InterruptedException ex)
											{
												Thread.currentThread().interrupt();
											}
							System.out.println("--------------------------------------------------------------");
							System.out.println("The "+b.getClass().getSimpleName()+" is Dead");
							System.out.println("--------------------------------------------------------------");
							System.out.println("The winner is "+a.getClass().getSimpleName());
							animals.remove(b);
							}
							else
							{
								System.out.println("The "+b.getClass().getSimpleName()+" is Escaped");
							}
							System.out.println("--------------------------------------------------------------");
				}
				
			
		}
		
			public void perform(){
			int i=10;
			while(i>1){
						int x = rand.nextInt(animals.size());
					int y=rand.nextInt(animals.size());
					fight(animals.get(x),animals.get(y));
				i--;
				}
						System.out.println("The final winner is :"+animals.get(0).getClass().getSimpleName());
			
			
			
			}
}