package com.lxisoft.about;
import com.lxisoft.cast.*;

public class Casting
{
	Actors hero=new Actor();
	Actors heroine=new Actress();
	Actors comdeian=new Actor();
	Actors villain=new Actor();

	NonActors director=new Director();
	
	public void setCasting()
	{
		hero.setName("T.R.Silambarasan");
		heroine.setName("TrishaKrishnan");
		comdeian.setName("Ganesh,RajaKrishnamoorthy");
		villain.setName("BabuAntony");
		director.setName("GauthamVasudevMenon");



	}
	public void displayCasting()
	{
		System.out.println("\t Hero :"+hero.getName());
		System.out.println("\t Heroine :"+heroine.getName());
		System.out.println("\t comdeian :"+comdeian.getName());
		System.out.println("\t villain :"+villain.getName());
		System.out.println("\t director :"+director.getName());

	}





}