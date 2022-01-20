package com.lxisoft.snakesandladders;

import java.util.List;

import com.lxisoft.game.Coin;

public class Snake {

	protected Cell headPosition;
	protected Cell tailPosition;

	public Snake() {
	}

	public Snake(Cell headPosition, List<Cell> cells) {
		this.headPosition = headPosition;
		int tailPosition = headPosition.getCellNumber() - 30;
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
