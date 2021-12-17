package com.lxisoft.snakesandladders;

import java.util.ArrayList;
import java.util.List;

import com.lxisoft.game.Coin;

public class Board {

	private Snake snakes[];
	private Ladder ladders[];

	public Board() {
		addSnakesAndLadders();
	}

	public void biteOrLift(Coin coin) {
		for (int i = 0; i < 5; i++) {
			if (coin.getPosition() == ladders[i].getBottomPosition()) {
				ladders[i].lift(coin)package com.lxisoft.snakesandladders;

import java.util.ArrayList;
import java.util.List;

import com.lxisoft.game.Coin;

public class Board {

	private List<Cell> cells;

	public Board() {
		addCells();
		addSnakesAndLadders();
	}

	private void addCells() {
		cells = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			Cell cell = new Cell();
			cell.setCellNumber(i);
			cells.add(cell);
		}
	}

	public void biteOrLift(Coin coin) {
		Cell cell = cells.get(coin.getPosition() - 1);
		Ladder ladder = cell.getLadder();
		Snake snake = cell.getSnake();
		if (ladder != null) {
			ladder.lift(coin);
			System.out.println("Wow...ladder on cell " + ladder.getBottomPosition());
		} else if (snake != null) {
			snake.bite(coin);
			System.out.println("Aww...snake on cell " + snake.getHeadPosition());
		}
	}

	private void addSnakesAndLadders() {
		int headPosition = 95;
		int topPosition = 90;
		int snakeLength = 50;
		int ladderLength = 37;

		for (int i = 0; i < 5; i++) {
			int tailPosition = headPosition - snakeLength;
			Snake snake = new Snake(headPosition, tailPosition);
			cells.get(headPosition - 1).setSnake(snake);
			int bottomPosition = topPosition - ladderLength;
			Ladder ladder = new Ladder(topPosition, bottomPosition);
			cells.get(bottomPosition - 1).setLadder(ladder);
			headPosition -= 15;
			topPosition -= 12;
			snakeLength -= 5;
			ladderLength -= 5;

		}
	}

	public List<Cell> getCells() {
		return cells;
	}

	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}

}
;
				System.out.println("Wow...ladder on cell " + ladders[i].getBottomPosition());
				break;
			} else if (coin.getPosition() == snakes[i].getHeadPosition()) {
				snakes[i].bite(coin);
				System.out.println("Aww...snake on cell " + snakes[i].getHeadPosition());
				break;
			}
		}
	}

	private void addSnakesAndLadders() {
		snakes = new Snake[5];
		ladders = new Ladder[5];
		int headPosition = 95;
		int topPosition = 90;
		int snakeLength = 50;
		int ladderLength = 37;

		for (int i = 0; i < 5; i++) {
			snakes[i] = new Snake(headPosition, headPosition - snakeLength);
			ladders[i] = new Ladder(topPosition, topPosition - ladderLength);
			headPosition -= 15;
			topPosition -= 12;
			snakeLength -= 5;
			ladderLength -= 5;

		}
	}

	public Snake[] getSnakes() {
		return snakes;
	}

	public void setSnakes(Snake[] snakes) {
		this.snakes = snakes;
	}

	public Ladder[] getLadders() {
		return ladders;
	}

	public void setLadders(Ladder[] ladders) {
		this.ladders = ladders;
	}

}
