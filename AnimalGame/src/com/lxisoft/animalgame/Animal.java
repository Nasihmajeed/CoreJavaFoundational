package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;
import com.lxisoft.animalgame.Rabbit;
public class Animal
{
	public String animalName;
	public int strength;
	public String aggresive;
	Animal[] animalArray;	
	public void meet()
	{
	 	
		Scanner sc=new Scanner(System.in);
		System.out.println("Animals meet each other");
	 	System.out.println("enter the number of animal");			
	 	int n=sc.nextInt();	
	 	for(int i=0;i<n;i++)
	 	{
	 	System.out.println("name of the animal");
	  	animalName=sc.next();
		}	
	}
//	public void features
//	{
//		System.out.println("no of animals"+n);
//		System.out.println("name of the animal"+animalName);
//	}	
		

}