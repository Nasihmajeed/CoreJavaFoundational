package com.lxisoft.storyline;
import com.lxisoft.script.*;
import java.io.*;
import java.util.*;
public class StartMovie
{
	Scene1 sc1=new Scene1();
	Scene2 sc2=new Scene2();
	Scene3 sc3=new Scene3();
	Scanner sc=new Scanner(System.in);
	int ans;
	public void startMovie()
	{
		
		System.out.println("Enter the Scene You want to see 1.RomanceScene 2.ComedyScene ");
		ans=sc.nextInt();

		switch(ans)
		{
			case 1:	sc1.romanceScene();
					break;

			case 2: sc2.comedyScene();
					break;		

		}




	}


}