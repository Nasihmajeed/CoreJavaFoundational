package com.lxisoft.Test;
import com.lxisoft.Race.Race;
import java.io.File;
import java.io.IOException;
public class Tdd
{
	public static void main (String[] args)
	{
	  Race race = new Race();
	  race.show();
	  //race.playersDetails();
	  //race.track();
	  //race.planHowToPlayTheGame();
	  //race.finalWinner();
	  File file = new File("D:\\program\\java\\CoreJavaFoundational\\CarRacing\\scr\\com\\lxisoft\\File\\file.txt");
		try
		{
			if(file.createNewFile())
			{
				System.out.print("\n file got created ");
			}
			else
			{
				System.out.print("\n file got created ");
			}
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	}
}