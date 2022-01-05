package com.lxisoft;

import com.lxisoft.game.Coin;
import com.lxisoft.game.Die;
import com.lxisoft.game.Game;
import com.lxisoft.game.Player;
import com.lxisoft.snakesandladders.Board;

public class Tdd {

	public static void main(String[] args) {

		Die die = new Die(6);
		Player player1 = new Player();
		player1.setName("Player 1");
		Coin coin1 = new Coin();
		coin1.setColor("Red");
		player1.setCoin(coin1);
		Player player2 = new Player();
		player2.setName("Player 2");
		Coin coin2 = new Coin();
		coin2.setColor("Blue");
		player2.setCoin(coin2);
		Board board = new Board();
		Game game = new Game();
		game.setBoard(board);
		game.setPlayer1(player1);
		game.setPlayer2(player2);
		game.setDie(die);
		System.out.println("\t\t\t\t\t\t\tWELCOME TO SNAKES AND LADDERS");
		System.out.println("\t\t\t\t\t\t\t=============================\n\n\n");
		System.out.println("DESCRIPTION: Snakes and ladders is a board game for two or more players regarded today, as a worldwide classic.The game originated\n\t     in ancient India as Moksha Patam, and was brought to the UK in the 1890s. It is played on a game board with numbered,\n\t     gridded squares.A number of ladders and snakes are pictured on the board, each connecting two specific board squares.\n\t     The object of the game is to navigate one's game piece, according to die rolls, from the start (bottom square) to the\n\t     finish (top square),helped by climbing ladders but hindered by falling down snakes.\n\n");
		System.out.println("SETUP: The Snakes and Ladders rules dictate that at least two players play at one go.\n       The game has got one hundred squares.The players start at the first square,and\n       they have to maneuver through snakes and ladders to get to the 100th square. \n\n");
		System.out.println("RULES: * When a coin comes on a number which lies on the top of a snake(face of the snake),then the coin will land below to the bottom of the snake\n         (tail of it) that can also be said as an unlucky move.\n       * If somehow the coin falls on the ladder base, it will immediately climb to the top of the ladder (which is considered to be a lucky move).\n       * Whereas if a player lands on the bottom of the snake or top of a ladder,the player will remain in the same spot (same number) and will not\n         get affected by any particular rule. The players can never move down ladders.\n       * The coins of different players can overlap each other without knocking out anyone. There is no concept of knocking out by opponent players\n         in Snakes and Ladders.\n       * To win, the player needs to roll the exact number of die to land on the number 100. If he/she fails to do so,then the player needs to roll\n         the die again in the next turn.For example,if a player is on the number 98 and the die roll shows the number 4,then the player cannot move\n         its coin until he/she gets a 2 to win or 1 to be on the 99th number.\n\n");
		System.out.println("EQUIPMENTS: * Snakes and ladders board\n\t    * Die\n\t    * Coins\n\n");
		System.out.println("ROLE OF SNAKE: When a player lands on a top of a snake, their playing coin will slide down to the bottom of the snake. Whereas landing on the bottom of a snake the player will remain in the same spot until their\t       next turn.\n");
		System.out.println("ROLE OF LADDER: When a player lands at the base of a ladder, it immediately climbs to the top of the ladder. Whereas landing at the top of a ladder the player will stay there until the next turn. The player does\t        not move to the bottom of the ladder.\n\n");
		System.out.println("Board");
		System.out.println("-------");
		System.out.println("* Number of cells: 100");
		System.out.println("* Number of snakes: 5");
		System.out.println("* Number of ladders: 5\n");
		System.out.println("Players");
		System.out.println("-------");
		System.out.println("* " + player1.getName() + " with " + coin1.getColor());
		System.out.println("* " + player2.getName() + " with " + coin2.getColor() + "\n");
		System.out.println("Die");
		System.out.println("-----");
		System.out.println("* Number of faces: " + die.getFaces());
		System.out.println("* Value to start the game: 1\n\n\n");
		System.out.println("\t\t\t\t\t**************Let's start the game**************\n\n\n");

		game.play();
	}

}
