package com.lxisoft.Movies;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Info
{
	ArrayList<movieInfo> mo =new ArrayList<movieInfo>();

	public void infoPrint()
	{
		int choice=0;int i=0;
		do
		{
					mo.add(new movieInfo("Tom Hanks",64,200,"Best Actor"));
					mo.add(new movieInfo("Joan Cusack",57,75,"Best Actress"));
					mo.add(new movieInfo("Tim Allen",67,170,"Best Supporting Actor"));	
					mo.add(new movieInfo("Errik Deten",38,20,"Best Debut"));
			System.out.println("Press\n\t1.Age of Actors\t2.Awards Won.");
			Scanner scn=new Scanner(System.in);
			choice=scn.nextInt();
				if(choice==1)
				{
					
					Collections.sort(mo);
					System.out.println("|-Sl No:-"+"|------Name------|"+"------Age------|");
	 				for (movieInfo movie: mo) 
	 				{
	 					System.out.println("|"+(i+1)+"\t"+" "+"|"+movie.getName()+"\t  |"+"\t"+movie.getAge()+"\t "+" "+"|");
	 					i++;
	 				}

				}
				else if(choice==2)
				{
	 				Ageinfo agei=new Ageinfo(); 
	 				Collections.sort(mo,agei);
	 				System.out.println("|-Sl No:-"+"|------Name------|"+"------Age------|");

	 				for (movieInfo movie: mo) 
					{
	 					System.out.println("|"+(i+1)+"\t"+" "+"|"+movie.getName()+"\t  |"+"\t"+movie.getawardName()+"\t "+" "+"|");
	 					i++;

					}
						System.out.println("|-----------------------------------------------|");

				}

		}while(choice<3);
	}
}