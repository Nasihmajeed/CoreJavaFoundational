package com.lxisoft.Test;
import com.lxisoft.Game.Game;
public class Tdd
{
	public static void main (String[] args)
	{
	  Game game = new Game();
	  game.details();
	  game.playersDetails();
	  game.board();
	  game.planHowToPlayTheGame();
	  game.finalWinner();
	}
}