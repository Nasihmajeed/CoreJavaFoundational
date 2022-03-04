package com.lxisoft.game;

import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.lxisoft.database.DatabaseHelper;
import com.lxisoft.database.History;
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
	private Properties properties;

	public void play() {
		System.out.println(properties.getProperty("game.begin"));
		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().charAt(0);
		if (c == 'Y') {
			System.out.println(properties.getProperty("game.start-message1"));

			Coin coin = player1.getCoin();
			Coin coin2 = player2.getCoin();
			do {
				System.out.println("--> " + player1.getName() + properties.getProperty("game.stage"));
				int result = die.roll();
				System.out.println("* " + player1.getName() + properties.getProperty("game.currentStage") + result);
				if (coin.getPosition() != null) {
					System.out.println("* " + coin.getColor() + properties.getProperty("game.coin.position")
							+ coin.getPosition().getCellNumber());
				} else {
					System.out.println("* " + coin.getColor() + properties.getProperty("game.coin.position") + 0);
				}

				if (result == 1
						|| (coin.getPosition() != null && (coin.getPosition().getCellNumber() + result <= 100))) {
					try {
						player1.moveCoin(result, board.getCells());
					} catch (SnakeException e) {
						Snake snake = coin.getPosition().getSnake();
						snake.bite(coin);
						System.out.println(properties.getProperty("snake.bite"));
					} catch (LadderException e) {
						Ladder ladder = coin.getPosition().getLadder();
						ladder.lift(coin);
						System.out.println(properties.getProperty("ladder.climb"));
					}
					System.out.print(
							properties.getProperty("game.coin.new-position") + coin.getPosition().getCellNumber());
				}
				System.out.println("\n------------------------------------\n");
				System.out.println("--> " + player2.getName() + properties.getProperty("game.stage"));
				result = die.roll();
				System.out.println("* " + player2.getName() + properties.getProperty("game.currentStage") + result);
				if (coin2.getPosition() != null) {
					System.out.println("* " + coin2.getColor() + properties.getProperty("game.coin.position")
							+ coin2.getPosition().getCellNumber());
				} else {
					System.out.println("* " + coin2.getColor() + properties.getProperty("game.coin.position") + 0);
				}

				if (result == 1
						|| (coin2.getPosition() != null && (coin2.getPosition().getCellNumber() + result <= 100))) {
					try {
						player2.moveCoin(result, board.getCells());
					} catch (SnakeException e) {
						Snake snake = coin2.getPosition().getSnake();
						snake.bite(coin2);
						System.out.println(properties.getProperty("snake.bite"));
					} catch (LadderException e) {
						Ladder ladder = coin2.getPosition().getLadder();
						ladder.lift(coin2);
						System.out.println(properties.getProperty("ladder.climb"));
					}
					System.out.print(
							properties.getProperty("game.coin.new-position") + coin2.getPosition().getCellNumber());
				}
				System.out.println("\n------------------------------------\n");
			} while ((coin.getPosition() == null) || coin.getPosition().getCellNumber() < 100
					&& ((coin2.getPosition() == null) || coin2.getPosition().getCellNumber() < 100));

			History history = new History();
			if ((coin.getPosition() != null) && coin.getPosition().getCellNumber() == 100) {
				System.out.println("\n" + properties.getProperty("game.result") + " " + player1.getName() + " *****\n"
						+ properties.getProperty("game.better-luck") + player2.getName() + " *****");
				history.setWinner(player1.getName());
				history.setLoser(player2.getName());
			} else {
				System.out.println("\n" + properties.getProperty("game.result") + " " + player2.getName() + " *****\n"
						+ properties.getProperty("game.better-luck") + player1.getName() + " *****");
				history.setWinner(player2.getName());
				history.setLoser(player1.getName());
			}
			System.out.println(properties.getProperty("game.over"));
			DatabaseHelper.saveHistory(history);
			List<History> histories = DatabaseHelper.getHistory();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|     GameId\t| Winner\t| Loser\t\t| GameDate\t|");
			System.out.println("-----------------------------------------------------------------");
			for (History hist : histories) {
				System.out.print("|\t" + hist.getGameId());
				System.out.print("\t| " + hist.getWinner());
				System.out.print("\t| " + hist.getLoser());
				System.out.println("\t| " + hist.getGameDate() + "\t|");
			}
			System.out.println("-----------------------------------------------------------------");

		} else {
			System.out.println(properties.getProperty("game.exit-message"));
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

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
