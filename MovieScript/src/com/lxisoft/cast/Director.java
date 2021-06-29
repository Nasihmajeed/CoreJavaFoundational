package com.lxisoft.cast;
import java.util.*;
import com.lxisoft.storyline.*;
import com.lxisoft.about.*;

public class Director 
{
Casting casting =new Casting();

public void castSetting()
{
	casting.makeCasting();
}



public void directsMovie(Genere genere)
{
	
switch(genere)
{
	case Comedy : System.out.println("Comedy");
					break;
	case Romantic : System.out.println("Romantic");
					break;
	case Emotional : System.out.println("Emotional");
					break;
	case Thriller : System.out.println("Thriller");
					break;



}









}




}