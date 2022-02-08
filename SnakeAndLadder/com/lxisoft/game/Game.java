package com.lxisoft.game;

import java.util.Scanner;

import com.lxisoft.snakesandladders.Board;
import com.lxisoft.snakesandladders.Ladder;
import com.lxisoft.snakesandladders.Snake;
import com.lxisoft.snakesandladders.exceptions.LadderException;
import com.lxisoft.snakesandladders.exceptions.SnakeException;

public class Game {

	private Board board;
	private Player player1;
	private Player player2;
	private Die die;
	private String description;
	private String setup;
	private String rules;
	private String equipments;
	private String snakeRole;
	private String ladderRole;

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
					try {
						player1.moveCoin(result, board.getCells());
					} catch (SnakeException e) {
						Snake snake = coin.getPosition().getSnake();
						snake.bite(coin);
						System.out.println("* Aww...snake on cell " + snake.getHeadPosition().getCellNumber());
					} catch (LadderException e) {
						Ladder ladder = coin.getPosition().getLadder();
						ladder.lift(coin);
						System.out.println("* Wow...ladder on cell " + ladder.getBottomPosition().getCellNumber());
					}
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
					try {
						player2.moveCoin(result, board.getCells());
					} catch (SnakeException e) {
						Snake snake = coin2.getPosition().getSnake();
						snake.bite(coin2);
						System.out.println("* Aww...snake on cell " + snake.getHeadPosition().getCellNumber());
					} catch (LadderException e) {
						Ladder ladder = coin2.getPosition().getLadder();
						ladder.lift(coin2);
						System.out.println("* Wow...ladder on cell " + ladder.getBottomPosition().getCellNumber());
					}
					System.out.print("* New Position: " + coin2.getPosition().getCellNumber());
				}
				System.out.println("\n------------------------------------\n");
			} while ((coin.getPosition() == null) || coin.getPosition().getCellNumber() < 100
					&& ((coin2.getPosition() == null) || coin2.getPosition().getCellNumber() < 100));
			if ((coin.getPosition() != null) && coin.getPosition().getCellNumber() == 100)
				System.out.println("\n\t\t\t\t\t\t   ***** Congratulations " + player1.getName() + " *****\n"
						+ "\n\t\t\t\t\t\t ***** Better luck next time " + player2.getName() + " *****");
			else
				System.out.println("\n\t\t\t\t\t\t   ***** Congratulations " + player2.getName() + " *****\n"
						+ "\n\t\t\t\t\t\t ***** Better luck next time " + player1.getName() + " *****");
			System.out.println("\n\t\t\t\t\t\t\t  ***** GAME OVER *****");
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
