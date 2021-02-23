package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*;

public class Movies{
	String movieName = "C.I.D MOOSA";
	String director = "Jhony Antony";
	String genere = "Comedy";
	Scenes scene = new Scenes();
	public void setMovie(){
		System.out.println("+--------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("|                                   "+movieName+"                                         |");
		System.out.println("|                              by :   "+director+"                                      |");
		System.out.println("|    Genere : "+genere+"                                             IMDb : 7.6/10          |");
		System.out.println("|    Plot   : The adventures of a private detective CID Moosa, who's luck and wit helps |");
		System.out.println("|             him to solve the cases.                                                   |");
		System.out.println("|    Cast   : Dileep   Bhavana   Jagathy_Sreekumar    Harisree_Asokan    Cochin_Haneefa |");
		System.out.println("|             Oduvil_Unnikrishnan   Saleem_Kumar   Ashish_Vidyarthy    Murali   Indrans |");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-1                                          ");
		System.out.println("                                       ---------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println(" Moolam kuzhiyil Sahadevan get prepared for the police selection and leaves the home in \n the mid way he tries to stop Thorappan Kochunni from pickpoketting Meena but Shadevan\n too get arrested by S.I.Peethambaran");
		System.out.println("+---------------------------------------------------------------------------------------+\n Scene-1 Begins");
		scene.setScene1();
		scene.printScene1();
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-2                                          ");
		System.out.println("                                       ---------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println(" Sahadevan has got expelled from the selection camp as he couldn't get there on Time.   \n So he decided to start his own Private Detective Company ");
		System.out.println("+---------------------------------------------------------------------------------------+\n Scene-2 Begins");
		scene.setScene2();
		//scene.printScene2();
		System.out.println("+---------------------------------------------------------------------------------------+");
	}
}