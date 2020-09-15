package com.Lxisoft.Game;
import com.Lxisoft.Test.*;

public class Ui
{
	Game g =new Game();
	public void gameIntro()
	{
		System.out.println("\t\t_____________________________________________________");
		System.out.println("\t\t_____________________________________________________");
		System.out.println("\t\t_________________SNAKE_______________________________");
		System.out.println("\t\t______________________AND____________________________");
		System.out.println("\t\t_________________________LADDER______________________");
		System.out.println("\t\t_____________________________________________________");
		System.out.println("\t\t_____________________________________________________");
	}


	public void gameDescription()
	{
		System.out.println("\n\n\t\t___________________InStructions______________________________");
		System.out.println("\t\t Get 1 to enter the game ");
		System.out.println("\t\t 2 palyers allowed ");
		System.out.println("\t\t First player who finishes is the winner");
		System.out.println("\t\t");
	}

	public void gameStarts()
	{
		g.gameStart();
	}
}