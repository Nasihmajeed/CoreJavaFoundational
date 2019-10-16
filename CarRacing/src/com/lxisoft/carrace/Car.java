package com.lxisoft.carrace;
import java.util.Scanner;
import com.lxisoft.carrace.Carrace;
public class Car
{		
	//Carrace[] carArray;	
	public void  carRace()
	{
	  	Scanner sc=new Scanner(System.in);
	  	System.out.println("car race begins");
	  	System.out.println("racing cars are");
	  	System.out.println("enter the name of benz");			
	 	String b=sc.next();	
	 	System.out.println("enter the name of duster");			
	 	String d=sc.next();	
	 	System.out.println("enter the name of jeep");			
	 	String j=sc.next();
	 	System.out.println("enter the name of ford");			
	 	String f=sc.next();	
	 	System.out.println("enter the name of polo");			
	 	String p=sc.next();	
	 	System.out.println("enter the name of breza");			
	 	String br=sc.next();
	 	System.out.println("enter the name of wagnor");			
	 	String w=sc.next();	
	 	System.out.println("enter the name of swift");			
	 	String s=sc.next();	
	 	System.out.println("enter the name of tiago");			
	 	String t=sc.next();
	 	String total=b+d+j+f+p+br+w+s+t;	 	
	 	carDetails(b,d,j,f,p,br,w,s,t);
	}
	public void carDetails(int b,int d,int j,int f,int p,int br,int w,int s,int t)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("car racing");
		for(int i=0;i<b;i++)				
	 	{
	 		Benz benz=new Benz();	 		
	 		System.out.println("name of the car is");
	  		benz.carName=sc.next();
	  		benz.basicSpeed=40;
	  		benz.cC=500;
	  		benz.velocity=40;
	 		System.out.println("distance of benz");
	  		benz.distance=sc.nextInt();
	  		System.out.println("engine type of the benz");
	  		benz.enginetype=sc.next();
	  		System.out.println("type of tyres");
	  		benz.tyreType=sc.next();  		
	  	}
		for(int i=d;i<b+d;i++)
		{
			Duster duster=new Duster();
			System.out.println("name of the car is");
	  		duster.carName=sc.next();
	  		duster.basicSpeed=50;
	  		duster.cC=1000;
	  		duster.velocity=50;
	  		System.out.println("distance of duster");
	  		duster.distance=sc.nextInt();
	  		System.out.println("engine type of the duster");
	  		duster.enginetype=sc.next();
	  		System.out.println("type of tyres");
	  		duster.tyreType=sc.next();

		}
		for(int i=b+d;i<b+d+j;i++)
		{
			Jeep.jeep=new Jeep();
			System.out.println("name of the car is");
	  		jeep.carName=sc.next();
	  		jeep.basicSpeed=50;
	  		jeep.velocity=45;
	  		jeep.cC=1500;
	  		System.out.println("distance of jeep");
	  		jeep.distance=sc.nextInt();
	  		System.out.println("engine type of the jeep");
	  		jeep.enginetype=sc.next();
	  		System.out.println("type of tyres");
	  		jeep.tyreType=sc.next();
	  	}
	  	for(int i=b+d+j;i<b+d+j+f;i++)
	  	{
	  		Ford ford=new Ford();
			System.out.println("name of the car is");
	  		ford.carName=sc.next();
	  		ford.basicSpeed=50;
	  		ford.velocity=46;
	  		ford.cC=1400;
	  		System.out.println("distance of ford");
	  		ford.distance=sc.nextInt();
	  		System.out.println("engine type of the ford");
	  		ford.enginetype=sc.next();
	  		System.out.println("type of tyres");
	  		ford.tyreType=sc.next();
	  	}	
	  	for(int i=b+d+j+f;i<b+d+j+f+p;i++)
	  	{
	  		Polo polo=new Polo();
			System.out.println("name of the car is");
	  		polo.carName=sc.next();
	  		polo.basicSpeed=50;
	  		polo.velocity=50;
	  		polo.cC=1300;
	  		System.out.println("distance of polo");
	  		polo.distance=sc.nextInt();
	  		System.out.println("engine type of the polo");
	  		polo.enginetype=sc.next();
	  		System.out.println("type of tyres");
	  		polo.tyreType=sc.next();
	  	}
	  	for(int i=b+d+j+p;i<b+d+j+f+p+br;i++)
	  	{
	  		Breza breza=new Breza();
			System.out.println("name of the car is");
	  		breza.carName=sc.next();
	  		breza.basicSpeed=50;
	  		breza.velocity=47;
	  		breza.cC=1100;
	  		System.out.println("distance of breza");
	  		breza.distance=sc.nextInt();
	  		System.out.println("engine type of the breza");
	  		breza.enginetype=sc.next();
	  		System.out.println("type of tyres");
	  		breza.tyreType=sc.next();
	  	}
	  	for(int i=b+d+j+p+br;i<b+d+j+f+p+br+w;i++)
	  	{
	  		Wagnor wagnor=new Wagnor();	 		
	 		System.out.println("name of the car is");
	  		wagnor.carName=sc.next();
	  		wagnor.basicSpeed=40;
	  		wagnor.velocity=49;
	  		wagnor.cC=600;
	  		System.out.println("distance of wagnor");
	  		wagnor.distance=sc.nextInt();
	  		System.out.println("engine type of the wagnor");
	  		wagnor.enginetype=sc.next();
	  		System.out.println("type of tyres");
	  		wagnor.tyreType=sc.next();
	  	}
	  	for(int i=b+d+j+p+br+w;i<b+d+j+f+p+br+w+s;i++)
	  	{
	  		Swift swift=new Swift();	 		
	 		System.out.println("name of the car is");
	  		swift.carName=sc.next();
	  		swift.basicSpeed=40;
	  		swift.velocity=24;
	  		swift.cC=800;
	  		System.out.println("distance of swift");
	  		swift.distance=sc.nextInt();
	  		System.out.println("engine type of the swift");
	  		swift.enginetype=sc.next();
	  		System.out.println("type of tyres");
	  		swift.tyreType=sc.next();
		
	  	}
	  	for(int i=b+d+j+p+br+w+s;i<b+d+j+f+p+br+w+s+t;i++)
		{
			Tiago tiago=new Tiago();	 		
	 		System.out.println("name of the car is");
	  		tiago.carName=sc.next();
	  		tiago.basicSpeed=40;
	  		tiago.velocity=35;
	  		tiago.cC=900;
	  		System.out.println("distance of tiago");
	  		tiago.distance=sc.nextInt();
	  		System.out.println("engine type of the tiago");
	  		tiago.enginetype=sc.next();
	  		System.out.println("type of tyres");
	  		tiago.tyreType=sc.next();
 	}
	 //  	public void raceBegin() 
		// {
		// 	Scanner sc=new Scanner(System.in);
		// 	System.out.println("\n-------race begins--------\n");
		// 	int[] arr=new int[carArray.length];
		// 	for(int i=0;true;i++)
		// 	{
		// 		d=(int) (Math.random()*carArray.length);
		// 		v=(int) (Math.random()*carArray.length);
		// 		count=winner();
		// 		if(count==1)
		// 		{
		// 			break;
		// 		}				
		// 	}
		// }
		// public void carPower()	
		// {
		// 	if(enginetype==diesel)
		// 			{
		// 				System.out.println(power==+(carArray[].power-=1));
		// 				if(carArray[].power<=0)
		// 				{
		// 					System.out.println("\t\t\tmore power==" + carArray[].carName);					 	
		// 				}
		// }
					
	// }	
	// public void carTime(int d,int v)
	// {
	// 	float time=distance/velocity;
	//  	return time;
	// }
	
	
	

}

	 	 	  



















