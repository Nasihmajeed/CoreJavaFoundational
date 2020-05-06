package com.lxisoft.nivea;
import com.lxisoft.nivea.Cricketball;
import com.lxisoft.nivea.Tennisball;
import com.lxisoft.nivea.Football;
import com.lxisoft.nivea.Volleyball;
import java.util.Scanner;
public class Onlineshowroom
{
	
	public void shopping()
	{
		
	Ball cricketball=new Cricketball();
	Ball tennisball=new Tennisball();
	Ball football=new Football();
	Ball volleyball=new Volleyball();
		Scanner scr=new Scanner(System.in);
		System.out.println("		----- Nivea Onlineshowroom -----\n");
		System.out.println("1 : parchase items \n2 : exit");
		int number=scr.nextInt();
		switch (number)
		{				
			case 1:	

					
					System.out.println("1 : "+cricketball.name+""+ cricketball.price);
					System.out.println("2 : "+tennisball.name+""+  tennisball.price);
					System.out.println("3 : "+football.name+""+  football.price);
					System.out.println("4 : "+volleyball.name+""+  volleyball.price);

		}

	}
}