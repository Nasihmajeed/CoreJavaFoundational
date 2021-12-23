package com.lxisoft.game;

import com.lxisoft.snakesandladders.Board;

public class Game {

	private Board board;
	private Player player1;
	private Player player2;
	private Die die;

	public void play() {
		do {
			System.out.println("--> " +player1.getName() + " rolling the die...\n");
			int result = die.roll();
			System.out.println("* " + player1.getName() + " rolled: " + result);
			System.out.println("* Current Position of " + player1.getCoin().getColor() + " coin: " + player1.getCoin().getPosition());
			if ((player1.getCoin().getPosition() > 0 || result == 1) && (player1.getCoin().getPosition() + result <= 100)) {
				player1.movecoin(result);
				board.biteOrLift(player1.getCoin());
				System.out.print("* New Position: " + player1.getCoin().getPosition());
			}
			System.out.println("\n------------------------------------\n");
			System.out.println("--> " + player2.getName() + " rolling the die...\n");
			result = die.roll();
			System.out.println("* " + player2.getName() + " rolled: " + result);
			System.out.println("* Current Position of " + player2.getCoin().getColor() + " coin: " + player2.getCoin().getPosition());
			if ((player2.getCoin().getPosition() > 0 || result == 1) && (player2.getCoin().getPosition() + result <= 100)) {
				player2.movecoin(result);
				board.biteOrLift(player2.getCoin());
				System.out.print("* New Position: " + player2.getCoin().getPosition());
			}
			System.out.println("\n------------------------------------\n");
		} while (player1.getCoin().getPosition() < 100 && player2.getCoin().getPosition() < 100);
		if (player1.getCoin().getPosition() == 100)
			System.out.println("\n\t\t\t\t  *****Congratulations " + player1.getName() + "*****\n" + "\n\t\t\t\t*****Better luck next time" + player2.getName() + "*****");
		else
			System.out.println("\n\t\t\t\t  *****Congratulations " + player2.getName() + "*****\n" + "\n\t\t\t\t*****Better luck next time" + player1.getName() + "*****");
			System.out.println("\n\n\t\t\t\t\t  *****GAME OVER*****");
			System.out.println("\t\t\t\t\t  ------------------");
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

}
