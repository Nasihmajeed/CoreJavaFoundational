package com.lxisoft.game;

import java.util.Scanner;

import com.lxisoft.snakesandladders.Board;

public class Game {

	private Board board;
	private Player player1;
	private Player player2;
	private Die die;
	private String description = "DESCRIPTION: Snakes and ladders is a board game for two or more players regarded today, as a worldwide classic.The game originated\n\t     in ancient India as Moksha Patam, and was brought to the UK in the 1890s. It is played on a game board with numbered,\n\t     gridded squares.A number of ladders and snakes are pictured on the board, each connecting two specific board squares.\n\t     The object of the game is to navigate one's game piece, according to die rolls, from the start (bottom square) to the\n\t     finish (top square),helped by climbing ladders but hindered by falling down snakes.\n\n";
	private String setup = "SETUP: The Snakes and Ladders rules dictate that at least two players play at one go.\n       The game has got one hundred squares.The players start at the first square,and\n       they have to maneuver through snakes and ladders to get to the 100th square. \n\n";
	private String rules = "RULES: * When a coin comes on a number which lies on the top of a snake(face of the snake),then the coin will land below to the bottom of the snake\n         (tail of it) that can also be said as an unlucky move.\n       * If somehow the coin falls on the ladder base, it will immediately climb to the top of the ladder (which is considered to be a lucky move).\n       * Whereas if a player lands on the bottom of the snake or top of a ladder,the player will remain in the same spot (same number) and will not\n         get affected by any particular rule. The players can never move down ladders.\n       * The coins of different players can overlap each other without knocking out anyone. There is no concept of knocking out by opponent players\n         in Snakes and Ladders.\n       * To win, the player needs to roll the exact number of die to land on the number 100. If he/she fails to do so,then the player needs to roll\n         the die again in the next turn.For example,if a player is on the number 98 and the die roll shows the number 4,then the player cannot move\n         its coin until he/she gets a 2 to win or 1 to be on the 99th number.\n\n";
	private String equipments = "EQUIPMENTS: * Snakes and ladders board\n\t    * Die\n\t    * Coins\n\n";
	private String snakeRole = "ROLE OF SNAKE: When a player lands on a top of a snake, their playing coin will slide down to the bottom of the snake. Whereas landing on the bottom of a snake the player will remain in the same spot until their\t       next turn.\n";
	private String ladderRole = "ROLE OF LADDER: When a player lands at the base of a ladder, it immediately climbs to the top of the ladder. Whereas landing at the top of a ladder the player will stay there until the next turn. The player does\t        not move to the bottom of the ladder.\n\n";

	public void play() {
		System.out.println("If you want to start the game, PRESS Y");
		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().charAt(0);
		if (c == 'Y') {
			System.out.println("\n\t\t\t\t\t\t\tWELCOME TO THE GAME\n\n");

			Coin coin = player1.getCoin();
			Coin coin2 = player2.getCoin();
			do {
				System.out.println("--> " + player1.getName() + " rolling the die...\n");
				int result = die.roll();
				System.out.println("* " + player1.getName() + " rolled: " + result);
				if (coin.getPosition() != null) {
					System.out.println("* Current Position of " + coin.getColor() + " coin: "
							+ coin.getPosition().getCellNumber());
				} else {
					System.out.println("* Current Position of " + coin.getColor() + " coin: 0");
				}

				if (result == 1
						|| (coin.getPosition() != null && (coin.getPosition().getCellNumber() + result <= 100))) {
					player1.moveCoin(result, board.getCells());
					board.biteOrLift(coin);
					System.out.print("* New Position: " + coin.getPosition().getCellNumber());
				}
				System.out.println("\n------------------------------------\n");
				System.out.println("--> " + player2.getName() + " rolling the die...\n");
				result = die.roll();
				System.out.println("* " + player2.getName() + " rolled: " + result);
				if (coin2.getPosition() != null) {
					System.out.println("* Current Position of " + coin2.getColor() + " coin: "
							+ coin2.getPosition().getCellNumber());
				} else {
					System.out.println("* Current Position of " + coin2.getColor() + " coin: 0");
				}

				if (result == 1
						|| (coin2.getPosition() != null && (coin2.getPosition().getCellNumber() + result <= 100))) {
					player2.moveCoin(result, board.getCells());
					board.biteOrLift(coin2);
					System.out.print("* New Position: " + coin2.getPosition().getCellNumber());
				}
				System.out.println("\n------------------------------------\n");
			} while ((coin.getPosition() == null) || coin.getPosition().getCellNumber() < 100
					&& ((coin2.getPosition() == null) || coin2.getPosition().getCellNumber() < 100));
			if ((coin.getPosition() != null) && coin.getPosition().getCellNumber() == 100)
				System.out.println("\n\t\t\t\t\t\t   *****Congratulations " + player1.getName() + "*****\n"
						+ "\n\t\t\t\t\t\t *****Better luck next time" + player2.getName() + "*****");
			else
				System.out.println("\n\t\t\t\t\t\t   *****Congratulations " + player2.getName() + "*****\n"
						+ "\n\t\t\t\t\t\t *****Better luck next time" + player1.getName() + "*****");
			System.out.println("\n\t\t\t\t\t\t\t  *****GAME OVER*****");
		} else {
			System.out.println("\n\t\t\t\t\t\t\tEXIT FROM GAME\n\n");
		}
		scanner.close();
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSetup() {
		return setup;
	}

	public void setSetup(String setup) {
		this.setup = setup;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getEquipments() {
		return equipments;
	}

	public void setEquipments(String equipments) {
		this.equipments = equipments;
	}

	public String getSnakeRole() {
		return snakeRole;
	}

	public void setSnakeRole(String snakeRole) {
		this.snakeRole = snakeRole;
	}

	public String getLadderRole() {
		return ladderRole;
	}

	public void setLadderRole(String ladderRole) {
		this.ladderRole = ladderRole;
	}

}
