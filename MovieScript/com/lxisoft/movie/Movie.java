package com.lxisoft.movie;
import com.lxisoft.cast.Comedian;
import com.lxisoft.cast.Hero;
import com.lxisoft.cast.Heroine;
import com.lxisoft.cast.Villan;

public class Movie  {

 private String name;
 private String genre;
private String language;
private String director;
public Hero g1;
public  Heroine r1;
public  Comedian srf;
public Comedian vny;
public Villan cbvd;
public Villan anl;
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
 
 
 
 public void movieDetails()  {
	 
	name = "GEORGETTAN'S POORAM";
genre = "COMEDY";
language = "MALAYALAM";	
director = "K.biju";
	 	 
	 
 }
 
 
 
 public void printDetails()   {
	 
	 
	 System.out.println("\t\t\t\t\t\t\tMOVIE DETAIL");
	 System.out.println("\t\t\t\t\t\t-------------------------");
	System.out.println("\t\tName :" + this.name); 
	 System.out.println("\t\tGenre :" + this.genre);
	 System.out.println("\t\tLanguage :" + this.language);
	 System.out.println("\t\tDirctor :" + this.director);
	 System.out.println("\n");
	
	System.out.println("\t\t\t\t\t\t\tACTORS DETAILS");
	System.out.println("\t\t\t\t\t\t______________________________");
	System.out.println("\n");
	
	 g1.actorDetails();
	 
	 r1.actorDetails();
	 
	 srf.actorDetails ();
	 
	 vny.actorDetails();
	 
	 cbvd.actorDetails();
	 
	 anl.actorDetails();
	 
	 sc1.scene1Details();

		sc1.scene3Details();
 }	 
}