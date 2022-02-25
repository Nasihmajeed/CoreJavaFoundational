package com.lxisoft.movie;
import java.util.Scanner;



enum Genre{

ACTION,COMEDY,ROMANTIC,THRILLER;


}



public class Movie  {

	Scanner sc = new Scanner(System.in);
 

 private String name;
 private Genre genre;
private String language;
private String director;
public int number;


Director dirctr = new Director();
Script script = new Script();
ScriptWriter scriptWriter = new ScriptWriter();

 public String getName()   {
	 return name;
 }
 public void setName(String newName)  {
	 this.name = newName;
 }
 
 
 public Genre getGenre() {
	 return genre;
 }
 public void setGenre(Genre newGenre)  {
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
 
 
 public void movieDetails()   {
	 
	 
	 System.out.println("\t\t\t\t\t\t\tMOVIE DETAIL");
	 System.out.println("\t\t\t\t\t\t-------------------------");
		System.out.println("\t\tMovie Types");
		System.out.println("\t\t____________________");
		System.out.println("\n");

		System.out.println("1 = Action");
		System.out.println("2 = Romantic");
		System.out.println("3 = Comedy");
		System.out.println("4 = Thriller");
		System.out.println("\n");

		System.out.println("Enter The Number of Genre Type ");
		 number= sc.nextInt();

			sc.nextLine();

			switch  (number)  {

case 1 :

 Genre genreAction = Genre.ACTION;
	genre =genreAction;

break;


case 2: 

Genre genreRomantic = Genre.ROMANTIC;
genre =genreRomantic;

break;


case 3:

Genre genreComedy = Genre.COMEDY;
genre =genreComedy;

break;


case 4:

Genre genreThriller = Genre.THRILLER;
genre =genreThriller;

break;
	

			}


		System.out.println("Enter The Name Of Movie");
		name = sc.nextLine();
		System.out.println("\n");
	 System.out.println("only 1 Language available");
		System.out.println("*MALAYALAM");
		System.out.println("Select MALAYALAM Language Press 1 ");
		System.out.println("\n");
		System.out.println("Enter Number");
		number = sc.nextInt();
sc.nextLine();

if (number ==1)  {

language = ("MALAYALAM");

}

		if(number != 1)   {

			System.out.println("You Are Selected Wrong Number... Press 1");

		}


		System.out.println("Enter The Director Name");
		director = sc.nextLine();


		System.out.println("\t\tName :" + this.name); 
	 System.out.println("\t\tDirctor :" + this.director);
		System.out.println("\t\tGenre :"+ this.genre);
		System.out.println("\t\tLanguage :" +this.language);
	 System.out.println("\n");


dirctr.castActors();

scriptWriter.writeScript();


script.getSceneNo(); 


 }	 


}