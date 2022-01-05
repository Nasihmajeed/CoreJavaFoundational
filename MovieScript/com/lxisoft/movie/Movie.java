package com.lxisoft.movie;
import java.util.Scanner;

import com.lxisoft.cast.Comedian;
import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;
import com.lxisoft.cast.Villan;

public class Movie  {

	Scanner sc = new Scanner(System.in);


 private String name;
 private String genre;
private String language;
private String director;
public Hero [] hero1 = new Hero[4];
public  Heroine rajisha1;
public  Comedian sharaf1;
public Comedian vinay1;
public Villan chemban1;
public Villan anil1;
public Script sc1;


 
 public String getName()   {
	 return name;
 }
 public void set(String newName)  {
	 this.name = newName;
 }
 
 
 public String getGenre() {
	 return genre;
 }
 public void setGenre(String newGenre)  {
	 this.genre = newGenre;
 }
 
 
 
 public String getLanguage()  {
	 return language;
 }
 public void setLanguage(String newLanguage)   {
	 this.language = newLanguage;
 }
 

public String getDirector()  {
	 return director;
 }
 public void setDirector(String newDirector)   {
	 this.director = newDirector;
 }
 
 
 public void printDetails()   {
	 
	 
	 System.out.println("\t\t\t\t\t\t\tMOVIE DETAIL");
	 System.out.println("\t\t\t\t\t\t-------------------------");
		System.out.println("Enter The Type Of Movie ");
		genre = sc.nextLine();
		System.out.println("Enter The Name Of Movie");
		name = sc.nextLine();
	 System.out.println("only 1 Language available");
		System.out.println("*MALAYALAM");
		System.out.println("Enter The Language");
		language = sc.nextLine();
		System.out.println("Enter The Director Name");
		director = sc.nextLine();
		System.out.println("\t\tName :" + this.name); 
	 System.out.println("\t\tDirctor :" + this.director);
		System.out.println("\t\tGenre :"+ this.genre);
		System.out.println("\t\tLanguage :" +this.language);
	 System.out.println("\n");
	
	System.out.println("\t\t\t\t\t\t\tACTORS DETAILS");
	System.out.println("\t\t\t\t\t\t______________________________");
	System.out.println("\n");


	for (int i = 1; i < 3; i ++)  {

	 hero1[i].actorDetails();
	}
	 rajisha1.actorDetails();
	 
	 sharaf1.actorDetails ();
	 
	 vinay1.actorDetails();
	 
	 chemban1.actorDetails();
	 
	 anil1.actorDetails();
	 
	 sc1.scene1Details();

		sc1.scene2Details();
 }	 
}