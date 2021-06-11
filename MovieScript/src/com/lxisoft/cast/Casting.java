package com.lxisoft.cast;

import java.util.*;
import com.lxisoft.storyline.*;

public class Casting
{
	Actors hero=new Actor();
	Actors heroine=new Actress();
	Actors comedian=new Actor();
	Actors villan=new Actor();

	//NonActors director=new Director();
	//Mapping map=new Mapping();

Scanner sc =new Scanner(System.in);
		Director director =new Director();


	
	public void setCasting()
{
			director.setHeroName();
			director.setHeroineName();
			director.setComedianName();
			director.setVillianName();
			director.displayAll();

}




}