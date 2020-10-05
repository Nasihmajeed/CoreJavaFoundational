package com.LxiSoft.Test;
import com.LxiSoft.Game.*;
public class Tdd
{
public static void main( String [] args)
	{
		Board b =new Board();

		b.startScreen();
		b.boardLayout();
		b.rules();

		Game g=new Game();
		g.startGame();

	}
}
