package com.lxisoft.about;
import com.lxisoft.cast.*;
import java.util.*;

public class Casting
{
	Actors hero=new Actor();
	Actors heroine=new Actress();
	Actors comedian=new Actor();
	Actors villan=new Actor();

	NonActors director=new Director();

Scanner sc =new Scanner(System.in);
		String heroName;
		String heroineName;
		String comedianName;
		String villanName;
		String directorName;
	
	public void setCasting()
	{
		


			System.out.println("\t Enter the Hero Name ");
				heroName=sc.nextLine();
				hero.setName(heroName);

				System.out.println("\t Enter the Heroine Name ");
				heroineName=sc.nextLine();
				heroine.setName(heroineName);

				System.out.println("\t Enter the Comedian Name ");
				comedianName=sc.nextLine();
				comedian.setName(comedianName);

				System.out.println("\t Enter the villan Name ");
				villanName=sc.nextLine();
				villan.setName(villanName);

				System.out.println("\t Enter the director Name ");
				directorName=sc.nextLine();
				director.setName(directorName);

	



	}
	public void displayCasting()
	{
		System.out.println("\t Hero :"+hero.getName());
		System.out.println("\t Heroine :"+heroine.getName());
		System.out.println("\t comdeian :"+comedian.getName());
		System.out.println("\t villain :"+villan.getName());
		System.out.println("\t director :"+director.getName());

	}





}