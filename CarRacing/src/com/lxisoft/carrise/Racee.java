package com.lxisoft.carrise;
import com.lxisoft.carrise.*;
import java.util.Scanner;
public class Racee
{
	public void race()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("\n");
	    System.out.println("    Race starts  ");
	    System.out.println("  ****************");
	    System.out.println("Enter no.of Normal cars:");
		int n=sc.nextInt();
		System.out.println("Enter no.of Luxury cars:");
	    int l=sc.nextInt();
		carNormal(n,l);
		//carLuxury(n,l);
	}

	public void carNormal(int n,int l)
    {
    	Scanner sc=new Scanner (System.in);
	    for(int i=0;i<n;i++)
		{
			Car cN=new Car();
			System.out.println("Normal car details\n");
			System.out.println("Enter car name:");
			cN.carName=sc.next();
			System.out.println("Enter Type of tyre");
			cN.tyreType=sc.next();
			System.out.println("Type of fuel: ");
			cN.fuel=sc.next();
			System.out.println("Enter power: ");
	        cN.power=sc.nextInt();
	        cN.basicSpeed=60;
	        System.out.println("Basic speed: "+cN.basicSpeed);
	        System.out.println("\n");
	        Car[] raceArr=new Car[10];
			raceArr[i]=cN;
	
		    for(int j=n;j<n+l;j++)
			{
				Car cL=new Car();
				System.out.println("Luxury car details\n");
				System.out.println("Enter car name:");
				cL.carName=sc.next();
				System.out.println("Enter Type of tyre");
				cL.tyreType=sc.next();
				System.out.println("Type of fuel: ");
				cL.fuel=sc.next();
				System.out.println("Enter power: ");
		        cL.power=sc.nextInt();
		        cL.basicSpeed=60;
		        System.out.println("Basic speed: "+cL.basicSpeed);
		        System.out.println("\n");
		       	raceArr[j]=cL;
			}
			rank(raceArr);
		}
	}

// public class carRace(Car[] raceArr)
// {
// 	int x=((int)(Math.random)*raceArr.length)
// 	int y=((int)(Math.random)*raceArr.length)
// 	System.out.println(raceArr[x]+"VS"+raceArr[x])
// }

	public void rank(Car[] raceArr)
	{
		int n=raceArr.length;
		Car temp;
        Car[] rank=new Car[n];;
		for(int i=0;i<n;i++)
		{
		   	rank[i]=raceArr[i];
	    }
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(rank[i].power>rank[j].power)
				{
					temp=rank[i];
					rank[i]=rank[j];
					rank[j]=temp;
				}
			}
		}
		System.out.println("Rank");
		System.out.println("**********");		
		for(int i=0; i<n; i++)
		{
			System.out.println("Rank: " +(i+1)+"\t"+ " Name: "+rank[i].carName+"\t"+" Power:"+rank[i].power);
		}
	}
}