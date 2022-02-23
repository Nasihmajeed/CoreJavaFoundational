package com.lxisoft.movie;
import java.util.Scanner;

import com.lxisoft.cast.Comedian;
import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;
import com.lxisoft.cast.Villan;


public class Director {
 

Scanner sc = new Scanner(System.in);

 public int heroNo,heroineNo,comedianNo,villanNo,number,sum;

 public String[] actors=new String[100];


public void castActors() {


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

actors[i] = hero.getCharacterName();



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

actors[heroNo + i] = heroine.getCharacterName();

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

actors[heroNo + heroineNo + i] = comedian.getCharacterName();


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

actors[heroNo + heroineNo + comedianNo +i] = villan.getCharacterName();

villan.actorDetails();
System.out.println("\n");

}


}

 
}
