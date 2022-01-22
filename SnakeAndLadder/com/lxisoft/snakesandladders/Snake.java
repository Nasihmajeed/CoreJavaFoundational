package com.lxisoft.snakesandladders;

import java.util.List;

import com.lxisoft.game.Coin;

public class Snake {

	protected Cell headPosition;
	protected Cell tailPosition;

	public Snake() {
	}

	public Snake(Cell headPosition, List<Cell> cells) {
		updateHeadAndTail(headPosition, cells, 30);
	}

	protected void updateHeadAndTail(Cell headPosition, List<Cell> cells, int snakeLength) {
		this.headPosition = headPosition;
		int tailPosition = headPosition.getCellNumber() - snakeLength;
		this.tailPosition = cells.get(tailPosition - 1);
	}

	public void bite(Coin coin) {
		coin.setPosition(tailPosition);
	}

	public Cell getHeadPosition() {
		return headPosition;
	}

	public Cell getTailPosition() {
		return tailPosition;
	}

}
