package com.lxisoft.test;
import com.lxisoft.movie.Movie;
import com.lxisoft.movie.Fileoperation;
import java.util.Scanner;
public class Tdd
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("1 : Play movie \n2 : write dialogue");
		int num=scr.nextInt();
		
		
		Movie movie=new Movie();
		
		System.out.println("you want write Character dialogue y / n");
		char ltr=scr.next().charAt(0); 
		do{


			switch(num)
			{
				case 1:
						System.out.println("\n");
						movie.playScene();

						break;
			
				case 2:

						Fileoperation fo=new Fileoperation();
						fo.writeIntoFile();
						
						break;
			}
						System.out.println("you want write dialogue y / n");
						char lr=scr.next().charAt(0);
						if(lr=='n')
						{
							break;
						}
		}while(ltr=='y');
				

	
 			
	}
}