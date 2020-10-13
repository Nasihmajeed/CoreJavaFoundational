package com.lxisoft.TDD;
import com.lxisoft.Game.*;

public class TDD
{
	public static void main(String[] args)
	{
		Game game = new Game();
		game.welcomePage();
		game.starting();
		game.printBoard();
		game.player1();
		game.player2();
	}
}