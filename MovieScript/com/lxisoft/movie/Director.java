package com.lxisoft.movie;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.lxisoft.cast.Comedian;
import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;
import com.lxisoft.cast.Villan;

public class Director {
 
 private String name;

public String getName() {

return name ;

}

public void setName ( String name) {

this.name  = name;

}
	public Director (String name) {


		this.name = name;
	}



Scanner sc = new Scanner(System.in);



 private List <Actor> actorDetails=new ArrayList<Actor>();
   
public List<Actor> getActorDetails(Properties prop) {

return actorDetails;

}

public void setActorDetails( List <Actor>actorDetails)  {

this.actorDetails = actorDetails;

}

public List <Actor> castActors(Properties property) {

	int heroNo,heroineNo,comedianNo,villanNo;


	System.out.println("\t\t\t\t\t\t\t" + property.getProperty("actordetails"));
	System.out.println("\t\t\t\t\t\t______________________________");
	System.out.println("\n");



	System.out.println(property.getProperty("heronumber"));
heroNo = sc.nextInt();
sc.nextLine();

	for (int i = 1; i <=  heroNo; i ++)  {

		Hero hero = new Hero();

		System.out.println(i +property.getProperty("heroname"));
		hero.setName( sc.nextLine());

		System.out.println( i + property.getProperty("herocharacter"));
		hero.setCharacterName(sc.nextLine());

actorDetails.add(hero);


		hero.actorDetails();

		System.out.println("\n");

	}


	System.out.println(property.getProperty("heroinenumber"));
heroineNo = sc.nextInt();
System.out.println("\n");
sc.nextLine();

for(int i = 1; i <= heroineNo; i ++)  {

Heroine heroine = new Heroine();

System.out.println( i + property.getProperty("heroinename"));
heroine.setName(sc.nextLine());
System.out.println(i+property.getProperty("heroinecharacter"));
heroine.setCharacterName(sc.nextLine());
System.out.println("\n");

actorDetails.add( heroine);

heroine.actorDetails();
System.out.println("\n");

}


System.out.println(property.getProperty("comediannumber"));
comedianNo = sc.nextInt();
System.out.println("\n");
sc.nextLine();

for(int i = 1; i <= comedianNo; i ++)  {

	Comedian comedian = new Comedian();

	System.out.println( i + property.getProperty("comedianname"));
	comedian.setName(sc.nextLine());
	System.out.println( i + property.getProperty("comediancharacter"));
	comedian.setCharacterName(sc.nextLine());

actorDetails.add(comedian);


	comedian.actorDetails();
	System.out.println("\n");

}


System.out.println(property.getProperty("villannumber"));
villanNo = sc.nextInt();
System.out.println("\n");
sc.nextLine();

for(int i = 1; i <= villanNo; i ++)  {

Villan villan = new Villan();

System.out.println( i +property.getProperty("villanname"));
villan.setName(sc.nextLine());
System.out.println( i +property.getProperty("villancharacter"));
villan.setCharacterName(sc.nextLine()); 
    
actorDetails.add(villan);

villan.actorDetails();
System.out.println("\n");

}

   return actorDetails;
}

 
}
