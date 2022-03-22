package com.lxisoft.movie;
import java.util.ArrayList;
import java.util.List;
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
   
public List<Actor> getActorDetails() {

return actorDetails;

}

public void setActorDetails( List <Actor>actorDetails)  {

this.actorDetails = actorDetails;

}

public List <Actor> castActors() {

	int heroNo,heroineNo,comedianNo,villanNo;


	System.out.println("\t\t\t\t\t\t\tACTORS DETAILS");
	System.out.println("\t\t\t\t\t\t______________________________");
	System.out.println("\n");



	System.out.println("Enter the number of Hero :");
heroNo = sc.nextInt();
sc.nextLine();

	for (int i = 1; i <=  heroNo; i ++)  {

		Hero hero = new Hero();

		System.out.println("Enter" +i +" Hero name :");
		hero.setName( sc.nextLine());

		System.out.println("Enter" + i + "Hero Character Name");
		hero.setCharacterName(sc.nextLine());

actorDetails.add(hero);


		hero.actorDetails();

		System.out.println("\n");

	}


	System.out.println("Enter the Number of Heroine :");
heroineNo = sc.nextInt();
System.out.println("\n");
sc.nextLine();

for(int i = 1; i <= heroineNo; i ++)  {

Heroine heroine = new Heroine();

System.out.println("Enter" + i + "Heroine Name :");
heroine.setName(sc.nextLine());
System.out.println("Enter"+i+"Character Name :");
heroine.setCharacterName(sc.nextLine());
System.out.println("\n");

actorDetails.add( heroine);

heroine.actorDetails();
System.out.println("\n");

}


System.out.println("Enter the Number of Comedian :");
comedianNo = sc.nextInt();
System.out.println("\n");
sc.nextLine();

for(int i = 1; i <= comedianNo; i ++)  {

	Comedian comedian = new Comedian();

	System.out.println("Enter" + i + "Comedian Name :");
	comedian.setName(sc.nextLine());
	System.out.println("Enter" + i + "Comedian Character Name :");
	comedian.setCharacterName(sc.nextLine());

actorDetails.add(comedian);


	comedian.actorDetails();
	System.out.println("\n");

}


System.out.println("Enter the Number of Villan :");
villanNo = sc.nextInt();
System.out.println("\n");
sc.nextLine();

for(int i = 1; i <= villanNo; i ++)  {

Villan villan = new Villan();

System.out.println("Enter" + i + "Villan Name ");
villan.setName(sc.nextLine());
System.out.println("Enter" + i + "Villan Character Name :");
villan.setCharacterName(sc.nextLine()); 
    
actorDetails.add(villan);

villan.actorDetails();
System.out.println("\n");

}

   return actorDetails;
}

 
}
