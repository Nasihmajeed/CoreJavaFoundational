package com.lxisoft.about;
import com.lxisoft.cast.*;
import java.util.*;
import com.lxisoft.storyline.*;

public class Casting
{
	Actors hero=new Actor();
	Actors heroine=new Actress();
	Actors comedian=new Actor();
	Actors villan=new Actor();

	NonActors director=new Director();
	Mapping map=new Mapping();

Scanner sc =new Scanner(System.in);
		public String heroName;
	public	String heroineName;
		public String comedianName;
		public String villanName;
		public String directorName;
	
	public void setCasting()
	{
		


			System.out.println("\t Enter the Hero Name ");
				heroName=sc.nextLine();
				hero.setName(heroName);
				heroName=hero.getName();

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

				map.setActors(hero.getName(),heroine.getName(),comedian.getName(),villan.getName());
	



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