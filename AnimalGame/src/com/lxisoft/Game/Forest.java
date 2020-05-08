package com.lxisoft.Game;
import java.util.*;
public class Forest
{
	public void gameStart()
	{
		Scanner in = new Scanner(System.in);
		String yn;
		System.out.println("\t\tAnimal Game");
		System.out.println("\t\tStart Game(yes/no)");
		yn=in.nextLine();
		if(yn.equals("yes"))
		{
			System.out.println("\nGame Begin");
		}
	}
}