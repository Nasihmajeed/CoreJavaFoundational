package com.lxisoft.game;
import java.util.*;
import java.lang.*;
import com.lxisoft.forest.*;
public class Game
{
	private int energyLevel1,energyLevel2;
	Random objGenerator = new Random();
	FileReppo gameResult =new FileReppo();
	
	static Scanner input =new Scanner(System.in);
public void startGame(ArrayList<Animal> animals)
	{

		Area area=new Area();
		FileReppo gameResult =new FileReppo();
		int temp=animals.size();

		System.out.println("\n\nYou Entered in to Game");
		System.out.println("\n________________________\n\n");
		GameLevel();
	do{
		int randomNumber = objGenerator.nextInt(10); 
		int random=objGenerator.nextInt(10);
		int distance=checkDistance(animals.get(randomNumber),animals.get(random));
				
		if(randomNumber!=random)
		{
			if(animals.get(randomNumber).getAlive()==true&&animals.get(random).getAlive()==true)
			{   System.out.println(animals.get(randomNumber).getAnimalName());	
				System.out.println(animals.get(random).getAnimalName());
				System.out.println("distance = "+distance);	
				if(distance<20)
				{	temp =checkStrength(animals.get(randomNumber),animals.get(random),temp);
					System.out.println("\n**********\n\n");
				    temp=checkWin(animals,temp);
				}}}	area.setAnimalPosition(animals);
		
		}while(temp>1);	
	for(int i=0;i<animals.size();i++)
		{
			if(animals.get(i).getAlive()==true)
			{System.out.println(animals.get(i).getAnimalName()+" Survrived At last");
			gameResult.writeTofile(animals.get(i).getAnimalName()); }
		}
		
		if(temp==0)
		{
			try
			{	throw new MyException("NO Animal Survived"); }

			catch(MyException e)
			{	System.out.println("Exception caught  "+e);	}
		}
	}
public int checkDistance(Animal animal1,Animal animal2)
{
	int a=animal1.getxaxis();
	int b=animal1.getyaxis();
	int c=animal2.getxaxis();
	int d=animal2.getyaxis();
	int z=c-a;
	int q=d-b;
	int result=(int)Math.sqrt((int)Math.pow(z,2)+(int)Math.pow(q,2));
return result;
}

public int checkWin(ArrayList<Animal> animals,int temp)
{	int count=0;
 	for (int i=9;i>=0;i--)
 	{
 	if(animals.get(i).getAlive()==true&&animals.get(i) instanceof Herbivores)
 		{count=count+1;}
 	}
 	if(count==temp)
 	{System.out.println(count+" Animals Survived");
 	temp=1;}

return temp;
} 

public void changeStrength(Animal animala,Animal animalb)
{
	int x=animala.getAnimalStrength();
	if(x>0)
	{	x=x-energyLevel1;	}
	animala.setAnimalStrength(x);
	int y=animalb.getAnimalStrength();
	if(y>0)
	{	y=y-energyLevel2;	}

	animalb.setAnimalStrength(y);

}

public int changeAlive(Animal animala,Animal animalb,int temp)
{
	int x=animala.getAnimalStrength();
	if(x<=0)
	{	animala.setAlive(false);
		temp--;	}
	int y=animalb.getAnimalStrength();
	if(y<=0)
	{	animalb.setAlive(false);
		temp--;	}
return temp;
}

public int checkStrength(Animal animal1,Animal animal2,int temp)
	{
			if(animal1 instanceof Herbivores&&animal2 instanceof Herbivores)
			{noAtack(animal1,animal2);}

			else if(animal1 instanceof  Carnivores||animal2 instanceof  Carnivores)
			{
				if(animal1.getAnimalStrength()>animal2.getAnimalStrength())
				{temp =fight(animal1,animal2,temp);}

				else if(animal1.getAnimalStrength()<animal2.getAnimalStrength())
				{temp =fight(animal2,animal1,temp);}

				else
				{temp =fight(animal2,animal1,temp);	}
			}
	return temp;
    }

public boolean luckyFactor()
{
	int luckyfactor=objGenerator.nextInt(3);
	if(luckyfactor==1)
	{return true;}
	else 
	{return false;}
}

public void noAtack(Animal animal1,Animal animal2)
	{			
		System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
		System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
		System.out.println(animal2.getAnimalStrength()+" Strength of"+animal2.getAnimalName());
		System.out.println("No Atack");
	}	

public int fight(Animal animal1,Animal animal2,int temp)
{
  boolean x=luckyFactor();
		if(x==true)
		{
			if((animal1 instanceof Herbivores&&animal1.getAnimalStrength()<5)||(animal2 instanceof Herbivores&&animal2.getAnimalStrength()<5))
			{luckrunAway(animal1,animal2);}
		}
		else
		{
			if((animal2 instanceof Herbivores)&&(animal2.getAnimalStrength()<5))
			{	directAtack(animal1,animal2);
				animal2.setAlive(false);
				temp--;	}				
			else
			{ temp=win(animal1,animal2,temp); }
		}	
return temp;
}

public void luckrunAway(Animal animal1,Animal animal2)
{
	if(animal2 instanceof Herbivores)
	{	System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
		System.out.println(animal2.getAnimalName()+" Runned Away By Luck Factor");
		System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
		System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
	}
	else
	{	System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
		System.out.println(animal1.getAnimalName()+" Runned Away By Luck Factor");
		System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
		System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
	}		
}

public void directAtack(Animal animal1,Animal animal2)
{
	System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
	System.out.println("Strength before Atack");
	System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
	System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
	System.out.println(animal1.getAnimalName()+"win");
	System.out.println("Strength After Atack");
	System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
	System.out.println(animal2.getAnimalName()+" Dead");
}

public int win(Animal animal1,Animal animal2,int temp) 
	{
		System.out.println("\n"+animal1.getAnimalName()+" Meet With "+animal2.getAnimalName()+"\n......\n");
		System.out.println("\nStrength before Atack");
		System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
		System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
		System.out.println("\n"+animal1.getAnimalName()+" Atacked "+animal2.getAnimalName());
		changeStrength(animal2,animal1);
		int emp=changeAlive(animal2,animal1,temp);
		if(temp==emp)
		{System.out.println(animal2.getAnimalName()+" moved away");}
		else{System.out.println(animal2.getAnimalName()+"dead");
		int x=animal1.getAnimalStrength();
		animal1.setAnimalStrength(x+2);}
		System.out.println("\nStrength After Atack");
		System.out.println(animal1.getAnimalStrength()+" Strength of "+animal1.getAnimalName());
		System.out.println(animal2.getAnimalStrength()+" Strength of "+animal2.getAnimalName());
	return emp;
	}
       
public void GameLevel()
{
	int choise=0;
	do{
	System.out.print("\n1.Low Level\n2.Medium Level\n3.Hard Level\n\n Enter Your Choise :");
	choise=input.nextInt();
	Level level;
	try	{switch(choise)
	{		
		case 1:
		level = Level.LOW; 
        System.out.println("You Selected "+level+"Level"); 
        setEnergy1(3);
        setEnergy2(2);
		break;
		case 2:
		level = Level.NORMAL; 
        System.out.println("You Selected "+level+"Level"); 
        setEnergy1(2);
        setEnergy2(1);
		break;
		case 3:
		level = Level.HARD; 
        System.out.println("You Selected "+level+"Level");
        setEnergy1(1);
        setEnergy2(0); 
		break;
		default:
		System.out.println("\nPLease Select a LEvel ....."); 
		break; }}
	catch(Exception ex)
	{ System.out.println("**"+ex);}	
	}while(choise>3);
}
public void setEnergy1(int x)
{ this.energyLevel1=x; }
public void setEnergy2(int x)
{ this.energyLevel2=x; }
}