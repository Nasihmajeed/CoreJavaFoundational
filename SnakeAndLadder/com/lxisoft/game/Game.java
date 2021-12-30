package com.lxisoft.game;

import java.util.Scanner;

import com.lxisoft.snakesandladders.Board;

public class Game {

	private Board board;
	private Player player1;
	private Player player2;
	private Die die;

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

}
