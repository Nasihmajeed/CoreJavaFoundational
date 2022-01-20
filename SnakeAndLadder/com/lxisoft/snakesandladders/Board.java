package com.lxisoft.snakesandladders;

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
		Cell cell = coin.getPosition();
		if (cell != null) {
			Ladder ladder = cell.getLadder();
			Snake snake = cell.getSnake();
			if (ladder != null) {
				ladder.lift(coin);
				System.out.println("* Wow...ladder on cell " + ladder.getBottomPosition().getCellNumber());
			} else if (snake != null) {
				snake.bite(coin);
				System.out.println("* Aww...snake on cell " + snake.getHeadPosition().getCellNumber());
			}
		}
	}

	private void addSnakesAndLadders() {
		int headPosition = 95;
		int bottomPosition = 10;

		for (int i = 0; i < 2; i++) {
			Snake snake = new BoosterSnake(cells.get(headPosition - 1), cells);
			cells.get(headPosition - 1).setSnake(snake);
			Ladder ladder = new BoosterLadder(cells.get(bottomPosition - 1), cells);
			cells.get(bottomPosition - 1).setLadder(ladder);
			headPosition -= 15;
			bottomPosition += 12;
		}
		for (int i = 0; i < 3; i++) {
			Snake snake = new Snake(cells.get(headPosition - 1), cells);
			cells.get(headPosition - 1).setSnake(snake);
			Ladder ladder = new Ladder(cells.get(bottomPosition - 1), cells);
			cells.get(bottomPosition - 1).setLadder(ladder);
			headPosition -= 15;
			bottomPosition += 12;
		}
	}

	public List<Cell> getCells() {
		return cells;
	}

	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}

}
